import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
import java.sql.Statement;

public  class about extends HttpServlet {

	public void doPost(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException {
		
		try {
			 
			String url = "jdbc:mysql://localhost:3306/rest";
			String user = "root";
			String pass = "root";
		 //String username=request.getParameter("username");
		 String email=req.getParameter("email");
		 String subject=req.getParameter("subject");
		 String feedback=req.getParameter("feedback");
		 Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		PrintWriter out = resp.getWriter();
		 System.out.println("he");
	    if(email!= null && subject!= null && feedback!= null ){
	  
	        //session.setAttribute("user", username);
	        //out.println("welcome " + userid);
	        //out.println("<a href='logout.jsp'>Log out</a>");
	         String query="Insert into about(email,subject,feedback) values(?,?,?)";
		 PreparedStatement ps=con.prepareStatement(query);
		 ps.setString(1, email);
		 ps.setString(2, subject);
		 ps.setString(3,feedback);
		 ps.executeUpdate();
		 out.println("thank you");
		}
	    else {
	        out.println("welcome " );

	    }
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

			

		