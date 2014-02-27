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
package de.hybris.platform.core.dto.type;

import de.hybris.platform.core.dto.type.CollectionTypeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CollectionType first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "collectiontypes")
public class CollectionTypesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CollectionTypeDTO*/
	private List<CollectionTypeDTO>  collectiontypesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CollectionTypesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CollectionTypesDTO(final List<CollectionTypeDTO> collectiontypesList)
	{
		super();
		this.collectiontypesList=collectiontypesList;
	}
	
	
	/**
	 * @return the collectiontypes
	 */
	@XmlElement(name = "collectiontype")
	public List<CollectionTypeDTO> getCollectionTypes()
	{
		return	collectiontypesList;
	}
	
	/**
	 * @param collectiontypesList 
	 *  the collectiontypesList to set   
	 */
	public void setCollectionTypes(final List<CollectionTypeDTO> collectiontypesList)
	{
		this.collectiontypesList=collectiontypesList;
	}
	
}
