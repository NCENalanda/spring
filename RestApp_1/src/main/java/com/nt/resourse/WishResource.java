package com.nt.resourse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/wish")
public class WishResource {
	static {
		System.out.println("_______________________________------------WishResource-------------___________________________________");
	}
	
	@GET
	@Path("/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getMessage(@PathParam("name") String name) {
		String msg=name+"   WelCome to RestFul  ..................!!!!! ";
		System.out.println(msg);
		return Response.ok(msg).build();
	}
	

}
