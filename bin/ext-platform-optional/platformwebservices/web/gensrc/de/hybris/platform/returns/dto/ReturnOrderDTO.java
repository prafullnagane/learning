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

import de.hybris.platform.core.dto.order.OrderDTO;
import de.hybris.platform.returns.model.ReturnOrderModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ReturnOrder first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = ReturnOrderModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "returnorder")
public class ReturnOrderDTO extends OrderDTO
{
	/** <i>Generated variable</i> - Variable of <code>ReturnOrder.notes</code> attribute defined at extension <code> */
	private java.lang.String _notes;
	/** <i>Generated variable</i> - Variable of <code>ReturnOrder.fulfilmentStatus</code> attribute defined at extension <code> */
	private java.lang.String _fulfilmentStatus;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReturnOrderDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getFulfilmentStatus()
	{
		return this._fulfilmentStatus;
	}
	
	public String getNotes()
	{
		return this._notes;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setFulfilmentStatus(final String value)
	{
		this.modifiedPropsSet.add("fulfilmentStatus");
		this._fulfilmentStatus = value;
	}
	
	public void setNotes(final String value)
	{
		this.modifiedPropsSet.add("notes");
		this._notes = value;
	}
	
}
