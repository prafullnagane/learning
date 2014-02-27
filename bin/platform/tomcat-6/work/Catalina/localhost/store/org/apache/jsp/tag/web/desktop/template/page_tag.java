package org.apache.jsp.tag.web.desktop.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(31);
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/common/header/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/common/footer/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/cart/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/nav/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/master.tag");
    _jspx_dependants.add("/WEB-INF/tags/shared/analytics/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/shared/debug/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/styleSheets.tag");
    _jspx_dependants.add("/WEB-INF/tld/accelerator_granule.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/compressible/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/cms/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/compressible/css.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/cms/previewCSS.tag");
    _jspx_dependants.add("/WEB-INF/tags/shared/analytics/analytics.tag");
    _jspx_dependants.add("/WEB-INF/tags/shared/analytics/googleAnalytics.tag");
    _jspx_dependants.add("/WEB-INF/tags/shared/analytics/jirafe.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/javaScriptVariables.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/javaScript.tag");
    _jspx_dependants.add("/WEB-INF/tags/shared/theme/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/compressible/js.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/cms/previewJS.tag");
    _jspx_dependants.add("/WEB-INF/tags/shared/debug/debugFooter.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/common/header/header.tag");
    _jspx_dependants.add("/WEB-INF/common/tld/cmstags.tld");
    _jspx_dependants.add("/WEB-INF/common/tld/ycommercetags.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/common/header/languageSelector.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/common/header/currencySelector.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/nav/topNavigation.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/cart/addToCart.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/common/footer/footer.tag");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody;

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
  private java.lang.String pageTitle;
  private javax.servlet.jsp.tagext.JspFragment pageCss;
  private javax.servlet.jsp.tagext.JspFragment pageScripts;

  public java.lang.String getPageTitle() {
    return this.pageTitle;
  }

  public void setPageTitle(java.lang.String pageTitle) {
    this.pageTitle = pageTitle;
    jspContext.setAttribute("pageTitle", pageTitle);
  }

  public javax.servlet.jsp.tagext.JspFragment getPageCss() {
    return this.pageCss;
  }

  public void setPageCss(javax.servlet.jsp.tagext.JspFragment pageCss) {
    this.pageCss = pageCss;
    jspContext.setAttribute("pageCss", pageCss);
  }

  public javax.servlet.jsp.tagext.JspFragment getPageScripts() {
    return this.pageScripts;
  }

  public void setPageScripts(javax.servlet.jsp.tagext.JspFragment pageScripts) {
    this.pageScripts = pageScripts;
    jspContext.setAttribute("pageScripts", pageScripts);
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.release();
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
    if( getPageTitle() != null ) 
      _jspx_page_context.setAttribute("pageTitle", getPageTitle());
    if( getPageCss() != null ) 
      _jspx_page_context.setAttribute("pageCss", getPageCss());
    if( getPageScripts() != null ) 
      _jspx_page_context.setAttribute("pageScripts", getPageScripts());

    try {
      if (_jspx_meth_template_005fmaster_005f0(_jspx_page_context))
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
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_template_005fmaster_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  template:master
    org.apache.jsp.tag.web.desktop.template.master_tag _jspx_th_template_005fmaster_005f0 = new org.apache.jsp.tag.web.desktop.template.master_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_template_005fmaster_005f0);
    _jspx_th_template_005fmaster_005f0.setJspContext(_jspx_page_context);
    _jspx_th_template_005fmaster_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/template/page.tag(13,0) name = pageTitle type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_template_005fmaster_005f0.setPageTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageTitle}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    javax.servlet.jsp.tagext.JspFragment _jspx_temp0 = new Helper( 0, _jspx_page_context, _jspx_th_template_005fmaster_005f0, null);
    // /WEB-INF/tags/desktop/template/page.tag(13,0) null
    _jspx_th_template_005fmaster_005f0.setPageCss(_jspx_temp0);
    javax.servlet.jsp.tagext.JspFragment _jspx_temp1 = new Helper( 1, _jspx_page_context, _jspx_th_template_005fmaster_005f0, null);
    // /WEB-INF/tags/desktop/template/page.tag(13,0) null
    _jspx_th_template_005fmaster_005f0.setPageScripts(_jspx_temp1);
    _jspx_th_template_005fmaster_005f0.setJspBody(new Helper( 2, _jspx_page_context, _jspx_th_template_005fmaster_005f0, null));
    _jspx_th_template_005fmaster_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_template_005fmaster_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f0 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/tags/desktop/template/page.tag(26,4) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f0.setCode("text.skipToContent");
    // /WEB-INF/tags/desktop/template/page.tag(26,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f0.setVar("skipToContent");
    int[] _jspx_push_body_count_spring_005ftheme_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f0 = _jspx_th_spring_005ftheme_005f0.doStartTag();
      if (_jspx_th_spring_005ftheme_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f1 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/tags/desktop/template/page.tag(28,4) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f1.setCode("text.skipToNavigation");
    // /WEB-INF/tags/desktop/template/page.tag(28,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f1.setVar("skipToNavigation");
    int[] _jspx_push_body_count_spring_005ftheme_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f1 = _jspx_th_spring_005ftheme_005f1.doStartTag();
      if (_jspx_th_spring_005ftheme_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_header_005fheader_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  header:header
    org.apache.jsp.tag.web.desktop.common.header.header_tag _jspx_th_header_005fheader_005f0 = new org.apache.jsp.tag.web.desktop.common.header.header_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_header_005fheader_005f0);
    _jspx_th_header_005fheader_005f0.setJspContext(_jspx_page_context);
    _jspx_th_header_005fheader_005f0.setParent(_jspx_parent);
    _jspx_th_header_005fheader_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_header_005fheader_005f0);
    return false;
  }

  private boolean _jspx_meth_nav_005ftopNavigation_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  nav:topNavigation
    org.apache.jsp.tag.web.desktop.nav.topNavigation_tag _jspx_th_nav_005ftopNavigation_005f0 = new org.apache.jsp.tag.web.desktop.nav.topNavigation_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_nav_005ftopNavigation_005f0);
    _jspx_th_nav_005ftopNavigation_005f0.setJspContext(_jspx_page_context);
    _jspx_th_nav_005ftopNavigation_005f0.setParent(_jspx_parent);
    _jspx_th_nav_005ftopNavigation_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_nav_005ftopNavigation_005f0);
    return false;
  }

  private boolean _jspx_meth_cart_005faddToCart_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  cart:addToCart
    org.apache.jsp.tag.web.desktop.cart.addToCart_tag _jspx_th_cart_005faddToCart_005f0 = new org.apache.jsp.tag.web.desktop.cart.addToCart_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_cart_005faddToCart_005f0);
    _jspx_th_cart_005faddToCart_005f0.setJspContext(_jspx_page_context);
    _jspx_th_cart_005faddToCart_005f0.setParent(_jspx_parent);
    _jspx_th_cart_005faddToCart_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_cart_005faddToCart_005f0);
    return false;
  }

  private boolean _jspx_meth_footer_005ffooter_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  footer:footer
    org.apache.jsp.tag.web.desktop.common.footer.footer_tag _jspx_th_footer_005ffooter_005f0 = new org.apache.jsp.tag.web.desktop.common.footer.footer_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_footer_005ffooter_005f0);
    _jspx_th_footer_005ffooter_005f0.setJspContext(_jspx_page_context);
    _jspx_th_footer_005ffooter_005f0.setParent(_jspx_parent);
    _jspx_th_footer_005ffooter_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_footer_005ffooter_005f0);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getPageCss() != null) {
        getPageCss().invoke(_jspx_sout);
      }
      jspContext.getELContext().putContext(JspContext.class,getJspContext());
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getPageScripts() != null) {
        getPageScripts().invoke(_jspx_sout);
      }
      jspContext.getELContext().putContext(JspContext.class,getJspContext());
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write("<div id=\"wrapper\">\n");
      out.write("\t\t\t<div id=\"page\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_spring_005ftheme_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<a href=\"#skip-to-content\" class=\"skiptocontent\" data-role=\"none\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${skipToContent}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("</a>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_spring_005ftheme_005f1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<a href=\"#skiptonavigation\" class=\"skiptonavigation\" data-role=\"none\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${skipToNavigation}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("</a>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_header_005fheader_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<a id=\"skiptonavigation\"></a>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_nav_005ftopNavigation_005f0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_cart_005faddToCart_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<div id=\"content\">\n");
      out.write("\t\t\t\t<a id=\"skip-to-content\"></a>\n");
      out.write("\t\t\t\t\t");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      jspContext.getELContext().putContext(JspContext.class,getJspContext());
      out.write("</div>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_footer_005ffooter_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        this.jspContext.getELContext().putContext(JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
