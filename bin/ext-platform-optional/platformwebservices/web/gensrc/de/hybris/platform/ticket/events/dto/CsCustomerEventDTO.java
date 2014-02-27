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
package de.hybris.platform.ticket.events.dto;

import de.hybris.platform.ticket.events.dto.CsTicketEventDTO;
import de.hybris.platform.ticket.events.model.CsCustomerEventModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CsCustomerEvent first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@GraphNode(target = CsCustomerEventModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "cscustomerevent")
public class CsCustomerEventDTO extends CsTicketEventDTO
{
	/** <i>Generated variable</i> - Variable of <code>CsCustomerEvent.interventionType</code> attribute defined at extension <code> */
	private java.lang.String _interventionType;
	/** <i>Generated variable</i> - Variable of <code>CsCustomerEvent.reason</code> attribute defined at extension <code> */
	private java.lang.String _reason;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsCustomerEventDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getInterventionType()
	{
		return this._interventionType;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getReason()
	{
		return this._reason;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setInterventionType(final String value)
	{
		this.modifiedPropsSet.add("interventionType");
		this._interventionType = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setReason(final String value)
	{
		this.modifiedPropsSet.add("reason");
		this._reason = value;
	}
	
}
