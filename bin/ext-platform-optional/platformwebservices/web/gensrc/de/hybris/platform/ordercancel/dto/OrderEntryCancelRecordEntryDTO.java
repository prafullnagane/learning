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

import de.hybris.platform.ordercancel.model.OrderEntryCancelRecordEntryModel;
import de.hybris.platform.ordermodify.dto.OrderEntryModificationRecordEntryDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OrderEntryCancelRecordEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = OrderEntryCancelRecordEntryModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "orderentrycancelrecordentry")
public class OrderEntryCancelRecordEntryDTO extends OrderEntryModificationRecordEntryDTO
{
	/** <i>Generated variable</i> - Variable of <code>OrderEntryCancelRecordEntry.cancelledQuantity</code> attribute defined at extension <code> */
	private java.lang.Integer _cancelledQuantity;
	/** <i>Generated variable</i> - Variable of <code>OrderEntryCancelRecordEntry.cancelReason</code> attribute defined at extension <code> */
	private java.lang.String _cancelReason;
	/** <i>Generated variable</i> - Variable of <code>OrderEntryCancelRecordEntry.cancelRequestQuantity</code> attribute defined at extension <code> */
	private java.lang.Integer _cancelRequestQuantity;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderEntryCancelRecordEntryDTO()
	{
		super();
	}
	
	
	public Integer getCancelledQuantity()
	{
		return this._cancelledQuantity;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getCancelReason()
	{
		return this._cancelReason;
	}
	
	public Integer getCancelRequestQuantity()
	{
		return this._cancelRequestQuantity;
	}
	
	public void setCancelledQuantity(final Integer value)
	{
		this.modifiedPropsSet.add("cancelledQuantity");
		this._cancelledQuantity = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setCancelReason(final String value)
	{
		this.modifiedPropsSet.add("cancelReason");
		this._cancelReason = value;
	}
	
	public void setCancelRequestQuantity(final Integer value)
	{
		this.modifiedPropsSet.add("cancelRequestQuantity");
		this._cancelRequestQuantity = value;
	}
	
}
