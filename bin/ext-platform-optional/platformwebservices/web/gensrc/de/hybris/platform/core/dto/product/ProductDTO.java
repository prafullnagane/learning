/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 13, 2013 6:34:48 PM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.core.dto.product;

import de.hybris.platform.acceleratorcms.dto.components.ProductFeatureComponentDTO;
import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.catalog.dto.KeywordDTO;
import de.hybris.platform.catalog.dto.ProductFeatureDTO;
import de.hybris.platform.catalog.dto.ProductReferenceDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationClassDTO;
import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.cms2.dto.contents.components.CMSLinkComponentDTO;
import de.hybris.platform.cms2.dto.restrictions.CMSProductRestrictionDTO;
import de.hybris.platform.cms2lib.dto.components.ProductCarouselComponentDTO;
import de.hybris.platform.cms2lib.dto.components.ProductDetailComponentDTO;
import de.hybris.platform.cms2lib.dto.components.ProductListComponentDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.media.MediaContainerDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.dto.order.delivery.DeliveryModeDTO;
import de.hybris.platform.core.dto.product.UnitDTO;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.customerreview.dto.CustomerReviewDTO;
import de.hybris.platform.deeplink.dto.media.BarcodeMediaDTO;
import de.hybris.platform.europe1.dto.DiscountRowDTO;
import de.hybris.platform.europe1.dto.PriceRowDTO;
import de.hybris.platform.europe1.dto.TaxRowDTO;
import de.hybris.platform.fraud.dto.ProductOrderLimitDTO;
import de.hybris.platform.ordersplitting.dto.StockLevelDTO;
import de.hybris.platform.ordersplitting.dto.VendorDTO;
import de.hybris.platform.promotions.dto.ProductPromotionDTO;
import de.hybris.platform.variants.dto.VariantProductDTO;
import de.hybris.platform.variants.dto.VariantTypeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Product first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = ProductModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "product")
public class ProductDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Product.numberOfReviews</code> attribute defined at extension <code> */
	private java.lang.Integer _numberOfReviews;
	/** <i>Generated variable</i> - Variable of <code>Product.internalOnly</code> attribute defined at extension <code> */
	private java.lang.Boolean _internalOnly;
	/** <i>Generated variable</i> - Variable of <code>Product.manufacturerTypeDescription</code> attribute defined at extension <code> */
	private java.lang.String _manufacturerTypeDescription;
	/** <i>Generated variable</i> - Variable of <code>Product.normal</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.media.MediaDTO> _normal;
	/** <i>Generated variable</i> - Variable of <code>Product.offlineDate</code> attribute defined at extension <code> */
	private java.util.Date _offlineDate;
	/** <i>Generated variable</i> - Variable of <code>Product.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>Product.manufacturerAID</code> attribute defined at extension <code> */
	private java.lang.String _manufacturerAID;
	/** <i>Generated variable</i> - Variable of <code>Product.contentUnit</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.UnitDTO _contentUnit;
	/** <i>Generated variable</i> - Variable of <code>Product.averageRating</code> attribute defined at extension <code> */
	private java.lang.Double _averageRating;
	/** <i>Generated variable</i> - Variable of <code>Product.others</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.media.MediaDTO> _others;
	/** <i>Generated variable</i> - Variable of <code>Product.productDetailComponents</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2lib.dto.components.ProductDetailComponentDTO> _productDetailComponents;
	/** <i>Generated variable</i> - Variable of <code>Product.europe1Taxes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.europe1.dto.TaxRowDTO> _europe1Taxes;
	/** <i>Generated variable</i> - Variable of <code>Product.logo</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.media.MediaDTO> _logo;
	/** <i>Generated variable</i> - Variable of <code>Product.supercategories</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.category.dto.CategoryDTO> _supercategories;
	/** <i>Generated variable</i> - Variable of <code>Product.productListComponents</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2lib.dto.components.ProductListComponentDTO> _productListComponents;
	/** <i>Generated variable</i> - Variable of <code>Product.xmlcontent</code> attribute defined at extension <code> */
	private java.lang.String _xmlcontent;
	/** <i>Generated variable</i> - Variable of <code>Product.productReviews</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.customerreview.dto.CustomerReviewDTO> _productReviews;
	/** <i>Generated variable</i> - Variable of <code>Product.vendors</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.ordersplitting.dto.VendorDTO> _vendors;
	/** <i>Generated variable</i> - Variable of <code>Product.summary</code> attribute defined at extension <code> */
	private java.lang.String _summary;
	/** <i>Generated variable</i> - Variable of <code>Product.data_sheet</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.media.MediaDTO> _data_sheet;
	/** <i>Generated variable</i> - Variable of <code>Product.variants</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.variants.dto.VariantProductDTO> _variants;
	/** <i>Generated variable</i> - Variable of <code>Product.erpGroupBuyer</code> attribute defined at extension <code> */
	private java.lang.String _erpGroupBuyer;
	/** <i>Generated variable</i> - Variable of <code>Product.detail</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.media.MediaDTO> _detail;
	/** <i>Generated variable</i> - Variable of <code>Product.stockLevels</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.ordersplitting.dto.StockLevelDTO> _stockLevels;
	/** <i>Generated variable</i> - Variable of <code>Product.features</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.ProductFeatureDTO> _features;
	/** <i>Generated variable</i> - Variable of <code>Product.approvalStatus</code> attribute defined at extension <code> */
	private java.lang.String _approvalStatus;
	/** <i>Generated variable</i> - Variable of <code>Product.minOrderQuantity</code> attribute defined at extension <code> */
	private java.lang.Integer _minOrderQuantity;
	/** <i>Generated variable</i> - Variable of <code>Product.Europe1PriceFactory_PPG</code> attribute defined at extension <code> */
	private java.lang.String _Europe1PriceFactory_PPG;
	/** <i>Generated variable</i> - Variable of <code>Product.galleryImages</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.media.MediaContainerDTO> _galleryImages;
	/** <i>Generated variable</i> - Variable of <code>Product.productCarouselComponents</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2lib.dto.components.ProductCarouselComponentDTO> _productCarouselComponents;
	/** <i>Generated variable</i> - Variable of <code>Product.Europe1PriceFactory_PDG</code> attribute defined at extension <code> */
	private java.lang.String _Europe1PriceFactory_PDG;
	/** <i>Generated variable</i> - Variable of <code>Product.thumbnails</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.media.MediaDTO> _thumbnails;
	/** <i>Generated variable</i> - Variable of <code>Product.restrictions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.restrictions.CMSProductRestrictionDTO> _restrictions;
	/** <i>Generated variable</i> - Variable of <code>Product.sequenceId</code> attribute defined at extension <code> */
	private java.lang.Long _sequenceId;
	/** <i>Generated variable</i> - Variable of <code>Product.catalogVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _catalogVersion;
	/** <i>Generated variable</i> - Variable of <code>Product.orderQuantityInterval</code> attribute defined at extension <code> */
	private java.lang.Integer _orderQuantityInterval;
	/** <i>Generated variable</i> - Variable of <code>Product.Europe1PriceFactory_PTG</code> attribute defined at extension <code> */
	private java.lang.String _Europe1PriceFactory_PTG;
	/** <i>Generated variable</i> - Variable of <code>Product.europe1Prices</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.europe1.dto.PriceRowDTO> _europe1Prices;
	/** <i>Generated variable</i> - Variable of <code>Product.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>Product.deliveryTime</code> attribute defined at extension <code> */
	private java.lang.Double _deliveryTime;
	/** <i>Generated variable</i> - Variable of <code>Product.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>Product.ean</code> attribute defined at extension <code> */
	private java.lang.String _ean;
	/** <i>Generated variable</i> - Variable of <code>Product.onlineDate</code> attribute defined at extension <code> */
	private java.util.Date _onlineDate;
	/** <i>Generated variable</i> - Variable of <code>Product.manufacturerName</code> attribute defined at extension <code> */
	private java.lang.String _manufacturerName;
	/** <i>Generated variable</i> - Variable of <code>Product.thumbnail</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _thumbnail;
	/** <i>Generated variable</i> - Variable of <code>Product.promotions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.ProductPromotionDTO> _promotions;
	/** <i>Generated variable</i> - Variable of <code>Product.remarks</code> attribute defined at extension <code> */
	private java.lang.String _remarks;
	/** <i>Generated variable</i> - Variable of <code>Product.variantType</code> attribute defined at extension <code> */
	private de.hybris.platform.variants.dto.VariantTypeDTO _variantType;
	/** <i>Generated variable</i> - Variable of <code>Product.erpGroupSupplier</code> attribute defined at extension <code> */
	private java.lang.String _erpGroupSupplier;
	/** <i>Generated variable</i> - Variable of <code>Product.endLineNumber</code> attribute defined at extension <code> */
	private java.lang.Integer _endLineNumber;
	/** <i>Generated variable</i> - Variable of <code>Product.productOrderLimit</code> attribute defined at extension <code> */
	private de.hybris.platform.fraud.dto.ProductOrderLimitDTO _productOrderLimit;
	/** <i>Generated variable</i> - Variable of <code>Product.deliveryModes</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.core.dto.order.delivery.DeliveryModeDTO> _deliveryModes;
	/** <i>Generated variable</i> - Variable of <code>Product.classificationClasses</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.classification.ClassificationClassDTO> _classificationClasses;
	/** <i>Generated variable</i> - Variable of <code>Product.priceQuantity</code> attribute defined at extension <code> */
	private java.lang.Double _priceQuantity;
	/** <i>Generated variable</i> - Variable of <code>Product.maxOrderQuantity</code> attribute defined at extension <code> */
	private java.lang.Integer _maxOrderQuantity;
	/** <i>Generated variable</i> - Variable of <code>Product.supplierAlternativeAID</code> attribute defined at extension <code> */
	private java.lang.String _supplierAlternativeAID;
	/** <i>Generated variable</i> - Variable of <code>Product.europe1Discounts</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.europe1.dto.DiscountRowDTO> _europe1Discounts;
	/** <i>Generated variable</i> - Variable of <code>Product.picture</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _picture;
	/** <i>Generated variable</i> - Variable of <code>Product.untypedFeatures</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.ProductFeatureDTO> _untypedFeatures;
	/** <i>Generated variable</i> - Variable of <code>Product.productReferences</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.catalog.dto.ProductReferenceDTO> _productReferences;
	/** <i>Generated variable</i> - Variable of <code>Product.keywords</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.KeywordDTO> _keywords;
	/** <i>Generated variable</i> - Variable of <code>Product.order</code> attribute defined at extension <code> */
	private java.lang.Integer _order;
	/** <i>Generated variable</i> - Variable of <code>Product.linkComponents</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.contents.components.CMSLinkComponentDTO> _linkComponents;
	/** <i>Generated variable</i> - Variable of <code>Product.barcodes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.deeplink.dto.media.BarcodeMediaDTO> _barcodes;
	/** <i>Generated variable</i> - Variable of <code>Product.startLineNumber</code> attribute defined at extension <code> */
	private java.lang.Integer _startLineNumber;
	/** <i>Generated variable</i> - Variable of <code>Product.numberContentUnits</code> attribute defined at extension <code> */
	private java.lang.Double _numberContentUnits;
	/** <i>Generated variable</i> - Variable of <code>Product.segment</code> attribute defined at extension <code> */
	private java.lang.String _segment;
	/** <i>Generated variable</i> - Variable of <code>Product.productFeatureComponents</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.acceleratorcms.dto.components.ProductFeatureComponentDTO> _productFeatureComponents;
	/** <i>Generated variable</i> - Variable of <code>Product.unit</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.UnitDTO _unit;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getApprovalStatus()
	{
		return this._approvalStatus;
	}
	
	public Double getAverageRating()
	{
		return this._averageRating;
	}
	
	@XmlElementWrapper(name = "barcodes")
	@XmlElement(name = "barcodeMedia")
	public Collection<BarcodeMediaDTO> getBarcodes()
	{
		return this._barcodes;
	}
	
	public CatalogVersionDTO getCatalogVersion()
	{
		return this._catalogVersion;
	}
	
	@XmlElementWrapper(name = "classificationClasses")
	@XmlElement(name = "classificationClass")
	public List<ClassificationClassDTO> getClassificationClasses()
	{
		return this._classificationClasses;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public UnitDTO getContentUnit()
	{
		return this._contentUnit;
	}
	
	@XmlElementWrapper(name = "data_sheet")
	@XmlElement(name = "media")
	public Collection<MediaDTO> getData_sheet()
	{
		return this._data_sheet;
	}
	
	@XmlElementWrapper(name = "deliveryModes")
	@XmlElement(name = "deliveryMode")
	public Set<DeliveryModeDTO> getDeliveryModes()
	{
		return this._deliveryModes;
	}
	
	public Double getDeliveryTime()
	{
		return this._deliveryTime;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	@XmlElementWrapper(name = "detail")
	@XmlElement(name = "media")
	public Collection<MediaDTO> getDetail()
	{
		return this._detail;
	}
	
	public String getEan()
	{
		return this._ean;
	}
	
	public Integer getEndLineNumber()
	{
		return this._endLineNumber;
	}
	
	public String getErpGroupBuyer()
	{
		return this._erpGroupBuyer;
	}
	
	public String getErpGroupSupplier()
	{
		return this._erpGroupSupplier;
	}
	
	@XmlElementWrapper(name = "europe1Discounts")
	@XmlElement(name = "discountRow")
	public Collection<DiscountRowDTO> getEurope1Discounts()
	{
		return this._europe1Discounts;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getEurope1PriceFactory_PDG()
	{
		return this._Europe1PriceFactory_PDG;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getEurope1PriceFactory_PPG()
	{
		return this._Europe1PriceFactory_PPG;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getEurope1PriceFactory_PTG()
	{
		return this._Europe1PriceFactory_PTG;
	}
	
	@XmlElementWrapper(name = "europe1Prices")
	@XmlElement(name = "priceRow")
	public Collection<PriceRowDTO> getEurope1Prices()
	{
		return this._europe1Prices;
	}
	
	@XmlElementWrapper(name = "europe1Taxes")
	@XmlElement(name = "taxRow")
	public Collection<TaxRowDTO> getEurope1Taxes()
	{
		return this._europe1Taxes;
	}
	
	@XmlElementWrapper(name = "features")
	@XmlElement(name = "productFeature")
	public List<ProductFeatureDTO> getFeatures()
	{
		return this._features;
	}
	
	@XmlElementWrapper(name = "galleryImages")
	@XmlElement(name = "mediaContainer")
	public List<MediaContainerDTO> getGalleryImages()
	{
		return this._galleryImages;
	}
	
	public Boolean getInternalOnly()
	{
		return this._internalOnly;
	}
	
	public List<KeywordDTO> getKeywords()
	{
		return this._keywords;
	}
	
	@XmlElementWrapper(name = "linkComponents")
	@XmlElement(name = "cMSLinkComponent")
	public List<CMSLinkComponentDTO> getLinkComponents()
	{
		return this._linkComponents;
	}
	
	@XmlElementWrapper(name = "logo")
	@XmlElement(name = "media")
	public Collection<MediaDTO> getLogo()
	{
		return this._logo;
	}
	
	public String getManufacturerAID()
	{
		return this._manufacturerAID;
	}
	
	public String getManufacturerName()
	{
		return this._manufacturerName;
	}
	
	public String getManufacturerTypeDescription()
	{
		return this._manufacturerTypeDescription;
	}
	
	public Integer getMaxOrderQuantity()
	{
		return this._maxOrderQuantity;
	}
	
	public Integer getMinOrderQuantity()
	{
		return this._minOrderQuantity;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	@XmlElementWrapper(name = "normal")
	@XmlElement(name = "media")
	public Collection<MediaDTO> getNormal()
	{
		return this._normal;
	}
	
	public Double getNumberContentUnits()
	{
		return this._numberContentUnits;
	}
	
	public Integer getNumberOfReviews()
	{
		return this._numberOfReviews;
	}
	
	public Date getOfflineDate()
	{
		return this._offlineDate;
	}
	
	public Date getOnlineDate()
	{
		return this._onlineDate;
	}
	
	public Integer getOrder()
	{
		return this._order;
	}
	
	public Integer getOrderQuantityInterval()
	{
		return this._orderQuantityInterval;
	}
	
	@XmlElementWrapper(name = "others")
	@XmlElement(name = "media")
	public Collection<MediaDTO> getOthers()
	{
		return this._others;
	}
	
	public MediaDTO getPicture()
	{
		return this._picture;
	}
	
	public Double getPriceQuantity()
	{
		return this._priceQuantity;
	}
	
	@XmlElementWrapper(name = "productCarouselComponents")
	@XmlElement(name = "productCarouselComponent")
	public Collection<ProductCarouselComponentDTO> getProductCarouselComponents()
	{
		return this._productCarouselComponents;
	}
	
	@XmlElementWrapper(name = "productDetailComponents")
	@XmlElement(name = "productDetailComponent")
	public List<ProductDetailComponentDTO> getProductDetailComponents()
	{
		return this._productDetailComponents;
	}
	
	@XmlElementWrapper(name = "productFeatureComponents")
	@XmlElement(name = "productFeatureComponent")
	public List<ProductFeatureComponentDTO> getProductFeatureComponents()
	{
		return this._productFeatureComponents;
	}
	
	@XmlElementWrapper(name = "productListComponents")
	@XmlElement(name = "productListComponent")
	public Collection<ProductListComponentDTO> getProductListComponents()
	{
		return this._productListComponents;
	}
	
	public ProductOrderLimitDTO getProductOrderLimit()
	{
		return this._productOrderLimit;
	}
	
	@XmlElementWrapper(name = "productReferences")
	@XmlElement(name = "productReference")
	public Collection<ProductReferenceDTO> getProductReferences()
	{
		return this._productReferences;
	}
	
	@XmlElementWrapper(name = "productReviews")
	@XmlElement(name = "customerReview")
	public Collection<CustomerReviewDTO> getProductReviews()
	{
		return this._productReviews;
	}
	
	@XmlElementWrapper(name = "promotions")
	@XmlElement(name = "productPromotion")
	public Collection<ProductPromotionDTO> getPromotions()
	{
		return this._promotions;
	}
	
	public String getRemarks()
	{
		return this._remarks;
	}
	
	@XmlElementWrapper(name = "restrictions")
	@XmlElement(name = "cMSProductRestriction")
	public Collection<CMSProductRestrictionDTO> getRestrictions()
	{
		return this._restrictions;
	}
	
	public String getSegment()
	{
		return this._segment;
	}
	
	public Long getSequenceId()
	{
		return this._sequenceId;
	}
	
	public Integer getStartLineNumber()
	{
		return this._startLineNumber;
	}
	
	@XmlElementWrapper(name = "stockLevels")
	@XmlElement(name = "stockLevel")
	public Set<StockLevelDTO> getStockLevels()
	{
		return this._stockLevels;
	}
	
	public String getSummary()
	{
		return this._summary;
	}
	
	@XmlElementWrapper(name = "supercategories")
	@XmlElement(name = "category")
	public Collection<CategoryDTO> getSupercategories()
	{
		return this._supercategories;
	}
	
	public String getSupplierAlternativeAID()
	{
		return this._supplierAlternativeAID;
	}
	
	public MediaDTO getThumbnail()
	{
		return this._thumbnail;
	}
	
	@XmlElementWrapper(name = "thumbnails")
	@XmlElement(name = "media")
	public Collection<MediaDTO> getThumbnails()
	{
		return this._thumbnails;
	}
	
	public UnitDTO getUnit()
	{
		return this._unit;
	}
	
	@XmlElementWrapper(name = "untypedFeatures")
	@XmlElement(name = "productFeature")
	public List<ProductFeatureDTO> getUntypedFeatures()
	{
		return this._untypedFeatures;
	}
	
	@XmlElementWrapper(name = "variants")
	@XmlElement(name = "variantProduct")
	public Collection<VariantProductDTO> getVariants()
	{
		return this._variants;
	}
	
	public VariantTypeDTO getVariantType()
	{
		return this._variantType;
	}
	
	@XmlElementWrapper(name = "vendors")
	@XmlElement(name = "vendor")
	public Set<VendorDTO> getVendors()
	{
		return this._vendors;
	}
	
	public String getXmlcontent()
	{
		return this._xmlcontent;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setApprovalStatus(final String value)
	{
		this.modifiedPropsSet.add("approvalStatus");
		this._approvalStatus = value;
	}
	
	public void setAverageRating(final Double value)
	{
		this.modifiedPropsSet.add("averageRating");
		this._averageRating = value;
	}
	
	public void setBarcodes(final Collection<BarcodeMediaDTO> value)
	{
		this.modifiedPropsSet.add("barcodes");
		this._barcodes = value;
	}
	
	public void setCatalogVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("catalogVersion");
		this._catalogVersion = value;
	}
	
	public void setClassificationClasses(final List<ClassificationClassDTO> value)
	{
		this.modifiedPropsSet.add("classificationClasses");
		this._classificationClasses = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setContentUnit(final UnitDTO value)
	{
		this.modifiedPropsSet.add("contentUnit");
		this._contentUnit = value;
	}
	
	public void setData_sheet(final Collection<MediaDTO> value)
	{
		this.modifiedPropsSet.add("data_sheet");
		this._data_sheet = value;
	}
	
	public void setDeliveryModes(final Set<DeliveryModeDTO> value)
	{
		this.modifiedPropsSet.add("deliveryModes");
		this._deliveryModes = value;
	}
	
	public void setDeliveryTime(final Double value)
	{
		this.modifiedPropsSet.add("deliveryTime");
		this._deliveryTime = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setDetail(final Collection<MediaDTO> value)
	{
		this.modifiedPropsSet.add("detail");
		this._detail = value;
	}
	
	public void setEan(final String value)
	{
		this.modifiedPropsSet.add("ean");
		this._ean = value;
	}
	
	public void setEndLineNumber(final Integer value)
	{
		this.modifiedPropsSet.add("endLineNumber");
		this._endLineNumber = value;
	}
	
	public void setErpGroupBuyer(final String value)
	{
		this.modifiedPropsSet.add("erpGroupBuyer");
		this._erpGroupBuyer = value;
	}
	
	public void setErpGroupSupplier(final String value)
	{
		this.modifiedPropsSet.add("erpGroupSupplier");
		this._erpGroupSupplier = value;
	}
	
	public void setEurope1Discounts(final Collection<DiscountRowDTO> value)
	{
		this.modifiedPropsSet.add("europe1Discounts");
		this._europe1Discounts = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setEurope1PriceFactory_PDG(final String value)
	{
		this.modifiedPropsSet.add("Europe1PriceFactory_PDG");
		this._Europe1PriceFactory_PDG = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setEurope1PriceFactory_PPG(final String value)
	{
		this.modifiedPropsSet.add("Europe1PriceFactory_PPG");
		this._Europe1PriceFactory_PPG = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setEurope1PriceFactory_PTG(final String value)
	{
		this.modifiedPropsSet.add("Europe1PriceFactory_PTG");
		this._Europe1PriceFactory_PTG = value;
	}
	
	public void setEurope1Prices(final Collection<PriceRowDTO> value)
	{
		this.modifiedPropsSet.add("europe1Prices");
		this._europe1Prices = value;
	}
	
	public void setEurope1Taxes(final Collection<TaxRowDTO> value)
	{
		this.modifiedPropsSet.add("europe1Taxes");
		this._europe1Taxes = value;
	}
	
	public void setFeatures(final List<ProductFeatureDTO> value)
	{
		this.modifiedPropsSet.add("features");
		this._features = value;
	}
	
	public void setGalleryImages(final List<MediaContainerDTO> value)
	{
		this.modifiedPropsSet.add("galleryImages");
		this._galleryImages = value;
	}
	
	public void setInternalOnly(final Boolean value)
	{
		this.modifiedPropsSet.add("internalOnly");
		this._internalOnly = value;
	}
	
	public void setKeywords(final List<KeywordDTO> value)
	{
		this.modifiedPropsSet.add("keywords");
		this._keywords = value;
	}
	
	public void setLinkComponents(final List<CMSLinkComponentDTO> value)
	{
		this.modifiedPropsSet.add("linkComponents");
		this._linkComponents = value;
	}
	
	public void setLogo(final Collection<MediaDTO> value)
	{
		this.modifiedPropsSet.add("logo");
		this._logo = value;
	}
	
	public void setManufacturerAID(final String value)
	{
		this.modifiedPropsSet.add("manufacturerAID");
		this._manufacturerAID = value;
	}
	
	public void setManufacturerName(final String value)
	{
		this.modifiedPropsSet.add("manufacturerName");
		this._manufacturerName = value;
	}
	
	public void setManufacturerTypeDescription(final String value)
	{
		this.modifiedPropsSet.add("manufacturerTypeDescription");
		this._manufacturerTypeDescription = value;
	}
	
	public void setMaxOrderQuantity(final Integer value)
	{
		this.modifiedPropsSet.add("maxOrderQuantity");
		this._maxOrderQuantity = value;
	}
	
	public void setMinOrderQuantity(final Integer value)
	{
		this.modifiedPropsSet.add("minOrderQuantity");
		this._minOrderQuantity = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setNormal(final Collection<MediaDTO> value)
	{
		this.modifiedPropsSet.add("normal");
		this._normal = value;
	}
	
	public void setNumberContentUnits(final Double value)
	{
		this.modifiedPropsSet.add("numberContentUnits");
		this._numberContentUnits = value;
	}
	
	public void setNumberOfReviews(final Integer value)
	{
		this.modifiedPropsSet.add("numberOfReviews");
		this._numberOfReviews = value;
	}
	
	public void setOfflineDate(final Date value)
	{
		this.modifiedPropsSet.add("offlineDate");
		this._offlineDate = value;
	}
	
	public void setOnlineDate(final Date value)
	{
		this.modifiedPropsSet.add("onlineDate");
		this._onlineDate = value;
	}
	
	public void setOrder(final Integer value)
	{
		this.modifiedPropsSet.add("order");
		this._order = value;
	}
	
	public void setOrderQuantityInterval(final Integer value)
	{
		this.modifiedPropsSet.add("orderQuantityInterval");
		this._orderQuantityInterval = value;
	}
	
	public void setOthers(final Collection<MediaDTO> value)
	{
		this.modifiedPropsSet.add("others");
		this._others = value;
	}
	
	public void setPicture(final MediaDTO value)
	{
		this.modifiedPropsSet.add("picture");
		this._picture = value;
	}
	
	public void setPriceQuantity(final Double value)
	{
		this.modifiedPropsSet.add("priceQuantity");
		this._priceQuantity = value;
	}
	
	public void setProductCarouselComponents(final Collection<ProductCarouselComponentDTO> value)
	{
		this.modifiedPropsSet.add("productCarouselComponents");
		this._productCarouselComponents = value;
	}
	
	public void setProductDetailComponents(final List<ProductDetailComponentDTO> value)
	{
		this.modifiedPropsSet.add("productDetailComponents");
		this._productDetailComponents = value;
	}
	
	public void setProductFeatureComponents(final List<ProductFeatureComponentDTO> value)
	{
		this.modifiedPropsSet.add("productFeatureComponents");
		this._productFeatureComponents = value;
	}
	
	public void setProductListComponents(final Collection<ProductListComponentDTO> value)
	{
		this.modifiedPropsSet.add("productListComponents");
		this._productListComponents = value;
	}
	
	public void setProductOrderLimit(final ProductOrderLimitDTO value)
	{
		this.modifiedPropsSet.add("productOrderLimit");
		this._productOrderLimit = value;
	}
	
	public void setProductReferences(final Collection<ProductReferenceDTO> value)
	{
		this.modifiedPropsSet.add("productReferences");
		this._productReferences = value;
	}
	
	public void setProductReviews(final Collection<CustomerReviewDTO> value)
	{
		this.modifiedPropsSet.add("productReviews");
		this._productReviews = value;
	}
	
	public void setPromotions(final Collection<ProductPromotionDTO> value)
	{
		this.modifiedPropsSet.add("promotions");
		this._promotions = value;
	}
	
	public void setRemarks(final String value)
	{
		this.modifiedPropsSet.add("remarks");
		this._remarks = value;
	}
	
	public void setRestrictions(final Collection<CMSProductRestrictionDTO> value)
	{
		this.modifiedPropsSet.add("restrictions");
		this._restrictions = value;
	}
	
	public void setSegment(final String value)
	{
		this.modifiedPropsSet.add("segment");
		this._segment = value;
	}
	
	public void setSequenceId(final Long value)
	{
		this.modifiedPropsSet.add("sequenceId");
		this._sequenceId = value;
	}
	
	public void setStartLineNumber(final Integer value)
	{
		this.modifiedPropsSet.add("startLineNumber");
		this._startLineNumber = value;
	}
	
	public void setStockLevels(final Set<StockLevelDTO> value)
	{
		this.modifiedPropsSet.add("stockLevels");
		this._stockLevels = value;
	}
	
	public void setSummary(final String value)
	{
		this.modifiedPropsSet.add("summary");
		this._summary = value;
	}
	
	public void setSupercategories(final Collection<CategoryDTO> value)
	{
		this.modifiedPropsSet.add("supercategories");
		this._supercategories = value;
	}
	
	public void setSupplierAlternativeAID(final String value)
	{
		this.modifiedPropsSet.add("supplierAlternativeAID");
		this._supplierAlternativeAID = value;
	}
	
	public void setThumbnail(final MediaDTO value)
	{
		this.modifiedPropsSet.add("thumbnail");
		this._thumbnail = value;
	}
	
	public void setThumbnails(final Collection<MediaDTO> value)
	{
		this.modifiedPropsSet.add("thumbnails");
		this._thumbnails = value;
	}
	
	public void setUnit(final UnitDTO value)
	{
		this.modifiedPropsSet.add("unit");
		this._unit = value;
	}
	
	public void setUntypedFeatures(final List<ProductFeatureDTO> value)
	{
		this.modifiedPropsSet.add("untypedFeatures");
		this._untypedFeatures = value;
	}
	
	public void setVariants(final Collection<VariantProductDTO> value)
	{
		this.modifiedPropsSet.add("variants");
		this._variants = value;
	}
	
	public void setVariantType(final VariantTypeDTO value)
	{
		this.modifiedPropsSet.add("variantType");
		this._variantType = value;
	}
	
	public void setVendors(final Set<VendorDTO> value)
	{
		this.modifiedPropsSet.add("vendors");
		this._vendors = value;
	}
	
	public void setXmlcontent(final String value)
	{
		this.modifiedPropsSet.add("xmlcontent");
		this._xmlcontent = value;
	}
	
}
