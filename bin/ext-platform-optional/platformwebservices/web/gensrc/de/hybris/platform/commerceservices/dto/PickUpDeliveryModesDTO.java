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
package de.hybris.platform.commerceservices.dto;

import de.hybris.platform.commerceservices.dto.PickUpDeliveryModeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PickUpDeliveryMode first defined at extension commerceservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "pickupdeliverymodes")
public class PickUpDeliveryModesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PickUpDeliveryModeDTO*/
	private List<PickUpDeliveryModeDTO>  pickupdeliverymodesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PickUpDeliveryModesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PickUpDeliveryModesDTO(final List<PickUpDeliveryModeDTO> pickupdeliverymodesList)
	{
		super();
		this.pickupdeliverymodesList=pickupdeliverymodesList;
	}
	
	
	/**
	 * @return the pickupdeliverymodes
	 */
	@XmlElement(name = "pickupdeliverymode")
	public List<PickUpDeliveryModeDTO> getPickUpDeliveryModes()
	{
		return	pickupdeliverymodesList;
	}
	
	/**
	 * @param pickupdeliverymodesList 
	 *  the pickupdeliverymodesList to set   
	 */
	public void setPickUpDeliveryModes(final List<PickUpDeliveryModeDTO> pickupdeliverymodesList)
	{
		this.pickupdeliverymodesList=pickupdeliverymodesList;
	}
	
}
