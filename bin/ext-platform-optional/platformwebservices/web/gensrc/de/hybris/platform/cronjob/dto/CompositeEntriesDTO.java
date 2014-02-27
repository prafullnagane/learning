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
package de.hybris.platform.cronjob.dto;

import de.hybris.platform.cronjob.dto.CompositeEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CompositeEntry first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "compositeentries")
public class CompositeEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CompositeEntryDTO*/
	private List<CompositeEntryDTO>  compositeentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompositeEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompositeEntriesDTO(final List<CompositeEntryDTO> compositeentriesList)
	{
		super();
		this.compositeentriesList=compositeentriesList;
	}
	
	
	/**
	 * @return the compositeentries
	 */
	@XmlElement(name = "compositeentry")
	public List<CompositeEntryDTO> getCompositeEntries()
	{
		return	compositeentriesList;
	}
	
	/**
	 * @param compositeentriesList 
	 *  the compositeentriesList to set   
	 */
	public void setCompositeEntries(final List<CompositeEntryDTO> compositeentriesList)
	{
		this.compositeentriesList=compositeentriesList;
	}
	
}
