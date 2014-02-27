package org.apache.jsp.tag.web.desktop.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class master_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(18);
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/implicit.tld");
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
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005ftext_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;

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
  private java.lang.String metaDescription;
  private java.lang.String metaKeywords;
  private javax.servlet.jsp.tagext.JspFragment pageCss;
  private javax.servlet.jsp.tagext.JspFragment pageScripts;

  public java.lang.String getPageTitle() {
    return this.pageTitle;
  }

  public void setPageTitle(java.lang.String pageTitle) {
    this.pageTitle = pageTitle;
    jspContext.setAttribute("pageTitle", pageTitle);
  }

  public java.lang.String getMetaDescription() {
    return this.metaDescription;
  }

  public void setMetaDescription(java.lang.String metaDescription) {
    this.metaDescription = metaDescription;
    jspContext.setAttribute("metaDescription", metaDescription);
  }

  public java.lang.String getMetaKeywords() {
    return this.metaKeywords;
  }

  public void setMetaKeywords(java.lang.String metaKeywords) {
    this.metaKeywords = metaKeywords;
    jspContext.setAttribute("metaKeywords", metaKeywords);
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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005ftext_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005ftext_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
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
    if( getMetaDescription() != null ) 
      _jspx_page_context.setAttribute("metaDescription", getMetaDescription());
    if( getMetaKeywords() != null ) 
      _jspx_page_context.setAttribute("metaKeywords", getMetaKeywords());
    if( getPageCss() != null ) 
      _jspx_page_context.setAttribute("pageCss", getPageCss());
    if( getPageScripts() != null ) 
      _jspx_page_context.setAttribute("pageScripts", getPageScripts());

    try {
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentLanguage.isocode}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\">\n");
      out.write("<head>\n");
      out.write("\t<title>\n");
      out.write("\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty pageTitle ? pageTitle : not empty cmsPage.title ? cmsPage.title : 'Accelerator Title'}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_spring_005ftheme_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${faviconURL}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\" type=\"image/x-icon\"/>\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_template_005fstyleSheets_005f0(_jspx_page_context))
        return;
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getPageCss() != null) {
        getPageCss().invoke(_jspx_sout);
      }
      jspContext.getELContext().putContext(JspContext.class,getJspContext());
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${commonResourcePath}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("/js/jquery-1.7.2.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t");
      if (_jspx_meth_analytics_005fanalytics_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_template_005fjavaScriptVariables_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageBodyCssClasses}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cmsPageRequestContextData.liveEdit ? ' yCmsLiveEdit' : ''}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write(" language-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentLanguage.isocode}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\">\n");
      out.write("\n");
      out.write("\t");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      jspContext.getELContext().putContext(JspContext.class,getJspContext());
      out.write("<form name=\"accessiblityForm\">\n");
      out.write("\t\t<input type=\"hidden\" id=\"accesibility_refreshScreenReaderBufferField\" name=\"accesibility_refreshScreenReaderBufferField\" value=\"\"/>\n");
      out.write("\t</form>\n");
      out.write("\t<div id=\"ariaStatusMsg\" class=\"skip\" role=\"status\" aria-relevant=\"text\" aria-live=\"polite\"></div>\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_template_005fjavaScript_005f0(_jspx_page_context))
        return;
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getPageScripts() != null) {
        getPageScripts().invoke(_jspx_sout);
      }
      jspContext.getELContext().putContext(JspContext.class,getJspContext());
      out.write("</body>\n");
      out.write("\n");
      if (_jspx_meth_debug_005fdebugFooter_005f0(_jspx_page_context))
        return;
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/template/master.tag(25,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("metatag");
    // /WEB-INF/tags/desktop/template/master.tag(25,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/tags/desktop/template/master.tag(25,1) '${metatags}'",_el_expressionfactory.createValueExpression(this.getJspContext().getELContext(),"${metatags}",java.lang.Object.class)).getValue(this.getJspContext().getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/tags/desktop/template/master.tag(26,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty metatag.content}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<meta name=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${metatag.name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("\" content=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${metatag.content}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("\" />\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f0 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/template/master.tag(32,1) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f0.setCode("img.favIcon");
    // /WEB-INF/tags/desktop/template/master.tag(32,1) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f0.setText("/");
    // /WEB-INF/tags/desktop/template/master.tag(32,1) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f0.setVar("favIconPath");
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
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/template/master.tag(33,1) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${favIconPath}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    // /WEB-INF/tags/desktop/template/master.tag(33,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("faviconURL");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fstyleSheets_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  template:styleSheets
    org.apache.jsp.tag.web.desktop.template.styleSheets_tag _jspx_th_template_005fstyleSheets_005f0 = new org.apache.jsp.tag.web.desktop.template.styleSheets_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_template_005fstyleSheets_005f0);
    _jspx_th_template_005fstyleSheets_005f0.setJspContext(_jspx_page_context);
    _jspx_th_template_005fstyleSheets_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_template_005fstyleSheets_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_template_005fstyleSheets_005f0);
    return false;
  }

  private boolean _jspx_meth_analytics_005fanalytics_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  analytics:analytics
    org.apache.jsp.tag.web.shared.analytics.analytics_tag _jspx_th_analytics_005fanalytics_005f0 = new org.apache.jsp.tag.web.shared.analytics.analytics_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_analytics_005fanalytics_005f0);
    _jspx_th_analytics_005fanalytics_005f0.setJspContext(_jspx_page_context);
    _jspx_th_analytics_005fanalytics_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_analytics_005fanalytics_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_analytics_005fanalytics_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fjavaScriptVariables_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  template:javaScriptVariables
    org.apache.jsp.tag.web.desktop.template.javaScriptVariables_tag _jspx_th_template_005fjavaScriptVariables_005f0 = new org.apache.jsp.tag.web.desktop.template.javaScriptVariables_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_template_005fjavaScriptVariables_005f0);
    _jspx_th_template_005fjavaScriptVariables_005f0.setJspContext(_jspx_page_context);
    _jspx_th_template_005fjavaScriptVariables_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_template_005fjavaScriptVariables_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_template_005fjavaScriptVariables_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/template/master.tag(48,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty googleApiVersion}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<script type=\"text/javascript\" src=\"http://maps.googleapis.com/maps/api/js?v=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${googleApiVersion}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("&amp;key=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${googleApiKey}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("&amp;sensor=false\"></script>\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_template_005fjavaScript_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  template:javaScript
    org.apache.jsp.tag.web.desktop.template.javaScript_tag _jspx_th_template_005fjavaScript_005f0 = new org.apache.jsp.tag.web.desktop.template.javaScript_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_template_005fjavaScript_005f0);
    _jspx_th_template_005fjavaScript_005f0.setJspContext(_jspx_page_context);
    _jspx_th_template_005fjavaScript_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_template_005fjavaScript_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_template_005fjavaScript_005f0);
    return false;
  }

  private boolean _jspx_meth_debug_005fdebugFooter_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  debug:debugFooter
    org.apache.jsp.tag.web.shared.debug.debugFooter_tag _jspx_th_debug_005fdebugFooter_005f0 = new org.apache.jsp.tag.web.shared.debug.debugFooter_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_debug_005fdebugFooter_005f0);
    _jspx_th_debug_005fdebugFooter_005f0.setJspContext(_jspx_page_context);
    _jspx_th_debug_005fdebugFooter_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_debug_005fdebugFooter_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_debug_005fdebugFooter_005f0);
    return false;
  }
}
