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
package de.hybris.platform.acceleratorcms.dto.components;

import de.hybris.platform.acceleratorcms.dto.components.SubCategoryListComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SubCategoryListComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@XmlRootElement(name = "subcategorylistcomponents")
public class SubCategoryListComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SubCategoryListComponentDTO*/
	private List<SubCategoryListComponentDTO>  subcategorylistcomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SubCategoryListComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SubCategoryListComponentsDTO(final List<SubCategoryListComponentDTO> subcategorylistcomponentsList)
	{
		super();
		this.subcategorylistcomponentsList=subcategorylistcomponentsList;
	}
	
	
	/**
	 * @return the subcategorylistcomponents
	 */
	@XmlElement(name = "subcategorylistcomponent")
	public List<SubCategoryListComponentDTO> getSubCategoryListComponents()
	{
		return	subcategorylistcomponentsList;
	}
	
	/**
	 * @param subcategorylistcomponentsList 
	 *  the subcategorylistcomponentsList to set   
	 */
	public void setSubCategoryListComponents(final List<SubCategoryListComponentDTO> subcategorylistcomponentsList)
	{
		this.subcategorylistcomponentsList=subcategorylistcomponentsList;
	}
	
}
