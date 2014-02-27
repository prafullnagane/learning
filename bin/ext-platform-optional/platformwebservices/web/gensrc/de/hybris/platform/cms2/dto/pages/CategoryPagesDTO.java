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
package de.hybris.platform.cms2.dto.pages;

import de.hybris.platform.cms2.dto.pages.CategoryPageDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CategoryPage first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "categorypages")
public class CategoryPagesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CategoryPageDTO*/
	private List<CategoryPageDTO>  categorypagesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CategoryPagesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CategoryPagesDTO(final List<CategoryPageDTO> categorypagesList)
	{
		super();
		this.categorypagesList=categorypagesList;
	}
	
	
	/**
	 * @return the categorypages
	 */
	@XmlElement(name = "categorypage")
	public List<CategoryPageDTO> getCategoryPages()
	{
		return	categorypagesList;
	}
	
	/**
	 * @param categorypagesList 
	 *  the categorypagesList to set   
	 */
	public void setCategoryPages(final List<CategoryPageDTO> categorypagesList)
	{
		this.categorypagesList=categorypagesList;
	}
	
}
