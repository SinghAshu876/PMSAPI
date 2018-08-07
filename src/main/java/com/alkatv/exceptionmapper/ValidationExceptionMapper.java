package com.alkatv.exceptionmapper;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
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
public class ValidationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

	Logger log = LoggerFactory.getLogger(ValidationExceptionMapper.class);

	@Override
	public Response toResponse(final ConstraintViolationException exception) {
		log.info("ValidationExceptionMapper");
		return Response.status(Status.OK).entity(prepareMessage(exception)).build();
	}

	private APIResponse prepareMessage(ConstraintViolationException exception) {
		APIResponse apiResponse = new APIResponse();
		List<Error> errorList = new ArrayList<>();

		for (ConstraintViolation<?> cv : exception.getConstraintViolations()) {
			Error error = new Error(ErrorMessages.VALIDATION_EXCEPTION.getCode(),
					cv.getPropertyPath() + cv.getMessage());
			errorList.add(error);
		}

		apiResponse.setError(errorList);
		apiResponse.setResponseType(ResponseType.ERROR);

		return apiResponse;
	}
}
