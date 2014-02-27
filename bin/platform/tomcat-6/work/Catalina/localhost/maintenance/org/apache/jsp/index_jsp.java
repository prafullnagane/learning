package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//thestyleworks.de//DTD XHTML 1.0 Custom//EN\" \"../dtd/xhtml1-custom.dtd\">\r\n\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"de\" lang=\"de\">\r\n<head>\r\n\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF8\">\r\n\t<link rel=\"stylesheet\" href=\"styles/hybris_main.css\">\r\n\t<title>Maintenance page - hybris platform </title>\r\n</head>\r\n<body>\r\n<div id=\"head\">\r\n\t&nbsp;\r\n</div>\r\n<div id=\"rightmargin\">&nbsp;</div>\r\n\t\t<div id=\"headsystem\" class=\"header\">\r\n\t\t</div>\r\n<div id=\"headtop\">\r\n\t<img name =\"head_E-Business_Software\" src=\"images/HEAD_e-business_platform.gif\" />\r\n\t<br /> \r\n \t<img src=\"images/transp.gif\" height=\"20\" /> \r\n \t<br /> \r\n \t<div class=\"header\">Maintenance Page</div>\r\n \t<div class=\"header\" style=\"font-size: 8px;\">SID ");
      out.print(request.getSession().getId());
      out.write("</div>\r\n</div>\r\n<div id=\"MainNav\">\r\n</div>\r\n\r\n<div id=\"Scaleback\">&nbsp;</div>\r\n\r\n<div id=\"main\">\r\n\r\n\r\n\t<div id=\"right\">\r\n\t</div>\r\n\t\r\n\t<div id=\"content\">\r\n<div id=\"absatz\" align=\"left\">\r\n\t\t&nbsp;\r\n\t</div>\r\n\t\r\n\r\n</div>\r\n\r\n<div id=\"absatz\" align=\"left\">\r\n<p>We're currently down for maintenance.</p>\r\n<p>Sorry for the inconvenience. We'll be back shortly. Please email us if you need to get in touch.</p>\r\n\r\nPlease try again later.\r\n");

if(request.getParameter( "backurl" )!=null)
{

      out.write("\r\n <a href=\"");
      out.print(request.getParameter( "backurl" ) );
      out.write('"');
      out.write('>');
      out.print(request.getParameter( "backurl" ) );
      out.write("</a>\r\n");

}

      out.write("\r\n<br/><br/><br/>\r\n<br/><br/><br/>\r\n\r\n</div>\r\n\t\r\n<div id=\"absatz\" align=\"left\">Copyright (c) 2000-2013 hybris AG - <a href=\"http://www.hybris.com\">www.hybris.com</a></font><p></div >\r\n</div>\r\n</div>\r\n</body>\r\n</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
