package com.alkatv.rest.resources;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alkatv.rest.requests.LoginRequest;
import com.alkatv.rest.requests.LogoutRequest;
import com.alkatv.rest.requests.RegistrationRequest;
import com.alkatv.rest.responses.LoginResponse;
import com.alkatv.rest.responses.LogoutResponse;
import com.alkatv.rest.responses.RegistrationResponse;
import com.alkatv.services.ApplicationUsersService;
import com.alkatv.util.ResourceURIs;

@Path(ResourceURIs.APP_USERS_ROOT)
public class AppUsersResource {

	Logger log = LoggerFactory.getLogger(AppUsersResource.class);

	@Autowired
	private ApplicationUsersService applicationUsersService;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path(ResourceURIs.APP_USERS_LOGIN)
	public Response login(@Valid LoginRequest loginRequest) throws Exception {
		log.info("login");
		LoginResponse loginResponse = applicationUsersService.authenticate(loginRequest);
		return Response.status(200).entity(loginResponse).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path(ResourceURIs.APP_USERS_REGISTER)
	public Response register(@Valid RegistrationRequest registrationRequest) throws Exception {
		log.info("register");
		RegistrationResponse registrationResponse = applicationUsersService.register(registrationRequest);
		return Response.status(200).entity(registrationResponse).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path(ResourceURIs.APP_USERS_LOGOUT)
	public Response logout(LogoutRequest logoutRequest) throws Exception {
		log.info("logout");
		LogoutResponse logoutResponse = applicationUsersService.logout(logoutRequest);
		return Response.status(200).entity(logoutResponse).build();
	}

}
