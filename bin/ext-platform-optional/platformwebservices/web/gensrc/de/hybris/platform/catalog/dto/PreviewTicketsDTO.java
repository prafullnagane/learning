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
package de.hybris.platform.catalog.dto;

import de.hybris.platform.catalog.dto.PreviewTicketDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PreviewTicket first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "previewtickets")
public class PreviewTicketsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PreviewTicketDTO*/
	private List<PreviewTicketDTO>  previewticketsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PreviewTicketsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PreviewTicketsDTO(final List<PreviewTicketDTO> previewticketsList)
	{
		super();
		this.previewticketsList=previewticketsList;
	}
	
	
	/**
	 * @return the previewtickets
	 */
	@XmlElement(name = "previewticket")
	public List<PreviewTicketDTO> getPreviewTickets()
	{
		return	previewticketsList;
	}
	
	/**
	 * @param previewticketsList 
	 *  the previewticketsList to set   
	 */
	public void setPreviewTickets(final List<PreviewTicketDTO> previewticketsList)
	{
		this.previewticketsList=previewticketsList;
	}
	
}
