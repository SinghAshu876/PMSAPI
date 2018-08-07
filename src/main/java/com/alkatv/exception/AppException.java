package com.alkatv.exception;

import com.alkatv.messages.ErrorMessages;

public class AppException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2525183435516704892L;

	private ErrorMessages errorMessages;

	public AppException(ErrorMessages errorMessages) {
		super();
		this.errorMessages = errorMessages;
	}

	public ErrorMessages getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(ErrorMessages errorMessages) {
		this.errorMessages = errorMessages;
	}

	
}
