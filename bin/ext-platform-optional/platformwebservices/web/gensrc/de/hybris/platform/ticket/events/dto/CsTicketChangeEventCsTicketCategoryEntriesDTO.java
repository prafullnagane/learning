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

import de.hybris.platform.ticket.events.dto.CsTicketChangeEventCsTicketCategoryEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CsTicketChangeEventCsTicketCategoryEntry first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@XmlRootElement(name = "csticketchangeeventcsticketcategoryentries")
public class CsTicketChangeEventCsTicketCategoryEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CsTicketChangeEventCsTicketCategoryEntryDTO*/
	private List<CsTicketChangeEventCsTicketCategoryEntryDTO>  csticketchangeeventcsticketcategoryentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventCsTicketCategoryEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventCsTicketCategoryEntriesDTO(final List<CsTicketChangeEventCsTicketCategoryEntryDTO> csticketchangeeventcsticketcategoryentriesList)
	{
		super();
		this.csticketchangeeventcsticketcategoryentriesList=csticketchangeeventcsticketcategoryentriesList;
	}
	
	
	/**
	 * @return the csticketchangeeventcsticketcategoryentries
	 */
	@XmlElement(name = "csticketchangeeventcsticketcategoryentry")
	public List<CsTicketChangeEventCsTicketCategoryEntryDTO> getCsTicketChangeEventCsTicketCategoryEntries()
	{
		return	csticketchangeeventcsticketcategoryentriesList;
	}
	
	/**
	 * @param csticketchangeeventcsticketcategoryentriesList 
	 *  the csticketchangeeventcsticketcategoryentriesList to set   
	 */
	public void setCsTicketChangeEventCsTicketCategoryEntries(final List<CsTicketChangeEventCsTicketCategoryEntryDTO> csticketchangeeventcsticketcategoryentriesList)
	{
		this.csticketchangeeventcsticketcategoryentriesList=csticketchangeeventcsticketcategoryentriesList;
	}
	
}
