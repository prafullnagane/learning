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

import de.hybris.platform.core.dto.type.MapTypeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type MapType first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "maptypes")
public class MapTypesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>MapTypeDTO*/
	private List<MapTypeDTO>  maptypesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MapTypesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MapTypesDTO(final List<MapTypeDTO> maptypesList)
	{
		super();
		this.maptypesList=maptypesList;
	}
	
	
	/**
	 * @return the maptypes
	 */
	@XmlElement(name = "maptype")
	public List<MapTypeDTO> getMapTypes()
	{
		return	maptypesList;
	}
	
	/**
	 * @param maptypesList 
	 *  the maptypesList to set   
	 */
	public void setMapTypes(final List<MapTypeDTO> maptypesList)
	{
		this.maptypesList=maptypesList;
	}
	
}
