/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2014-04-10 02:57:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.public_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paginaInicial_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<body>\n");
      out.write("\t<!-- Carousel\n");
      out.write("    ================================================== -->\n");
      out.write("\t<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t<!-- Indicators -->\n");
      out.write("\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t</ol>\n");
      out.write("\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t<div class=\"item active\">\n");
      out.write("\t\t\t\t<img src=\"/evs-pedro/resources/img/Espaco-Vida-Saudavel-shake.jpg\"\n");
      out.write("\t\t\t\t\tstyle=\"width: 640px; height: 500px\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t\t<h1>Sobre a Herbalife:</h1>\n");
      out.write("\t\t\t\t\t\t<p>Herbalife Ltd. é uma empresa global de nutrição que\n");
      out.write("\t\t\t\t\t\t\tcomercializa produtos de controle de peso, nutrição e cuidados\n");
      out.write("\t\t\t\t\t\t\tpessoais para um estilo de vida saudável. Os produtos Herbalife\n");
      out.write("\t\t\t\t\t\t\tsão vendidos em mais de 80 países por meio de uma rede de mais\n");
      out.write("\t\t\t\t\t\t\tde 2 milhões de distribuidores independentes.</p>\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-lg btn-primary\" href=\"#myModal\"\n");
      out.write("\t\t\t\t\t\t\t\tdata-toggle=\"modal\">Saiba mais</a>\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t<img src=\"/evs-pedro/resources/img/shakes.jpg\"\n");
      out.write("\t\t\t\t\tstyle=\"width: 640px; height: 500px\" alt=\"Segunda Imagem\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-primary\" data-toggle=\"modal\"\n");
      out.write("\t\t\t\t\t\t\tdata-target=\"#myModal\">Informacoes</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t<img src=\"/evs-pedro/resources/img/EVS.jpg\"\n");
      out.write("\t\t\t\t\tstyle=\"width: 640px; height: 500px\" alt=\"Terceira Imagem\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t\t<!-- Button trigger modal -->\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-primary\" data-toggle=\"modal\"\n");
      out.write("\t\t\t\t\t\t\tdata-target=\"#myModal\">Informacoes</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\"><span\n");
      out.write("\t\t\tclass=\"glyphicon glyphicon-chevron-left\"></span></a> <a\n");
      out.write("\t\t\tclass=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\"><span\n");
      out.write("\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></span></a>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /.carousel -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<!-- Boxes de Acoes -->\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 col-lg-4\">\n");
      out.write("\t\t\t\t<div class=\"box\">\n");
      out.write("\t\t\t\t\t<div class=\"icon\">\n");
      out.write("\t\t\t\t\t\t<div class=\"image\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-thumbs-o-up\"></i>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"info\">\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"title\">Made with Bootstrap</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("\t\t\t\t\t\t\t\tSed in lobortis nisl, vitae iaculis sapien. Phasellus ultrices\n");
      out.write("\t\t\t\t\t\t\t\tgravida massa luctus ornare. Suspendisse blandit quam elit, eu\n");
      out.write("\t\t\t\t\t\t\t\timperdiet neque semper.</p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"more\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" title=\"Title Link\"> Read More <i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-angle-double-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"space\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 col-lg-4\">\n");
      out.write("\t\t\t\t<div class=\"box\">\n");
      out.write("\t\t\t\t\t<div class=\"icon\">\n");
      out.write("\t\t\t\t\t\t<div class=\"image\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-flag\"></i>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"info\">\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"title\">Icons by Font Awesome</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("\t\t\t\t\t\t\t\tSed in lobortis nisl, vitae iaculis sapien. Phasellus ultrices\n");
      out.write("\t\t\t\t\t\t\t\tgravida massa luctus ornare. Suspendisse blandit quam elit, eu\n");
      out.write("\t\t\t\t\t\t\t\timperdiet neque semper.</p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"more\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" title=\"Title Link\"> Read More <i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-angle-double-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"space\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 col-lg-4\">\n");
      out.write("\t\t\t\t<div class=\"box\">\n");
      out.write("\t\t\t\t\t<div class=\"icon\">\n");
      out.write("\t\t\t\t\t\t<div class=\"image\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-desktop\"></i>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"info\">\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"title\">Desktop Friendly</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("\t\t\t\t\t\t\t\tSed in lobortis nisl, vitae iaculis sapien. Phasellus ultrices\n");
      out.write("\t\t\t\t\t\t\t\tgravida massa luctus ornare. Suspendisse blandit quam elit, eu\n");
      out.write("\t\t\t\t\t\t\t\timperdiet neque semper.</p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"more\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" title=\"Title Link\"> Read More <i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-angle-double-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"space\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /Boxes de Acoes -->\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Modal -->\n");
      out.write("\t<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-hidden=\"true\">&times;</button>\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">Modal title</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">...</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Marketing messaging and featurettes\n");
      out.write("    ================================================== -->\n");
      out.write("\t<!-- Wrap the rest of the page in another container to center all the content. -->\n");
      out.write("\t<div class=\"container marketing\"></div>\n");
      out.write("\t<!-- /.container -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
