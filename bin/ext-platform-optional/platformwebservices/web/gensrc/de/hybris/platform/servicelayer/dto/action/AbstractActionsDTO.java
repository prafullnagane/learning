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

import de.hybris.platform.servicelayer.dto.action.AbstractActionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AbstractAction first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "abstractactions")
public class AbstractActionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AbstractActionDTO*/
	private List<AbstractActionDTO>  abstractactionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractActionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractActionsDTO(final List<AbstractActionDTO> abstractactionsList)
	{
		super();
		this.abstractactionsList=abstractactionsList;
	}
	
	
	/**
	 * @return the abstractactions
	 */
	@XmlElement(name = "abstractaction")
	public List<AbstractActionDTO> getAbstractActions()
	{
		return	abstractactionsList;
	}
	
	/**
	 * @param abstractactionsList 
	 *  the abstractactionsList to set   
	 */
	public void setAbstractActions(final List<AbstractActionDTO> abstractactionsList)
	{
		this.abstractactionsList=abstractactionsList;
	}
	
}
