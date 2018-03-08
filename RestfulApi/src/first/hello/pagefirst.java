package first.hello;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import studentDetails.student;



@Path("/Hello")
public class pagefirst {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{name}")
	public String hello(@Context HttpHeaders header, @PathParam  ("name") String Name) {
		String hell = "Hello " +Name;
		return hell;
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{number}")
	public String contact(@Context HttpHeaders header, @PathParam  ("number") int number) {
		String num = "Hello " +number;
		return num;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	
	public student Students(@Context HttpHeaders header) {
		
		student stu = new student("Khan", 1, "Math");
		return stu;
 		
		
	}

}
