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

import de.hybris.platform.promotions.dto.OrderThresholdFreeVoucherPromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type OrderThresholdFreeVoucherPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "orderthresholdfreevoucherpromotions")
public class OrderThresholdFreeVoucherPromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>OrderThresholdFreeVoucherPromotionDTO*/
	private List<OrderThresholdFreeVoucherPromotionDTO>  orderthresholdfreevoucherpromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdFreeVoucherPromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderThresholdFreeVoucherPromotionsDTO(final List<OrderThresholdFreeVoucherPromotionDTO> orderthresholdfreevoucherpromotionsList)
	{
		super();
		this.orderthresholdfreevoucherpromotionsList=orderthresholdfreevoucherpromotionsList;
	}
	
	
	/**
	 * @return the orderthresholdfreevoucherpromotions
	 */
	@XmlElement(name = "orderthresholdfreevoucherpromotion")
	public List<OrderThresholdFreeVoucherPromotionDTO> getOrderThresholdFreeVoucherPromotions()
	{
		return	orderthresholdfreevoucherpromotionsList;
	}
	
	/**
	 * @param orderthresholdfreevoucherpromotionsList 
	 *  the orderthresholdfreevoucherpromotionsList to set   
	 */
	public void setOrderThresholdFreeVoucherPromotions(final List<OrderThresholdFreeVoucherPromotionDTO> orderthresholdfreevoucherpromotionsList)
	{
		this.orderthresholdfreevoucherpromotionsList=orderthresholdfreevoucherpromotionsList;
	}
	
}
