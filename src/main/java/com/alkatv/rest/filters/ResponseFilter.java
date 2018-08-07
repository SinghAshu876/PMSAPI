package com.alkatv.rest.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;


public class ResponseFilter implements ContainerResponseFilter {

	private final Logger logger = LoggerFactory.getLogger(ResponseFilter.class);
	
	private final ObjectMapper mapper = new ObjectMapper();

	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		String method = requestContext.getMethod();

		logger.info("Response {} for path {}", method, requestContext.getUriInfo().getPath());
		Object entity = responseContext.getEntity();
		if (entity != null) {
			logger.info("Response {}", mapper.writeValueAsString(entity));
		}
		
		logger.info("CORS settings added");
		MultivaluedMap<String, Object> headers = responseContext.getHeaders();

		headers.add("Access-Control-Allow-Origin", "*");
		headers.add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");

	}

}