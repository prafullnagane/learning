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
package de.hybris.platform.ticket.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.order.AbstractOrderDTO;
import de.hybris.platform.core.dto.user.EmployeeDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.ticket.dto.CsAgentGroupDTO;
import de.hybris.platform.ticket.events.dto.CsTicketEventDTO;
import de.hybris.platform.ticket.events.dto.CsTicketResolutionEventDTO;
import de.hybris.platform.ticket.model.CsTicketModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CsTicket first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@GraphNode(target = CsTicketModel.class, factory = GenericNodeFactory.class, uidProperties="ticketID")
@XmlRootElement(name = "csticket")
public class CsTicketDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CsTicket.assignedGroup</code> attribute defined at extension <code> */
	private de.hybris.platform.ticket.dto.CsAgentGroupDTO _assignedGroup;
	/** <i>Generated variable</i> - Variable of <code>CsTicket.assignedAgent</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.EmployeeDTO _assignedAgent;
	/** <i>Generated variable</i> - Variable of <code>CsTicket.ticketID</code> attribute defined at extension <code> */
	private java.lang.String _ticketID;
	/** <i>Generated variable</i> - Variable of <code>CsTicket.events</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.ticket.events.dto.CsTicketEventDTO> _events;
	/** <i>Generated variable</i> - Variable of <code>CsTicket.customer</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _customer;
	/** <i>Generated variable</i> - Variable of <code>CsTicket.category</code> attribute defined at extension <code> */
	private java.lang.String _category;
	/** <i>Generated variable</i> - Variable of <code>CsTicket.resolution</code> attribute defined at extension <code> */
	private de.hybris.platform.ticket.events.dto.CsTicketResolutionEventDTO _resolution;
	/** <i>Generated variable</i> - Variable of <code>CsTicket.headline</code> attribute defined at extension <code> */
	private java.lang.String _headline;
	/** <i>Generated variable</i> - Variable of <code>CsTicket.priority</code> attribute defined at extension <code> */
	private java.lang.String _priority;
	/** <i>Generated variable</i> - Variable of <code>CsTicket.state</code> attribute defined at extension <code> */
	private java.lang.String _state;
	/** <i>Generated variable</i> - Variable of <code>CsTicket.order</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.AbstractOrderDTO _order;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketDTO()
	{
		super();
	}
	
	
	public EmployeeDTO getAssignedAgent()
	{
		return this._assignedAgent;
	}
	
	public CsAgentGroupDTO getAssignedGroup()
	{
		return this._assignedGroup;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getCategory()
	{
		return this._category;
	}
	
	public UserDTO getCustomer()
	{
		return this._customer;
	}
	
	@XmlElementWrapper(name = "events")
	@XmlElement(name = "csTicketEvent")
	public List<CsTicketEventDTO> getEvents()
	{
		return this._events;
	}
	
	public String getHeadline()
	{
		return this._headline;
	}
	
	public AbstractOrderDTO getOrder()
	{
		return this._order;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getPriority()
	{
		return this._priority;
	}
	
	public CsTicketResolutionEventDTO getResolution()
	{
		return this._resolution;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getState()
	{
		return this._state;
	}
	
	@XmlAttribute
	public String getTicketID()
	{
		return this._ticketID;
	}
	
	public void setAssignedAgent(final EmployeeDTO value)
	{
		this.modifiedPropsSet.add("assignedAgent");
		this._assignedAgent = value;
	}
	
	public void setAssignedGroup(final CsAgentGroupDTO value)
	{
		this.modifiedPropsSet.add("assignedGroup");
		this._assignedGroup = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setCategory(final String value)
	{
		this.modifiedPropsSet.add("category");
		this._category = value;
	}
	
	public void setCustomer(final UserDTO value)
	{
		this.modifiedPropsSet.add("customer");
		this._customer = value;
	}
	
	public void setEvents(final List<CsTicketEventDTO> value)
	{
		this.modifiedPropsSet.add("events");
		this._events = value;
	}
	
	public void setHeadline(final String value)
	{
		this.modifiedPropsSet.add("headline");
		this._headline = value;
	}
	
	public void setOrder(final AbstractOrderDTO value)
	{
		this.modifiedPropsSet.add("order");
		this._order = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setPriority(final String value)
	{
		this.modifiedPropsSet.add("priority");
		this._priority = value;
	}
	
	public void setResolution(final CsTicketResolutionEventDTO value)
	{
		this.modifiedPropsSet.add("resolution");
		this._resolution = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setState(final String value)
	{
		this.modifiedPropsSet.add("state");
		this._state = value;
	}
	
	public void setTicketID(final String value)
	{
		this.modifiedPropsSet.add("ticketID");
		this._ticketID = value;
	}
	
}
