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
package de.hybris.platform.promotions.dto;

import de.hybris.platform.promotions.dto.OrderThresholdChangeDeliveryModePromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderThresholdChangeDeliveryModePromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "orderthresholdchangedeliverymodepromotions")
public class OrderThresholdChangeDeliveryModePromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderThresholdChangeDeliveryModePromotionDTO*/
	private List<OrderThresholdChangeDeliveryModePromotionDTO>  orderthresholdchangedeliverymodepromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdChangeDeliveryModePromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdChangeDeliveryModePromotionsDTO(final List<OrderThresholdChangeDeliveryModePromotionDTO> orderthresholdchangedeliverymodepromotionsList)
	{
		super();
		this.orderthresholdchangedeliverymodepromotionsList=orderthresholdchangedeliverymodepromotionsList;
	}
	
	
	/**
	 * @return the orderthresholdchangedeliverymodepromotions
	 */
	@XmlElement(name = "orderthresholdchangedeliverymodepromotion")
	public List<OrderThresholdChangeDeliveryModePromotionDTO> getOrderThresholdChangeDeliveryModePromotions()
	{
		return	orderthresholdchangedeliverymodepromotionsList;
	}
	
	/**
	 * @param orderthresholdchangedeliverymodepromotionsList 
	 *  the orderthresholdchangedeliverymodepromotionsList to set   
	 */
	public void setOrderThresholdChangeDeliveryModePromotions(final List<OrderThresholdChangeDeliveryModePromotionDTO> orderthresholdchangedeliverymodepromotionsList)
	{
		this.orderthresholdchangedeliverymodepromotionsList=orderthresholdchangedeliverymodepromotionsList;
	}
	
}
