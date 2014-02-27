package org.apache.jsp.tag.web.desktop.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productDetailsTab_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/implicit.tld");
    _jspx_dependants.add("/WEB-INF/common/tld/ycommercetags.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/productDetailsClassifications.tag");
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
    if( getProduct() != null ) 
      _jspx_page_context.setAttribute("product", getProduct());

    try {
      out.write("<h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("</h4>\r\n");
      if (_jspx_meth_ycommerce_005ftestId_005f0(_jspx_page_context))
        return;
      out.write("<div class=\"productFeatureClasses\">\r\n");
      out.write("\t");
      if (_jspx_meth_product_005fproductDetailsClassifications_005f0(_jspx_page_context))
        return;
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
    }
  }

  private boolean _jspx_meth_ycommerce_005ftestId_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  ycommerce:testId
    de.hybris.merchandise.storefront.tags.TestIdTag _jspx_th_ycommerce_005ftestId_005f0 = new de.hybris.merchandise.storefront.tags.TestIdTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_ycommerce_005ftestId_005f0);
    _jspx_th_ycommerce_005ftestId_005f0.setJspContext(_jspx_page_context);
    _jspx_th_ycommerce_005ftestId_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productDetailsTab.tag(12,0) name = code type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ycommerce_005ftestId_005f0.setCode("productDetails_content_label");
    _jspx_th_ycommerce_005ftestId_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_ycommerce_005ftestId_005f0, null));
    _jspx_th_ycommerce_005ftestId_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_ycommerce_005ftestId_005f0);
    return false;
  }

  private boolean _jspx_meth_product_005fproductDetailsClassifications_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  product:productDetailsClassifications
    org.apache.jsp.tag.web.desktop.product.productDetailsClassifications_tag _jspx_th_product_005fproductDetailsClassifications_005f0 = new org.apache.jsp.tag.web.desktop.product.productDetailsClassifications_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_product_005fproductDetailsClassifications_005f0);
    _jspx_th_product_005fproductDetailsClassifications_005f0.setJspContext(_jspx_page_context);
    _jspx_th_product_005fproductDetailsClassifications_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productDetailsTab.tag(19,1) name = product type = de.hybris.platform.commercefacades.product.data.ProductData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_product_005fproductDetailsClassifications_005f0.setProduct((de.hybris.platform.commercefacades.product.data.ProductData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product}", de.hybris.platform.commercefacades.product.data.ProductData.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_product_005fproductDetailsClassifications_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_product_005fproductDetailsClassifications_005f0);
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
      out.write("<div class=\"productDescription\">\r\n");
      out.write("\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.description}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("</div>\r\n");
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
