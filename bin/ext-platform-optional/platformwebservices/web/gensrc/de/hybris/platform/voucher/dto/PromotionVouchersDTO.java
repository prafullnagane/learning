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
package de.hybris.platform.voucher.dto;

import de.hybris.platform.voucher.dto.PromotionVoucherDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PromotionVoucher first defined at extension voucher
 */
@SuppressWarnings("all")
@XmlRootElement(name = "promotionvouchers")
public class PromotionVouchersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PromotionVoucherDTO*/
	private List<PromotionVoucherDTO>  promotionvouchersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionVouchersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionVouchersDTO(final List<PromotionVoucherDTO> promotionvouchersList)
	{
		super();
		this.promotionvouchersList=promotionvouchersList;
	}
	
	
	/**
	 * @return the promotionvouchers
	 */
	@XmlElement(name = "promotionvoucher")
	public List<PromotionVoucherDTO> getPromotionVouchers()
	{
		return	promotionvouchersList;
	}
	
	/**
	 * @param promotionvouchersList 
	 *  the promotionvouchersList to set   
	 */
	public void setPromotionVouchers(final List<PromotionVoucherDTO> promotionvouchersList)
	{
		this.promotionvouchersList=promotionvouchersList;
	}
	
}
