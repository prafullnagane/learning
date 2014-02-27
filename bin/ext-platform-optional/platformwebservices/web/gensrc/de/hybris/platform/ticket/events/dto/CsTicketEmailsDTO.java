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

import de.hybris.platform.ticket.events.dto.CsTicketEmailDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CsTicketEmail first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@XmlRootElement(name = "csticketemails")
public class CsTicketEmailsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CsTicketEmailDTO*/
	private List<CsTicketEmailDTO>  csticketemailsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketEmailsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketEmailsDTO(final List<CsTicketEmailDTO> csticketemailsList)
	{
		super();
		this.csticketemailsList=csticketemailsList;
	}
	
	
	/**
	 * @return the csticketemails
	 */
	@XmlElement(name = "csticketemail")
	public List<CsTicketEmailDTO> getCsTicketEmails()
	{
		return	csticketemailsList;
	}
	
	/**
	 * @param csticketemailsList 
	 *  the csticketemailsList to set   
	 */
	public void setCsTicketEmails(final List<CsTicketEmailDTO> csticketemailsList)
	{
		this.csticketemailsList=csticketemailsList;
	}
	
}
