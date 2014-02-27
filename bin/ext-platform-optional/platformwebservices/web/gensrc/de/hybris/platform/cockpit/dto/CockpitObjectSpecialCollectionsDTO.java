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

import de.hybris.platform.cockpit.dto.CockpitObjectSpecialCollectionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CockpitObjectSpecialCollection first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cockpitobjectspecialcollections")
public class CockpitObjectSpecialCollectionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CockpitObjectSpecialCollectionDTO*/
	private List<CockpitObjectSpecialCollectionDTO>  cockpitobjectspecialcollectionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitObjectSpecialCollectionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitObjectSpecialCollectionsDTO(final List<CockpitObjectSpecialCollectionDTO> cockpitobjectspecialcollectionsList)
	{
		super();
		this.cockpitobjectspecialcollectionsList=cockpitobjectspecialcollectionsList;
	}
	
	
	/**
	 * @return the cockpitobjectspecialcollections
	 */
	@XmlElement(name = "cockpitobjectspecialcollection")
	public List<CockpitObjectSpecialCollectionDTO> getCockpitObjectSpecialCollections()
	{
		return	cockpitobjectspecialcollectionsList;
	}
	
	/**
	 * @param cockpitobjectspecialcollectionsList 
	 *  the cockpitobjectspecialcollectionsList to set   
	 */
	public void setCockpitObjectSpecialCollections(final List<CockpitObjectSpecialCollectionDTO> cockpitobjectspecialcollectionsList)
	{
		this.cockpitobjectspecialcollectionsList=cockpitobjectspecialcollectionsList;
	}
	
}
