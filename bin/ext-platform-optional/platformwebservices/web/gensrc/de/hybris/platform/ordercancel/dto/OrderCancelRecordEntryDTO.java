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
package de.hybris.platform.ordercancel.dto;

import de.hybris.platform.ordercancel.model.OrderCancelRecordEntryModel;
import de.hybris.platform.ordermodify.dto.OrderModificationRecordEntryDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OrderCancelRecordEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = OrderCancelRecordEntryModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "ordercancelrecordentry")
public class OrderCancelRecordEntryDTO extends OrderModificationRecordEntryDTO
{
	/** <i>Generated variable</i> - Variable of <code>OrderCancelRecordEntry.refusedMessage</code> attribute defined at extension <code> */
	private java.lang.String _refusedMessage;
	/** <i>Generated variable</i> - Variable of <code>OrderCancelRecordEntry.cancelResult</code> attribute defined at extension <code> */
	private java.lang.String _cancelResult;
	/** <i>Generated variable</i> - Variable of <code>OrderCancelRecordEntry.cancelReason</code> attribute defined at extension <code> */
	private java.lang.String _cancelReason;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderCancelRecordEntryDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getCancelReason()
	{
		return this._cancelReason;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getCancelResult()
	{
		return this._cancelResult;
	}
	
	public String getRefusedMessage()
	{
		return this._refusedMessage;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setCancelReason(final String value)
	{
		this.modifiedPropsSet.add("cancelReason");
		this._cancelReason = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setCancelResult(final String value)
	{
		this.modifiedPropsSet.add("cancelResult");
		this._cancelResult = value;
	}
	
	public void setRefusedMessage(final String value)
	{
		this.modifiedPropsSet.add("refusedMessage");
		this._refusedMessage = value;
	}
	
}
