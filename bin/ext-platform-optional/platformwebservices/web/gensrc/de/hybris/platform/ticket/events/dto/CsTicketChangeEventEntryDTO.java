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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.AttributeDescriptorDTO;
import de.hybris.platform.ticket.events.dto.CsTicketEventDTO;
import de.hybris.platform.ticket.events.model.CsTicketChangeEventEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CsTicketChangeEventEntry first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@GraphNode(target = CsTicketChangeEventEntryModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "csticketchangeevententry")
public class CsTicketChangeEventEntryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEntry.newStringValue</code> attribute defined at extension <code> */
	private java.lang.String _newStringValue;
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEntry.event</code> attribute defined at extension <code> */
	private de.hybris.platform.ticket.events.dto.CsTicketEventDTO _event;
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEntry.oldBinaryValue</code> attribute defined at extension <code> */
	private java.lang.Object _oldBinaryValue;
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEntry.alteredAttribute</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.AttributeDescriptorDTO _alteredAttribute;
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEntry.oldStringValue</code> attribute defined at extension <code> */
	private java.lang.String _oldStringValue;
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEntry.newBinaryValue</code> attribute defined at extension <code> */
	private java.lang.Object _newBinaryValue;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventEntryDTO()
	{
		super();
	}
	
	
	public AttributeDescriptorDTO getAlteredAttribute()
	{
		return this._alteredAttribute;
	}
	
	public CsTicketEventDTO getEvent()
	{
		return this._event;
	}
	
	public Object getNewBinaryValue()
	{
		return this._newBinaryValue;
	}
	
	public String getNewStringValue()
	{
		return this._newStringValue;
	}
	
	public Object getOldBinaryValue()
	{
		return this._oldBinaryValue;
	}
	
	public String getOldStringValue()
	{
		return this._oldStringValue;
	}
	
	public void setAlteredAttribute(final AttributeDescriptorDTO value)
	{
		this.modifiedPropsSet.add("alteredAttribute");
		this._alteredAttribute = value;
	}
	
	public void setEvent(final CsTicketEventDTO value)
	{
		this.modifiedPropsSet.add("event");
		this._event = value;
	}
	
	public void setNewBinaryValue(final Object value)
	{
		this.modifiedPropsSet.add("newBinaryValue");
		this._newBinaryValue = value;
	}
	
	public void setNewStringValue(final String value)
	{
		this.modifiedPropsSet.add("newStringValue");
		this._newStringValue = value;
	}
	
	public void setOldBinaryValue(final Object value)
	{
		this.modifiedPropsSet.add("oldBinaryValue");
		this._oldBinaryValue = value;
	}
	
	public void setOldStringValue(final String value)
	{
		this.modifiedPropsSet.add("oldStringValue");
		this._oldStringValue = value;
	}
	
}
