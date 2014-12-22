package main.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/test")
public class TestService {

	@get
	public Response testGet(@PathParam("param")String msg ){
		String salida = "Jersey sais: "+msg;
		return Response.status(200).entity(salida).build();
	}
}
