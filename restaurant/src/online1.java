import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class online1 extends HttpServlet{
	public void doPost(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException {
	
		
		if( !empty("date")&& !empty("time") && !empty("size")){		
		try {
			String url = "jdbc:mysql://localhost:3306/rest";
			String user = "root";
			String pass = "root";
			 
			String date = req.getParameter("date");
			String time = req.getParameter("time");
			String size = req.getParameter("size");

			String query = "insert into online(date,time,size)values(?,?,?)";

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(query);

			ps.setString(1, date);
			ps.setString(2, time);
			ps.setString(3, size);
			ps.executeUpdate();
			
			PrintWriter out = resp.getWriter();
			ResultSet rs = ps.executeQuery();
			
			
			out.println("<html><body><table><tr><td><h4>date</h4></td><td><h4>time</h4></td><td><h4>size</h4></td>");
			
			while(rs.next()) {
				out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>");
			
			}
			
			out.println("</table></body></html>");
			
			
			//RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			//rd.forward(req, resp);
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		}
	}

	private boolean empty(String string) {
		// TODO Auto-generated method stub
		return false;
	}

}
			
