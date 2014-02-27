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

import de.hybris.platform.ticket.events.dto.CsTicketChangeEventEntryDTO;
import de.hybris.platform.ticket.events.model.CsTicketChangeEventCsTicketStateEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CsTicketChangeEventCsTicketStateEntry first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@GraphNode(target = CsTicketChangeEventCsTicketStateEntryModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "csticketchangeeventcsticketstateentry")
public class CsTicketChangeEventCsTicketStateEntryDTO extends CsTicketChangeEventEntryDTO
{
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventCsTicketStateEntry.newValue</code> attribute defined at extension <code> */
	private java.lang.String _newValue;
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventCsTicketStateEntry.oldValue</code> attribute defined at extension <code> */
	private java.lang.String _oldValue;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventCsTicketStateEntryDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getNewValue()
	{
		return this._newValue;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getOldValue()
	{
		return this._oldValue;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setNewValue(final String value)
	{
		this.modifiedPropsSet.add("newValue");
		this._newValue = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setOldValue(final String value)
	{
		this.modifiedPropsSet.add("oldValue");
		this._oldValue = value;
	}
	
}
