package org.apache.jsp.usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DeletarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>DiaryBOOK - Cadastro de Usuários</title>\n");
      out.write("        <link rel=\"icon\" href=\"agendaIcon.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link href=\"css/cadUser.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"inner_header\">\n");
      out.write("                <div id=\"logo_container\">\n");
      out.write("                    <a href=\"menuPrincipal.jsp\">\n");
      out.write("                        <h1>Diary<span>BOOK</span></h1>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <ul id=\"navegar\">\n");
      out.write("                    <a><li></li></a>\n");
      out.write("                    <a><li></li></a>\n");
      out.write("                    <a><li></li></a>\n");
      out.write("                    <a><li></li></a>\n");
      out.write("                    <a><li></li></a>\n");
      out.write("                    <a><li></li></a>\n");
      out.write("                    <a><li></li></a>\n");
      out.write("                    <a><li></li></a>\n");
      out.write("                    <a><li></li></a>\n");
      out.write("                    <a><li></li></a>\n");
      out.write("                    <a><li></li></a>\n");
      out.write("                    <a><li></li></a>\n");
      out.write("                    <a><li></li></a>\n");
      out.write("                    <a><li></li></a>\n");
      out.write("                    <a><li>A sua agenda digital</li></a>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section id=\"contact\" id=\"parallax-section\">\n");
      out.write("            <div class=\"form-container\" id=\"form-container\">\n");
      out.write("                <center> \n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-12 col-sm-12\">\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <!-- SECTION TITLE -->\n");
      out.write("                            <div class=\"wow fadeInUp section-title\" data-wow-delay=\"0.2s\">\n");
      out.write("                                <h2>Cadastrar Usuário</h2>\n");
      out.write("                                <p>Junte-se a nós preenchendo os campos abaixo.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-7 col-sm-10\">\n");
      out.write("\n");
      out.write("                            <!-- CONTACT FORM HERE -->\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"wow fadeInUp\" data-wow-delay=\"0.4s\">\n");
      out.write("                                <form name=\"formDeletarUsuario\" action=\"DeletarUsuario\" >\n");
      out.write("                                    <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"id\" placeholder=\"id\" required=\"\" id=\"formControl\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-offset-8 col-md-4 col-sm-offset-6 col-sm-6\">\n");
      out.write("                                        <button  type=\"submit\" class=\"form-control\" name=\"submit\" id=\"btCad\">Cadastrar</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </center>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <p>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"container\" >\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"wow fadeInUp col-md-12 col-sm-12\" data-wow-delay=\"0.8s\">\n");
      out.write("                        <p class=\"white-color\">Copyright &copy; 2019 DiaryBOOK \n");
      out.write("                            | BY: Lucas Daniel</p>\n");
      out.write("                        <div class=\"wow fadeInUp\" data-wow-delay=\"1s\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
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
