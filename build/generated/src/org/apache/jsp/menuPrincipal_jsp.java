package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menuPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>DiaryBOOK</title>\n");
      out.write("        <link rel=\"icon\" href=\"agendaIcon.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link href=\"css/styleCad.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <section id=\"service\">\n");
      out.write("            <div class=\"container\" >\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"col-md-8 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.2s\" id=\"section-title\">\n");
      out.write("                        <!-- SECTION TITLE -->\n");
      out.write("                        <h2>We are DiaryBOOK</h2>\n");
      out.write("                        <p>A sua agenda digital.</p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-sm-6 col-xs-2 wow fadeInUp\">\n");
      out.write("                        <img src=\"agenda.png\" id=\"foto\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.4s\">\n");
      out.write("                    <div id=\"service-thumb\">\n");
      out.write("                        <img src=\"https://img.icons8.com/nolan/64/000000/open-book.png\">\n");
      out.write("                        <a href=\"menuUsuario.jsp\">\n");
      out.write("                            <h4>Dados Pessoais</h4>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.6s\">\n");
      out.write("                    <div id=\"service-thumb\">\n");
      out.write("                        <img src=\"https://img.icons8.com/nolan/64/000000/contacts.png\">\n");
      out.write("                        <a href=\"menuContato.jsp\">\n");
      out.write("                            <h4>Contatos</h4>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.6s\">\n");
      out.write("                    <div id=\"service-thumb\">\n");
      out.write("                        <img src=\"https://img.icons8.com/nolan/64/000000/list.png\">\n");
      out.write("                        <a href=\"menuEndereco.jsp\">\n");
      out.write("                            <h4>Endereco</h4>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.8s\">\n");
      out.write("                    <div id=\"service-thumb\">\n");
      out.write("                        <a href=\"cadastraUsuario.jsp\">\n");
      out.write("                            <img src=\"https://img.icons8.com/nolan/64/000000/add-image.png\">\n");
      out.write("                            <h4>Meio Contato</h4>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
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
