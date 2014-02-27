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
package de.hybris.platform.btg.dto;

import de.hybris.platform.btg.dto.BTGAbstractReferenceOperandDTO;
import de.hybris.platform.btg.model.BTGReferenceProductsOperandModel;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGReferenceProductsOperand first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGReferenceProductsOperandModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "btgreferenceproductsoperand")
public class BTGReferenceProductsOperandDTO extends BTGAbstractReferenceOperandDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGReferenceProductsOperand.products</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.product.ProductDTO> _products;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceProductsOperandDTO()
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
