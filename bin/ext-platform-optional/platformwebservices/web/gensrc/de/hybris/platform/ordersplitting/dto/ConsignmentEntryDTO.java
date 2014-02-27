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
package de.hybris.platform.ordersplitting.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.order.AbstractOrderEntryDTO;
import de.hybris.platform.ordersplitting.dto.ConsignmentDTO;
import de.hybris.platform.ordersplitting.model.ConsignmentEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ConsignmentEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = ConsignmentEntryModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "consignmententry")
public class ConsignmentEntryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ConsignmentEntry.shippedQuantity</code> attribute defined at extension <code> */
	private java.lang.Long _shippedQuantity;
	/** <i>Generated variable</i> - Variable of <code>ConsignmentEntry.quantity</code> attribute defined at extension <code> */
	private java.lang.Long _quantity;
	/** <i>Generated variable</i> - Variable of <code>ConsignmentEntry.orderEntry</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.AbstractOrderEntryDTO _orderEntry;
	/** <i>Generated variable</i> - Variable of <code>ConsignmentEntry.consignment</code> attribute defined at extension <code> */
	private de.hybris.platform.ordersplitting.dto.ConsignmentDTO _consignment;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConsignmentEntryDTO()
	{
		super();
	}
	
	
	public ConsignmentDTO getConsignment()
	{
		return this._consignment;
	}
	
	public AbstractOrderEntryDTO getOrderEntry()
	{
		return this._orderEntry;
	}
	
	public Long getQuantity()
	{
		return this._quantity;
	}
	
	public Long getShippedQuantity()
	{
		return this._shippedQuantity;
	}
	
	public void setConsignment(final ConsignmentDTO value)
	{
		this.modifiedPropsSet.add("consignment");
		this._consignment = value;
	}
	
	public void setOrderEntry(final AbstractOrderEntryDTO value)
	{
		this.modifiedPropsSet.add("orderEntry");
		this._orderEntry = value;
	}
	
	public void setQuantity(final Long value)
	{
		this.modifiedPropsSet.add("quantity");
		this._quantity = value;
	}
	
	public void setShippedQuantity(final Long value)
	{
		this.modifiedPropsSet.add("shippedQuantity");
		this._shippedQuantity = value;
	}
	
}
