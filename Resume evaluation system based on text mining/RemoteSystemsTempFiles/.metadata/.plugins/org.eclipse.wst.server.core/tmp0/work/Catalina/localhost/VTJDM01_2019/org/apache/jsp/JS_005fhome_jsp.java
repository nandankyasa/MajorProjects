/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-11-24 05:42:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class JS_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <meta name=\"description\" content=\"\">\r\n");
      out.write("  <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("  <title>A Resume Evaluation System Based on Text Mining</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap core CSS -->\r\n");
      out.write("  <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom fonts for this template -->\r\n");
      out.write("  <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Plugin CSS -->\r\n");
      out.write("  <link href=\"vendor/magnific-popup/magnific-popup.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom styles for this template -->\r\n");
      out.write("  <link href=\"css/freelancer.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\" style=\"backbround-image:user_back.jpg\">\r\n");
      out.write("\t");
 String username=(String)session.getAttribute("username");
	String user_id=(String)session.getAttribute("user_id");

		System.out.println("user_id="+user_id);
		session.setAttribute("username", username);
		session.setAttribute("user_id", user_id);
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- Navigation -->\r\n");
      out.write("  <nav class=\"navbar navbar-expand-lg bg-secondary fixed-top\" id=\"mainNav\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <!-- <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">A Resume Evaluation System Based on Text Mining</a> -->\r\n");
      out.write("      <button class=\"navbar-toggler navbar-toggler-right text-uppercase bg-primary text-white rounded\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("        Menu\r\n");
      out.write("        <i class=\"fas fa-bars\"></i>\r\n");
      out.write("      </button>\r\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("          \r\n");
      out.write("           <!-- <li class=\"nav-item mx-0 mx-lg-1\">\r\n");
      out.write("            <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"user_login.jsp\">Login</a>\r\n");
      out.write("          </li>  -->\r\n");
      out.write("          <!-- <li class=\"nav-item mx-0 mx-lg-1\">\r\n");
      out.write("            <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"JS_profile.jsp\">View profile</a>\r\n");
      out.write("          </li> -->\r\n");
      out.write("          <li class=\"nav-item mx-0 mx-lg-1\">\r\n");
      out.write("            <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"Noti_from_hr.jsp\">Notifications from HR</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item mx-0 mx-lg-1\">\r\n");
      out.write("            <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"HR_response.jsp\">HR response</a>\r\n");
      out.write("          </li>\r\n");
      out.write("                    <li class=\"nav-item mx-0 mx-lg-1\">\r\n");
      out.write("            <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"Index.html\">logout</a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("  <!-- Header -->\r\n");
      out.write("  <header class=\"masthead bg-primary text-white text-center\">\r\n");
      out.write(" <!--  <h2 style=\"color:black\">A Resume Evaluation System Based on Text Mining</h2> -->\r\n");
      out.write(" welcome ");
      out.print( username);
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    \r\n");
      out.write("       <h2 class=\"text-uppercase mb-0\">A Resume Evaluation System Based on Text Mining</h2> \r\n");
      out.write("      <img class=\"img-fluid mb-5 d-block mx-auto\" src=\"img/eee.jpg\" alt=\"\" style=\"width:400px;height:400px\";>\r\n");
      out.write("   \r\n");
      out.write("      <hr class=\"star-light\">\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("  </header>\r\n");
      out.write("\r\n");
      out.write("  <!-- Portfolio Grid Section -->\r\n");
      out.write("  \r\n");
      out.write("  <!-- Bootstrap core JavaScript -->\r\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Plugin JavaScript -->\r\n");
      out.write("  <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("  <script src=\"vendor/magnific-popup/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Contact Form JavaScript -->\r\n");
      out.write("  <script src=\"js/jqBootstrapValidation.js\"></script>\r\n");
      out.write("  <script src=\"js/contact_me.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom scripts for this template -->\r\n");
      out.write("  <script src=\"js/freelancer.min.js\"></script>\r\n");
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