/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-11-24 05:49:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HR_005freg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <meta name=\"description\" content=\"\">\r\n");
      out.write("  <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("  <title>HR_Register</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom fonts for this template-->\r\n");
      out.write("  <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom styles for this template-->\r\n");
      out.write("  <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"bg-gradient-primary\">\r\n");
      out.write("  <div id=\"hd\">\r\n");
      out.write("  <center><h1 style=\"color:white;width:100%;height:80px;padding:20px;font-size:50px;\"><b> A Resume Evaluation System Based on Text Mining </b></h1></center>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"card o-hidden border-0 shadow-lg my-5\">\r\n");
      out.write("      <div class=\"card-body p-0\">\r\n");
      out.write("        <!-- Nested Row within Card Body -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-lg-5 d-none d-lg-block bg-register-image\"></div>\r\n");
      out.write("          <div class=\"col-lg-7\">\r\n");
      out.write("            <div class=\"p-5\">\r\n");
      out.write("              <div class=\"text-center\">\r\n");
      out.write("                <h1 class=\"h4 text-gray-900 mb-4\">HR Register here!</h1>\r\n");
      out.write("              </div>\r\n");
      out.write("              <form class=\"user\" action=\"HR_regdb.jsp\" method=\"POST\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("        \r\n");
      out.write("                  <input type=\"text\" name=\"hr_name\" class=\"form-control form-control-user\" id=\"exampleInputName\" placeholder=\"Enter your Name\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <input type=\"text\" maxlength=\"10\" name=\"hr_mobile\" class=\"form-control form-control-user\" id=\"exampleInputNumber\" placeholder=\"Mobile Number\">\r\n");
      out.write("                </div>\r\n");
      out.write("                 <div class=\"form-group\">\r\n");
      out.write("                  <input type=\"email\" name=\"hr_mail\" class=\"form-control form-control-user\" id=\"exampleInputMail\" placeholder=\"Email-Id\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <input type=\"text\" name=\"company_name\" class=\"form-control form-control-user\" id=\"exampleInputMail\" placeholder=\"Enter your organization name\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                  <div class=\"col-sm-6 mb-3 mb-sm-0\">\r\n");
      out.write("                    <input type=\"password\" name=\"hr_pass\" class=\"form-control form-control-user\" id=\"examplePassword\" placeholder=\"password\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-sm-6\">\r\n");
      out.write("                    <input type=\"Password\" name=\"hr_conpass\" class=\"form-control form-control-user\" id=\"exampleConfirmPassword\" placeholder=\"confirm Password\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <input type=\"text\" name=\"organization_address\" class=\"form-control form-control-user\" id=\"exampleInputAddress\" placeholder=\"Enter your organization Address\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary btn-user btn-block\">\r\n");
      out.write("                  Register Account</button>\r\n");
      out.write("         \r\n");
      out.write("              \r\n");
      out.write("                <hr>\r\n");
      out.write("              \r\n");
      out.write("              </form>\r\n");
      out.write("              <hr>\r\n");
      out.write("              <div class=\"text-center\">\r\n");
      out.write("                <a class=\"small\" href=\"Hr_login.jsp\">Already have an account? Login!</a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap core JavaScript-->\r\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Core plugin JavaScript-->\r\n");
      out.write("  <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom scripts for all pages-->\r\n");
      out.write("  <script src=\"js/sb-admin-2.min.js\"></script>\r\n");
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
