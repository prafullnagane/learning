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

import de.hybris.platform.ticket.dto.CsTicketDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CsTicket first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cstickets")
public class CsTicketsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CsTicketDTO*/
	private List<CsTicketDTO>  csticketsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketsDTO(final List<CsTicketDTO> csticketsList)
	{
		super();
		this.csticketsList=csticketsList;
	}
	
	
	/**
	 * @return the cstickets
	 */
	@XmlElement(name = "csticket")
	public List<CsTicketDTO> getCsTickets()
	{
		return	csticketsList;
	}
	
	/**
	 * @param csticketsList 
	 *  the csticketsList to set   
	 */
	public void setCsTickets(final List<CsTicketDTO> csticketsList)
	{
		this.csticketsList=csticketsList;
	}
	
}
