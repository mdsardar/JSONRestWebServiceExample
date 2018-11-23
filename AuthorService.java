package com.javacodegeeks.examples.jersey;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/AuthorService")
public class AuthorService {
	@GET
	@Path("/authors")	
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTrackInJSON(@QueryParam("from") int from) {
		/*List listPerson = new ArrayList();
		Person p1 = new Person();
		p1.setId(1);;
		p1.setName("name1");
		Person p2 = new Person();
		p2.setId(from);
		p2.setName("name2");
		listPerson.add(p1);
		listPerson.add(p2);
		return listPerson;*/
		return Response
				   .status(200)
				   .entity("getUsers is called, from : " + from).build();
	}
	
	
	/*public Response getUsers(
			@QueryParam("from") int from,
			@QueryParam("to") int to,
			@QueryParam("orderBy") List<String> orderBy) {

			return Response
			   .status(200)
			   .entity("getUsers is called, from : " + from + ", to : " + to
				+ ", orderBy" + orderBy.toString()).build();

		}*/
	
}
