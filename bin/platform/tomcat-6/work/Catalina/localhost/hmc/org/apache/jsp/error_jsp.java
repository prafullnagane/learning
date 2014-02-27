package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.MessageFormat;
import java.io.PrintWriter;
import de.hybris.platform.util.Config;
import de.hybris.platform.hmc.*;
import de.hybris.platform.hmc.jalo.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

	boolean developerMode = "true".equals( session.getAttribute( "developermode" ) );

      out.write("\r\n\r\n<html>\r\n\t<head>\r\n\t\t<title>hybris Management Console (hMC)</title>\r\n\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\">\r\n\t\t<meta http-equiv=\"expires\" content=\"0\">\r\n\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n\t\t<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"css/hmc.css\"/>\r\n\t</head>\r\n\t\r\n\t<body>\r\n\r\n\t\t<table style=\"height:100%; width: 100%; white-space:nowrap;\" width=\"100%\" height=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" >\r\n\t\t\t\t<tr class=\"page-header\">\r\n\t\t\t\t\t<td class=\"page-header-left\"><span class=\"error_headline\" style=\"color:white;font-size:24px;font-weight:bold;margin-left:10px\">Error</span></td>\r\n\t\t\t\t\t<td align=\"right\" valign=\"top\" class=\"page-header-right\"><img src=\"css/src/images/y_logo_platform.gif\" border=\"0\" name=\"logo\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr style=\"vertical-align: top;\">\r\n\t\t\t\t\t<td style=\"vertical-align: top; white-space: nowrap;\" colspan=\"2\" id=\"outerTD\">\r\n\t\t\t\t\t\t<table cellspacing=\"0\" cellpadding=\"0\" class=\"content_table\" style=\"height: 100%; width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t\t<tbody><tr>\r\n\t\t\t\t\t\t\t\t<td align=\"top\" class=\"toolbar_container\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t<table cellspacing=\"0\" cellpadding=\"0\" class=\"toolbar\">\r\n\t\t\t\t\t\t\t\t\t\t<tbody><tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td class=\"leftActionChips\">&nbsp;</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td class=\"rightActionChips\">&nbsp;</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</tbody>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</tbody>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t</tr>\r\n\t<tr height=\"100%\">\r\n\t\t<td colspan=\"2\" class=\"error_content\" style=\"padding:20px;background-color:white\" valign=\"top\">\r\n\t\t\t\t\t\t<table width=\"600px\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td class=\"item\">\r\n\t\t\t\t\t\t\t\t\t");

										if( developerMode ) 
										{
											Exception exp = (Exception)session.getAttribute( "exception" );	
											PrintWriter pw = new PrintWriter( out, true );
									
      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<b>Unhandled Exception:</b><br/>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<pre>\r\n\t\t\t\t\t\t\t\t\t");
	
											exp.printStackTrace( pw ); 
											if( exp instanceof HMCSystemException && ((HMCSystemException)exp).getThrowable() != null )
											{
												((HMCSystemException)exp).getThrowable().printStackTrace( pw );
											}
									
      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</pre>\r\n\t\t\t\t\t\t\t\t\t");
	
										}
										else
										{
											String errormessage = (String) session.getAttribute("localizederrormessage");
											if( errormessage != null )
											{
												out.println( MessageFormat.format(errormessage, new Object[] { new java.util.Date().toString() }) );
											}
										}
									
      out.write("\r\n\t\t\t\t\t\t\t\t\t<p><a href=\"");
      out.print(HMCMasterServlet.MASTERSERVLET);
      out.write("\">Neu anmelden / Login again</a></p>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr style=\"width:100%; height:7px;\">\r\n\t\t\t\t\t<td colspan=\"2\"> </td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\r\n\t</body>\r\n</html>\r\n");
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
