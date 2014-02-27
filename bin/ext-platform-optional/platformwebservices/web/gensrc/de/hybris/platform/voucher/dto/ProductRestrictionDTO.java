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
package de.hybris.platform.voucher.dto;

import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.voucher.dto.RestrictionDTO;
import de.hybris.platform.voucher.model.ProductRestrictionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductRestriction first defined at extension voucher
 */
@SuppressWarnings("all")
@GraphNode(target = ProductRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "productrestriction")
public class ProductRestrictionDTO extends RestrictionDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductRestriction.products</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.product.ProductDTO> _products;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductRestrictionDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "products")
	@XmlElement(name = "product")
	public Collection<ProductDTO> getProducts()
	{
		return this._products;
	}
	
	public void setProducts(final Collection<ProductDTO> value)
	{
		this.modifiedPropsSet.add("products");
		this._products = value;
	}
	
}
