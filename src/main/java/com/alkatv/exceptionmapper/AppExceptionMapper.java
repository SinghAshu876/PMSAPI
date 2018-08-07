package com.alkatv.exceptionmapper;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alkatv.exception.AppException;
import com.alkatv.exception.Error;
import com.alkatv.rest.responses.APIResponse;
import com.alkatv.rest.responses.ResponseType;

@Provider
public class AppExceptionMapper implements ExceptionMapper<AppException> {

	Logger log = LoggerFactory.getLogger(AppExceptionMapper.class);

	@Override
	public Response toResponse(AppException exception) {
		log.info("AppExceptionMapper");
		return Response.status(Status.OK).entity(convertAppException2ErrorResponse(exception)).build();
	}

	private APIResponse convertAppException2ErrorResponse(AppException exception) {
		APIResponse apiResponse = new APIResponse();
		List<Error> errorList = new ArrayList<>();

		Error error = new Error(exception.getErrorMessages());
		errorList.add(error);

		apiResponse.setError(errorList);
		apiResponse.setResponseType(ResponseType.ERROR);
		return apiResponse;
	}
}