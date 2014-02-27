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

import de.hybris.platform.cronjob.dto.GetURLStepDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type GetURLStep first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "geturlsteps")
public class GetURLStepsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>GetURLStepDTO*/
	private List<GetURLStepDTO>  geturlstepsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public GetURLStepsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public GetURLStepsDTO(final List<GetURLStepDTO> geturlstepsList)
	{
		super();
		this.geturlstepsList=geturlstepsList;
	}
	
	
	/**
	 * @return the geturlsteps
	 */
	@XmlElement(name = "geturlstep")
	public List<GetURLStepDTO> getGetURLSteps()
	{
		return	geturlstepsList;
	}
	
	/**
	 * @param geturlstepsList 
	 *  the geturlstepsList to set   
	 */
	public void setGetURLSteps(final List<GetURLStepDTO> geturlstepsList)
	{
		this.geturlstepsList=geturlstepsList;
	}
	
}
