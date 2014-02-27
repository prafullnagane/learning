package org.apache.jsp.selenium;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import de.hybris.platform.util.WebSessionFunctions;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.hmc.jalo.HMCManager;
import de.hybris.platform.hmc.webchips.DisplayState;

public final class hmc_005finit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n\r\n\r\n\r\n<html>\r\n\t<head>\r\n\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\r\n\t\t<title>hybris e-business software</title>\r\n\t</head>\r\n\t\r\n\t");
	
		if( JaloSession.hasCurrentSession() )
		{
			JaloSession.getCurrentSession().close();
			JaloSession.deactivate();
		} 
		DisplayState.unsetCurrent();
		session.invalidate();
	
      out.write("\r\n\t\r\n\t<body>\r\n\t\t<center>\r\n\t\t<h1>Selenium vs. HMC</h1><br>\r\n\t\tThis page is for testing purposes only and does nothing more than clean the Jalo session and set the language to DE.<br><br>\r\n\t\t<br/>\r\n\t\t<br/>\r\n\t\t<a href=\"../index.jsp?lang=de\">HMCLogin</a>\r\n\t\t</center>\r\n\t</body>\r\n</html>\r\n");
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
