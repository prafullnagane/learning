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

import de.hybris.platform.storelocator.dto.SpecialOpeningDayDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SpecialOpeningDay first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "specialopeningdaies")
public class SpecialOpeningDaiesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SpecialOpeningDayDTO*/
	private List<SpecialOpeningDayDTO>  specialopeningdaiesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SpecialOpeningDaiesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SpecialOpeningDaiesDTO(final List<SpecialOpeningDayDTO> specialopeningdaiesList)
	{
		super();
		this.specialopeningdaiesList=specialopeningdaiesList;
	}
	
	
	/**
	 * @return the specialopeningdaies
	 */
	@XmlElement(name = "specialopeningday")
	public List<SpecialOpeningDayDTO> getSpecialOpeningDaies()
	{
		return	specialopeningdaiesList;
	}
	
	/**
	 * @param specialopeningdaiesList 
	 *  the specialopeningdaiesList to set   
	 */
	public void setSpecialOpeningDaies(final List<SpecialOpeningDayDTO> specialopeningdaiesList)
	{
		this.specialopeningdaiesList=specialopeningdaiesList;
	}
	
}
