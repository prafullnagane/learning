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

import de.hybris.platform.comments.dto.CommentDTO;
import de.hybris.platform.ticket.dto.CsTicketDTO;
import de.hybris.platform.ticket.events.dto.CsTicketChangeEventEntryDTO;
import de.hybris.platform.ticket.events.dto.CsTicketEmailDTO;
import de.hybris.platform.ticket.events.model.CsTicketEventModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CsTicketEvent first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@GraphNode(target = CsTicketEventModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "csticketevent")
public class CsTicketEventDTO extends CommentDTO
{
	/** <i>Generated variable</i> - Variable of <code>CsTicketEvent.endDateTime</code> attribute defined at extension <code> */
	private java.util.Date _endDateTime;
	/** <i>Generated variable</i> - Variable of <code>CsTicketEvent.entries</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.ticket.events.dto.CsTicketChangeEventEntryDTO> _entries;
	/** <i>Generated variable</i> - Variable of <code>CsTicketEvent.startDateTime</code> attribute defined at extension <code> */
	private java.util.Date _startDateTime;
	/** <i>Generated variable</i> - Variable of <code>CsTicketEvent.ticket</code> attribute defined at extension <code> */
	private de.hybris.platform.ticket.dto.CsTicketDTO _ticket;
	/** <i>Generated variable</i> - Variable of <code>CsTicketEvent.emails</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.ticket.events.dto.CsTicketEmailDTO> _emails;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketEventDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "emails")
	@XmlElement(name = "csTicketEmail")
	public List<CsTicketEmailDTO> getEmails()
	{
		return this._emails;
	}
	
	public Date getEndDateTime()
	{
		return this._endDateTime;
	}
	
	@XmlElementWrapper(name = "entries")
	@XmlElement(name = "csTicketChangeEventEntry")
	public Set<CsTicketChangeEventEntryDTO> getEntries()
	{
		return this._entries;
	}
	
	public Date getStartDateTime()
	{
		return this._startDateTime;
	}
	
	public CsTicketDTO getTicket()
	{
		return this._ticket;
	}
	
	public void setEmails(final List<CsTicketEmailDTO> value)
	{
		this.modifiedPropsSet.add("emails");
		this._emails = value;
	}
	
	public void setEndDateTime(final Date value)
	{
		this.modifiedPropsSet.add("endDateTime");
		this._endDateTime = value;
	}
	
	public void setEntries(final Set<CsTicketChangeEventEntryDTO> value)
	{
		this.modifiedPropsSet.add("entries");
		this._entries = value;
	}
	
	public void setStartDateTime(final Date value)
	{
		this.modifiedPropsSet.add("startDateTime");
		this._startDateTime = value;
	}
	
	public void setTicket(final CsTicketDTO value)
	{
		this.modifiedPropsSet.add("ticket");
		this._ticket = value;
	}
	
}
