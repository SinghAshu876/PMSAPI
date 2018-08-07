package com.alkatv.rest.responses;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import com.alkatv.exception.Error;
import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement
@JsonInclude(JsonInclude.Include.NON_NULL)
public class APIResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;
	private List<Error> error;
	private ResponseType responseType;

	public List<Error> getError() {
		return error;
	}

	public void setError(List<Error> error) {
		this.error = error;
	}

	public ResponseType getResponseType() {
		return responseType;
	}

	public void setResponseType(ResponseType responseType) {
		this.responseType = responseType;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
