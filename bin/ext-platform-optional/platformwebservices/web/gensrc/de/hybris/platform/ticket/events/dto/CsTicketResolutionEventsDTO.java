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

import de.hybris.platform.ticket.events.dto.CsTicketResolutionEventDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CsTicketResolutionEvent first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@XmlRootElement(name = "csticketresolutionevents")
public class CsTicketResolutionEventsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CsTicketResolutionEventDTO*/
	private List<CsTicketResolutionEventDTO>  csticketresolutioneventsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketResolutionEventsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketResolutionEventsDTO(final List<CsTicketResolutionEventDTO> csticketresolutioneventsList)
	{
		super();
		this.csticketresolutioneventsList=csticketresolutioneventsList;
	}
	
	
	/**
	 * @return the csticketresolutionevents
	 */
	@XmlElement(name = "csticketresolutionevent")
	public List<CsTicketResolutionEventDTO> getCsTicketResolutionEvents()
	{
		return	csticketresolutioneventsList;
	}
	
	/**
	 * @param csticketresolutioneventsList 
	 *  the csticketresolutioneventsList to set   
	 */
	public void setCsTicketResolutionEvents(final List<CsTicketResolutionEventDTO> csticketresolutioneventsList)
	{
		this.csticketresolutioneventsList=csticketresolutioneventsList;
	}
	
}
