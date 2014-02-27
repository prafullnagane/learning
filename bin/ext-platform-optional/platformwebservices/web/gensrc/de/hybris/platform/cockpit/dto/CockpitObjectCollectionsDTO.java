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

import de.hybris.platform.cockpit.dto.CockpitObjectCollectionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CockpitObjectCollection first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cockpitobjectcollections")
public class CockpitObjectCollectionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CockpitObjectCollectionDTO*/
	private List<CockpitObjectCollectionDTO>  cockpitobjectcollectionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitObjectCollectionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitObjectCollectionsDTO(final List<CockpitObjectCollectionDTO> cockpitobjectcollectionsList)
	{
		super();
		this.cockpitobjectcollectionsList=cockpitobjectcollectionsList;
	}
	
	
	/**
	 * @return the cockpitobjectcollections
	 */
	@XmlElement(name = "cockpitobjectcollection")
	public List<CockpitObjectCollectionDTO> getCockpitObjectCollections()
	{
		return	cockpitobjectcollectionsList;
	}
	
	/**
	 * @param cockpitobjectcollectionsList 
	 *  the cockpitobjectcollectionsList to set   
	 */
	public void setCockpitObjectCollections(final List<CockpitObjectCollectionDTO> cockpitobjectcollectionsList)
	{
		this.cockpitobjectcollectionsList=cockpitobjectcollectionsList;
	}
	
}
