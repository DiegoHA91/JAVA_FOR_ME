package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Acceso_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <title>----Acceso al Sistema---</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        *{\n");
      out.write("\n");
      out.write("            text-align: center;\n");
      out.write("            margin: auto;\n");
      out.write("        }\n");
      out.write("        form{\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top:200px;\n");
      out.write("            width: 400px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"RegistroSol\" method=\"POST\">\n");
      out.write("            <table class=\"table table-condensed\" border=\"0\" >\n");
      out.write("                <h2>INICIO DE SESIÓN</h2>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><img src=\"img/admin.jpg\" width=\"20\" height=\"20\">Usuario</td>\n");
      out.write("                        <td><input type=\"text\" name=\"usuario\" value=\"\" size=\"20\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                <br><td><img src=\"img/clave.png\" width=\"20\" height=\"20\">Password</td>\n");
      out.write("                <td><input type=\"password\" name=\"clave\" value=\"\" size=\"20\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr aling=\"center\">\n");
      out.write("                    <td colspan=\"2\"><br>\n");
      out.write("                    <input  type=\"submit\" class=\"btn btn-primary\" value=\"Iniciar Sesion\" name=\"accion\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}