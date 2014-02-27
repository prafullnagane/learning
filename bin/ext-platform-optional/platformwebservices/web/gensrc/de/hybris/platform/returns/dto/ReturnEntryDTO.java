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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.order.AbstractOrderEntryDTO;
import de.hybris.platform.returns.dto.ReturnRequestDTO;
import de.hybris.platform.returns.model.ReturnEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ReturnEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = ReturnEntryModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "returnentry")
public class ReturnEntryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.returnRequest</code> attribute defined at extension <code> */
	private de.hybris.platform.returns.dto.ReturnRequestDTO _returnRequest;
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.orderEntry</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.AbstractOrderEntryDTO _orderEntry;
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.notes</code> attribute defined at extension <code> */
	private java.lang.String _notes;
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.receivedQuantity</code> attribute defined at extension <code> */
	private java.lang.Long _receivedQuantity;
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.expectedQuantity</code> attribute defined at extension <code> */
	private java.lang.Long _expectedQuantity;
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.reachedDate</code> attribute defined at extension <code> */
	private java.util.Date _reachedDate;
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.action</code> attribute defined at extension <code> */
	private java.lang.String _action;
	/** <i>Generated variable</i> - Variable of <code>ReturnEntry.status</code> attribute defined at extension <code> */
	private java.lang.String _status;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReturnEntryDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getAction()
	{
		return this._action;
	}
	
	public Long getExpectedQuantity()
	{
		return this._expectedQuantity;
	}
	
	public String getNotes()
	{
		return this._notes;
	}
	
	public AbstractOrderEntryDTO getOrderEntry()
	{
		return this._orderEntry;
	}
	
	public Date getReachedDate()
	{
		return this._reachedDate;
	}
	
	public Long getReceivedQuantity()
	{
		return this._receivedQuantity;
	}
	
	public ReturnRequestDTO getReturnRequest()
	{
		return this._returnRequest;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getStatus()
	{
		return this._status;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setAction(final String value)
	{
		this.modifiedPropsSet.add("action");
		this._action = value;
	}
	
	public void setExpectedQuantity(final Long value)
	{
		this.modifiedPropsSet.add("expectedQuantity");
		this._expectedQuantity = value;
	}
	
	public void setNotes(final String value)
	{
		this.modifiedPropsSet.add("notes");
		this._notes = value;
	}
	
	public void setOrderEntry(final AbstractOrderEntryDTO value)
	{
		this.modifiedPropsSet.add("orderEntry");
		this._orderEntry = value;
	}
	
	public void setReachedDate(final Date value)
	{
		this.modifiedPropsSet.add("reachedDate");
		this._reachedDate = value;
	}
	
	public void setReceivedQuantity(final Long value)
	{
		this.modifiedPropsSet.add("receivedQuantity");
		this._receivedQuantity = value;
	}
	
	public void setReturnRequest(final ReturnRequestDTO value)
	{
		this.modifiedPropsSet.add("returnRequest");
		this._returnRequest = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setStatus(final String value)
	{
		this.modifiedPropsSet.add("status");
		this._status = value;
	}
	
}
