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

import de.hybris.platform.deliveryzone.dto.ZoneDeliveryModeValueDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ZoneDeliveryModeValue first defined at extension deliveryzone
 */
@SuppressWarnings("all")
@XmlRootElement(name = "zonedeliverymodevalues")
public class ZoneDeliveryModeValuesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ZoneDeliveryModeValueDTO*/
	private List<ZoneDeliveryModeValueDTO>  zonedeliverymodevaluesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ZoneDeliveryModeValuesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ZoneDeliveryModeValuesDTO(final List<ZoneDeliveryModeValueDTO> zonedeliverymodevaluesList)
	{
		super();
		this.zonedeliverymodevaluesList=zonedeliverymodevaluesList;
	}
	
	
	/**
	 * @return the zonedeliverymodevalues
	 */
	@XmlElement(name = "zonedeliverymodevalue")
	public List<ZoneDeliveryModeValueDTO> getZoneDeliveryModeValues()
	{
		return	zonedeliverymodevaluesList;
	}
	
	/**
	 * @param zonedeliverymodevaluesList 
	 *  the zonedeliverymodevaluesList to set   
	 */
	public void setZoneDeliveryModeValues(final List<ZoneDeliveryModeValueDTO> zonedeliverymodevaluesList)
	{
		this.zonedeliverymodevaluesList=zonedeliverymodevaluesList;
	}
	
}
