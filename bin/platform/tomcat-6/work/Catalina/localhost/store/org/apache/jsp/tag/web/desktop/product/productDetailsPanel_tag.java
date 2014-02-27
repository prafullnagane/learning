package org.apache.jsp.tag.web.desktop.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productDetailsPanel_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(21);
    _jspx_dependants.add("/WEB-INF/tags/desktop/template/implicit.tld");
    _jspx_dependants.add("/WEB-INF/common/tld/cmstags.tld");
    _jspx_dependants.add("/WEB-INF/tags/shared/theme/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/shared/format/implicit.tld");
    _jspx_dependants.add("/WEB-INF/common/tld/ycommercetags.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/productImageCarousel.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/productImagePanel.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/productPrimaryImage.tag");
    _jspx_dependants.add("/WEB-INF/tags/shared/theme/image.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/productPromotionSection.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/productVariantSelector.tag");
    _jspx_dependants.add("/WEB-INF/tags/shared/format/price.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/productPricePanel.tag");
    _jspx_dependants.add("/WEB-INF/tags/shared/format/fromPrice.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/productAddToCartPanel.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/storepickup/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/storepickup/clickPickupInStore.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/store/implicit.tld");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/productReviewSummary.tag");
    _jspx_dependants.add("/WEB-INF/tags/desktop/product/productShareTag.tag");
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
  private de.hybris.platform.commercefacades.product.data.ProductData product;
  private java.util.List galleryImages;

  public de.hybris.platform.commercefacades.product.data.ProductData getProduct() {
    return this.product;
  }

  public void setProduct(de.hybris.platform.commercefacades.product.data.ProductData product) {
    this.product = product;
    jspContext.setAttribute("product", product);
  }

  public java.util.List getGalleryImages() {
    return this.galleryImages;
  }

  public void setGalleryImages(java.util.List galleryImages) {
    this.galleryImages = galleryImages;
    jspContext.setAttribute("galleryImages", galleryImages);
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
    if( getProduct() != null ) 
      _jspx_page_context.setAttribute("product", getProduct());
    if( getGalleryImages() != null ) 
      _jspx_page_context.setAttribute("galleryImages", getGalleryImages());

    try {
      if (_jspx_meth_spring_005ftheme_005f0(_jspx_page_context))
        return;
      out.write("<!--<div class=\"span-4\">\n");
      out.write("\t");
      if (_jspx_meth_product_005fproductImageCarousel_005f0(_jspx_page_context))
        return;
      out.write("</div>-->\n");
      out.write("<div class=\"span-8\">\n");
      out.write("\t");
      if (_jspx_meth_product_005fproductImagePanel_005f0(_jspx_page_context))
        return;
      out.write("<div class=\"span-8 viewMore\">\n");
      out.write("\t\t");
      if (_jspx_meth_product_005fproductImageCarousel_005f1(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"span-9 productDescription last\">\n");
      out.write("\t\n");
      out.write("\t\t");
      if (_jspx_meth_ycommerce_005ftestId_005f0(_jspx_page_context))
        return;
      out.write("<p class=\"productSummary\">\n");
      out.write("\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.summary}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("</p>\n");
      out.write("\n");
      out.write("\t\t");
      if (_jspx_meth_product_005fproductPromotionSection_005f0(_jspx_page_context))
        return;
      //  product:productVariantSelector
      org.apache.jsp.tag.web.desktop.product.productVariantSelector_tag _jspx_th_product_005fproductVariantSelector_005f0 = new org.apache.jsp.tag.web.desktop.product.productVariantSelector_tag();
      org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_product_005fproductVariantSelector_005f0);
      _jspx_th_product_005fproductVariantSelector_005f0.setJspContext(_jspx_page_context);
      _jspx_th_product_005fproductVariantSelector_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/desktop/product/productDetailsPanel.tag(43,2) name = product type = de.hybris.platform.commercefacades.product.data.ProductData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_product_005fproductVariantSelector_005f0.setProduct((de.hybris.platform.commercefacades.product.data.ProductData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product}", de.hybris.platform.commercefacades.product.data.ProductData.class, (PageContext)this.getJspContext(), null, false));
      _jspx_th_product_005fproductVariantSelector_005f0.doTag();
      java.lang.Boolean showAddToCart = null;
      showAddToCart = (java.lang.Boolean) _jspx_page_context.findAttribute("showAddToCart");
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_product_005fproductVariantSelector_005f0);
      if (_jspx_meth_ycommerce_005ftestId_005f1(_jspx_page_context))
        return;
      if (_jspx_meth_product_005fproductAddToCartPanel_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_product_005fproductReviewSummary_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_product_005fproductShareTag_005f0(_jspx_page_context))
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

  private boolean _jspx_meth_spring_005ftheme_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f0 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productDetailsPanel.tag(16,0) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f0.setCode("text.addToCart");
    // /WEB-INF/tags/desktop/product/productDetailsPanel.tag(16,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f0.setVar("addToCartText");
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

  private boolean _jspx_meth_product_005fproductImageCarousel_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  product:productImageCarousel
    org.apache.jsp.tag.web.desktop.product.productImageCarousel_tag _jspx_th_product_005fproductImageCarousel_005f0 = new org.apache.jsp.tag.web.desktop.product.productImageCarousel_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_product_005fproductImageCarousel_005f0);
    _jspx_th_product_005fproductImageCarousel_005f0.setJspContext(_jspx_page_context);
    _jspx_th_product_005fproductImageCarousel_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productDetailsPanel.tag(20,1) name = galleryImages type = java.util.List reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_product_005fproductImageCarousel_005f0.setGalleryImages((java.util.List) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${galleryImages}", java.util.List.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_product_005fproductImageCarousel_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_product_005fproductImageCarousel_005f0);
    return false;
  }

  private boolean _jspx_meth_product_005fproductImagePanel_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  product:productImagePanel
    org.apache.jsp.tag.web.desktop.product.productImagePanel_tag _jspx_th_product_005fproductImagePanel_005f0 = new org.apache.jsp.tag.web.desktop.product.productImagePanel_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_product_005fproductImagePanel_005f0);
    _jspx_th_product_005fproductImagePanel_005f0.setJspContext(_jspx_page_context);
    _jspx_th_product_005fproductImagePanel_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productDetailsPanel.tag(23,1) name = product type = de.hybris.platform.commercefacades.product.data.ProductData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_product_005fproductImagePanel_005f0.setProduct((de.hybris.platform.commercefacades.product.data.ProductData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product}", de.hybris.platform.commercefacades.product.data.ProductData.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_product_005fproductImagePanel_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_product_005fproductImagePanel_005f0);
    return false;
  }

  private boolean _jspx_meth_product_005fproductImageCarousel_005f1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  product:productImageCarousel
    org.apache.jsp.tag.web.desktop.product.productImageCarousel_tag _jspx_th_product_005fproductImageCarousel_005f1 = new org.apache.jsp.tag.web.desktop.product.productImageCarousel_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_product_005fproductImageCarousel_005f1);
    _jspx_th_product_005fproductImageCarousel_005f1.setJspContext(_jspx_page_context);
    _jspx_th_product_005fproductImageCarousel_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productDetailsPanel.tag(26,2) name = galleryImages type = java.util.List reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_product_005fproductImageCarousel_005f1.setGalleryImages((java.util.List) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${galleryImages}", java.util.List.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_product_005fproductImageCarousel_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_product_005fproductImageCarousel_005f1);
    return false;
  }

  private boolean _jspx_meth_ycommerce_005ftestId_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  ycommerce:testId
    de.hybris.merchandise.storefront.tags.TestIdTag _jspx_th_ycommerce_005ftestId_005f0 = new de.hybris.merchandise.storefront.tags.TestIdTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_ycommerce_005ftestId_005f0);
    _jspx_th_ycommerce_005ftestId_005f0.setJspContext(_jspx_page_context);
    _jspx_th_ycommerce_005ftestId_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productDetailsPanel.tag(31,2) name = code type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ycommerce_005ftestId_005f0.setCode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("productDetails_productNamePrice_label_${product.code}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_ycommerce_005ftestId_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_ycommerce_005ftestId_005f0, null));
    _jspx_th_ycommerce_005ftestId_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_ycommerce_005ftestId_005f0);
    return false;
  }

  private boolean _jspx_meth_product_005fproductPromotionSection_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  product:productPromotionSection
    org.apache.jsp.tag.web.desktop.product.productPromotionSection_tag _jspx_th_product_005fproductPromotionSection_005f0 = new org.apache.jsp.tag.web.desktop.product.productPromotionSection_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_product_005fproductPromotionSection_005f0);
    _jspx_th_product_005fproductPromotionSection_005f0.setJspContext(_jspx_page_context);
    _jspx_th_product_005fproductPromotionSection_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productDetailsPanel.tag(42,2) name = product type = de.hybris.platform.commercefacades.product.data.ProductData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_product_005fproductPromotionSection_005f0.setProduct((de.hybris.platform.commercefacades.product.data.ProductData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product}", de.hybris.platform.commercefacades.product.data.ProductData.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_product_005fproductPromotionSection_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_product_005fproductPromotionSection_005f0);
    return false;
  }

  private boolean _jspx_meth_ycommerce_005ftestId_005f1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  ycommerce:testId
    de.hybris.merchandise.storefront.tags.TestIdTag _jspx_th_ycommerce_005ftestId_005f1 = new de.hybris.merchandise.storefront.tags.TestIdTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_ycommerce_005ftestId_005f1);
    _jspx_th_ycommerce_005ftestId_005f1.setJspContext(_jspx_page_context);
    _jspx_th_ycommerce_005ftestId_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productDetailsPanel.tag(46,2) name = code type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ycommerce_005ftestId_005f1.setCode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("productDetails_productNamePrice_label_${product.code}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_ycommerce_005ftestId_005f1.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_ycommerce_005ftestId_005f1, null));
    _jspx_th_ycommerce_005ftestId_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_ycommerce_005ftestId_005f1);
    return false;
  }

  private boolean _jspx_meth_product_005fproductPricePanel_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  product:productPricePanel
    org.apache.jsp.tag.web.desktop.product.productPricePanel_tag _jspx_th_product_005fproductPricePanel_005f0 = new org.apache.jsp.tag.web.desktop.product.productPricePanel_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_product_005fproductPricePanel_005f0);
    _jspx_th_product_005fproductPricePanel_005f0.setJspContext(_jspx_page_context);
    _jspx_th_product_005fproductPricePanel_005f0.setParent(_jspx_parent);
    // /WEB-INF/tags/desktop/product/productDetailsPanel.tag(47,3) name = product type = de.hybris.platform.commercefacades.product.data.ProductData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_product_005fproductPricePanel_005f0.setProduct((de.hybris.platform.commercefacades.product.data.ProductData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product}", de.hybris.platform.commercefacades.product.data.ProductData.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_product_005fproductPricePanel_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_product_005fproductPricePanel_005f0);
    return false;
  }

  private boolean _jspx_meth_product_005fproductAddToCartPanel_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  product:productAddToCartPanel
    org.apache.jsp.tag.web.desktop.product.productAddToCartPanel_tag _jspx_th_product_005fproductAddToCartPanel_005f0 = new org.apache.jsp.tag.web.desktop.product.productAddToCartPanel_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_product_005fproductAddToCartPanel_005f0);
    _jspx_th_product_005fproductAddToCartPanel_005f0.setJspContext(_jspx_page_context);
    _jspx_th_product_005fproductAddToCartPanel_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productDetailsPanel.tag(49,2) name = product type = de.hybris.platform.commercefacades.product.data.ProductData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_product_005fproductAddToCartPanel_005f0.setProduct((de.hybris.platform.commercefacades.product.data.ProductData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product}", de.hybris.platform.commercefacades.product.data.ProductData.class, (PageContext)this.getJspContext(), null, false));
    // /WEB-INF/tags/desktop/product/productDetailsPanel.tag(49,2) name = allowAddToCart type = java.lang.Boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_product_005fproductAddToCartPanel_005f0.setAllowAddToCart((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty showAddToCart ? true : showAddToCart}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_product_005fproductAddToCartPanel_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_product_005fproductAddToCartPanel_005f0);
    return false;
  }

  private boolean _jspx_meth_product_005fproductReviewSummary_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  product:productReviewSummary
    org.apache.jsp.tag.web.desktop.product.productReviewSummary_tag _jspx_th_product_005fproductReviewSummary_005f0 = new org.apache.jsp.tag.web.desktop.product.productReviewSummary_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_product_005fproductReviewSummary_005f0);
    _jspx_th_product_005fproductReviewSummary_005f0.setJspContext(_jspx_page_context);
    _jspx_th_product_005fproductReviewSummary_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/product/productDetailsPanel.tag(51,2) name = product type = de.hybris.platform.commercefacades.product.data.ProductData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_product_005fproductReviewSummary_005f0.setProduct((de.hybris.platform.commercefacades.product.data.ProductData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product}", de.hybris.platform.commercefacades.product.data.ProductData.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_product_005fproductReviewSummary_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_product_005fproductReviewSummary_005f0);
    return false;
  }

  private boolean _jspx_meth_product_005fproductShareTag_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  product:productShareTag
    org.apache.jsp.tag.web.desktop.product.productShareTag_tag _jspx_th_product_005fproductShareTag_005f0 = new org.apache.jsp.tag.web.desktop.product.productShareTag_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_product_005fproductShareTag_005f0);
    _jspx_th_product_005fproductShareTag_005f0.setJspContext(_jspx_page_context);
    _jspx_th_product_005fproductShareTag_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_product_005fproductShareTag_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_product_005fproductShareTag_005f0);
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
      out.write("<h1>\n");
      out.write("\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("</h1>\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_product_005fproductPricePanel_005f0(_jspx_parent, _jspx_page_context))
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
          case 1:
            invoke1( out );
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
