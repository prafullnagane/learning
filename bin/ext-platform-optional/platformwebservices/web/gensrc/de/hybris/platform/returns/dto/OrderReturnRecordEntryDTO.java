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

import de.hybris.platform.ordermodify.dto.OrderModificationRecordEntryDTO;
import de.hybris.platform.returns.model.OrderReturnRecordEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OrderReturnRecordEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = OrderReturnRecordEntryModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "orderreturnrecordentry")
public class OrderReturnRecordEntryDTO extends OrderModificationRecordEntryDTO
{
	/** <i>Generated variable</i> - Variable of <code>OrderReturnRecordEntry.expectedQuantity</code> attribute defined at extension <code> */
	private java.lang.Long _expectedQuantity;
	/** <i>Generated variable</i> - Variable of <code>OrderReturnRecordEntry.returnStatus</code> attribute defined at extension <code> */
	private java.lang.String _returnStatus;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderReturnRecordEntryDTO()
	{
		super();
	}
	
	
	public Long getExpectedQuantity()
	{
		return this._expectedQuantity;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getReturnStatus()
	{
		return this._returnStatus;
	}
	
	public void setExpectedQuantity(final Long value)
	{
		this.modifiedPropsSet.add("expectedQuantity");
		this._expectedQuantity = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setReturnStatus(final String value)
	{
		this.modifiedPropsSet.add("returnStatus");
		this._returnStatus = value;
	}
	
}
