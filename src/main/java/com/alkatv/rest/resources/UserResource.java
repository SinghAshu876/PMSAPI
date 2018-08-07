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

import com.alkatv.rest.requests.SearchRequest;
import com.alkatv.rest.responses.SearchResponse;
import com.alkatv.services.UserService;
import com.alkatv.util.ResourceURIs;

@Path(ResourceURIs.USER_ROOT)
public class UserResource {

	Logger log = LoggerFactory.getLogger(UserResource.class);

	@Autowired
	private UserService userService;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path(ResourceURIs.USERS_SEARCH)
	public Response searchUsers(@Valid SearchRequest searchRequest) throws Exception {
		log.info("searchUsers {}", searchRequest);
		SearchResponse searchResponse = userService.search(searchRequest);
		return Response.status(200).entity(searchResponse).build();
	}

}
