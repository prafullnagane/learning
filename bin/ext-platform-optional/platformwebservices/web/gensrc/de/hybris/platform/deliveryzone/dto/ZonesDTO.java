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
package de.hybris.platform.deliveryzone.dto;

import de.hybris.platform.deliveryzone.dto.ZoneDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Zone first defined at extension deliveryzone
 */
@SuppressWarnings("all")
@XmlRootElement(name = "zones")
public class ZonesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ZoneDTO*/
	private List<ZoneDTO>  zonesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ZonesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ZonesDTO(final List<ZoneDTO> zonesList)
	{
		super();
		this.zonesList=zonesList;
	}
	
	
	/**
	 * @return the zones
	 */
	@XmlElement(name = "zone")
	public List<ZoneDTO> getZones()
	{
		return	zonesList;
	}
	
	/**
	 * @param zonesList 
	 *  the zonesList to set   
	 */
	public void setZones(final List<ZoneDTO> zonesList)
	{
		this.zonesList=zonesList;
	}
	
}
