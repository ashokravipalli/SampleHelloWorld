package com.app.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloAppResource {

	@GET
	@Produces("text/plain")
	public String hello() {
		return "Hello Welcome to JAX-RS REST API Class";
	}
}
