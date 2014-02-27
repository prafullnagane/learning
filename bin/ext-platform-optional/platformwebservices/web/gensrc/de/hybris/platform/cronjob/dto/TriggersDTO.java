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

import de.hybris.platform.cronjob.dto.TriggerDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Trigger first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "triggers")
public class TriggersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>TriggerDTO*/
	private List<TriggerDTO>  triggersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TriggersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TriggersDTO(final List<TriggerDTO> triggersList)
	{
		super();
		this.triggersList=triggersList;
	}
	
	
	/**
	 * @return the triggers
	 */
	@XmlElement(name = "trigger")
	public List<TriggerDTO> getTriggers()
	{
		return	triggersList;
	}
	
	/**
	 * @param triggersList 
	 *  the triggersList to set   
	 */
	public void setTriggers(final List<TriggerDTO> triggersList)
	{
		this.triggersList=triggersList;
	}
	
}
