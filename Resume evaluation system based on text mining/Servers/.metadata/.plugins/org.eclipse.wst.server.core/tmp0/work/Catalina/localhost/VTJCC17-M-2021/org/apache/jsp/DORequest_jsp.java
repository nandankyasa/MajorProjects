/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-06-02 10:20:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.dao.DBConnection;
import java.sql.SQLException;

public final class DORequest_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("\tIndus by TEMPLATE STOCK\r\n");
      out.write("\ttemplatestock.co @templatestock\r\n");
      out.write("\tReleased for free under the Creative Commons Attribution 3.0 license (templated.co/license)\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\" class=\"no-js\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<style>\r\n");
      out.write("a{\r\n");
      out.write("font-size: 15px;\r\n");
      out.write("color: blue;\r\n");
      out.write("font-style: italic;\r\n");
      out.write("}\r\n");
      out.write("td,tr,th{\r\n");
      out.write("font-size:15px;\r\n");
      out.write("color: black;\r\n");
      out.write("font-family: verdana;\r\n");
      out.write("}\r\n");
      out.write("th{\r\n");
      out.write("color: black;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \r\n");
      out.write("        <title>Provably secure and lightweight identity-based\r\n");
      out.write("authenticated data sharing protocol for\r\n");
      out.write("cyber-physical cloud environment</title>\r\n");
      out.write("        <link rel=\"StyleSheet\" href=w3.css>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/et-lineicon.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome.min.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Roboto:400,500,400italic,500italic,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <!--[if IE]>\r\n");
      out.write("        \t<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("        <!-- Preloader -->\r\n");
      out.write("        <div class=\"animationload\">\r\n");
      out.write("            <div class=\"loader\">\r\n");
      out.write("                Loading...\r\n");
      out.write("            </div>\r\n");
      out.write("        </div> \r\n");
      out.write("        <!-- End Preloader -->\r\n");
      out.write("\r\n");
      out.write("        <!-- =========================\r\n");
      out.write("                 HOME\r\n");
      out.write("        ========================== -->\r\n");
      out.write("\r\n");
      out.write("\t\t<section id=\"home\">\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("                <div id=\"large-header\" class=\"large-header\">\r\n");
      out.write("                    <canvas id=\"demo-canvas\"></canvas>\r\n");
      out.write("                    <div id=\"countdown_dashboard\" class=\"home-main container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"logo\">\r\n");
      out.write("                                <h1 style=\"color: white\"> Provably secure and lightweight identity-based\r\n");
      out.write("authenticated data sharing protocol for\r\n");
      out.write("cyber-physical cloud environment</h1>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <br><br>\r\n");
      out.write("                             <div class=\"row\">\r\n");
      out.write("                            <!-- DAYS -->\r\n");
      out.write("                            <!-- HOURS -->\r\n");
      out.write("                            <div class=\"col-md-2\" data-scroll-reveal=\"enter bottom move 25px, after 0.3s\">\r\n");
      out.write("                                <div class=\"dash hours_dash\">\r\n");
      out.write("                                <a href=\"DORequest.jsp\" class=\"dash_title\" style=\"font-size: 25px;\">DO</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-2\" data-scroll-reveal=\"enter bottom move 25px, after 0.3s\">\r\n");
      out.write("                                <div class=\"dash hours_dash\">\r\n");
      out.write("                                <a href=\"DCRequest.jsp\" class=\"dash_title\" style=\"font-size: 25px;\">DC</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- MINUTES -->\r\n");
      out.write("                            <div class=\"col-md-2\" data-scroll-reveal=\"enter bottom move 25px, after 0.3s\">\r\n");
      out.write("                                <div class=\"dash minutes_dash\">\r\n");
      out.write("                                    <a href=\"EncryptionDetails.jsp\" class=\"dash_title\" style=\"font-size: 25px;\">ENCRYPTED M</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                             <div class=\"col-md-3\" data-scroll-reveal=\"enter bottom move 25px, after 0.3s\">\r\n");
      out.write("                                <div class=\"dash days_dash\">\r\n");
      out.write("                                    <a href=\"DCDecryptRequest.jsp\" class=\"dash_title\" style=\"font-size: 25px;\">REQUEST</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- SECONDS -->\r\n");
      out.write("                            <div class=\"col-md-3\" data-scroll-reveal=\"enter bottom move 25px, after 0.3s\">\r\n");
      out.write("                                <div class=\"dash seconds_dash\">\r\n");
      out.write("                                    <a href=\"index.html\" class=\"dash_title\" style=\"font-size: 25px;\">SIGN OUT</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div> <!-- END ROW -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div> <!-- END COUNTDOWN -->\r\n");
      out.write("                </div> <!-- LARGE HEADER -->\r\n");
      out.write("            </div> <!-- END CONTENT -->\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- =========================\r\n");
      out.write("                 CONTACT\r\n");
      out.write("        ========================== -->\r\n");
      out.write("\r\n");
      out.write("        <section id=\"contact\" class=\"contact\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12 col-md-12\">\r\n");
      out.write("                         <h4>DO'S REQUEST</h4>\r\n");
      out.write("                        <div class=\"line-separate line-white text-center\"><span></span></div>\r\n");
      out.write("                    </div> <!-- end Our Location -->\r\n");
      out.write("                </div> <!-- end row -->\r\n");
      out.write("                <!-- CONTACT FORM -->\r\n");
      out.write("                <div id=\"cformSuccessMsg\" style=\"display: none;\" class=\"confirm-message\"></div>\r\n");
      out.write("<div class=\"row\">\r\n");
 
String sql = "select * from doregister where status1='pending'";
ResultSet rs = DBConnection.getData1(sql);

      out.write("\r\n");
      out.write("<BR>\r\n");
      out.write("<table width=\"100%\" border=\"1\">\r\n");
      out.write("<thead style=\"color:white;\">\r\n");
      out.write("<tr class=\"w3-blue\"><th>Name</th><th>Email</th><th>Gender</th><th>Mobile</th><th>Status</th></tr>\r\n");

try{
	while(rs.next()){

      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr class=\"w3-card-2 w3-hover-blue-grey w3-text-white\"><td>");
      out.print(rs.getString(1) );
      out.write("<td>");
      out.print(rs.getString(2) );
      out.write("</td><td>");
      out.print(rs.getString(3) );
      out.write("</td><td>");
      out.print(rs.getString(4) );
      out.write("</td>\r\n");
      out.write("<td><a href=\"DORequest?email=");
      out.print(rs.getString(2) );
      out.write("\">Add</a> </td></tr>\r\n");
      out.write("\r\n");
} 
}catch(SQLException e){
	e.printStackTrace();
}

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("<div class=\"col-md-12\" data-scroll-reveal=\"enter bottom move 25px, after 0.3s\">\r\n");
      out.write("                                <div class=\"dash days_dash\">\r\n");
      out.write("                                    <a href=\"ViewAllDO.jsp\" class=\"dash_title\" style=\"font-size: 25px;\">VIEW ALL DO'S</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("            </div> <!-- end container -->\r\n");
      out.write("        </section> <!-- end Contact -->\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("                            \r\n");
      out.write("            \r\n");
      out.write("        <!-- JAVASCRIPTS -->\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.lwtCountdown-1.0.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.stellar.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.nicescroll.min.js\"></script>\r\n");
      out.write("        <script src=\"js/animated.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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
