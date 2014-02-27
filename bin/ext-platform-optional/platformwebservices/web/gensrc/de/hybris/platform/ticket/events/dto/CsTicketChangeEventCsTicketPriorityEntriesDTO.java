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

import de.hybris.platform.ticket.events.dto.CsTicketChangeEventCsTicketPriorityEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CsTicketChangeEventCsTicketPriorityEntry first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@XmlRootElement(name = "csticketchangeeventcsticketpriorityentries")
public class CsTicketChangeEventCsTicketPriorityEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CsTicketChangeEventCsTicketPriorityEntryDTO*/
	private List<CsTicketChangeEventCsTicketPriorityEntryDTO>  csticketchangeeventcsticketpriorityentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventCsTicketPriorityEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventCsTicketPriorityEntriesDTO(final List<CsTicketChangeEventCsTicketPriorityEntryDTO> csticketchangeeventcsticketpriorityentriesList)
	{
		super();
		this.csticketchangeeventcsticketpriorityentriesList=csticketchangeeventcsticketpriorityentriesList;
	}
	
	
	/**
	 * @return the csticketchangeeventcsticketpriorityentries
	 */
	@XmlElement(name = "csticketchangeeventcsticketpriorityentry")
	public List<CsTicketChangeEventCsTicketPriorityEntryDTO> getCsTicketChangeEventCsTicketPriorityEntries()
	{
		return	csticketchangeeventcsticketpriorityentriesList;
	}
	
	/**
	 * @param csticketchangeeventcsticketpriorityentriesList 
	 *  the csticketchangeeventcsticketpriorityentriesList to set   
	 */
	public void setCsTicketChangeEventCsTicketPriorityEntries(final List<CsTicketChangeEventCsTicketPriorityEntryDTO> csticketchangeeventcsticketpriorityentriesList)
	{
		this.csticketchangeeventcsticketpriorityentriesList=csticketchangeeventcsticketpriorityentriesList;
	}
	
}
