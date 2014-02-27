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
package de.hybris.platform.cms2.dto.restrictions;

import de.hybris.platform.cms2.dto.restrictions.AbstractRestrictionDTO;
import de.hybris.platform.cms2.model.restrictions.CMSProductRestrictionModel;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CMSProductRestriction first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = CMSProductRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "cmsproductrestriction")
public class CMSProductRestrictionDTO extends AbstractRestrictionDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSProductRestriction.products</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.product.ProductDTO> _products;
	/** <i>Generated variable</i> - Variable of <code>CMSProductRestriction.productCodes</code> attribute defined at extension <code> */
	private java.util.List<java.lang.String> _productCodes;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSProductRestrictionDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "productCodes")
	@XmlElement(name = "value")
	public List<String> getProductCodes()
	{
		return this._productCodes;
	}
	
	@XmlElementWrapper(name = "products")
	@XmlElement(name = "product")
	public Collection<ProductDTO> getProducts()
	{
		return this._products;
	}
	
	public void setProductCodes(final List<String> value)
	{
		this.modifiedPropsSet.add("productCodes");
		this._productCodes = value;
	}
	
	public void setProducts(final Collection<ProductDTO> value)
	{
		this.modifiedPropsSet.add("products");
		this._products = value;
	}
	
}
