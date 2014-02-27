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

import de.hybris.platform.deliveryzone.dto.ZoneDeliveryModeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ZoneDeliveryMode first defined at extension deliveryzone
 */
@SuppressWarnings("all")
@XmlRootElement(name = "zonedeliverymodes")
public class ZoneDeliveryModesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ZoneDeliveryModeDTO*/
	private List<ZoneDeliveryModeDTO>  zonedeliverymodesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ZoneDeliveryModesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ZoneDeliveryModesDTO(final List<ZoneDeliveryModeDTO> zonedeliverymodesList)
	{
		super();
		this.zonedeliverymodesList=zonedeliverymodesList;
	}
	
	
	/**
	 * @return the zonedeliverymodes
	 */
	@XmlElement(name = "zonedeliverymode")
	public List<ZoneDeliveryModeDTO> getZoneDeliveryModes()
	{
		return	zonedeliverymodesList;
	}
	
	/**
	 * @param zonedeliverymodesList 
	 *  the zonedeliverymodesList to set   
	 */
	public void setZoneDeliveryModes(final List<ZoneDeliveryModeDTO> zonedeliverymodesList)
	{
		this.zonedeliverymodesList=zonedeliverymodesList;
	}
	
}
