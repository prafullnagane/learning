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
package de.hybris.platform.core.dto;

import de.hybris.platform.core.dto.GenericTestItemDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type GenericTestItem first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "generictestitems")
public class GenericTestItemsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>GenericTestItemDTO*/
	private List<GenericTestItemDTO>  generictestitemsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public GenericTestItemsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public GenericTestItemsDTO(final List<GenericTestItemDTO> generictestitemsList)
	{
		super();
		this.generictestitemsList=generictestitemsList;
	}
	
	
	/**
	 * @return the generictestitems
	 */
	@XmlElement(name = "generictestitem")
	public List<GenericTestItemDTO> getGenericTestItems()
	{
		return	generictestitemsList;
	}
	
	/**
	 * @param generictestitemsList 
	 *  the generictestitemsList to set   
	 */
	public void setGenericTestItems(final List<GenericTestItemDTO> generictestitemsList)
	{
		this.generictestitemsList=generictestitemsList;
	}
	
}
