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
package de.hybris.platform.category.dto;

import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Category first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "categories")
public class CategoriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CategoryDTO*/
	private List<CategoryDTO>  categoriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CategoriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CategoriesDTO(final List<CategoryDTO> categoriesList)
	{
		super();
		this.categoriesList=categoriesList;
	}
	
	
	/**
	 * @return the categories
	 */
	@XmlElement(name = "category")
	public List<CategoryDTO> getCategories()
	{
		return	categoriesList;
	}
	
	/**
	 * @param categoriesList 
	 *  the categoriesList to set   
	 */
	public void setCategories(final List<CategoryDTO> categoriesList)
	{
		this.categoriesList=categoriesList;
	}
	
}
