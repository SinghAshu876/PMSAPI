package com.alkatv.exception;

import com.alkatv.messages.ErrorMessages;

public class Error {

	private String errorCode;
	private String errorDesc;

	public Error(String errorCode, String errorDesc) {
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}

	public Error(ErrorMessages errorMsg) {
		this.errorCode = errorMsg.getCode();
		this.errorDesc = errorMsg.getDesc();
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

}
