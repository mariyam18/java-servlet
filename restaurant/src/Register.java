

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Register extends HttpServlet{

	public void doPost(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException {
		
		try {
			String url = "jdbc:mysql://localhost:3306/rest";
			String user = "root";
			String pass = "root";
			
			String name = req.getParameter("name");
			String gender = req.getParameter("gender");
			String address = req.getParameter("address");
			String username = req.getParameter("username");
			String password= req.getParameter("password");
			String c_pass = req.getParameter("c_pass");
			String mobile = req.getParameter("mobile");
			
			String query = "insert into sign(name,gender,address,username,password,c_pass,mobile)values(?,?,?,?,?,?,?)";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(query);
			
			ps.setString(1, name);
			ps.setString(2, gender);
			ps.setString(3, address);
			ps.setString(4, username);
			ps.setString(5, password);
			ps.setString(6, c_pass);
			ps.setString(7, mobile);
			ps.executeUpdate();
			
			PrintWriter out = resp.getWriter();
			out.println("You Have Successfully Registered !");
			
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, resp);
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
