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

import de.hybris.platform.voucher.dto.RestrictionDTO;
import de.hybris.platform.voucher.model.RegularCustomerOrderQuantityRestrictionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type RegularCustomerOrderQuantityRestriction first defined at extension voucher
 */
@SuppressWarnings("all")
@GraphNode(target = RegularCustomerOrderQuantityRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "regularcustomerorderquantityrestriction")
public class RegularCustomerOrderQuantityRestrictionDTO extends RestrictionDTO
{
	/** <i>Generated variable</i> - Variable of <code>RegularCustomerOrderQuantityRestriction.orderQuantity</code> attribute defined at extension <code> */
	private java.lang.Integer _orderQuantity;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RegularCustomerOrderQuantityRestrictionDTO()
	{
		super();
	}
	
	
	public Integer getOrderQuantity()
	{
		return this._orderQuantity;
	}
	
	public void setOrderQuantity(final Integer value)
	{
		this.modifiedPropsSet.add("orderQuantity");
		this._orderQuantity = value;
	}
	
}
