package com.alkatv.rest.requests;

import static com.alkatv.messages.ValidationMessages.NOTNULL;
import static com.alkatv.messages.ValidationMessages.SIZE_LOGIN_PWD;
import static com.alkatv.messages.ValidationMessages.SIZE_LOGIN_UNAME;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginRequest extends APIRequest {

	@NotNull(message = NOTNULL)
	@Size(min = 1, max = 10, message = SIZE_LOGIN_UNAME)
	private String userName;

	@NotNull(message = NOTNULL)
	@Size(min = 1, max = 10, message = SIZE_LOGIN_PWD)
	private String pwd;

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

}
