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
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Voucher first defined at extension voucher
 */
@SuppressWarnings("all")
@XmlRootElement(name = "vouchers")
public class VouchersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>VoucherDTO*/
	private List<VoucherDTO>  vouchersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VouchersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VouchersDTO(final List<VoucherDTO> vouchersList)
	{
		super();
		this.vouchersList=vouchersList;
	}
	
	
	/**
	 * @return the vouchers
	 */
	@XmlElement(name = "voucher")
	public List<VoucherDTO> getVouchers()
	{
		return	vouchersList;
	}
	
	/**
	 * @param vouchersList 
	 *  the vouchersList to set   
	 */
	public void setVouchers(final List<VoucherDTO> vouchersList)
	{
		this.vouchersList=vouchersList;
	}
	
}
