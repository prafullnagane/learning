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
import de.hybris.platform.ticket.events.dto.CsTicketEventDTO;
import de.hybris.platform.ticket.events.model.CsTicketEmailModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CsTicketEmail first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@GraphNode(target = CsTicketEmailModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "csticketemail")
public class CsTicketEmailDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CsTicketEmail.messageId</code> attribute defined at extension <code> */
	private java.lang.String _messageId;
	/** <i>Generated variable</i> - Variable of <code>CsTicketEmail.from</code> attribute defined at extension <code> */
	private java.lang.String _from;
	/** <i>Generated variable</i> - Variable of <code>CsTicketEmail.ticket</code> attribute defined at extension <code> */
	private de.hybris.platform.ticket.events.dto.CsTicketEventDTO _ticket;
	/** <i>Generated variable</i> - Variable of <code>CsTicketEmail.body</code> attribute defined at extension <code> */
	private java.lang.String _body;
	/** <i>Generated variable</i> - Variable of <code>CsTicketEmail.subject</code> attribute defined at extension <code> */
	private java.lang.String _subject;
	/** <i>Generated variable</i> - Variable of <code>CsTicketEmail.to</code> attribute defined at extension <code> */
	private java.lang.String _to;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketEmailDTO()
	{
		super();
	}
	
	
	public String getBody()
	{
		return this._body;
	}
	
	public String getFrom()
	{
		return this._from;
	}
	
	public String getMessageId()
	{
		return this._messageId;
	}
	
	public String getSubject()
	{
		return this._subject;
	}
	
	public CsTicketEventDTO getTicket()
	{
		return this._ticket;
	}
	
	public String getTo()
	{
		return this._to;
	}
	
	public void setBody(final String value)
	{
		this.modifiedPropsSet.add("body");
		this._body = value;
	}
	
	public void setFrom(final String value)
	{
		this.modifiedPropsSet.add("from");
		this._from = value;
	}
	
	public void setMessageId(final String value)
	{
		this.modifiedPropsSet.add("messageId");
		this._messageId = value;
	}
	
	public void setSubject(final String value)
	{
		this.modifiedPropsSet.add("subject");
		this._subject = value;
	}
	
	public void setTicket(final CsTicketEventDTO value)
	{
		this.modifiedPropsSet.add("ticket");
		this._ticket = value;
	}
	
	public void setTo(final String value)
	{
		this.modifiedPropsSet.add("to");
		this._to = value;
	}
	
}
