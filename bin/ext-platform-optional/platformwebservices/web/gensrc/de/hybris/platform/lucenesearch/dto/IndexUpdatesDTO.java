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
package de.hybris.platform.lucenesearch.dto;

import de.hybris.platform.lucenesearch.dto.IndexUpdateDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type IndexUpdate first defined at extension lucenesearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "indexupdates")
public class IndexUpdatesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>IndexUpdateDTO*/
	private List<IndexUpdateDTO>  indexupdatesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public IndexUpdatesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public IndexUpdatesDTO(final List<IndexUpdateDTO> indexupdatesList)
	{
		super();
		this.indexupdatesList=indexupdatesList;
	}
	
	
	/**
	 * @return the indexupdates
	 */
	@XmlElement(name = "indexupdate")
	public List<IndexUpdateDTO> getIndexUpdates()
	{
		return	indexupdatesList;
	}
	
	/**
	 * @param indexupdatesList 
	 *  the indexupdatesList to set   
	 */
	public void setIndexUpdates(final List<IndexUpdateDTO> indexupdatesList)
	{
		this.indexupdatesList=indexupdatesList;
	}
	
}
