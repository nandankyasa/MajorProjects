/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-11-24 05:50:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import database.connection;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import database.connection;
import java.sql.*;
import java.sql.Statement;
import java.sql.SQLException;

public final class AppliedPro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\r\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/main.css\" />\r\n");
      out.write("\t\t\r\n");
      out.write("  <!-- Custom fonts for this template -->\r\n");
      out.write("  <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom styles for this template -->\r\n");
      out.write("  <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom styles for this page -->\r\n");
      out.write("  <link href=\"vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body class=\"is-preload\" style=\"background:url(img/back1.jpg)\";>\r\n");
      out.write("\r\n");
      out.write("<body class=\"is-preload\" style=\"background:url(img/back1.jpg)\";>\r\n");
      out.write("\r\n");
 String company_name=(String)session.getAttribute("company_name");
			
		session.setAttribute("company_name", company_name);
		
      out.write("\r\n");
      out.write("\t\t\r\n");

ResultSet rs1=null;
 String username=(String)session.getAttribute("username");
String mail=request.getParameter("mail");
Connection con=connection.getConnection();
String query="SELECT * from trails where company_name='"+company_name+"'";
try {
	Statement st=con.createStatement();
	
	System.out.println("=====>"+query);
	rs1=st.executeQuery(query);
	
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
 
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- Page Wrapper -->\r\n");
      out.write(" <header id=\"header\">\r\n");
      out.write("\t\t\t\t<h1><a class=\"logo\" href=\"Index.html\">A Resume Evaluation System Based on Text Mining</a></h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</header>\r\n");
      out.write("<!-- Heading -->\r\n");
      out.write("\t\t\t<div id=\"heading\" >\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<center>  <h3>welcome ");
      out.print( company_name);
      out.write("</h3></h3></center>\r\n");
      out.write("\t\t\t\t<a href=\"HR_home.jsp\">logout</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Main -->\r\n");
      out.write("\t\t\t<section id=\"main\" class=\"wrapper\">\r\n");
      out.write("\t\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"table-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\" style=\"background-color:grey;color:black\">\r\n");
      out.write("                  <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <th>Candidate Name</th>\r\n");
      out.write("                      <th>Mobile</th>\r\n");
      out.write("                      <th>Mail id</th>\r\n");
      out.write("                      <th>address</th>\r\n");
      out.write("                      <th>School name</th>\r\n");
      out.write("                      <th>CGPA_10</th>\r\n");
      out.write("                      <th>12_College name</th>\r\n");
      out.write("                      <th>CGPA_12</th>\r\n");
      out.write("                      <th>Branch</th>\r\n");
      out.write("                      <th>College name</th>\r\n");
      out.write("                      <th>CGPA_Graduation</th>\r\n");
      out.write("                      <th>Graduation branch</th>\r\n");
      out.write("                      <th>Year of passed out</th>\r\n");
      out.write("                      <th>Skills</th>\r\n");
      out.write("                      <th>Previous company</th>\r\n");
      out.write("                      <th>Pre_package</th>\r\n");
      out.write("                      <th>Expecting package</th>\r\n");
      out.write("                      <th>resume</th>\r\n");
      out.write("                      \r\n");
      out.write("                                          </tr>\r\n");
      out.write("                  </thead>\r\n");
      out.write("                  <tbody>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      ");

			Connection conn=connection.getConnection();
			String sql="SELECT * from trails where company_name='"+company_name+"'";
			PreparedStatement ps=conn.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
		  while(rs.next())
			{ 
			  
				
				
      out.write("\r\n");
      out.write("\t\t\t\t<tr><td>");
      out.print(rs.getString(2) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(3) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(4) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(5) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(6) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(7) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(8) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(9) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(10) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(11) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(12) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(13) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(14) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(15) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(16) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(17) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(18) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(19) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t \t");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

			}
			
			
      out.write("\t\r\n");
      out.write("\t\t\t \r\n");
      out.write("                  \t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
