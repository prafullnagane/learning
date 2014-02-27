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

import de.hybris.platform.cockpit.dto.CockpitFavoriteCategoryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CockpitFavoriteCategory first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cockpitfavoritecategories")
public class CockpitFavoriteCategoriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CockpitFavoriteCategoryDTO*/
	private List<CockpitFavoriteCategoryDTO>  cockpitfavoritecategoriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitFavoriteCategoriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitFavoriteCategoriesDTO(final List<CockpitFavoriteCategoryDTO> cockpitfavoritecategoriesList)
	{
		super();
		this.cockpitfavoritecategoriesList=cockpitfavoritecategoriesList;
	}
	
	
	/**
	 * @return the cockpitfavoritecategories
	 */
	@XmlElement(name = "cockpitfavoritecategory")
	public List<CockpitFavoriteCategoryDTO> getCockpitFavoriteCategories()
	{
		return	cockpitfavoritecategoriesList;
	}
	
	/**
	 * @param cockpitfavoritecategoriesList 
	 *  the cockpitfavoritecategoriesList to set   
	 */
	public void setCockpitFavoriteCategories(final List<CockpitFavoriteCategoryDTO> cockpitfavoritecategoriesList)
	{
		this.cockpitfavoritecategoriesList=cockpitfavoritecategoriesList;
	}
	
}
