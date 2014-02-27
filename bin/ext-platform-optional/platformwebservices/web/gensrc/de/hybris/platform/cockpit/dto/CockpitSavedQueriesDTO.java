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
package de.hybris.platform.cockpit.dto;

import de.hybris.platform.cockpit.dto.CockpitSavedQueryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CockpitSavedQuery first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cockpitsavedqueries")
public class CockpitSavedQueriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CockpitSavedQueryDTO*/
	private List<CockpitSavedQueryDTO>  cockpitsavedqueriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitSavedQueriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitSavedQueriesDTO(final List<CockpitSavedQueryDTO> cockpitsavedqueriesList)
	{
		super();
		this.cockpitsavedqueriesList=cockpitsavedqueriesList;
	}
	
	
	/**
	 * @return the cockpitsavedqueries
	 */
	@XmlElement(name = "cockpitsavedquery")
	public List<CockpitSavedQueryDTO> getCockpitSavedQueries()
	{
		return	cockpitsavedqueriesList;
	}
	
	/**
	 * @param cockpitsavedqueriesList 
	 *  the cockpitsavedqueriesList to set   
	 */
	public void setCockpitSavedQueries(final List<CockpitSavedQueryDTO> cockpitsavedqueriesList)
	{
		this.cockpitsavedqueriesList=cockpitsavedqueriesList;
	}
	
}
