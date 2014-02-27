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
package de.hybris.platform.core.dto.c2l;

import de.hybris.platform.core.dto.c2l.RegionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Region first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "regions")
public class RegionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RegionDTO*/
	private List<RegionDTO>  regionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RegionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RegionsDTO(final List<RegionDTO> regionsList)
	{
		super();
		this.regionsList=regionsList;
	}
	
	
	/**
	 * @return the regions
	 */
	@XmlElement(name = "region")
	public List<RegionDTO> getRegions()
	{
		return	regionsList;
	}
	
	/**
	 * @param regionsList 
	 *  the regionsList to set   
	 */
	public void setRegions(final List<RegionDTO> regionsList)
	{
		this.regionsList=regionsList;
	}
	
}
