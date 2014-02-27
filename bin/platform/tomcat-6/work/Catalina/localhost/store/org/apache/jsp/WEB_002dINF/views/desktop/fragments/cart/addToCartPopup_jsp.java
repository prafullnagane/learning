package org.apache.jsp.WEB_002dINF.views.desktop.fragments.cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addToCartPopup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(8);
    _jspx_dependants.add("/WEB-INF/common/tld/cmstags.tld");
    _jspx_dependants.add("/WEB-INF/tags/shared/theme/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/shared/format/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/shared/theme/image.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/productPrimaryImage.tag");
    _jspx_dependants.add("/WEB-INF/common/tld/ycommercetags.tld");
    _jspx_dependants.add("/WEB-INF/tags/shared/format/price.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fescapeBody_0026_005fjavaScriptEscape;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fescapeBody_0026_005fjavaScriptEscape = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fspring_005fescapeBody_0026_005fjavaScriptEscape.release();
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.release();
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
      response.setContentType("application/json");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("{\t\"cartData\": {\n");
      out.write("\t\t\"total\": \t\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cartData.totalPrice.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\",\n");
      out.write("\t\t\"products\": [\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t]\n");
      out.write("\t},\n");
      out.write("\t\"cartPopupHtml\":\t\"");
      if (_jspx_meth_spring_005fescapeBody_005f0(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("}\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(14,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(14,2) '${cartData.entries}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${cartData.entries}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(14,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("cartEntry");
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(14,2) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t{\n");
          out.write("\t\t\t\t\"sku\":\t\t\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cartEntry.product.code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\"name\": \t\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cartEntry.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\"qty\": \t\t\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cartEntry.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\"price\": \t\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cartEntry.basePrice.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\"categories\": [\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t]\n");
          out.write("\t\t\t}");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(21,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(21,4) '${cartEntry.product.categories}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${cartEntry.product.categories}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(21,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("category");
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(21,4) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVarStatus("categoryStatus");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${category.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(22,23) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not categoryStatus.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(25,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not status.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_spring_005fescapeBody_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:escapeBody
    org.springframework.web.servlet.tags.EscapeBodyTag _jspx_th_spring_005fescapeBody_005f0 = (org.springframework.web.servlet.tags.EscapeBodyTag) _005fjspx_005ftagPool_005fspring_005fescapeBody_0026_005fjavaScriptEscape.get(org.springframework.web.servlet.tags.EscapeBodyTag.class);
    _jspx_th_spring_005fescapeBody_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fescapeBody_005f0.setParent(null);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(29,19) name = javaScriptEscape type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fescapeBody_005f0.setJavaScriptEscape("true");
    int[] _jspx_push_body_count_spring_005fescapeBody_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fescapeBody_005f0 = _jspx_th_spring_005fescapeBody_005f0.doStartTag();
      if (_jspx_eval_spring_005fescapeBody_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_spring_005fescapeBody_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_spring_005fescapeBody_005f0[0]++;
          _jspx_th_spring_005fescapeBody_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_spring_005fescapeBody_005f0.doInitBody();
        }
        do {
          if (_jspx_meth_spring_005ftheme_005f0(_jspx_th_spring_005fescapeBody_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fescapeBody_005f0))
            return true;
          if (_jspx_meth_c_005furl_005f0(_jspx_th_spring_005fescapeBody_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fescapeBody_005f0))
            return true;
          if (_jspx_meth_c_005furl_005f1(_jspx_th_spring_005fescapeBody_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fescapeBody_005f0))
            return true;
          out.write("<div class=\"title\">\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_theme_005fimage_005f0(_jspx_th_spring_005fescapeBody_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fescapeBody_005f0))
            return true;
          out.write("<h3> ");
          if (_jspx_meth_spring_005ftheme_005f1(_jspx_th_spring_005fescapeBody_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fescapeBody_005f0))
            return true;
          out.write("</h3>\n");
          out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"close\" id=\"add_to_cart_close\"></a>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"cart_modal_popup\">\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"cart_popup_error_msg\">");
          if (_jspx_meth_spring_005ftheme_005f2(_jspx_th_spring_005fescapeBody_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fescapeBody_005f0))
            return true;
          out.write("</div>\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"prod_image\">\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_product_005fproductPrimaryImage_005f0(_jspx_th_spring_005fescapeBody_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fescapeBody_005f0))
            return true;
          out.write("</div>\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"prod_info\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</p>\n");
          out.write("\t\t\t\t\t\t\t\t\t<p class=\"prod_options\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f2(_jspx_th_spring_005fescapeBody_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fescapeBody_005f0))
            return true;
          out.write("</p>\n");
          out.write("\t\t\t\t\t\t\t\t\t<p class=\"prod_quantity\">");
          if (_jspx_meth_spring_005ftheme_005f5(_jspx_th_spring_005fescapeBody_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fescapeBody_005f0))
            return true;
          out.write("&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</p>\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"prod_price\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<p>");
          if (_jspx_meth_format_005fprice_005f0(_jspx_th_spring_005fescapeBody_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fescapeBody_005f0))
            return true;
          out.write("</p>\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"links\">\n");
          out.write("\t\t\t\t\t\t\t\t<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cartUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"positive large\">\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_theme_005fimage_005f1(_jspx_th_spring_005fescapeBody_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fescapeBody_005f0))
            return true;
          if (_jspx_meth_spring_005ftheme_005f6(_jspx_th_spring_005fescapeBody_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fescapeBody_005f0))
            return true;
          out.write("</a>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_spring_005fescapeBody_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_spring_005fescapeBody_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_spring_005fescapeBody_005f0[0]--;
        }
      }
      if (_jspx_th_spring_005fescapeBody_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fescapeBody_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fescapeBody_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fescapeBody_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005fescapeBody_0026_005fjavaScriptEscape.reuse(_jspx_th_spring_005fescapeBody_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fescapeBody_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fescapeBody_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f0 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fescapeBody_005f0);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(30,7) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f0.setCode("text.addToCart");
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(30,7) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f0.setVar("addToCartText");
    int[] _jspx_push_body_count_spring_005ftheme_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f0 = _jspx_th_spring_005ftheme_005f0.doStartTag();
      if (_jspx_th_spring_005ftheme_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fescapeBody_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fescapeBody_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fescapeBody_005f0);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(31,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/cart");
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(31,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("cartUrl");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fescapeBody_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fescapeBody_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fescapeBody_005f0);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(32,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/cart/checkout");
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(32,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setVar("checkoutUrl");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_theme_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fescapeBody_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fescapeBody_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  theme:image
    org.apache.jsp.tag.web.shared.theme.image_tag _jspx_th_theme_005fimage_005f0 = new org.apache.jsp.tag.web.shared.theme.image_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_theme_005fimage_005f0);
    _jspx_th_theme_005fimage_005f0.setJspContext(_jspx_page_context);
    _jspx_th_theme_005fimage_005f0.setParent(_jspx_th_spring_005fescapeBody_005f0);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(35,8) name = code type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_theme_005fimage_005f0.setCode("img.addToCartIcon");
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(35,8) name = alt type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_theme_005fimage_005f0.setAlt((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${addToCartText}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(35,8) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_theme_005fimage_005f0.setTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${addToCartText}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_theme_005fimage_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_theme_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fescapeBody_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fescapeBody_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f1 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fescapeBody_005f0);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(36,13) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f1.setCode("basket.added.to.basket");
    int[] _jspx_push_body_count_spring_005ftheme_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f1 = _jspx_th_spring_005ftheme_005f1.doStartTag();
      if (_jspx_th_spring_005ftheme_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fescapeBody_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fescapeBody_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f2 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fescapeBody_005f0);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(41,42) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f2.setCode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_spring_005ftheme_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f2 = _jspx_th_spring_005ftheme_005f2.doStartTag();
      if (_jspx_th_spring_005ftheme_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_product_005fproductPrimaryImage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fescapeBody_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fescapeBody_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  product:productPrimaryImage
    org.apache.jsp.tag.web.desktop.product.productPrimaryImage_tag _jspx_th_product_005fproductPrimaryImage_005f0 = new org.apache.jsp.tag.web.desktop.product.productPrimaryImage_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_product_005fproductPrimaryImage_005f0);
    _jspx_th_product_005fproductPrimaryImage_005f0.setJspContext(_jspx_page_context);
    _jspx_th_product_005fproductPrimaryImage_005f0.setParent(_jspx_th_spring_005fescapeBody_005f0);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(43,9) name = product type = de.hybris.platform.commercefacades.product.data.ProductData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_product_005fproductPrimaryImage_005f0.setProduct((de.hybris.platform.commercefacades.product.data.ProductData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product}", de.hybris.platform.commercefacades.product.data.ProductData.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(43,9) name = format type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_product_005fproductPrimaryImage_005f0.setFormat("cartIcon");
    _jspx_th_product_005fproductPrimaryImage_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_product_005fproductPrimaryImage_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fescapeBody_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fescapeBody_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fescapeBody_005f0);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(48,10) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(48,10) '${product.baseOptions}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${product.baseOptions}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(48,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("baseOptions");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_c_005fforEach_005f3(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(49,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(49,11) '${baseOptions.selected.variantOptionQualifiers}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${baseOptions.selected.variantOptionQualifiers}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(49,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("baseOptionQualifier");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(50,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseOptionQualifier.qualifier eq 'style' and not empty baseOptionQualifier.image.url}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<span class=\"prod_color\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_spring_005ftheme_005f3(_jspx_th_c_005fif_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
          return true;
        out.write("&nbsp;\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseOptionQualifier.image.url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  alt=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseOptionQualifier.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseOptionQualifier.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f3 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f3.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(52,14) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f3.setCode("product.variants.colour");
    int[] _jspx_push_body_count_spring_005ftheme_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f3 = _jspx_th_spring_005ftheme_005f3.doStartTag();
      if (_jspx_th_spring_005ftheme_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f3.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(56,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseOptionQualifier.qualifier eq 'size'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<span class=\"prod_size\">");
        if (_jspx_meth_spring_005ftheme_005f4(_jspx_th_c_005fif_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
          return true;
        out.write("&nbsp;");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseOptionQualifier.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f4 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f4.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(57,37) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f4.setCode("product.variants.size");
    int[] _jspx_push_body_count_spring_005ftheme_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f4 = _jspx_th_spring_005ftheme_005f4.doStartTag();
      if (_jspx_th_spring_005ftheme_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f4.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fescapeBody_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fescapeBody_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f5 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f5.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fescapeBody_005f0);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(62,34) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f5.setCode("popup.cart.quantity.added");
    int[] _jspx_push_body_count_spring_005ftheme_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f5 = _jspx_th_spring_005ftheme_005f5.doStartTag();
      if (_jspx_th_spring_005ftheme_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f5.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_format_005fprice_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fescapeBody_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fescapeBody_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  format:price
    org.apache.jsp.tag.web.shared.format.price_tag _jspx_th_format_005fprice_005f0 = new org.apache.jsp.tag.web.shared.format.price_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_format_005fprice_005f0);
    _jspx_th_format_005fprice_005f0.setJspContext(_jspx_page_context);
    _jspx_th_format_005fprice_005f0.setParent(_jspx_th_spring_005fescapeBody_005f0);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(64,13) name = priceData type = de.hybris.platform.commercefacades.product.data.PriceData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_format_005fprice_005f0.setPriceData((de.hybris.platform.commercefacades.product.data.PriceData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.basePrice}", de.hybris.platform.commercefacades.product.data.PriceData.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_format_005fprice_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_format_005fprice_005f0);
    return false;
  }

  private boolean _jspx_meth_theme_005fimage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fescapeBody_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fescapeBody_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  theme:image
    org.apache.jsp.tag.web.shared.theme.image_tag _jspx_th_theme_005fimage_005f1 = new org.apache.jsp.tag.web.shared.theme.image_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_theme_005fimage_005f1);
    _jspx_th_theme_005fimage_005f1.setJspContext(_jspx_page_context);
    _jspx_th_theme_005fimage_005f1.setParent(_jspx_th_spring_005fescapeBody_005f0);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(71,9) name = code type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_theme_005fimage_005f1.setCode("img.addToCartIcon");
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(71,9) name = alt type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_theme_005fimage_005f1.setAlt((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${addToCartText}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(71,9) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_theme_005fimage_005f1.setTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${addToCartText}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_theme_005fimage_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_theme_005fimage_005f1);
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fescapeBody_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fescapeBody_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f6 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f6.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fescapeBody_005f0);
    // /WEB-INF/views/desktop/fragments/cart/addToCartPopup.jsp(72,9) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f6.setCode("checkout.checkout");
    int[] _jspx_push_body_count_spring_005ftheme_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f6 = _jspx_th_spring_005ftheme_005f6.doStartTag();
      if (_jspx_th_spring_005ftheme_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f6.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f6);
    }
    return false;
  }
}
