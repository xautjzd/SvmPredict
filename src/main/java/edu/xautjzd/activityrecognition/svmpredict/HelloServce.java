package edu.xautjzd.activityrecognition.svmpredict;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloServce {
	@POST
	/*@Consumes(MediaType.APPLICATION_JSON + ";charset=UTF-8")*/
	@Consumes("application/json")
	@Produces("text/plain; charset=utf-8")
	public Response getAction(User u) {
		String info;
		info = "ÐÕÃû£º " + u.getName() + " ×¡Ö·: " + u.getAddress();
		return Response.status(200).entity(info).build();
	}
}
