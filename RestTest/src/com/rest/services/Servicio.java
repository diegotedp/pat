package com.rest.services;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/service")
public class Servicio {

	@GET
	@Produces("application/json")
	public Response fToC() throws JSONException{
		
		JSONObject jsonObject = new JSONObject();
		Double f = 98.24;
		Double c;
		c=(f-32)*5/9;
		jsonObject.put("F: ",f);
		jsonObject.put("C: ",c);
		
		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
		
	}
	
	@GET
	@Path("f2c/{f}")
	@Produces("application/json")
	public Response fToC(@PathParam("f") float f) throws JSONException{
		JSONObject jsonObject = new JSONObject();
		float celsius;
		celsius=(f-32)*5/9;
		jsonObject.put("F Value", f); 
		jsonObject.put("C Value", celsius);
 
		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}

	@GET
	@Path("c2f/{c}")
	@Produces("application/json")
	public Response cToF(@PathParam("c") float c) throws JSONException{
		JSONObject jsonObject = new JSONObject();
		float farenheit;
		farenheit=(c*9/5)+32;
		jsonObject.put("F Value", c); 
		jsonObject.put("C Value", farenheit);
 
		String result = "@Produces(\"application/json\") Output: \n\nC to F Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("other")
	@Produces("application/json")
	public Response other() throws JSONException{
		Persona persona = new Persona();
		persona.setName("Diego");
		persona.setSurname("Q");
		ObjectMapper mapper = new ObjectMapper();
		try {
			return Response.status(200).entity(mapper.writeValueAsString(persona)).build();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.status(500).build();
		}
		
	}
}
