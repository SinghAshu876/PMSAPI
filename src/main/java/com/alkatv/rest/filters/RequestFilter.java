package com.alkatv.rest.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestFilter implements ContainerRequestFilter {

	private final Logger logger = LoggerFactory.getLogger(RequestFilter.class);

	

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		logger.info("Request ");
		
	}

}
