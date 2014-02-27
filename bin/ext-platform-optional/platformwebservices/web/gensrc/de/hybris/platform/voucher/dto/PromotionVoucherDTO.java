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

import de.hybris.platform.voucher.dto.VoucherDTO;
import de.hybris.platform.voucher.model.PromotionVoucherModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PromotionVoucher first defined at extension voucher
 */
@SuppressWarnings("all")
@GraphNode(target = PromotionVoucherModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "promotionvoucher")
public class PromotionVoucherDTO extends VoucherDTO
{
	/** <i>Generated variable</i> - Variable of <code>PromotionVoucher.voucherCode</code> attribute defined at extension <code> */
	private java.lang.String _voucherCode;
	/** <i>Generated variable</i> - Variable of <code>PromotionVoucher.redemptionQuantityLimitPerUser</code> attribute defined at extension <code> */
	private java.lang.Integer _redemptionQuantityLimitPerUser;
	/** <i>Generated variable</i> - Variable of <code>PromotionVoucher.redemptionQuantityLimit</code> attribute defined at extension <code> */
	private java.lang.Integer _redemptionQuantityLimit;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionVoucherDTO()
	{
		super();
	}
	
	
	public Integer getRedemptionQuantityLimit()
	{
		return this._redemptionQuantityLimit;
	}
	
	public Integer getRedemptionQuantityLimitPerUser()
	{
		return this._redemptionQuantityLimitPerUser;
	}
	
	public String getVoucherCode()
	{
		return this._voucherCode;
	}
	
	public void setRedemptionQuantityLimit(final Integer value)
	{
		this.modifiedPropsSet.add("redemptionQuantityLimit");
		this._redemptionQuantityLimit = value;
	}
	
	public void setRedemptionQuantityLimitPerUser(final Integer value)
	{
		this.modifiedPropsSet.add("redemptionQuantityLimitPerUser");
		this._redemptionQuantityLimitPerUser = value;
	}
	
	public void setVoucherCode(final String value)
	{
		this.modifiedPropsSet.add("voucherCode");
		this._voucherCode = value;
	}
	
}
