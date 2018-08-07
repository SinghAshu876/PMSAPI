package com.alkatv.config;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.alkatv.exceptionmapper.AppExceptionMapper;
import com.alkatv.exceptionmapper.GenericExceptionMapper;
import com.alkatv.exceptionmapper.ValidationExceptionMapper;
import com.alkatv.rest.filters.RequestFilter;
import com.alkatv.rest.filters.ResponseFilter;
import com.alkatv.rest.resources.AppUsersResource;
import com.alkatv.rest.resources.UserResource;
import com.alkatv.util.ResourceURIs;

@Configuration
@ApplicationPath(ResourceURIs.APP_CONTEXT)
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {

	}

	@PostConstruct
	public void setUp() {

		/**
		 * Register REST Resources
		 */
		register(UserResource.class);
		register(AppUsersResource.class);

		/**
		 * Register Filters
		 */
		register(ResponseFilter.class);
		register(RequestFilter.class);

		/**
		 * Register exception Mapper
		 */
		register(ValidationExceptionMapper.class);
		register(GenericExceptionMapper.class);
		register(AppExceptionMapper.class);

	}

}