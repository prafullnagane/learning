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

import de.hybris.platform.ticket.events.dto.CsCustomerEventDTO;
import de.hybris.platform.ticket.events.model.CsTicketResolutionEventModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CsTicketResolutionEvent first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@GraphNode(target = CsTicketResolutionEventModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "csticketresolutionevent")
public class CsTicketResolutionEventDTO extends CsCustomerEventDTO
{
	/** <i>Generated variable</i> - Variable of <code>CsTicketResolutionEvent.resolutionType</code> attribute defined at extension <code> */
	private java.lang.String _resolutionType;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketResolutionEventDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getResolutionType()
	{
		return this._resolutionType;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setResolutionType(final String value)
	{
		this.modifiedPropsSet.add("resolutionType");
		this._resolutionType = value;
	}
	
}
