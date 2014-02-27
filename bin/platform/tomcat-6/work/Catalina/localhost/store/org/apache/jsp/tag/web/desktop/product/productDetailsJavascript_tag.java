package org.apache.jsp.tag.web.desktop.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productDetailsJavascript_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
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
  private de.hybris.platform.commercefacades.product.data.ProductData product;

  public de.hybris.platform.commercefacades.product.data.ProductData getProduct() {
    return this.product;
  }

  public void setProduct(de.hybris.platform.commercefacades.product.data.ProductData product) {
    this.product = product;
    jspContext.setAttribute("product", product);
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
    if( getProduct() != null ) 
      _jspx_page_context.setAttribute("product", getProduct());

    try {
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("<script type=\"text/javascript\">\n");
      out.write("/*<![CDATA[*/\n");
      out.write("\n");
      out.write("function initWriteReviewAction() {\n");
      out.write("\t$('#write_review_action_main').click(function(e){\n");
      out.write("\t\te.preventDefault();\n");
      out.write("\t\t$.scrollTo('#prod_tabs', 300, {axis: 'y'});\n");
      out.write("\t\t$('#reviews').hide();\n");
      out.write("\t\t$('#write_reviews').show();\n");
      out.write("\t\t$( \"#prod_tabs\" ).tabs( \"option\", \"selected\", $('#tab_strip').children().size() - 1 );\n");
      out.write("\t\t$('#reviewForm input[name=headline]').focus();\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("function initBasedOnReviewsAction() {\n");
      out.write("\t$('#based_on_reviews').click( function(e) {\n");
      out.write("\t\te.preventDefault();\n");
      out.write("\t\t$.scrollTo('#prod_tabs', 300, {axis: 'y'});\n");
      out.write("\t\t$( \"#prod_tabs\" ).tabs( \"option\", \"selected\", $('#tab_strip').children().size() - 1 );\n");
      out.write("\t\t$('#write_reviews').hide();\n");
      out.write("\t\t$('#reviews').show();\n");
      out.write("\t\t$('#read_reviews_action').click();\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("function initPageEvents() {\n");
      out.write("\t$(\".modal\").colorbox({\n");
      out.write("\t\tonComplete: function() {\n");
      out.write("\t\t    ACC.common.refreshScreenReaderBuffer();\n");
      out.write("\t\t},\n");
      out.write("\t\tonClosed: function() {\n");
      out.write("\t\t\tACC.common.refreshScreenReaderBuffer();\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t$(\"#carousel_alternate img\").click(function() {\n");
      out.write("\t\t$(\"#primary_image .modal img\").attr(\"src\", $(this).attr(\"data-primaryimagesrc\"));\n");
      out.write("\t\t$(\"#zoomLink\").attr(\"href\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${zoomImageUrlTemplate}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\".replace(\"POSITION\", $(this).attr(\"data-galleryposition\")));\n");
      out.write("\t\t$(\"#imageLink\").attr(\"href\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${zoomImageUrlTemplate}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\".replace(\"POSITION\", $(this).attr(\"data-galleryposition\")));\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\tinitWriteReviewAction();\n");
      out.write("\tinitBasedOnReviewsAction();\n");
      out.write("\n");
      out.write("\n");
      out.write("\t$(\"#Size\").change(function () {\n");
      out.write("\t\tvar url = \"\";\n");
      out.write("\t\tvar selectedIndex = 0;\n");
      out.write("\t\t$(\"#Size option:selected\").each(function () {\n");
      out.write("\t\t\turl = $(this).attr('value');\n");
      out.write("\t\t\tselectedIndex = $(this).attr(\"index\");\n");
      out.write("\t\t});\n");
      out.write("\t\tif (selectedIndex != 0) {\n");
      out.write("\t\t\twindow.location.href=url;\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t$(\"#variant\").change(function () {\n");
      out.write("\t\tvar url = \"\";\n");
      out.write("\t\tvar selectedIndex = 0;\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#variant option:selected\").each(function () {\n");
      out.write("\t\t\turl = $(this).attr('value');\n");
      out.write("\t\t\tselectedIndex = $(this).attr(\"index\");\n");
      out.write("\t\t});\n");
      out.write("\t\tif (selectedIndex != 0) {\n");
      out.write("\t\t\twindow.location.href=url;\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("$(document).ready(function() {\n");
      out.write("\t\n");
      out.write("\tinitPageEvents();\n");
      out.write("\t\n");
      out.write("\tsetTimeout(function() {\n");
      out.write("\t\tif($.query.get('tab') == 'writereview') {\n");
      out.write("\t\t\t$('#write_review_action_main').click();\n");
      out.write("\t\t}\n");
      out.write("\t\tif($.query.get('tab') == 'readreviews') {\n");
      out.write("\t\t\t$('#based_on_reviews').click();\n");
      out.write("\t\t}\n");
      out.write("\t}, 100);\n");
      out.write("});\n");
      out.write("\n");
      out.write("/*]]>*/\n");
      out.write("</script>");
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
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productDetailsJavascript.tag(7,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("p/${product.code}/zoomImages?galleryPosition=POSITION", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    // /WEB-INF/tags/desktop/product/productDetailsJavascript.tag(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("zoomImageUrlTemplate");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
