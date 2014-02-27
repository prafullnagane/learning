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
package de.hybris.platform.ordersplitting.dto;

import de.hybris.platform.ordersplitting.dto.ConsignmentEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ConsignmentEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "consignmententries")
public class ConsignmentEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ConsignmentEntryDTO*/
	private List<ConsignmentEntryDTO>  consignmententriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConsignmentEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConsignmentEntriesDTO(final List<ConsignmentEntryDTO> consignmententriesList)
	{
		super();
		this.consignmententriesList=consignmententriesList;
	}
	
	
	/**
	 * @return the consignmententries
	 */
	@XmlElement(name = "consignmententry")
	public List<ConsignmentEntryDTO> getConsignmentEntries()
	{
		return	consignmententriesList;
	}
	
	/**
	 * @param consignmententriesList 
	 *  the consignmententriesList to set   
	 */
	public void setConsignmentEntries(final List<ConsignmentEntryDTO> consignmententriesList)
	{
		this.consignmententriesList=consignmententriesList;
	}
	
}
