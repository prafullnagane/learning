package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sessiontimeout_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n\t<head>\r\n\t\t<title>hybris HMC</title>\r\n\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-2\">\r\n\t\t<meta http-equiv=\"expires\" content=\"0\">\r\n\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n\t\t<link rel=stylesheet type=\"text/css\" href=\"styles.css\">\r\n\t</head>\r\n\t<body style=\"cursor:default\" bgcolor=\"#D3D3D3\" leftmargin=\"0\" topmargin=\"0\" marginheight=\"0\" marginwidth=\"0\">\r\n\t\t<table width=\"100%\" height=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" valign=\"top\">\r\n\t\t\t<tr style=\"height:29px\">\r\n\t\t\t\t<td height=\"29px\" border=\"0\" valign=\"middle\" align=\"left\" style=\"white-space:nowrap\" style=\"background-image:url(images/window_head_back.jpg);\">\r\n\t\t\t\t &nbsp;&nbsp;<span class=\"head\">Your session has timed out.</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n\t\t\t\t</td>\r\n\t\t\t\t<td align=\"right\" border=\"0\" valign=\"top\" background=\"images/logo-back.gif\"><img src=\"images/headlogo_e-business_platform_2-0.gif\" border=\"0\" name=\"logo\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td colspan=\"2\">\r\n\t\t\t\t\t<center>\r\n\t\t\t\t\t\t<table width=\"600px\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td><img src=\"images/sessiontimeout.jpg\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td class=\"item\">Sessions are stored for a limited amount of time to reduce server load. Once a session is not used for this length it is removed. This has happened to your session. <a href=\"index.jsp\">Click here to start a new session</a></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</center>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</body>\r\n</html>\r\n");
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
