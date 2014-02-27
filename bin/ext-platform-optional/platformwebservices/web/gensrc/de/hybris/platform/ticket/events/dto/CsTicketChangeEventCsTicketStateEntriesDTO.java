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

import de.hybris.platform.ticket.events.dto.CsTicketChangeEventCsTicketStateEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CsTicketChangeEventCsTicketStateEntry first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@XmlRootElement(name = "csticketchangeeventcsticketstateentries")
public class CsTicketChangeEventCsTicketStateEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CsTicketChangeEventCsTicketStateEntryDTO*/
	private List<CsTicketChangeEventCsTicketStateEntryDTO>  csticketchangeeventcsticketstateentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventCsTicketStateEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventCsTicketStateEntriesDTO(final List<CsTicketChangeEventCsTicketStateEntryDTO> csticketchangeeventcsticketstateentriesList)
	{
		super();
		this.csticketchangeeventcsticketstateentriesList=csticketchangeeventcsticketstateentriesList;
	}
	
	
	/**
	 * @return the csticketchangeeventcsticketstateentries
	 */
	@XmlElement(name = "csticketchangeeventcsticketstateentry")
	public List<CsTicketChangeEventCsTicketStateEntryDTO> getCsTicketChangeEventCsTicketStateEntries()
	{
		return	csticketchangeeventcsticketstateentriesList;
	}
	
	/**
	 * @param csticketchangeeventcsticketstateentriesList 
	 *  the csticketchangeeventcsticketstateentriesList to set   
	 */
	public void setCsTicketChangeEventCsTicketStateEntries(final List<CsTicketChangeEventCsTicketStateEntryDTO> csticketchangeeventcsticketstateentriesList)
	{
		this.csticketchangeeventcsticketstateentriesList=csticketchangeeventcsticketstateentriesList;
	}
	
}
