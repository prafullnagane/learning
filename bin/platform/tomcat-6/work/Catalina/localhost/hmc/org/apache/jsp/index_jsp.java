package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import de.hybris.platform.hmc.HMCMasterServlet;
import de.hybris.platform.core.Tenant;
import de.hybris.platform.core.Registry;
import de.hybris.platform.core.SlaveTenant;

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

      out.write("\r\n\r\n");

 String backurl = request.getParameter("backurl");

      out.write("\r\n\r\n<!DOCTYPE html PUBLIC \"-//thestyleworks.de//DTD XHTML 1.0 Custom//EN\" \"../dtd/xhtml1-custom.dtd\">\r\n\r\n\r\n\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"de\" lang=\"de\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\r\n<link rel=\"stylesheet\" href=\"hybris_frontpage.css\">\r\n<title>[");
      out.print(Registry.getCurrentTenant().getTenantID());
      out.write("] - Management Console - hybris e-business software</title>\r\n</head>\r\n\t\r\n\t<script language = \"JavaScript1.2\">\r\n\t\tx=(screen.width/2)+(screen.width/4)+(screen.width/8);\r\n\t\ty=(screen.height/2)+(screen.height/4);\r\n\t\tnewWindow = window.open(\"");
      out.print(HMCMasterServlet.MASTERSERVLET);
      out.write("\",\"hmc");
      out.print((int)(Math.random()*10000));
      out.write("\", \"height=\"+y+\",width=\"+x+\",screenX=100,screenY=50,status=yes,dependent=yes,scrollbars=yes,resizable=yes,directories=no,location=no,left=80,top=50\");\r\n\t\tnewWindow.focus();\r\n\t</script>\r\n\r\n<body>\r\n<div id=\"head\">\r\n\t&nbsp;\r\n</div><div id=\"rightmargin\">&nbsp;</div>\r\n\t\t<div id=\"headsystem\" class=\"header\">\r\n");

		Tenant hs = Registry.getCurrentTenant();
		if( hs instanceof SlaveTenant )
		{

      out.write(" \r\n\t\t&lt;&lt;");
      out.print(hs.getTenantID());
      out.write("&gt;&gt; <br/>\r\n\t\t<a href=\"/?setmaster=true\" style=\"color:white;font-size:10px;\"> [Back to master tenant] </a>\r\n");

		}

      out.write("\r\n\t\t</div>\r\n<div id=\"headtop\">\r\n\t<img name =\"head_E-Business_Software\" src=\"images/HEAD_e-business_platform.gif\" />\r\n\t<br /> \r\n \t<img src=\"images/transp.gif\" height=\"20\" /> \r\n \t<br /> \r\n \t<div class=\"header\">Management Console</div>\r\n</div>\r\n<div id=\"MainNav\">\r\n</div><div id=\"Scaleback\">&nbsp;</div>\r\n<div id=\"main\">\r\n\r\n\t<div id=\"left\">\r\n\t</div>\r\n\t\r\n\r\n\t<div id=\"right\">\r\n\t</div>\r\n\t\r\n\r\n\t<div id=\"content\">\r\n<div class=\"absatz\">\r\n");

String hacContextPath = de.hybris.platform.util.Utilities.getExtensionInfo("hac").getWebModule().getWebRoot();
if (hacContextPath == null || hacContextPath.length() == 0)
{
  hacContextPath = "/";
}

      out.write("\r\n<a href=\"");
      out.print(response.encodeURL(hacContextPath));
      out.write("\">[Back to main page]</a><p/>\r\n</div>\r\n<div class=\"absatz\">\r\n&nbsp;\r\n</div>\r\n\t\t<p/>\r\n\t\t\t\tNote: If the Management Console window does not open, this may be due to a pop-up window blocker \r\n\t\t\t\tfunction of your web browser. Please disable pop-up blocking for this browser session and refresh this page.\r\n\t</div>\r\n</div>\r\n</body>\r\n</html>\r\n\r\n");

try{session.invalidate();}catch(Exception e ){/**/}

      out.write("\r\n\r\n");
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
