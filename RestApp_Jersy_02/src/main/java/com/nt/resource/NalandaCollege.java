package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.nt.domain.Student;

@Path("/nalanda")
public class NalandaCollege {
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getDetailsById(@PathParam("id") String id) {
		Student st=null;
		st=new Student();
		st.setName("Ayush");
		st.setRank(2000);
		st.setId(200);
		System.out.println(st.toString());
		return st;
	}

}
