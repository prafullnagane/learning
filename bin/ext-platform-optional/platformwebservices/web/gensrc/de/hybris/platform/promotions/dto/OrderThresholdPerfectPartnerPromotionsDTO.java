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

import de.hybris.platform.promotions.dto.OrderThresholdPerfectPartnerPromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderThresholdPerfectPartnerPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "orderthresholdperfectpartnerpromotions")
public class OrderThresholdPerfectPartnerPromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderThresholdPerfectPartnerPromotionDTO*/
	private List<OrderThresholdPerfectPartnerPromotionDTO>  orderthresholdperfectpartnerpromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdPerfectPartnerPromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdPerfectPartnerPromotionsDTO(final List<OrderThresholdPerfectPartnerPromotionDTO> orderthresholdperfectpartnerpromotionsList)
	{
		super();
		this.orderthresholdperfectpartnerpromotionsList=orderthresholdperfectpartnerpromotionsList;
	}
	
	
	/**
	 * @return the orderthresholdperfectpartnerpromotions
	 */
	@XmlElement(name = "orderthresholdperfectpartnerpromotion")
	public List<OrderThresholdPerfectPartnerPromotionDTO> getOrderThresholdPerfectPartnerPromotions()
	{
		return	orderthresholdperfectpartnerpromotionsList;
	}
	
	/**
	 * @param orderthresholdperfectpartnerpromotionsList 
	 *  the orderthresholdperfectpartnerpromotionsList to set   
	 */
	public void setOrderThresholdPerfectPartnerPromotions(final List<OrderThresholdPerfectPartnerPromotionDTO> orderthresholdperfectpartnerpromotionsList)
	{
		this.orderthresholdperfectpartnerpromotionsList=orderthresholdperfectpartnerpromotionsList;
	}
	
}
