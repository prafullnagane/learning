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
package de.hybris.platform.returns.dto;

import de.hybris.platform.ordermodify.dto.OrderEntryModificationRecordEntryDTO;
import de.hybris.platform.returns.model.OrderEntryReturnRecordEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OrderEntryReturnRecordEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = OrderEntryReturnRecordEntryModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "orderentryreturnrecordentry")
public class OrderEntryReturnRecordEntryDTO extends OrderEntryModificationRecordEntryDTO
{
	/** <i>Generated variable</i> - Variable of <code>OrderEntryReturnRecordEntry.expectedQuantity</code> attribute defined at extension <code> */
	private java.lang.Long _expectedQuantity;
	/** <i>Generated variable</i> - Variable of <code>OrderEntryReturnRecordEntry.returnedQuantity</code> attribute defined at extension <code> */
	private java.lang.Long _returnedQuantity;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderEntryReturnRecordEntryDTO()
	{
		super();
	}
	
	
	public Long getExpectedQuantity()
	{
		return this._expectedQuantity;
	}
	
	public Long getReturnedQuantity()
	{
		return this._returnedQuantity;
	}
	
	public void setExpectedQuantity(final Long value)
	{
		this.modifiedPropsSet.add("expectedQuantity");
		this._expectedQuantity = value;
	}
	
	public void setReturnedQuantity(final Long value)
	{
		this.modifiedPropsSet.add("returnedQuantity");
		this._returnedQuantity = value;
	}
	
}
