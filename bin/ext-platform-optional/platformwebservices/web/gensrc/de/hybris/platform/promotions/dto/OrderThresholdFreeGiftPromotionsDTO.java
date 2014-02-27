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

import de.hybris.platform.promotions.dto.OrderThresholdFreeGiftPromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderThresholdFreeGiftPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "orderthresholdfreegiftpromotions")
public class OrderThresholdFreeGiftPromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderThresholdFreeGiftPromotionDTO*/
	private List<OrderThresholdFreeGiftPromotionDTO>  orderthresholdfreegiftpromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdFreeGiftPromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdFreeGiftPromotionsDTO(final List<OrderThresholdFreeGiftPromotionDTO> orderthresholdfreegiftpromotionsList)
	{
		super();
		this.orderthresholdfreegiftpromotionsList=orderthresholdfreegiftpromotionsList;
	}
	
	
	/**
	 * @return the orderthresholdfreegiftpromotions
	 */
	@XmlElement(name = "orderthresholdfreegiftpromotion")
	public List<OrderThresholdFreeGiftPromotionDTO> getOrderThresholdFreeGiftPromotions()
	{
		return	orderthresholdfreegiftpromotionsList;
	}
	
	/**
	 * @param orderthresholdfreegiftpromotionsList 
	 *  the orderthresholdfreegiftpromotionsList to set   
	 */
	public void setOrderThresholdFreeGiftPromotions(final List<OrderThresholdFreeGiftPromotionDTO> orderthresholdfreegiftpromotionsList)
	{
		this.orderthresholdfreegiftpromotionsList=orderthresholdfreegiftpromotionsList;
	}
	
}
