
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Statement;
public  class Login extends HttpServlet {

public void doPost(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException {
		
		try {
			
			String username=req.getParameter("user");
			String pass=req.getParameter("pass");
		    Class.forName("com.mysql.jdbc.Driver");
			Connection con = null;
			String url = "jdbc:mysql://localhost:3306/rest";
			String user = "root";
			String pas = "root";
			con = DriverManager.getConnection(url, user, pas);
			HttpSession session = req.getSession();
	        session.setAttribute("user", username);
			PrintWriter out = resp.getWriter();

		    
		     Statement st = con.createStatement();
		    ResultSet rs;
		    rs = st.executeQuery("select * from sign where username='" + username + "' and password='" + pass + "' ");
		    if (rs.next()) {
		

				RequestDispatcher rd= req.getRequestDispatcher("rest2.jsp");
				rd.forward(req, resp);
				out.println("You Have Successfully Loged in !"+username);
				

		    } else {
		        out.println("Invalid password <a href='login'>try again</a>");
		    }
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
