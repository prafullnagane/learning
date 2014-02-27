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

import de.hybris.platform.ticket.events.dto.CsCustomerEventDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CsCustomerEvent first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cscustomerevents")
public class CsCustomerEventsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CsCustomerEventDTO*/
	private List<CsCustomerEventDTO>  cscustomereventsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsCustomerEventsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsCustomerEventsDTO(final List<CsCustomerEventDTO> cscustomereventsList)
	{
		super();
		this.cscustomereventsList=cscustomereventsList;
	}
	
	
	/**
	 * @return the cscustomerevents
	 */
	@XmlElement(name = "cscustomerevent")
	public List<CsCustomerEventDTO> getCsCustomerEvents()
	{
		return	cscustomereventsList;
	}
	
	/**
	 * @param cscustomereventsList 
	 *  the cscustomereventsList to set   
	 */
	public void setCsCustomerEvents(final List<CsCustomerEventDTO> cscustomereventsList)
	{
		this.cscustomereventsList=cscustomereventsList;
	}
	
}
