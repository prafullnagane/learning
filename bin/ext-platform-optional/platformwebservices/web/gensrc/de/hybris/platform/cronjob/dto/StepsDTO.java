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

import de.hybris.platform.cronjob.dto.StepDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Step first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "steps")
public class StepsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>StepDTO*/
	private List<StepDTO>  stepsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StepsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StepsDTO(final List<StepDTO> stepsList)
	{
		super();
		this.stepsList=stepsList;
	}
	
	
	/**
	 * @return the steps
	 */
	@XmlElement(name = "step")
	public List<StepDTO> getSteps()
	{
		return	stepsList;
	}
	
	/**
	 * @param stepsList 
	 *  the stepsList to set   
	 */
	public void setSteps(final List<StepDTO> stepsList)
	{
		this.stepsList=stepsList;
	}
	
}
