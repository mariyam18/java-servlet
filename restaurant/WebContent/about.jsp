
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>

    <head>
        
        <link rel="stylesheet"  href="about(1).css" type="text/css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
       
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <style type="text/css">
  body {
    background-color: lightblue;
}

@media screen and (min-width: 400px) {
    body {
        background-color: lightblue;
    }
}

@media screen and (min-width: 800px) {
    body {
        background-color: lavender;
    }
}

@media screen and (min-width: 400px) {
    
}

@media screen and (min-width: 800px) {
    .contact{
      

    }
}
  
 #fee{
 top:110px;
 text-align:center;
 margin_left:200px
 }
  
  </style>



    </head>
    <body>
    
    <h1 id="grill">Grill And Chill Restaurant</h1>
    <img src="img/logo.jpg" id="img"></img>

  	 <nav id="menu">
  <label for="tm" id="toggle-menu">Restaurant <span class="drop-icon"></span></label>
  <input type="checkbox" id="tm">
  <ul class="main-menu clearfix">
    <li><a href="rest2.jsp" style="text-decoration: none;">Home</a></li>
    <li><a href="login.jsp" style="text-decoration: none;">Login 
        <span class="drop-icon"></span>
        <label title="Toggle Drop-down" class="drop-icon" for="sm1"></label>
      </a>
      <input type="checkbox" id="sm1">
      <ul class="sub-menu">
        <li><a href="logout.jsp" style="text-decoration: none;">Logout</a></li>
       

      </ul>
    </li>
            <li><a href="menudb.jsp" style="text-decoration: none;">Menu</a></li>
            <li><a href="online.jsp" style="text-decoration: none;">Reservation</a></li>
    <li><a href="about.jsp" style="text-decoration: none;">About</a></li>

  </ul>
</nav>
        <body>
        
        <div class="slideshow">
    <hr>
    <img src ="img/citizen6.jpg"  id="slideimage">
    </div>
    <div class="grid_12">
      <h3 class="head1">The Best of Professionals</h3>
    </div>
    <div class="gallery">
    <div class="grid_3">
      <div class="box maxheight">
      <figure>
        <img src="img/page2_img1.jpg" alt="">
        <div class="title"><a href="#">Emma Smith</a></div>
Deneger convallis orci vel mi delaoreet, at ornare lorem consequat. Phasellus era nisl auctor vel velitero. 
</figure>
      </div>
    </div>
    <div class="grid_1">
      <div class="box maxheight">
      <figure>
        <img src="img/page2_img2.jpg" alt="">
        <div class="title"><a href="#">Thomas Nelson</a></div>
Reenteger convallis orci veli saelaoreet, at ornare lorem konsequat. Khasellus era  jauctor vel veliteru.
</figure>
      </div>
    </div>
    <div class="grid">
      <div class="box maxheight">
      <figure>
        <img src="img/page2_img3.jpg" alt="">
        
        <div class="title"><a href="#">Linda Grey</a></div>
Ortolieger convallis omi tem more, at ornare loren coatr. Lasellus era nisl auctor vel veliterolsed pharetr. 
</div>
</figure>
      </div>
    </div>
  
      </div>
        <main>
                <div class="contact">
                        <h3> Location & Hours</h3>
                    <p> Terry Francois Street
                        <br/>
                         San Francisco, CA 94158
                         <br/>
                         Open Monday to Friday 12pm to 10pm
                         <br/>
                         Saturday to Sunday 12pm to 11pm</p>
                        </div>
                <div class="social-media">
                        <h3>Get Connected</h3>
                        <a href="https://facebook.com"><i class="fab fa-facebook fa-2x"></i> Facebook</a>
                        <a href="https://instagram.com"><i class="fab fa-instagram fa-2x"></i> Instagram</a>
                        <a href="https://youtube.com"><i class="fab fa-youtube fa-2x"></i>Youtube</a>
                        
                    </div>
                
                <div class="contact-form" >
                    <div >
                   <h3 class="feedback">Feedback<h3/>
                   <br/>
                    <form action="about.jsp" method="post">
                        <label>
                            <div class="mu">
                                Email
                            </div>
                            <input id= 'user-email' type="email" name="email" value="" placeholder="username@example.com">
                        </label>
                        <label>
                            <div class="mu">
                                Subject
                            </div>
                            <input id='subject' type="text" name="subject" value="" placeholder="A short description about the matter">
                        </label>
                        <label>
                            <div class="mu">
                                Feedback
                            </div>
                            <textarea id='feedback' name="feedback"></textarea>

                        </label>
                        <div>
                            <input id='submit-btn'type="submit" name="sub_btn" value="Submit">		
                        </div>
                        </div>
                    </form>	
                    </div>
                </div>
           

           
            </main>

 <form method = "post" action = "example.jsp">
	 
	 <input id="fee" type ="submit" name = "check" value = "Show Feedback">
	 
	 </form>

            <script src="rest.js"></script>
            <footer>    
       <div class="copy">
      &copy; 2018 | <a href="#">Privacy Policy</a> <br> Website   designed by MMA
      </div>
  
 
</footer>
	 
	 
            

</body>
</html>


<%
 try{
	 String url = "jdbc:mysql://localhost:3306/rest";
		String user = "root";
		String pass = "root";
	
	 Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, user, pass);
	Statement st = con.createStatement();
    ResultSet rs;
   
	if ((session.getAttribute("user") == null) || (session.getAttribute("user") == "")) 
    {	%>
     <span style="font-size:1.30em; color:black; font-weight:bold;text-align:center;display:block;padding:20px;position: absolute;top: 2070px;left: 770px;">You are not logged in</br>
     <a href="login.jsp">Please Login</a>
     </span>
	
    	
  <%   }    
    
	else
    {
		if ((session.getAttribute("user") == "admin") ){
		     String fetch="select * from about";

			PreparedStatement fet = ((java.sql.Connection) con).prepareStatement(fetch);

			ResultSet feed = fet.executeQuery();
			%>
			<html>
			<body>
			
			<h3 id="detail">*******************Your booking details*************************</h3>
			
			<table id=disp>
				<tr>
					<td><h4>EMAIL</h4></td>
				 	<td><h4>SUBJECT</h4></td>
				  	<td><h4>FEEDBACK</h4></td>
				  	</tr>
				  	
				  	<% 

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
		else{
		String email=request.getParameter("email");
		 String subject=request.getParameter("subject");
		 String feedback=request.getParameter("feedback");
		
		 session.getAttribute("user");
			%>
			 <span style="font-size:1.30em; color:black; font-weight:bold;text-align:center;display:block;padding:20px;position: absolute;top: 257px;left: 1000px;">Welcome <%=session.getAttribute("user")%></span>
			
			<% 
		if(email !=null && subject!=null && feedback!=null){
     String query="Insert into about(email,subject,feedback) values(?,?,?)";
	 PreparedStatement ps=con.prepareStatement(query);
	 ps.setString(1, email);
	 ps.setString(2, subject);
	 ps.setString(3, feedback);
	 ps.executeUpdate();

	 //out.println("Thank you!!!"); %>
	 
	 
	 
	 <span style="font-size:1.30em; color:black; font-weight:bold;text-align:center;display:block;padding:20px;position: absolute;top: 2070px;left: 750px;">Thank you!!! <%=session.getAttribute("user")%> for your feedback</</span>
    <% } 
    
    }
	
	
 
	 
 }
 }
catch(NullPointerException e){
     e.printStackTrace();
 }
 %>	  
