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
package de.hybris.platform.servicelayer.internal.dto;

import de.hybris.platform.servicelayer.internal.dto.IndexTestItemDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type IndexTestItem first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "indextestitems")
public class IndexTestItemsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>IndexTestItemDTO*/
	private List<IndexTestItemDTO>  indextestitemsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public IndexTestItemsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public IndexTestItemsDTO(final List<IndexTestItemDTO> indextestitemsList)
	{
		super();
		this.indextestitemsList=indextestitemsList;
	}
	
	
	/**
	 * @return the indextestitems
	 */
	@XmlElement(name = "indextestitem")
	public List<IndexTestItemDTO> getIndexTestItems()
	{
		return	indextestitemsList;
	}
	
	/**
	 * @param indextestitemsList 
	 *  the indextestitemsList to set   
	 */
	public void setIndexTestItems(final List<IndexTestItemDTO> indextestitemsList)
	{
		this.indextestitemsList=indextestitemsList;
	}
	
}
