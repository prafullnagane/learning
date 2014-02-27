package org.apache.jsp.tag.web.desktop.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productAddToCartPanel_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:contains", org.apache.taglibs.standard.functions.Functions.class, "contains", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(8);
    _jspx_dependants.add("/WEB-INF/tags/shared/theme/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/storepickup/implicit.tld");
    _jspx_dependants.add("/WEB-INF/common/tld/ycommercetags.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/storepickup/clickPickupInStore.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/store/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/productPrimaryImage.tag");
    _jspx_dependants.add("/WEB-INF/tags/shared/theme/image.tag");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005farguments_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
  private de.hybris.platform.commercefacades.product.data.ProductData product;
  private java.lang.Boolean allowAddToCart;

  public de.hybris.platform.commercefacades.product.data.ProductData getProduct() {
    return this.product;
  }

  public void setProduct(de.hybris.platform.commercefacades.product.data.ProductData product) {
    this.product = product;
    jspContext.setAttribute("product", product);
  }

  public java.lang.Boolean getAllowAddToCart() {
    return this.allowAddToCart;
  }

  public void setAllowAddToCart(java.lang.Boolean allowAddToCart) {
    this.allowAddToCart = allowAddToCart;
    jspContext.setAttribute("allowAddToCart", allowAddToCart);
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005farguments_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.release();
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005farguments_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
    if( getProduct() != null ) 
      _jspx_page_context.setAttribute("product", getProduct());
    if( getAllowAddToCart() != null ) 
      _jspx_page_context.setAttribute("allowAddToCart", getAllowAddToCart());

    try {
      out.write("<div class=\"prod_add_to_cart\">\n");
      out.write("\t<form id=\"addToCartForm\" class=\"add_to_cart_form\" action=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" method=\"post\">\n");
      out.write("\t\t<div class=\"setQuantity\">\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("<input type=\"hidden\" name=\"productCodePost\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.code}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\"/>\n");
      out.write("\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("</div>\t\n");
      out.write("\n");
      out.write("\t\t");
      if (_jspx_meth_ycommerce_005ftestId_005f0(_jspx_page_context))
        return;
      out.write("<div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("</form>\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write("</div>\n");
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

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(15,59) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/cart/add");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(17,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.purchasable}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<label for=\"qty\" class=\"qtyLabel\">");
        if (_jspx_meth_spring_005ftheme_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</label>\n");
        out.write("\t\t\t\t<input type=\"text\" maxlength=\"3\"  size=\"1\" id=\"qty\" name=\"qty\" class=\"qty\" value=\"1\">\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_spring_005ftheme_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f0 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(18,38) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f0.setCode("basket.page.quantity");
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
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(23,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.stock.stockLevel gt 0}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_005fset_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(24,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("productStockLevel");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_005fset_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_005fset_005f0.doInitBody();
      }
      do {
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.stock.stockLevel}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("&nbsp;");
        if (_jspx_meth_spring_005ftheme_005f1(_jspx_th_c_005fset_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fset_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fset_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f1 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fset_005f0);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(24,68) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f1.setCode("product.variants.in.stock");
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
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(26,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.stock.stockLevelStatus.code eq 'lowStock'}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_005fset_005f1(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(27,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("productStockLevel");
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_eval_c_005fset_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_005fset_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_005fset_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_005fset_005f1.doInitBody();
      }
      do {
        if (_jspx_meth_spring_005ftheme_005f2(_jspx_th_c_005fset_005f1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fset_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_005fset_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f1);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fset_005f1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f2 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005farguments_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fset_005f1);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(27,35) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f2.setCode("product.variants.only.left");
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(27,35) name = arguments type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f2.setArguments((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.stock.stockLevel}", java.lang.Object.class, (PageContext)this.getJspContext(), null, false));
    int[] _jspx_push_body_count_spring_005ftheme_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f2 = _jspx_th_spring_005ftheme_005f2.doStartTag();
      if (_jspx_th_spring_005ftheme_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005farguments_005fnobody.reuse(_jspx_th_spring_005ftheme_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(29,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.stock.stockLevelStatus.code eq 'inStock' and empty product.stock.stockLevel}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_005fset_005f2(_jspx_th_c_005fif_005f3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(30,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setVar("productStockLevel");
    int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
    if (_jspx_eval_c_005fset_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_005fset_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_005fset_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_005fset_005f2.doInitBody();
      }
      do {
        if (_jspx_meth_spring_005ftheme_005f3(_jspx_th_c_005fset_005f2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fset_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_005fset_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f2);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f2);
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fset_005f2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f3 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f3.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fset_005f2);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(30,35) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f3.setCode("product.variants.available");
    int[] _jspx_push_body_count_spring_005ftheme_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f3 = _jspx_th_spring_005ftheme_005f3.doStartTag();
      if (_jspx_th_spring_005ftheme_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
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

  private boolean _jspx_meth_ycommerce_005ftestId_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  ycommerce:testId
    de.hybris.merchandise.storefront.tags.TestIdTag _jspx_th_ycommerce_005ftestId_005f0 = new de.hybris.merchandise.storefront.tags.TestIdTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_ycommerce_005ftestId_005f0);
    _jspx_th_ycommerce_005ftestId_005f0.setJspContext(_jspx_page_context);
    _jspx_th_ycommerce_005ftestId_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(34,2) name = code type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ycommerce_005ftestId_005f0.setCode("productDetails_productInStock_label");
    _jspx_th_ycommerce_005ftestId_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_ycommerce_005ftestId_005f0, null));
    _jspx_th_ycommerce_005ftestId_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_ycommerce_005ftestId_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(39,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allowAddToCart}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_005fset_005f3(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        if (_jspx_meth_c_005fif_005f5(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        if (_jspx_meth_c_005fchoose_005f0(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(40,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f3.setVar("buttonType");
    int _jspx_eval_c_005fset_005f3 = _jspx_th_c_005fset_005f3.doStartTag();
    if (_jspx_eval_c_005fset_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_005fset_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_005fset_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_005fset_005f3.doInitBody();
      }
      do {
        out.write("button");
        int evalDoAfterBody = _jspx_th_c_005fset_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_005fset_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_c_005fset_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f3);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(41,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.purchasable and product.stock.stockLevelStatus.code ne 'outOfStock' }", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_005fset_005f4(_jspx_th_c_005fif_005f5, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(42,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f4.setVar("buttonType");
    int _jspx_eval_c_005fset_005f4 = _jspx_th_c_005fset_005f4.doStartTag();
    if (_jspx_eval_c_005fset_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_005fset_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_005fset_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_005fset_005f4.doInitBody();
      }
      do {
        out.write("submit");
        int evalDoAfterBody = _jspx_th_c_005fset_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_005fset_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_c_005fset_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f4);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
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
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(46,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:contains(buttonType, 'button')}", java.lang.Boolean.class, (PageContext)this.getJspContext(), _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button type=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${buttonType}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("\" class=\"positive large out-of-stock\">\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_spring_005ftheme_005f4(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("</button>\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_spring_005ftheme_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f4 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f4.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(48,6) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f4.setCode("product.variants.out.of.stock");
    int[] _jspx_push_body_count_spring_005ftheme_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f4 = _jspx_th_spring_005ftheme_005f4.doStartTag();
      if (_jspx_th_spring_005ftheme_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
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
        out.write("<button id=\"addToCartButton\" type=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${buttonType}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("\" class=\"positive large\" disabled=\"true\">\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_spring_005ftheme_005f5(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
          return true;
        out.write("</button>\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_spring_005ftheme_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f5 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f5.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(54,6) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f5.setCode("basket.add.to.basket");
    int[] _jspx_push_body_count_spring_005ftheme_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f5 = _jspx_th_spring_005ftheme_005f5.doStartTag();
      if (_jspx_th_spring_005ftheme_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
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

  private boolean _jspx_meth_c_005fif_005f6(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(60,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allowAddToCart and product.availableForPickup}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_storepickup_005fclickPickupInStore_005f0(_jspx_th_c_005fif_005f6, _jspx_page_context))
          return true;
        out.write("<div id=\"popup_store_pickup_form\" class=\"pickup_store_search clearfix\" style=\"display:none\">\n");
        out.write("\t<div class=\"item_container_holder clearfix\">\n");
        out.write("\t\t<div class=\"title_holder\">\n");
        out.write("\t\t\t<h2>");
        if (_jspx_meth_spring_005ftheme_005f6(_jspx_th_c_005fif_005f6, _jspx_page_context))
          return true;
        out.write("</h2>\n");
        out.write("\t\t</div>\n");
        out.write("\t</div>\n");
        out.write("\n");
        out.write("\t<div class=\"prod_grid span-4\">\n");
        out.write("\t\t<span class=\"thumb\">\n");
        out.write("\t\t\t\n");
        out.write("\t\t</span>\n");
        out.write("\t\t<strong class=\"details\"></strong>\n");
        out.write("\t\t<div class=\"cart\">\n");
        out.write("\t\t\t<p><strong></strong></p>\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_005fif_005f7(_jspx_th_c_005fif_005f6, _jspx_page_context))
          return true;
        out.write("</div>\n");
        out.write("\t\t<div class=\"quantity pickup_store_search-quantity\">\n");
        out.write("\t\t\t<label data-for=\"pickupQty\">");
        if (_jspx_meth_spring_005ftheme_005f8(_jspx_th_c_005fif_005f6, _jspx_page_context))
          return true;
        out.write("</label>\n");
        out.write("\t\t\t<input type=\"text\" size=\"1\" maxlength=\"3\"  data-id=\"pickupQty\" name=\"qty\" class=\"qty\" />\n");
        out.write("\t\t</div>\n");
        out.write("\t</div>\n");
        out.write("\t\n");
        out.write("\t<div class=\"span-17 last\">\n");
        out.write("\t\t<div class=\"pickup_store_search-form\">\n");
        out.write("\t\t\t<form name=\"pickupInStoreForm\" action=\"#\" method=\"post\" class=\"form_field-input\">\n");
        out.write("\t\t\t\t<label for=\"locationForSearch\" class=\"nostyle\">");
        if (_jspx_meth_spring_005ftheme_005f9(_jspx_th_c_005fif_005f6, _jspx_page_context))
          return true;
        out.write("</label>\n");
        out.write("\t\t\t\t<input type=\"text\" name=\"locationQuery\" data-id=\"locationForSearch\" />\n");
        out.write("\t\t\t\t<input type=\"hidden\" name=\"cartPage\" data-id=\"atCartPage\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cartPage}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("\" />\n");
        out.write("\t\t\t\t<input type=\"hidden\" name=\"entryNumber\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entryNumber}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("\" class=\"entryNumber\" />\n");
        out.write("\t\t\t\t<button type=\"button\" class=\"form\" data-id=\"pickupstore_search_button\">");
        if (_jspx_meth_spring_005ftheme_005f10(_jspx_th_c_005fif_005f6, _jspx_page_context))
          return true;
        out.write("</button>\n");
        out.write("\t\t\t\t<button type=\"button\" class=\"form\" data-id=\"find_pickupStoresNearMe_button\">");
        if (_jspx_meth_spring_005ftheme_005f11(_jspx_th_c_005fif_005f6, _jspx_page_context))
          return true;
        out.write("</button>\n");
        out.write("\t\t\t</form>\n");
        out.write("\t\t</div>\n");
        out.write("\t\t<div data-id=\"pickup_store_results\" class=\"pickup_store_results\"></div>\n");
        out.write("\t</div>\n");
        out.write("</div>\n");
        out.write("\t\t\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
    return false;
  }

  private boolean _jspx_meth_storepickup_005fclickPickupInStore_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  storepickup:clickPickupInStore
    org.apache.jsp.tag.web.desktop.storepickup.clickPickupInStore_tag _jspx_th_storepickup_005fclickPickupInStore_005f0 = new org.apache.jsp.tag.web.desktop.storepickup.clickPickupInStore_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_storepickup_005fclickPickupInStore_005f0);
    _jspx_th_storepickup_005fclickPickupInStore_005f0.setJspContext(_jspx_page_context);
    _jspx_th_storepickup_005fclickPickupInStore_005f0.setParent(_jspx_th_c_005fif_005f6);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(61,2) name = product type = de.hybris.platform.commercefacades.product.data.ProductData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_storepickup_005fclickPickupInStore_005f0.setProduct((de.hybris.platform.commercefacades.product.data.ProductData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product}", de.hybris.platform.commercefacades.product.data.ProductData.class, (PageContext)this.getJspContext(), null, false));
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(61,2) name = cartPage type = java.lang.Boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_storepickup_005fclickPickupInStore_005f0.setCartPage(new Boolean(false));
    _jspx_th_storepickup_005fclickPickupInStore_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_storepickup_005fclickPickupInStore_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f6 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f6.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f6);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(66,7) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f6.setCode("pickup.product.availability");
    int[] _jspx_push_body_count_spring_005ftheme_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f6 = _jspx_th_spring_005ftheme_005f6.doStartTag();
      if (_jspx_th_spring_005ftheme_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
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

  private boolean _jspx_meth_c_005fif_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f6);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(77,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty product.baseOptions[0].selected.variantOptionQualifiers}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f7, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fif_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(78,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("variant");
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(78,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/tags/desktop/product/productAddToCartPanel.tag(78,4) '${product.baseOptions[0].selected.variantOptionQualifiers}'",_el_expressionfactory.createValueExpression(this.getJspContext().getELContext(),"${product.baseOptions[0].selected.variantOptionQualifiers}",java.lang.Object.class)).getValue(this.getJspContext().getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_c_005fif_005f8(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
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

  private boolean _jspx_meth_c_005fif_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(79,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty variant.value}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('<');
        out.write('p');
        out.write('>');
        if (_jspx_meth_spring_005ftheme_005f7(_jspx_th_c_005fif_005f8, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("</p>\n");
        out.write("\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f8);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f8);
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f7 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005farguments_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f7.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(80,9) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f7.setCode("basket.pickup.product.variant");
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(80,9) name = arguments type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f7.setArguments((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${variant.name},${variant.value}", java.lang.Object.class, (PageContext)this.getJspContext(), null, false));
    int[] _jspx_push_body_count_spring_005ftheme_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f7 = _jspx_th_spring_005ftheme_005f7.doStartTag();
      if (_jspx_th_spring_005ftheme_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f7.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005farguments_005fnobody.reuse(_jspx_th_spring_005ftheme_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f8 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f8.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f6);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(87,31) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f8.setCode("basket.page.quantity");
    int[] _jspx_push_body_count_spring_005ftheme_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f8 = _jspx_th_spring_005ftheme_005f8.doStartTag();
      if (_jspx_th_spring_005ftheme_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f8.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f9 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f9.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f6);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(95,51) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f9.setCode("pickup.search.message");
    int[] _jspx_push_body_count_spring_005ftheme_005f9 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f9 = _jspx_th_spring_005ftheme_005f9.doStartTag();
      if (_jspx_th_spring_005ftheme_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f9.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f10 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f10.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f6);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(99,75) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f10.setCode("pickup.search.button");
    int[] _jspx_push_body_count_spring_005ftheme_005f10 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f10 = _jspx_th_spring_005ftheme_005f10.doStartTag();
      if (_jspx_th_spring_005ftheme_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f10.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f10);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f11 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f11.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f6);
    // /WEB-INF/tags/desktop/product/productAddToCartPanel.tag(100,80) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f11.setCode("storeFinder.findStoresNearMe");
    int[] _jspx_push_body_count_spring_005ftheme_005f11 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f11 = _jspx_th_spring_005ftheme_005f11.doStartTag();
      if (_jspx_th_spring_005ftheme_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f11.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f11);
    }
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
      out.write("<p class=\"stock_message\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productStockLevel}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("</p>\n");
      out.write("\t\t");
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
