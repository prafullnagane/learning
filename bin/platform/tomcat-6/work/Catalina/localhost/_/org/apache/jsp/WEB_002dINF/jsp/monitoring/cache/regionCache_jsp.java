package org.apache.jsp.WEB_002dINF.jsp.monitoring.cache;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regionCache_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Cache</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" type=\"text/css\" media=\"screen, projection\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" type=\"text/css\" media=\"screen, projection\"/>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"prepend-top span-17 colborder\" id=\"content\">\r\n");
      out.write("\t\t<button id=\"toggleSidebarButton\">&gt;</button>\r\n");
      out.write("\t\t<div class=\"marginLeft marginBottom\">\r\n");
      out.write("\t\t\t<h2>Cache</h2>\r\n");
      out.write("\t\t\t<hr></hr>\r\n");
      out.write("\t\t\t<button id=\"resetCache\" data-url=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\">Clear cache</button>\r\n");
      out.write("\t\t\t</br>\r\n");
      out.write("\t\t\t<div id=\"accordion\" data-updateDataUrl=\"cache/regionCache/data\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"span-6 last\" id=\"sidebar\">\r\n");
      out.write("\t\t<div class=\"prepend-top\" id=\"recent-reviews\">\r\n");
      out.write("\t\t\t<h3 class=\"caps\">Useful Links</h3>\r\n");
      out.write("\t\t\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t\t<div class=\"quiet\">\r\n");
      out.write("\t\t\t\t\tFurther information about the <a href=\"https://wiki.hybris.com/display/release4/Cache\" class=\"quiet\">hybris Platform Cache</a> can be found in our Wiki.\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/jsp/monitoring/cache/regionCache.jsp(6,29) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/static/css/table.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/jsp/monitoring/cache/regionCache.jsp(7,29) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/static/css/custom-theme/jquery-ui-1.8.12.custom.css");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/jsp/monitoring/cache/regionCache.jsp(9,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/static/js/jquery.dataTables.min.js");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/jsp/monitoring/cache/regionCache.jsp(10,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/static/js/history.js");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /WEB-INF/jsp/monitoring/cache/regionCache.jsp(11,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/static/js/monitoring/cache/regionCache.js");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent(null);
    // /WEB-INF/jsp/monitoring/cache/regionCache.jsp(20,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/monitoring/cache/regionCache/clear");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/monitoring/cache/regionCache.jsp(24,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("region");
    // /WEB-INF/jsp/monitoring/cache/regionCache.jsp(24,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/monitoring/cache/regionCache.jsp(24,4) '${regions}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${regions}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<h1 id=\"h-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${region.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" style=\"padding-top:5px;padding-bottom:5px;\"><b>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${region.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</b></h3>\r\n");
          out.write("\t\t\t\t\t<div id=\"div-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${region.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t<div style=\"margin-left:-15px\">\r\n");
          out.write("\t\t\t\t\t\t\t<table>\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<dl class=\"marginTop\">\r\n");
          out.write("\t\t\t\t\t\t\t\t    \t\t<dt>Max Size</dt>\r\n");
          out.write("\t\t\t\t\t\t\t\t    \t\t<dd id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${region.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("_maxEntries\"></dd>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<dt>Max Reached Size</dt>\r\n");
          out.write("\t\t\t\t\t\t\t\t    \t\t<dd id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${region.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("_maxReachedSize\"></dd>\t    \t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<dt>Hit/Miss Ratio</dt>\r\n");
          out.write("\t\t\t\t\t\t\t\t    \t\t<dd><span id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${region.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("_factor\"></span>%</dd>\t    \t\t    \t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t    \t</dl>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<table>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Hits</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Misses</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Invalidations</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Evictions</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Fetches</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>InstanceCount</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${region.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("_Hits\"></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${region.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("_Misses\"></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${region.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("_Invalidations\"></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${region.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("_Evictions\"></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${region.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("_Fetches\"></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${region.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("_InstanceCount\"></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t    \t</table>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<table id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${region.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("_types\" >\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Type</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Hits</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Misses</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Ratio</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Invalidations</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Evictions</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Fetches</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>InstanceCount</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<tbody>\r\n");
          out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
          out.write("\t\t\t\t\t\t\t</table>\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
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
}
