package com.howtodoinjava.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.howtodoinjava.dom.Persona;

@Path("/user-management")
public class UserManagementModule
{
	@GET
	@Path("/users")
	public Response getAllUsers()
	{
		String result = "<h1>RESTful Demo Application</h1>In real world application, a collection of users will be returned !!";
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/jsonTest/{name}")
	@Produces("application/json")
	public Persona prodJson(@PathParam("name")String name){
		Persona p = new Persona(1L,name,"AR");
		return p;
	}
}
