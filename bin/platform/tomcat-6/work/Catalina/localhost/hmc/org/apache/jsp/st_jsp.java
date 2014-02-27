package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import de.hybris.platform.core.*;
import de.hybris.platform.jalo.security.*;
import de.hybris.platform.jalo.*;
import de.hybris.platform.util.*;
import de.hybris.platform.jalo.media.*;
import de.hybris.platform.jalo.type.*;
import de.hybris.platform.util.Config;
import de.hybris.platform.hmc.webchips.*;
import de.hybris.platform.hmc.webchips.event.*;
import de.hybris.platform.hmc.*;
import de.hybris.platform.hmc.administration.*;
import de.hybris.platform.hmc.attribute.*;
import de.hybris.platform.hmc.enumeration.*;
import de.hybris.platform.hmc.generic.*;
import de.hybris.platform.hmc.generic.organizer.*;
import de.hybris.platform.hmc.media.*;
import de.hybris.platform.hmc.security.*;
import java.io.*;
import org.apache.log4j.*;
import de.hybris.platform.licence.Licence;

public final class st_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n\r\n\r\n<!-- TEST PAGE FOR SESSION SERIALIZATION AND FAILOVER -->\r\n\r\n\r\n");

	JaloSession jaloSession = WebSessionFunctions.getSession( request );
	DisplayState state = (DisplayState)session.getAttribute("state");
	
	//out.println( session.getId() );


	if( request.getParameter("save")!=null )
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
		ObjectOutputStream oos = new ObjectOutputStream(baos); 
		oos.writeObject( jaloSession ); 
		byte[] buf = baos.toByteArray(); 
		session.setAttribute( "savedsession", buf );
		
		out.println("saved JaloSession [bytes]: "+buf.length+"<p>");
		
		baos = new ByteArrayOutputStream(); 
		oos = new ObjectOutputStream(baos); 
		oos.writeObject( state ); 
		buf = baos.toByteArray(); 
		session.setAttribute( "savedstate", buf );
		
		out.println("saved DisplayState [bytes]: "+buf.length+"<p>");
	}
	
	if( request.getParameter("restore")!=null )
	{

		ByteArrayInputStream bi = new ByteArrayInputStream( (byte[])session.getAttribute("savedsession") );
		ObjectInputStream ois = new ObjectInputStream(bi);
		JaloSession sess = (JaloSession)ois.readObject();
		session.setAttribute("jalosession", sess );
		sess.activate();
		
		bi = new ByteArrayInputStream( (byte[])session.getAttribute("savedstate") );
		ois = new ObjectInputStream(bi);
		DisplayState ds = (DisplayState)ois.readObject();
		session.setAttribute("state", ds );
		
		out.println("restored JaloSession and displaystate");	
	}

	

      out.write("\r\n<a href=\"st.jsp?save=true\">save current session</a><p>\r\n<a href=\"st.jsp?restore=true\">Restore current session</a><p>\r\n\r\n\t\r\n\r\n\r\n\r\n");
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
