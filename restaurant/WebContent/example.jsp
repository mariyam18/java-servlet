<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
  <style type="text/css">
table,tr,td{

    border: 1px solid black;
    border-collapse: collapse;
    margin-top: 20px;
    padding:10px;
    width:50%;
  


  
  
  }
  
  #detail{
  
  font-size:20px;
  text-align:center;
  margin-top:50px;
  margin-bottom:10px;
  }
  </style>


<body>

<%
 try{
	 
	 String url = "jdbc:mysql://localhost:3306/rest";
		String user = "root";
		String pass = "root";
	
	 Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, user, pass);
	Statement st = con.createStatement();
    ResultSet rs;
 
 
		     String fetch="select * from about";

			PreparedStatement fet = ((java.sql.Connection) con).prepareStatement(fetch);

			ResultSet feed = fet.executeQuery();
			System.out.println("hii");
			%>
			
			<h3 id="detail">*******************Feedback*************************</h3>
			
			<table id=disp>
				<tr>
					<td><h4>EMAIL</h4></td>
				 	<td><h4>SUBJECT</h4></td>
				  	<td><h4>FEEDBACK</h4></td>
				  	</tr>
				  	
				  	<%
					System.out.println("bye");

			while(feed.next()) 
			{
			out.println("<tr><td>"+feed.getString(1)+"</td> <td>"+feed.getString(2)+"</td> <td>"+feed.getString(3)+"</td></tr>");
			
			}
		
			%>
			
			</table>
			</body>
			</html>
			<%
			
 }

catch(NullPointerException e){
    e.printStackTrace();
}
			%>
			

