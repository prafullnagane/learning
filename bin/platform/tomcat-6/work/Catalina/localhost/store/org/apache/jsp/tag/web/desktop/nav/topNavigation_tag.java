package org.apache.jsp.tag.web.desktop.nav;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class topNavigation_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/common/tld/cmstags.tld");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody;

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
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.release();
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.release();
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
      out.write("<div id=\"nav_main\" class=\"nav_main\">\n");
      out.write("\t<div class=\"left_corner\" id=\"left_corner\">&nbsp;</div>\n");
      out.write("\t");
      if (_jspx_meth_cms_005fpageSlot_005f0(_jspx_page_context))
        return;
      out.write("<div class=\"right-corner\" id=\"right-corner\">&nbsp;\n");
      out.write("\t  <div class=\"right-ribin\">&nbsp;</div>\n");
      out.write("\t</div>\n");
      out.write("</div>");
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
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_cms_005fpageSlot_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  cms:pageSlot
    de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag _jspx_th_cms_005fpageSlot_005f0 = (de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag) _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.get(de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag.class);
    _jspx_th_cms_005fpageSlot_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fpageSlot_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/nav/topNavigation.tag(7,1) name = position type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f0.setPosition("NavigationBar");
    // /WEB-INF/tags/desktop/nav/topNavigation.tag(7,1) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f0.setVar("component");
    // /WEB-INF/tags/desktop/nav/topNavigation.tag(7,1) name = element type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f0.setElement("ul");
    // /WEB-INF/tags/desktop/nav/topNavigation.tag(7,1) null
    _jspx_th_cms_005fpageSlot_005f0.setDynamicAttribute(null, "class", new String("clear_fix"));
    int _jspx_eval_cms_005fpageSlot_005f0 = _jspx_th_cms_005fpageSlot_005f0.doStartTag();
    if (_jspx_eval_cms_005fpageSlot_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_cms_005fpageSlot_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_cms_005fpageSlot_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_cms_005fpageSlot_005f0.doInitBody();
      }
      do {
        if (_jspx_meth_cms_005fcomponent_005f0(_jspx_th_cms_005fpageSlot_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_cms_005fpageSlot_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_cms_005fpageSlot_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_cms_005fpageSlot_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.reuse(_jspx_th_cms_005fpageSlot_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.reuse(_jspx_th_cms_005fpageSlot_005f0);
    return false;
  }

  private boolean _jspx_meth_cms_005fcomponent_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cms_005fpageSlot_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  cms:component
    de.hybris.platform.acceleratorcms.tags2.CMSComponentTag _jspx_th_cms_005fcomponent_005f0 = (de.hybris.platform.acceleratorcms.tags2.CMSComponentTag) _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.get(de.hybris.platform.acceleratorcms.tags2.CMSComponentTag.class);
    _jspx_th_cms_005fcomponent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fcomponent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cms_005fpageSlot_005f0);
    // /WEB-INF/tags/desktop/nav/topNavigation.tag(8,2) name = component type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fcomponent_005f0.setComponent((de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${component}", de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel.class, (PageContext)this.getJspContext(), null, false));
    int _jspx_eval_cms_005fcomponent_005f0 = _jspx_th_cms_005fcomponent_005f0.doStartTag();
    if (_jspx_th_cms_005fcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f0);
    return false;
  }
}
