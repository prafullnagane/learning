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

import de.hybris.platform.core.dto.product.UnitDTO;
import de.hybris.platform.voucher.dto.ProductRestrictionDTO;
import de.hybris.platform.voucher.model.ProductQuantityRestrictionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductQuantityRestriction first defined at extension voucher
 */
@SuppressWarnings("all")
@GraphNode(target = ProductQuantityRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "productquantityrestriction")
public class ProductQuantityRestrictionDTO extends ProductRestrictionDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductQuantityRestriction.unit</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.UnitDTO _unit;
	/** <i>Generated variable</i> - Variable of <code>ProductQuantityRestriction.quantity</code> attribute defined at extension <code> */
	private java.lang.Long _quantity;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductQuantityRestrictionDTO()
	{
		super();
	}
	
	
	public Long getQuantity()
	{
		return this._quantity;
	}
	
	public UnitDTO getUnit()
	{
		return this._unit;
	}
	
	public void setQuantity(final Long value)
	{
		this.modifiedPropsSet.add("quantity");
		this._quantity = value;
	}
	
	public void setUnit(final UnitDTO value)
	{
		this.modifiedPropsSet.add("unit");
		this._unit = value;
	}
	
}
