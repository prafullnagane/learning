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
package de.hybris.platform.servicelayer.dto.action;

import de.hybris.platform.servicelayer.dto.action.SimpleActionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SimpleAction first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "simpleactions")
public class SimpleActionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SimpleActionDTO*/
	private List<SimpleActionDTO>  simpleactionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SimpleActionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SimpleActionsDTO(final List<SimpleActionDTO> simpleactionsList)
	{
		super();
		this.simpleactionsList=simpleactionsList;
	}
	
	
	/**
	 * @return the simpleactions
	 */
	@XmlElement(name = "simpleaction")
	public List<SimpleActionDTO> getSimpleActions()
	{
		return	simpleactionsList;
	}
	
	/**
	 * @param simpleactionsList 
	 *  the simpleactionsList to set   
	 */
	public void setSimpleActions(final List<SimpleActionDTO> simpleactionsList)
	{
		this.simpleactionsList=simpleactionsList;
	}
	
}
