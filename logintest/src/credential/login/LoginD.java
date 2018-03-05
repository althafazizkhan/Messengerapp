package credential.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/LoginD")
public class LoginD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
  
  

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String User = request.getParameter("USName");
		String passw = request.getParameter("passwo");
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
	           Connection con = null;   //Drivers added
	           String conUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=Registration;integratedSecurity=true";
	           con = DriverManager.getConnection(conUrl);
	           
	           PreparedStatement ps = con.prepareStatement("select * from register where UN=? and PW=? ;");
	           
	           ps.setString(1,User);
	           ps.setString(2,passw);
	           
	           ResultSet rs = ps.executeQuery();
	           if(rs.next()) {
	        	   
	        	   out.println("Successfully login");
	        	 
	        	   
	           }
	           else {
	        	   out.println("please login again");
	        	  
	           }
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	}


