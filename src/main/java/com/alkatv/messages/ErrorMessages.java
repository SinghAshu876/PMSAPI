package com.alkatv.messages;

public enum ErrorMessages {

	LOGIN_WRONG_UNAME_PWD("Please Enter Correct User Name and Password."),
	REGISTRATION_UNAME_EXISTS("Sorry, This mobile number is already registered , Kindly register with any other valid mobile number"),
	SYS_ERROR("Sorry, System Unavailable. Kindly contact the admin"),
	VALIDATION_EXCEPTION("");

	private String desc;

	ErrorMessages(String desc) {
		this.setDesc(desc);
	}
	
	public String getCode() {
		return this.name();
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
