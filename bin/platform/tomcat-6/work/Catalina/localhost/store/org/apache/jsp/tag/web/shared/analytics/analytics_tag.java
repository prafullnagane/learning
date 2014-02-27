package org.apache.jsp.tag.web.shared.analytics;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class analytics_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/tags/shared/analytics/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/shared/analytics/googleAnalytics.tag");
    _jspx_dependants.add("/WEB-INF/tags/shared/analytics/jirafe.tag");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(JspContext.class,jspContext);

    try {
      if (_jspx_meth_analytics_005fgoogleAnalytics_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_analytics_005fjirafe_005f0(_jspx_page_context))
        return;
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      jspContext.getELContext().putContext(JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }

  private boolean _jspx_meth_analytics_005fgoogleAnalytics_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  analytics:googleAnalytics
    org.apache.jsp.tag.web.shared.analytics.googleAnalytics_tag _jspx_th_analytics_005fgoogleAnalytics_005f0 = new org.apache.jsp.tag.web.shared.analytics.googleAnalytics_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_analytics_005fgoogleAnalytics_005f0);
    _jspx_th_analytics_005fgoogleAnalytics_005f0.setJspContext(_jspx_page_context);
    _jspx_th_analytics_005fgoogleAnalytics_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_analytics_005fgoogleAnalytics_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_analytics_005fgoogleAnalytics_005f0);
    return false;
  }

  private boolean _jspx_meth_analytics_005fjirafe_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  analytics:jirafe
    org.apache.jsp.tag.web.shared.analytics.jirafe_tag _jspx_th_analytics_005fjirafe_005f0 = new org.apache.jsp.tag.web.shared.analytics.jirafe_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_analytics_005fjirafe_005f0);
    _jspx_th_analytics_005fjirafe_005f0.setJspContext(_jspx_page_context);
    _jspx_th_analytics_005fjirafe_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_analytics_005fjirafe_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_analytics_005fjirafe_005f0);
    return false;
  }
}
