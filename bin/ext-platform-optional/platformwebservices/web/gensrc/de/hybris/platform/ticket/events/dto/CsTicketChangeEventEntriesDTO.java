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
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CsTicketChangeEventEntry first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@XmlRootElement(name = "csticketchangeevententries")
public class CsTicketChangeEventEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CsTicketChangeEventEntryDTO*/
	private List<CsTicketChangeEventEntryDTO>  csticketchangeevententriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventEntriesDTO(final List<CsTicketChangeEventEntryDTO> csticketchangeevententriesList)
	{
		super();
		this.csticketchangeevententriesList=csticketchangeevententriesList;
	}
	
	
	/**
	 * @return the csticketchangeevententries
	 */
	@XmlElement(name = "csticketchangeevententry")
	public List<CsTicketChangeEventEntryDTO> getCsTicketChangeEventEntries()
	{
		return	csticketchangeevententriesList;
	}
	
	/**
	 * @param csticketchangeevententriesList 
	 *  the csticketchangeevententriesList to set   
	 */
	public void setCsTicketChangeEventEntries(final List<CsTicketChangeEventEntryDTO> csticketchangeevententriesList)
	{
		this.csticketchangeevententriesList=csticketchangeevententriesList;
	}
	
}
