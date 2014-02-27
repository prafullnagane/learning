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
package de.hybris.platform.core.dto.flexiblesearch;

import de.hybris.platform.core.dto.flexiblesearch.SavedQueryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SavedQuery first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "savedqueries")
public class SavedQueriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SavedQueryDTO*/
	private List<SavedQueryDTO>  savedqueriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SavedQueriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SavedQueriesDTO(final List<SavedQueryDTO> savedqueriesList)
	{
		super();
		this.savedqueriesList=savedqueriesList;
	}
	
	
	/**
	 * @return the savedqueries
	 */
	@XmlElement(name = "savedquery")
	public List<SavedQueryDTO> getSavedQueries()
	{
		return	savedqueriesList;
	}
	
	/**
	 * @param savedqueriesList 
	 *  the savedqueriesList to set   
	 */
	public void setSavedQueries(final List<SavedQueryDTO> savedqueriesList)
	{
		this.savedqueriesList=savedqueriesList;
	}
	
}
