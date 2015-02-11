package com.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import com.rest.ducks.RubberDuck;
import com.rest.ducks.behavior.NoFlyBehavior;
import com.rest.ducks.behavior.SilenceBehavior;
import com.rest.ducks.behavior.SqueakBehavior;

@Path("/serviceDucks")
public class ServicioDucks {

	@GET
	@Path("rubberDuck")
	@Produces("application/json")
	public Response getRubberDuck() throws JSONException {
		RubberDuck rduck = new RubberDuck();
		rduck.setNombre("Patito de Goma");
//		rduck.setCuackBehavior(new SqueakBehavior());
//		rduck.setFlyBehavior(new NoFlyBehavior());
		
		JSONObject jobject = new JSONObject();
		jobject.put("nombre", rduck.getNombre());
		jobject.put("cuakBehavior", rduck.getCuackBehavior().hacerSonido());
		jobject.put("flyBehavior", rduck.getFlyBehavior().volar());
		
		return Response.status(200).entity(jobject.toString()).build();
	}
	
	@GET
	@Path("decoyDuck")
	@Produces("application/json")
	public Response getDecoyDuck() throws JSONException {
		RubberDuck dduck = new RubberDuck();
		dduck.setNombre("Pato decorativo");
//		dduck.setCuackBehavior(new SilenceBehavior());
//		dduck.setFlyBehavior(new NoFlyBehavior());
		
		JSONObject jobject = new JSONObject();
		jobject.put("nombre", dduck.getNombre());
		jobject.put("cuakBehavior", dduck.cuack());
		jobject.put("flyBehavior", dduck.volar());
		
		return Response.status(200).entity(jobject.toString()).build();
	}
}
