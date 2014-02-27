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

import de.hybris.platform.storelocator.dto.WeekdayOpeningDayDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type WeekdayOpeningDay first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "weekdayopeningdaies")
public class WeekdayOpeningDaiesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>WeekdayOpeningDayDTO*/
	private List<WeekdayOpeningDayDTO>  weekdayopeningdaiesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WeekdayOpeningDaiesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WeekdayOpeningDaiesDTO(final List<WeekdayOpeningDayDTO> weekdayopeningdaiesList)
	{
		super();
		this.weekdayopeningdaiesList=weekdayopeningdaiesList;
	}
	
	
	/**
	 * @return the weekdayopeningdaies
	 */
	@XmlElement(name = "weekdayopeningday")
	public List<WeekdayOpeningDayDTO> getWeekdayOpeningDaies()
	{
		return	weekdayopeningdaiesList;
	}
	
	/**
	 * @param weekdayopeningdaiesList 
	 *  the weekdayopeningdaiesList to set   
	 */
	public void setWeekdayOpeningDaies(final List<WeekdayOpeningDayDTO> weekdayopeningdaiesList)
	{
		this.weekdayopeningdaiesList=weekdayopeningdaiesList;
	}
	
}
