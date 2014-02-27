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
package de.hybris.platform.catalog.dto;

import de.hybris.platform.catalog.dto.CatalogVersionDifferenceDTO;
import de.hybris.platform.catalog.model.ProductCatalogVersionDifferenceModel;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductCatalogVersionDifference first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = ProductCatalogVersionDifferenceModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "productcatalogversiondifference")
public class ProductCatalogVersionDifferenceDTO extends CatalogVersionDifferenceDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductCatalogVersionDifference.targetProductApprovalStatus</code> attribute defined at extension <code> */
	private java.lang.String _targetProductApprovalStatus;
	/** <i>Generated variable</i> - Variable of <code>ProductCatalogVersionDifference.sourceProductApprovalStatus</code> attribute defined at extension <code> */
	private java.lang.String _sourceProductApprovalStatus;
	/** <i>Generated variable</i> - Variable of <code>ProductCatalogVersionDifference.sourceProduct</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _sourceProduct;
	/** <i>Generated variable</i> - Variable of <code>ProductCatalogVersionDifference.mode</code> attribute defined at extension <code> */
	private java.lang.String _mode;
	/** <i>Generated variable</i> - Variable of <code>ProductCatalogVersionDifference.targetProduct</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _targetProduct;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductCatalogVersionDifferenceDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getMode()
	{
		return this._mode;
	}
	
	public ProductDTO getSourceProduct()
	{
		return this._sourceProduct;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getSourceProductApprovalStatus()
	{
		return this._sourceProductApprovalStatus;
	}
	
	public ProductDTO getTargetProduct()
	{
		return this._targetProduct;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getTargetProductApprovalStatus()
	{
		return this._targetProductApprovalStatus;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setMode(final String value)
	{
		this.modifiedPropsSet.add("mode");
		this._mode = value;
	}
	
	public void setSourceProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("sourceProduct");
		this._sourceProduct = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setSourceProductApprovalStatus(final String value)
	{
		this.modifiedPropsSet.add("sourceProductApprovalStatus");
		this._sourceProductApprovalStatus = value;
	}
	
	public void setTargetProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("targetProduct");
		this._targetProduct = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setTargetProductApprovalStatus(final String value)
	{
		this.modifiedPropsSet.add("targetProductApprovalStatus");
		this._targetProductApprovalStatus = value;
	}
	
}
