/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2018-10-25 04:40:54 UTC
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

public final class online_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Restaurant Management System</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"rest.css\" />\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("  \n");
      out.write("  table,tr,td{\n");
      out.write("\n");
      out.write("    border: 1px solid black;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    margin-top: 20px;\n");
      out.write("    padding:10px;\n");
      out.write("    width:50%;\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  #detail{\n");
      out.write("  \n");
      out.write("  font-size:20px;\n");
      out.write("  text-align:center;\n");
      out.write("  margin-top:50px;\n");
      out.write("  margin-bottom:10px;\n");
      out.write("  }\n");
      out.write("  </style>\n");
      out.write("\t </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("\n");
      out.write("  <h1 id=\"grill\">Grill And Chill Restaurant</h1>\n");
      out.write("  <img src=\"img/logo.jpg\" id=\"img\"></img>\n");
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
      out.write("  <div class=\"slideshow\">\n");
      out.write("  <hr>\n");
      out.write("  <img src =\"img/grill.jpg\"  id=\"slideimage\">\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <h2 class=\"table\">Reserve your table</h2>\n");
      out.write("  <form action=\"online.jsp\" method=\"post\">\n");
      out.write("  <div class=\"booknow\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("     <label for=\"date\" >Date: </label>\n");
      out.write("                <input type=\"date\" name=\"date\" id=\"date\" class=\"form-input\" required=\"required\"/><br><br>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"control\">\n");
      out.write("                <label for=\"time\" >Time:</label>\n");
      out.write("                <input type=\"time\" id=\"time\" name=\"time\"\n");
      out.write("                       min=\"10:00\" max=\"23:00\" required=\"required\" />\n");
      out.write("                       <br>\n");
      out.write("                <span class=\"hours\">Restaurant hours: 10AM to 11PM</span><br><br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"party\">\n");
      out.write("                  <label for=\"size\">Party size: </label>\n");
      out.write("                  <select name=\"size\" id=\"size\" size=\"1\" class=\"form-input\" required=\"required\">\n");
      out.write("                      <option value=\"\">--------</option>\n");
      out.write("                      <option value=\"1\">1 Person</option>\n");
      out.write("                      <option value=\"2\">2 Person</option>\n");
      out.write("                      <option value=\"3\">3 Person</option>\n");
      out.write("                      <option value=\"4\">4 Person</option>\n");
      out.write("                      <option value=\"5\">5 Person</option>\n");
      out.write("                      <option value=\"6\">6 Person</option>\n");
      out.write("                  </select>\n");
      out.write("\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  </div>\n");
      out.write("                  <div >\n");
      out.write("                 \n");
      out.write("\n");
      out.write("<button name=\"sub_btn\" id=\"book\" onClick=\"submit()\">Book Now</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("<script src=\"rest.js\"></script>\n");
      out.write("\n");
      out.write("  \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");

	try {
		String url = "jdbc:mysql://localhost:3306/rest";
		String user = "root";
		String pass = "root";
		 
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, pass);
	
	    if ((session.getAttribute("user") == null) || (session.getAttribute("user") == "")) 
	    {	
      out.write("\n");
      out.write("\t     <span style=\"font-size:1.30em; color:black; font-weight:bold;text-align:center;display:block;padding:20px;position: absolute;top: 1500px;left: 300px;\">You are not logged in</br>\n");
      out.write("\t     <a href=\"login.jsp\">Please Login</a>\n");
      out.write("\t     </span>\n");
      out.write("\t\t\n");
      out.write("\t    \t\n");
      out.write("\t  ");
   }
	    else{
	    	String date = request.getParameter("date");
			String time = request.getParameter("time");
			String size = request.getParameter("size");
			session.getAttribute("user");
			
      out.write("\n");
      out.write("\t\t\t <span style=\"font-size:1.30em; color:black; font-weight:bold;text-align:center;display:block;padding:20px;position: absolute;top: 257px;left: 1000px;\">Welcome ");
      out.print(session.getAttribute("user"));
      out.write("</span>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");
 
	    	if(date !=null && time != null && size !=null){
	    	
			String query = "insert into online(date,time,size)values(?,?,?)";
			String fetch = "select * from online ";
	    	
		PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(query);
		PreparedStatement fet = ((java.sql.Connection) conn).prepareStatement(fetch);

		ps.setString(1, date);
		ps.setString(2, time);
		ps.setString(3, size);
		ps.executeUpdate();
		//PrintWriter outp = response.getWriter();

		//String temp=(String)session.getAttribute("username");
		//out.println("welcome"+temp);
	
      out.write("\n");
      out.write("     \t<span style=\"font-size:1.30em; color:black; font-weight:bold;text-align:center;display:block;padding:20px;position: absolute;top: 1500px;left: 300px;\">Thank you!! ");
      out.print(session.getAttribute("user"));
      out.write(".. Visit Agian</span>\n");
 
		ResultSet rs = fet.executeQuery();

      out.write("\n");
      out.write("\t\t<html>\n");
      out.write("\t\t<body>\n");
      out.write("\t\t\n");
      out.write("\t\t<h3 id=\"detail\">*******************Your booking details*************************</h3>\n");
      out.write("\t\t\n");
      out.write("\t\t<table id=disp>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><h4>DATE</h4></td>\n");
      out.write("\t\t\t \t<td><h4>TIME</h4></td>\n");
      out.write("\t\t\t  \t<td><h4>SIZE</h4></td>\n");
      out.write("\t\t\t  \t</tr>\n");
      out.write("\t\t\t  \t\n");
      out.write("\t\t\t  \t");
 
		while(rs.next()) 
		{
		out.println("<tr><td>"+rs.getString(1)+"</td> <td>"+rs.getString(2)+"</td> <td>"+rs.getString(3)+"</td></tr>");
		
		}
		
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("\t\t</body>\n");
      out.write("\t\t</html>\n");
      out.write("\t\t");
    
		
		}
		
		
	    }		
	
}
catch(NullPointerException e){
    e.printStackTrace();
}

		




      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer>    \n");
      out.write("       <div class=\"copy\">\n");
      out.write("      &copy; 2018 | <a href=\"#\">Privacy Policy</a> <br> Website   designed by MMA\n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write(" \n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("  \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
