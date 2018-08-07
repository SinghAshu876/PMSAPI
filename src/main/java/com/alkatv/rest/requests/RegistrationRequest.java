package com.alkatv.rest.requests;

import static com.alkatv.messages.ValidationMessages.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegistrationRequest extends APIRequest {

	@NotNull(message = NOTNULL)
	@Size(min = 1, max = 10, message = SIZE_LOGIN_UNAME)
	private String userName;

	@NotNull(message = NOTNULL)
	@Size(min = 1, max = 10, message = SIZE_LOGIN_PWD)
	private String pwd;

	@NotNull(message = NOTNULL)
	@Size(min = 5, max = 20, message = SIZE_REGISTRATION_NAME)
	private String name;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
