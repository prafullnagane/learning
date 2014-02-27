package org.apache.jsp.tag.web.desktop.nav;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class categoryNav_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(9);
    _jspx_dependants.add("/WEB-INF/common/tld/ycommercetags.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/nav/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/nav/categoryNavLinks.tag");
    _jspx_dependants.add("/WEB-INF/tags/shared/theme/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/nav/facetNavAppliedFilters.tag");
    _jspx_dependants.add("/WEB-INF/tags/shared/theme/image.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/nav/facetNavRefinements.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/nav/facetNavRefinementStoresFacet.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/nav/facetNavRefinementFacet.tag");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
  private de.hybris.platform.commerceservices.search.facetdata.ProductCategorySearchPageData pageData;

  public de.hybris.platform.commerceservices.search.facetdata.ProductCategorySearchPageData getPageData() {
    return this.pageData;
  }

  public void setPageData(de.hybris.platform.commerceservices.search.facetdata.ProductCategorySearchPageData pageData) {
    this.pageData = pageData;
    jspContext.setAttribute("pageData", pageData);
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
    if( getPageData() != null ) 
      _jspx_page_context.setAttribute("pageData", getPageData());

    try {
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
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

  private boolean _jspx_meth_c_005fchoose_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/tags/desktop/nav/categoryNav.tag(13,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${showCategoriesOnly}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_nav_005fcategoryNavLinks_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_nav_005fcategoryNavLinks_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  nav:categoryNavLinks
    org.apache.jsp.tag.web.desktop.nav.categoryNavLinks_tag _jspx_th_nav_005fcategoryNavLinks_005f0 = new org.apache.jsp.tag.web.desktop.nav.categoryNavLinks_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_nav_005fcategoryNavLinks_005f0);
    _jspx_th_nav_005fcategoryNavLinks_005f0.setJspContext(_jspx_page_context);
    _jspx_th_nav_005fcategoryNavLinks_005f0.setParent(_jspx_th_c_005fwhen_005f0);
    // /WEB-INF/tags/desktop/nav/categoryNav.tag(14,2) name = categories type = java.util.List reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_nav_005fcategoryNavLinks_005f0.setCategories((java.util.List) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageData.subCategories}", java.util.List.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_nav_005fcategoryNavLinks_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_nav_005fcategoryNavLinks_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_nav_005ffacetNavAppliedFilters_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
          return true;
        if (_jspx_meth_nav_005ffacetNavRefinements_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_nav_005ffacetNavAppliedFilters_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  nav:facetNavAppliedFilters
    org.apache.jsp.tag.web.desktop.nav.facetNavAppliedFilters_tag _jspx_th_nav_005ffacetNavAppliedFilters_005f0 = new org.apache.jsp.tag.web.desktop.nav.facetNavAppliedFilters_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_nav_005ffacetNavAppliedFilters_005f0);
    _jspx_th_nav_005ffacetNavAppliedFilters_005f0.setJspContext(_jspx_page_context);
    _jspx_th_nav_005ffacetNavAppliedFilters_005f0.setParent(_jspx_th_c_005fotherwise_005f0);
    // /WEB-INF/tags/desktop/nav/categoryNav.tag(18,2) name = pageData type = de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_nav_005ffacetNavAppliedFilters_005f0.setPageData((de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageData}", de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_nav_005ffacetNavAppliedFilters_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_nav_005ffacetNavAppliedFilters_005f0);
    return false;
  }

  private boolean _jspx_meth_nav_005ffacetNavRefinements_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  nav:facetNavRefinements
    org.apache.jsp.tag.web.desktop.nav.facetNavRefinements_tag _jspx_th_nav_005ffacetNavRefinements_005f0 = new org.apache.jsp.tag.web.desktop.nav.facetNavRefinements_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_nav_005ffacetNavRefinements_005f0);
    _jspx_th_nav_005ffacetNavRefinements_005f0.setJspContext(_jspx_page_context);
    _jspx_th_nav_005ffacetNavRefinements_005f0.setParent(_jspx_th_c_005fotherwise_005f0);
    // /WEB-INF/tags/desktop/nav/categoryNav.tag(19,2) name = pageData type = de.hybris.platform.commerceservices.search.facetdata.FacetSearchPageData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_nav_005ffacetNavRefinements_005f0.setPageData((de.hybris.platform.commerceservices.search.facetdata.FacetSearchPageData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageData}", de.hybris.platform.commerceservices.search.facetdata.FacetSearchPageData.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_nav_005ffacetNavRefinements_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_nav_005ffacetNavRefinements_005f0);
    return false;
  }
}
