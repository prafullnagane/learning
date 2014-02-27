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
package de.hybris.platform.core.dto.order.payment;

import de.hybris.platform.core.dto.order.payment.DebitPaymentInfoDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type DebitPaymentInfo first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "debitpaymentinfos")
public class DebitPaymentInfosDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DebitPaymentInfoDTO*/
	private List<DebitPaymentInfoDTO>  debitpaymentinfosList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DebitPaymentInfosDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DebitPaymentInfosDTO(final List<DebitPaymentInfoDTO> debitpaymentinfosList)
	{
		super();
		this.debitpaymentinfosList=debitpaymentinfosList;
	}
	
	
	/**
	 * @return the debitpaymentinfos
	 */
	@XmlElement(name = "debitpaymentinfo")
	public List<DebitPaymentInfoDTO> getDebitPaymentInfos()
	{
		return	debitpaymentinfosList;
	}
	
	/**
	 * @param debitpaymentinfosList 
	 *  the debitpaymentinfosList to set   
	 */
	public void setDebitPaymentInfos(final List<DebitPaymentInfoDTO> debitpaymentinfosList)
	{
		this.debitpaymentinfosList=debitpaymentinfosList;
	}
	
}
