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

import de.hybris.platform.storelocator.dto.OpeningScheduleDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OpeningSchedule first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "openingschedules")
public class OpeningSchedulesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OpeningScheduleDTO*/
	private List<OpeningScheduleDTO>  openingschedulesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OpeningSchedulesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OpeningSchedulesDTO(final List<OpeningScheduleDTO> openingschedulesList)
	{
		super();
		this.openingschedulesList=openingschedulesList;
	}
	
	
	/**
	 * @return the openingschedules
	 */
	@XmlElement(name = "openingschedule")
	public List<OpeningScheduleDTO> getOpeningSchedules()
	{
		return	openingschedulesList;
	}
	
	/**
	 * @param openingschedulesList 
	 *  the openingschedulesList to set   
	 */
	public void setOpeningSchedules(final List<OpeningScheduleDTO> openingschedulesList)
	{
		this.openingschedulesList=openingschedulesList;
	}
	
}
