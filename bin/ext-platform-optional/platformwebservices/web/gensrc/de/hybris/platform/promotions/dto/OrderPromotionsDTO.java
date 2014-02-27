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

import de.hybris.platform.promotions.dto.OrderPromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "orderpromotions")
public class OrderPromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderPromotionDTO*/
	private List<OrderPromotionDTO>  orderpromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderPromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderPromotionsDTO(final List<OrderPromotionDTO> orderpromotionsList)
	{
		super();
		this.orderpromotionsList=orderpromotionsList;
	}
	
	
	/**
	 * @return the orderpromotions
	 */
	@XmlElement(name = "orderpromotion")
	public List<OrderPromotionDTO> getOrderPromotions()
	{
		return	orderpromotionsList;
	}
	
	/**
	 * @param orderpromotionsList 
	 *  the orderpromotionsList to set   
	 */
	public void setOrderPromotions(final List<OrderPromotionDTO> orderpromotionsList)
	{
		this.orderpromotionsList=orderpromotionsList;
	}
	
}
