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

import de.hybris.platform.ticket.events.dto.CsTicketChangeEventEmployeeEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CsTicketChangeEventEmployeeEntry first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@XmlRootElement(name = "csticketchangeeventemployeeentries")
public class CsTicketChangeEventEmployeeEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CsTicketChangeEventEmployeeEntryDTO*/
	private List<CsTicketChangeEventEmployeeEntryDTO>  csticketchangeeventemployeeentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventEmployeeEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventEmployeeEntriesDTO(final List<CsTicketChangeEventEmployeeEntryDTO> csticketchangeeventemployeeentriesList)
	{
		super();
		this.csticketchangeeventemployeeentriesList=csticketchangeeventemployeeentriesList;
	}
	
	
	/**
	 * @return the csticketchangeeventemployeeentries
	 */
	@XmlElement(name = "csticketchangeeventemployeeentry")
	public List<CsTicketChangeEventEmployeeEntryDTO> getCsTicketChangeEventEmployeeEntries()
	{
		return	csticketchangeeventemployeeentriesList;
	}
	
	/**
	 * @param csticketchangeeventemployeeentriesList 
	 *  the csticketchangeeventemployeeentriesList to set   
	 */
	public void setCsTicketChangeEventEmployeeEntries(final List<CsTicketChangeEventEmployeeEntryDTO> csticketchangeeventemployeeentriesList)
	{
		this.csticketchangeeventemployeeentriesList=csticketchangeeventemployeeentriesList;
	}
	
}
