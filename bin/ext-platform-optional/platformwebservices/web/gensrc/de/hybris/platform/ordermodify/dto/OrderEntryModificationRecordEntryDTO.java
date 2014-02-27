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
package de.hybris.platform.ordermodify.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.order.OrderEntryDTO;
import de.hybris.platform.ordermodify.dto.OrderModificationRecordEntryDTO;
import de.hybris.platform.ordermodify.model.OrderEntryModificationRecordEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OrderEntryModificationRecordEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = OrderEntryModificationRecordEntryModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "orderentrymodificationrecordentry")
public class OrderEntryModificationRecordEntryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>OrderEntryModificationRecordEntry.orderEntry</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.OrderEntryDTO _orderEntry;
	/** <i>Generated variable</i> - Variable of <code>OrderEntryModificationRecordEntry.modificationRecordEntry</code> attribute defined at extension <code> */
	private de.hybris.platform.ordermodify.dto.OrderModificationRecordEntryDTO _modificationRecordEntry;
	/** <i>Generated variable</i> - Variable of <code>OrderEntryModificationRecordEntry.originalOrderEntry</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.OrderEntryDTO _originalOrderEntry;
	/** <i>Generated variable</i> - Variable of <code>OrderEntryModificationRecordEntry.notes</code> attribute defined at extension <code> */
	private java.lang.String _notes;
	/** <i>Generated variable</i> - Variable of <code>OrderEntryModificationRecordEntry.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderEntryModificationRecordEntryDTO()
	{
		super();
	}
	
	
	public String getCode()
	{
		return this._code;
	}
	
	public OrderModificationRecordEntryDTO getModificationRecordEntry()
	{
		return this._modificationRecordEntry;
	}
	
	public String getNotes()
	{
		return this._notes;
	}
	
	public OrderEntryDTO getOrderEntry()
	{
		return this._orderEntry;
	}
	
	public OrderEntryDTO getOriginalOrderEntry()
	{
		return this._originalOrderEntry;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setModificationRecordEntry(final OrderModificationRecordEntryDTO value)
	{
		this.modifiedPropsSet.add("modificationRecordEntry");
		this._modificationRecordEntry = value;
	}
	
	public void setNotes(final String value)
	{
		this.modifiedPropsSet.add("notes");
		this._notes = value;
	}
	
	public void setOrderEntry(final OrderEntryDTO value)
	{
		this.modifiedPropsSet.add("orderEntry");
		this._orderEntry = value;
	}
	
	public void setOriginalOrderEntry(final OrderEntryDTO value)
	{
		this.modifiedPropsSet.add("originalOrderEntry");
		this._originalOrderEntry = value;
	}
	
}
