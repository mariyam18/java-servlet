/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2018-10-25 08:15:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\"  href=\"about(1).css\" type=\"text/css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("       \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\" integrity=\"sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("  body {\n");
      out.write("    background-color: lightblue;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (min-width: 400px) {\n");
      out.write("    body {\n");
      out.write("        background-color: lightblue;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (min-width: 800px) {\n");
      out.write("    body {\n");
      out.write("        background-color: lavender;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (min-width: 400px) {\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (min-width: 800px) {\n");
      out.write("    .contact{\n");
      out.write("      \n");
      out.write("\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("  \n");
      out.write(" #fee{\n");
      out.write(" top:110px;\n");
      out.write(" text-align:center;\n");
      out.write(" margin_left:200px\n");
      out.write(" }\n");
      out.write("  \n");
      out.write("  </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("    <h1 id=\"grill\">Grill And Chill Restaurant</h1>\n");
      out.write("    <img src=\"img/logo.jpg\" id=\"img\"></img>\n");
      out.write("\n");
      out.write("  \t <nav id=\"menu\">\n");
      out.write("  <label for=\"tm\" id=\"toggle-menu\">Restaurant <span class=\"drop-icon\"></span></label>\n");
      out.write("  <input type=\"checkbox\" id=\"tm\">\n");
      out.write("  <ul class=\"main-menu clearfix\">\n");
      out.write("    <li><a href=\"rest2.jsp\" style=\"text-decoration: none;\">Home</a></li>\n");
      out.write("    <li><a href=\"login.jsp\" style=\"text-decoration: none;\">Login \n");
      out.write("        <span class=\"drop-icon\"></span>\n");
      out.write("        <label title=\"Toggle Drop-down\" class=\"drop-icon\" for=\"sm1\"></label>\n");
      out.write("      </a>\n");
      out.write("      <input type=\"checkbox\" id=\"sm1\">\n");
      out.write("      <ul class=\"sub-menu\">\n");
      out.write("        <li><a href=\"logout.jsp\" style=\"text-decoration: none;\">Logout</a></li>\n");
      out.write("       \n");
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </li>\n");
      out.write("            <li><a href=\"menudb.jsp\" style=\"text-decoration: none;\">Menu</a></li>\n");
      out.write("            <li><a href=\"online.jsp\" style=\"text-decoration: none;\">Reservation</a></li>\n");
      out.write("    <li><a href=\"about.jsp\" style=\"text-decoration: none;\">About</a></li>\n");
      out.write("\n");
      out.write("  </ul>\n");
      out.write("</nav>\n");
      out.write("        <body>\n");
      out.write("        \n");
      out.write("        <div class=\"slideshow\">\n");
      out.write("    <hr>\n");
      out.write("    <img src =\"img/citizen6.jpg\"  id=\"slideimage\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"grid_12\">\n");
      out.write("      <h3 class=\"head1\">The Best of Professionals</h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"gallery\">\n");
      out.write("    <div class=\"grid_3\">\n");
      out.write("      <div class=\"box maxheight\">\n");
      out.write("      <figure>\n");
      out.write("        <img src=\"img/page2_img1.jpg\" alt=\"\">\n");
      out.write("        <div class=\"title\"><a href=\"#\">Emma Smith</a></div>\n");
      out.write("Deneger convallis orci vel mi delaoreet, at ornare lorem consequat. Phasellus era nisl auctor vel velitero. \n");
      out.write("</figure>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"grid_1\">\n");
      out.write("      <div class=\"box maxheight\">\n");
      out.write("      <figure>\n");
      out.write("        <img src=\"img/page2_img2.jpg\" alt=\"\">\n");
      out.write("        <div class=\"title\"><a href=\"#\">Thomas Nelson</a></div>\n");
      out.write("Reenteger convallis orci veli saelaoreet, at ornare lorem konsequat. Khasellus era  jauctor vel veliteru.\n");
      out.write("</figure>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"grid\">\n");
      out.write("      <div class=\"box maxheight\">\n");
      out.write("      <figure>\n");
      out.write("        <img src=\"img/page2_img3.jpg\" alt=\"\">\n");
      out.write("        \n");
      out.write("        <div class=\"title\"><a href=\"#\">Linda Grey</a></div>\n");
      out.write("Ortolieger convallis omi tem more, at ornare loren coatr. Lasellus era nisl auctor vel veliterolsed pharetr. \n");
      out.write("</div>\n");
      out.write("</figure>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("      </div>\n");
      out.write("        <main>\n");
      out.write("                <div class=\"contact\">\n");
      out.write("                        <h3> Location & Hours</h3>\n");
      out.write("                    <p> Terry Francois Street\n");
      out.write("                        <br/>\n");
      out.write("                         San Francisco, CA 94158\n");
      out.write("                         <br/>\n");
      out.write("                         Open Monday to Friday 12pm to 10pm\n");
      out.write("                         <br/>\n");
      out.write("                         Saturday to Sunday 12pm to 11pm</p>\n");
      out.write("                        </div>\n");
      out.write("                <div class=\"social-media\">\n");
      out.write("                        <h3>Get Connected</h3>\n");
      out.write("                        <a href=\"https://facebook.com\"><i class=\"fab fa-facebook fa-2x\"></i> Facebook</a>\n");
      out.write("                        <a href=\"https://instagram.com\"><i class=\"fab fa-instagram fa-2x\"></i> Instagram</a>\n");
      out.write("                        <a href=\"https://youtube.com\"><i class=\"fab fa-youtube fa-2x\"></i>Youtube</a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                <div class=\"contact-form\" >\n");
      out.write("                    <div >\n");
      out.write("                   <h3 class=\"feedback\">Feedback<h3/>\n");
      out.write("                   <br/>\n");
      out.write("                    <form action=\"about.jsp\" method=\"post\">\n");
      out.write("                        <label>\n");
      out.write("                            <div class=\"mu\">\n");
      out.write("                                Email\n");
      out.write("                            </div>\n");
      out.write("                            <input id= 'user-email' type=\"email\" name=\"email\" value=\"\" placeholder=\"username@example.com\">\n");
      out.write("                        </label>\n");
      out.write("                        <label>\n");
      out.write("                            <div class=\"mu\">\n");
      out.write("                                Subject\n");
      out.write("                            </div>\n");
      out.write("                            <input id='subject' type=\"text\" name=\"subject\" value=\"\" placeholder=\"A short description about the matter\">\n");
      out.write("                        </label>\n");
      out.write("                        <label>\n");
      out.write("                            <div class=\"mu\">\n");
      out.write("                                Feedback\n");
      out.write("                            </div>\n");
      out.write("                            <textarea id='feedback' name=\"feedback\"></textarea>\n");
      out.write("\n");
      out.write("                        </label>\n");
      out.write("                        <div>\n");
      out.write("                            <input id='submit-btn'type=\"submit\" name=\"sub_btn\" value=\"Submit\">\t\t\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\t\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("\n");
      out.write("           \n");
      out.write("            </main>\n");
      out.write("\n");
      out.write(" <form method = \"post\" action = \"example.jsp\">\n");
      out.write("\t \n");
      out.write("\t <input id=\"fee\" type =\"submit\" name = \"check\" value = \"Show Feedback\">\n");
      out.write("\t \n");
      out.write("\t </form>\n");
      out.write("\n");
      out.write("            <script src=\"rest.js\"></script>\n");
      out.write("            <footer>    \n");
      out.write("       <div class=\"copy\">\n");
      out.write("      &copy; 2018 | <a href=\"#\">Privacy Policy</a> <br> Website   designed by MMA\n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write(" \n");
      out.write("</footer>\n");
      out.write("\t \n");
      out.write("\t \n");
      out.write("            \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");

 try{
	 String url = "jdbc:mysql://localhost:3306/rest";
		String user = "root";
		String pass = "root";
	
	 Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, user, pass);
	Statement st = con.createStatement();
    ResultSet rs;
   
	if ((session.getAttribute("user") == null) || (session.getAttribute("user") == "")) 
    {	
      out.write("\n");
      out.write("     <span style=\"font-size:1.30em; color:black; font-weight:bold;text-align:center;display:block;padding:20px;position: absolute;top: 2070px;left: 770px;\">You are not logged in</br>\n");
      out.write("     <a href=\"login.jsp\">Please Login</a>\n");
      out.write("     </span>\n");
      out.write("\t\n");
      out.write("    \t\n");
      out.write("  ");
   }    
    
	else
    {
		if ((session.getAttribute("user") == "admin") ){
		     String fetch="select * from about";

			PreparedStatement fet = ((java.sql.Connection) con).prepareStatement(fetch);

			ResultSet feed = fet.executeQuery();
			
      out.write("\n");
      out.write("\t\t\t<html>\n");
      out.write("\t\t\t<body>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<h3 id=\"detail\">*******************Your booking details*************************</h3>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<table id=disp>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td><h4>EMAIL</h4></td>\n");
      out.write("\t\t\t\t \t<td><h4>SUBJECT</h4></td>\n");
      out.write("\t\t\t\t  \t<td><h4>FEEDBACK</h4></td>\n");
      out.write("\t\t\t\t  \t</tr>\n");
      out.write("\t\t\t\t  \t\n");
      out.write("\t\t\t\t  \t");
 

			while(feed.next()) 
			{
			out.println("<tr><td>"+feed.getString(1)+"</td> <td>"+feed.getString(2)+"</td> <td>"+feed.getString(3)+"</td></tr>");
			
			}
			
      out.write("\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t</body>\n");
      out.write("\t\t\t</html>\n");
      out.write("\t\t\t");
   
			
		}
		else{
		String email=request.getParameter("email");
		 String subject=request.getParameter("subject");
		 String feedback=request.getParameter("feedback");
		
		 session.getAttribute("user");
			
      out.write("\n");
      out.write("\t\t\t <span style=\"font-size:1.30em; color:black; font-weight:bold;text-align:center;display:block;padding:20px;position: absolute;top: 257px;left: 1000px;\">Welcome ");
      out.print(session.getAttribute("user"));
      out.write("</span>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");
 
		if(email !=null && subject!=null && feedback!=null){
     String query="Insert into about(email,subject,feedback) values(?,?,?)";
	 PreparedStatement ps=con.prepareStatement(query);
	 ps.setString(1, email);
	 ps.setString(2, subject);
	 ps.setString(3, feedback);
	 ps.executeUpdate();

	 //out.println("Thank you!!!"); 
      out.write("\n");
      out.write("\t \n");
      out.write("\t \n");
      out.write("\t \n");
      out.write("\t <span style=\"font-size:1.30em; color:black; font-weight:bold;text-align:center;display:block;padding:20px;position: absolute;top: 2070px;left: 750px;\">Thank you!!! ");
      out.print(session.getAttribute("user"));
      out.write(" for your feedback</</span>\n");
      out.write("    ");
 } 
    
    }
	
	
 
	 
 }
 }
catch(NullPointerException e){
     e.printStackTrace();
 }
 
      out.write("\t  \n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
