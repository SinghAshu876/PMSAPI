package com.alkatv.exceptionmapper;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alkatv.exception.Error;
import com.alkatv.messages.ErrorMessages;
import com.alkatv.rest.responses.APIResponse;
import com.alkatv.rest.responses.ResponseType;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	Logger log = LoggerFactory.getLogger(GenericExceptionMapper.class);

	@Override
	public Response toResponse(Throwable exception) {
		log.error("generic error Response {}", exception);
		return Response.status(Status.OK).entity(sysErrorResponse()).build();
	}

	private APIResponse sysErrorResponse() {
		APIResponse apiResponse = new APIResponse();
		List<Error> errorList = new ArrayList<>();

		Error error = new Error(ErrorMessages.SYS_ERROR);
		errorList.add(error);

		apiResponse.setError(errorList);
		apiResponse.setResponseType(ResponseType.ERROR);

		return apiResponse;
	}
}