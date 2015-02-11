package com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
@Path("/test")
public class ServiceTest {
	@GET
	@Path("/users")
	public Response getAllUsers()
	{
		String result = "<h1>RESTful Demo Application</h1>API REST TEST IS ALIVE !!";
		return Response.status(200).entity(result).build();
	}
}
