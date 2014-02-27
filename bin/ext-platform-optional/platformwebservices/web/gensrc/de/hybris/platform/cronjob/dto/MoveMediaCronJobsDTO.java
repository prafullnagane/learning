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
package de.hybris.platform.cronjob.dto;

import de.hybris.platform.cronjob.dto.MoveMediaCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type MoveMediaCronJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "movemediacronjobs")
public class MoveMediaCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>MoveMediaCronJobDTO*/
	private List<MoveMediaCronJobDTO>  movemediacronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MoveMediaCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MoveMediaCronJobsDTO(final List<MoveMediaCronJobDTO> movemediacronjobsList)
	{
		super();
		this.movemediacronjobsList=movemediacronjobsList;
	}
	
	
	/**
	 * @return the movemediacronjobs
	 */
	@XmlElement(name = "movemediacronjob")
	public List<MoveMediaCronJobDTO> getMoveMediaCronJobs()
	{
		return	movemediacronjobsList;
	}
	
	/**
	 * @param movemediacronjobsList 
	 *  the movemediacronjobsList to set   
	 */
	public void setMoveMediaCronJobs(final List<MoveMediaCronJobDTO> movemediacronjobsList)
	{
		this.movemediacronjobsList=movemediacronjobsList;
	}
	
}
