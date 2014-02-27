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
package de.hybris.platform.storelocator.dto;

import de.hybris.platform.storelocator.dto.OpeningDayDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OpeningDay first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "openingdaies")
public class OpeningDaiesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OpeningDayDTO*/
	private List<OpeningDayDTO>  openingdaiesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OpeningDaiesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OpeningDaiesDTO(final List<OpeningDayDTO> openingdaiesList)
	{
		super();
		this.openingdaiesList=openingdaiesList;
	}
	
	
	/**
	 * @return the openingdaies
	 */
	@XmlElement(name = "openingday")
	public List<OpeningDayDTO> getOpeningDaies()
	{
		return	openingdaiesList;
	}
	
	/**
	 * @param openingdaiesList 
	 *  the openingdaiesList to set   
	 */
	public void setOpeningDaies(final List<OpeningDayDTO> openingdaiesList)
	{
		this.openingdaiesList=openingdaiesList;
	}
	
}
