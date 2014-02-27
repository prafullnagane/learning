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

import de.hybris.platform.voucher.dto.SerialVoucherDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SerialVoucher first defined at extension voucher
 */
@SuppressWarnings("all")
@XmlRootElement(name = "serialvouchers")
public class SerialVouchersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SerialVoucherDTO*/
	private List<SerialVoucherDTO>  serialvouchersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SerialVouchersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SerialVouchersDTO(final List<SerialVoucherDTO> serialvouchersList)
	{
		super();
		this.serialvouchersList=serialvouchersList;
	}
	
	
	/**
	 * @return the serialvouchers
	 */
	@XmlElement(name = "serialvoucher")
	public List<SerialVoucherDTO> getSerialVouchers()
	{
		return	serialvouchersList;
	}
	
	/**
	 * @param serialvouchersList 
	 *  the serialvouchersList to set   
	 */
	public void setSerialVouchers(final List<SerialVoucherDTO> serialvouchersList)
	{
		this.serialvouchersList=serialvouchersList;
	}
	
}
