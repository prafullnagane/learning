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

import de.hybris.platform.promotions.dto.OrderThresholdDiscountPromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderThresholdDiscountPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "orderthresholddiscountpromotions")
public class OrderThresholdDiscountPromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderThresholdDiscountPromotionDTO*/
	private List<OrderThresholdDiscountPromotionDTO>  orderthresholddiscountpromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdDiscountPromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdDiscountPromotionsDTO(final List<OrderThresholdDiscountPromotionDTO> orderthresholddiscountpromotionsList)
	{
		super();
		this.orderthresholddiscountpromotionsList=orderthresholddiscountpromotionsList;
	}
	
	
	/**
	 * @return the orderthresholddiscountpromotions
	 */
	@XmlElement(name = "orderthresholddiscountpromotion")
	public List<OrderThresholdDiscountPromotionDTO> getOrderThresholdDiscountPromotions()
	{
		return	orderthresholddiscountpromotionsList;
	}
	
	/**
	 * @param orderthresholddiscountpromotionsList 
	 *  the orderthresholddiscountpromotionsList to set   
	 */
	public void setOrderThresholdDiscountPromotions(final List<OrderThresholdDiscountPromotionDTO> orderthresholddiscountpromotionsList)
	{
		this.orderthresholddiscountpromotionsList=orderthresholddiscountpromotionsList;
	}
	
}
