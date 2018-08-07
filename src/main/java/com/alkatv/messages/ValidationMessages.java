package com.alkatv.messages;

public interface ValidationMessages {

	String NOTNULL = " is a mandatory field";

	String SIZE_LOGIN_UNAME = " must contain atlest 1 character and cannot be longer than 10 characters";
	String SIZE_LOGIN_PWD = " must contain atlest 1 character and cannot be longer than 10 characters";
	
	String SIZE_REGISTRATION_MOBNO = " should contain 10 numbers";
	String SIZE_REGISTRATION_NAME = " should contain at least 5 character and cannot be longer than 20 characters";
	
	String POSITIVE_NUMBER=" cannot be negative or zero";

}
