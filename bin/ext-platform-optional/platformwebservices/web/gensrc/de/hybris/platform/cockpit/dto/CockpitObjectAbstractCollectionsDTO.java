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

import de.hybris.platform.cockpit.dto.CockpitObjectAbstractCollectionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CockpitObjectAbstractCollection first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cockpitobjectabstractcollections")
public class CockpitObjectAbstractCollectionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CockpitObjectAbstractCollectionDTO*/
	private List<CockpitObjectAbstractCollectionDTO>  cockpitobjectabstractcollectionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitObjectAbstractCollectionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitObjectAbstractCollectionsDTO(final List<CockpitObjectAbstractCollectionDTO> cockpitobjectabstractcollectionsList)
	{
		super();
		this.cockpitobjectabstractcollectionsList=cockpitobjectabstractcollectionsList;
	}
	
	
	/**
	 * @return the cockpitobjectabstractcollections
	 */
	@XmlElement(name = "cockpitobjectabstractcollection")
	public List<CockpitObjectAbstractCollectionDTO> getCockpitObjectAbstractCollections()
	{
		return	cockpitobjectabstractcollectionsList;
	}
	
	/**
	 * @param cockpitobjectabstractcollectionsList 
	 *  the cockpitobjectabstractcollectionsList to set   
	 */
	public void setCockpitObjectAbstractCollections(final List<CockpitObjectAbstractCollectionDTO> cockpitobjectabstractcollectionsList)
	{
		this.cockpitobjectabstractcollectionsList=cockpitobjectabstractcollectionsList;
	}
	
}
