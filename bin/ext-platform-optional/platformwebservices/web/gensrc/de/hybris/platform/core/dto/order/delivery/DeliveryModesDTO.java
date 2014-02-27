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
package de.hybris.platform.core.dto.order.delivery;

import de.hybris.platform.core.dto.order.delivery.DeliveryModeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type DeliveryMode first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "deliverymodes")
public class DeliveryModesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DeliveryModeDTO*/
	private List<DeliveryModeDTO>  deliverymodesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DeliveryModesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DeliveryModesDTO(final List<DeliveryModeDTO> deliverymodesList)
	{
		super();
		this.deliverymodesList=deliverymodesList;
	}
	
	
	/**
	 * @return the deliverymodes
	 */
	@XmlElement(name = "deliverymode")
	public List<DeliveryModeDTO> getDeliveryModes()
	{
		return	deliverymodesList;
	}
	
	/**
	 * @param deliverymodesList 
	 *  the deliverymodesList to set   
	 */
	public void setDeliveryModes(final List<DeliveryModeDTO> deliverymodesList)
	{
		this.deliverymodesList=deliverymodesList;
	}
	
}
