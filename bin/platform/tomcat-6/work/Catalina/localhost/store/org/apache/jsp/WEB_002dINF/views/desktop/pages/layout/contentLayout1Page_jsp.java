package org.apache.jsp.WEB_002dINF.views.desktop.pages.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contentLayout1Page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(34);
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/implicit.tld");
    _jspx_dependants.add("/WEB-INF/common/tld/cmstags.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/nav/breadcrumb/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/page.tag");
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
    _jspx_dependants.add("/WEB-INF/common/tld/ycommercetags.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/common/header/languageSelector.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/common/header/currencySelector.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/nav/topNavigation.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/cart/addToCart.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/common/footer/footer.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/nav/breadcrumb/breadcrumb.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005felement_005fcomponent_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005felement_005fcomponent_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement.release();
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005felement_005fcomponent_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.release();
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.release();
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

      if (_jspx_meth_template_005fpage_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_template_005fpage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:page
    org.apache.jsp.tag.web.desktop.template.page_tag _jspx_th_template_005fpage_005f0 = new org.apache.jsp.tag.web.desktop.template.page_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_template_005fpage_005f0);
    _jspx_th_template_005fpage_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(6,0) name = pageTitle type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_template_005fpage_005f0.setPageTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_template_005fpage_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_template_005fpage_005f0, null));
    _jspx_th_template_005fpage_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_template_005fpage_005f0);
    return false;
  }

  private boolean _jspx_meth_breadcrumb_005fbreadcrumb_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  breadcrumb:breadcrumb
    org.apache.jsp.tag.web.desktop.nav.breadcrumb.breadcrumb_tag _jspx_th_breadcrumb_005fbreadcrumb_005f0 = new org.apache.jsp.tag.web.desktop.nav.breadcrumb.breadcrumb_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_breadcrumb_005fbreadcrumb_005f0);
    _jspx_th_breadcrumb_005fbreadcrumb_005f0.setJspContext(_jspx_page_context);
    _jspx_th_breadcrumb_005fbreadcrumb_005f0.setParent(_jspx_parent);
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(8,2) name = breadcrumbs type = java.util.List reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_breadcrumb_005fbreadcrumb_005f0.setBreadcrumbs((java.util.List) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${breadcrumbs}", java.util.List.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_breadcrumb_005fbreadcrumb_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_breadcrumb_005fbreadcrumb_005f0);
    return false;
  }

  private boolean _jspx_meth_cms_005fpageSlot_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cms:pageSlot
    de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag _jspx_th_cms_005fpageSlot_005f0 = (de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag) _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement.get(de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag.class);
    _jspx_th_cms_005fpageSlot_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fpageSlot_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(11,1) name = position type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f0.setPosition("Section1");
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(11,1) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f0.setVar("feature");
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(11,1) name = element type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f0.setElement("div");
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
      _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement.reuse(_jspx_th_cms_005fpageSlot_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement.reuse(_jspx_th_cms_005fpageSlot_005f0);
    return false;
  }

  private boolean _jspx_meth_cms_005fcomponent_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cms_005fpageSlot_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cms:component
    de.hybris.platform.acceleratorcms.tags2.CMSComponentTag _jspx_th_cms_005fcomponent_005f0 = (de.hybris.platform.acceleratorcms.tags2.CMSComponentTag) _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005felement_005fcomponent_005fclass_005fnobody.get(de.hybris.platform.acceleratorcms.tags2.CMSComponentTag.class);
    _jspx_th_cms_005fcomponent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fcomponent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cms_005fpageSlot_005f0);
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(12,2) name = component type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fcomponent_005f0.setComponent((de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${feature}", de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(12,2) name = element type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fcomponent_005f0.setElement("div");
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(12,2) null
    _jspx_th_cms_005fcomponent_005f0.setDynamicAttribute(null, "class", new String("span-24 section1 cms_disp-img_slot"));
    int _jspx_eval_cms_005fcomponent_005f0 = _jspx_th_cms_005fcomponent_005f0.doStartTag();
    if (_jspx_th_cms_005fcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005felement_005fcomponent_005fclass_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005felement_005fcomponent_005fclass_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f0);
    return false;
  }

  private boolean _jspx_meth_cms_005fpageSlot_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cms:pageSlot
    de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag _jspx_th_cms_005fpageSlot_005f1 = (de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag) _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.get(de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag.class);
    _jspx_th_cms_005fpageSlot_005f1.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fpageSlot_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(16,2) name = position type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f1.setPosition("Section2A");
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(16,2) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f1.setVar("feature");
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(16,2) name = element type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f1.setElement("div");
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(16,2) null
    _jspx_th_cms_005fpageSlot_005f1.setDynamicAttribute(null, "class", new String("span-4 zone_a cms_disp-img_slot"));
    int _jspx_eval_cms_005fpageSlot_005f1 = _jspx_th_cms_005fpageSlot_005f1.doStartTag();
    if (_jspx_eval_cms_005fpageSlot_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_cms_005fpageSlot_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_cms_005fpageSlot_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_cms_005fpageSlot_005f1.doInitBody();
      }
      do {
        if (_jspx_meth_cms_005fcomponent_005f1(_jspx_th_cms_005fpageSlot_005f1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_cms_005fpageSlot_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_cms_005fpageSlot_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_cms_005fpageSlot_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.reuse(_jspx_th_cms_005fpageSlot_005f1);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.reuse(_jspx_th_cms_005fpageSlot_005f1);
    return false;
  }

  private boolean _jspx_meth_cms_005fcomponent_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_cms_005fpageSlot_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cms:component
    de.hybris.platform.acceleratorcms.tags2.CMSComponentTag _jspx_th_cms_005fcomponent_005f1 = (de.hybris.platform.acceleratorcms.tags2.CMSComponentTag) _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.get(de.hybris.platform.acceleratorcms.tags2.CMSComponentTag.class);
    _jspx_th_cms_005fcomponent_005f1.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fcomponent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cms_005fpageSlot_005f1);
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(17,3) name = component type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fcomponent_005f1.setComponent((de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${feature}", de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_cms_005fcomponent_005f1 = _jspx_th_cms_005fcomponent_005f1.doStartTag();
    if (_jspx_th_cms_005fcomponent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f1);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f1);
    return false;
  }

  private boolean _jspx_meth_cms_005fpageSlot_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cms:pageSlot
    de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag _jspx_th_cms_005fpageSlot_005f2 = (de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag) _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.get(de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag.class);
    _jspx_th_cms_005fpageSlot_005f2.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fpageSlot_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(20,2) name = position type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f2.setPosition("Section2B");
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(20,2) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f2.setVar("feature");
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(20,2) name = element type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f2.setElement("div");
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(20,2) null
    _jspx_th_cms_005fpageSlot_005f2.setDynamicAttribute(null, "class", new String("span-20 zone_b last"));
    int _jspx_eval_cms_005fpageSlot_005f2 = _jspx_th_cms_005fpageSlot_005f2.doStartTag();
    if (_jspx_eval_cms_005fpageSlot_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_cms_005fpageSlot_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_cms_005fpageSlot_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_cms_005fpageSlot_005f2.doInitBody();
      }
      do {
        if (_jspx_meth_cms_005fcomponent_005f2(_jspx_th_cms_005fpageSlot_005f2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_cms_005fpageSlot_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_cms_005fpageSlot_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_cms_005fpageSlot_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.reuse(_jspx_th_cms_005fpageSlot_005f2);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.reuse(_jspx_th_cms_005fpageSlot_005f2);
    return false;
  }

  private boolean _jspx_meth_cms_005fcomponent_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_cms_005fpageSlot_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cms:component
    de.hybris.platform.acceleratorcms.tags2.CMSComponentTag _jspx_th_cms_005fcomponent_005f2 = (de.hybris.platform.acceleratorcms.tags2.CMSComponentTag) _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.get(de.hybris.platform.acceleratorcms.tags2.CMSComponentTag.class);
    _jspx_th_cms_005fcomponent_005f2.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fcomponent_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cms_005fpageSlot_005f2);
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(21,3) name = component type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fcomponent_005f2.setComponent((de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${feature}", de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_cms_005fcomponent_005f2 = _jspx_th_cms_005fcomponent_005f2.doStartTag();
    if (_jspx_th_cms_005fcomponent_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f2);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f2);
    return false;
  }

  private boolean _jspx_meth_cms_005fpageSlot_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cms:pageSlot
    de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag _jspx_th_cms_005fpageSlot_005f3 = (de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag) _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.get(de.hybris.platform.acceleratorcms.tags2.CMSContentSlotTag.class);
    _jspx_th_cms_005fpageSlot_005f3.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fpageSlot_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(25,1) name = position type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f3.setPosition("Section3");
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(25,1) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f3.setVar("feature");
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(25,1) name = element type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fpageSlot_005f3.setElement("div");
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(25,1) null
    _jspx_th_cms_005fpageSlot_005f3.setDynamicAttribute(null, "class", new String("span-24 section3 cms_disp-img_slot"));
    int _jspx_eval_cms_005fpageSlot_005f3 = _jspx_th_cms_005fpageSlot_005f3.doStartTag();
    if (_jspx_eval_cms_005fpageSlot_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_cms_005fpageSlot_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_cms_005fpageSlot_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_cms_005fpageSlot_005f3.doInitBody();
      }
      do {
        if (_jspx_meth_cms_005fcomponent_005f3(_jspx_th_cms_005fpageSlot_005f3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_cms_005fpageSlot_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_cms_005fpageSlot_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_cms_005fpageSlot_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.reuse(_jspx_th_cms_005fpageSlot_005f3);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fpageSlot_0026_005fvar_005fposition_005felement_005fclass.reuse(_jspx_th_cms_005fpageSlot_005f3);
    return false;
  }

  private boolean _jspx_meth_cms_005fcomponent_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_cms_005fpageSlot_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cms:component
    de.hybris.platform.acceleratorcms.tags2.CMSComponentTag _jspx_th_cms_005fcomponent_005f3 = (de.hybris.platform.acceleratorcms.tags2.CMSComponentTag) _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.get(de.hybris.platform.acceleratorcms.tags2.CMSComponentTag.class);
    _jspx_th_cms_005fcomponent_005f3.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fcomponent_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cms_005fpageSlot_005f3);
    // /WEB-INF/views/desktop/pages/layout/contentLayout1Page.jsp(26,2) name = component type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fcomponent_005f3.setComponent((de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${feature}", de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_cms_005fcomponent_005f3 = _jspx_th_cms_005fcomponent_005f3.doStartTag();
    if (_jspx_th_cms_005fcomponent_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f3);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fcms_005fcomponent_0026_005fcomponent_005fnobody.reuse(_jspx_th_cms_005fcomponent_005f3);
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
      out.write("<div id=\"breadcrumb\" class=\"breadcrumb\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_breadcrumb_005fbreadcrumb_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_cms_005fpageSlot_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<div class=\"span-24 section2\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_cms_005fpageSlot_005f1(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_cms_005fpageSlot_005f2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_cms_005fpageSlot_005f3(_jspx_parent, _jspx_page_context))
        return true;
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
