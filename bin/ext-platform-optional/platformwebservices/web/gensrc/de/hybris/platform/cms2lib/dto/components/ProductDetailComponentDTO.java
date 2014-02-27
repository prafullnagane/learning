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
package de.hybris.platform.cms2lib.dto.components;

import de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO;
import de.hybris.platform.cms2lib.model.components.ProductDetailComponentModel;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductDetailComponent first defined at extension cms2lib
 */
@SuppressWarnings("all")
@GraphNode(target = ProductDetailComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "productdetailcomponent")
public class ProductDetailComponentDTO extends SimpleCMSComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductDetailComponent.product</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _product;
	/** <i>Generated variable</i> - Variable of <code>ProductDetailComponent.productCode</code> attribute defined at extension <code> */
	private java.lang.String _productCode;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductDetailComponentDTO()
	{
		super();
	}
	
	
	public ProductDTO getProduct()
	{
		return this._product;
	}
	
	public String getProductCode()
	{
		return this._productCode;
	}
	
	public void setProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("product");
		this._product = value;
	}
	
	public void setProductCode(final String value)
	{
		this.modifiedPropsSet.add("productCode");
		this._productCode = value;
	}
	
}
