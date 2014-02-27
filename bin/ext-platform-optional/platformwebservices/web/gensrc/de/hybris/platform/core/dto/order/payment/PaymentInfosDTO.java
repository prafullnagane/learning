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

import de.hybris.platform.core.dto.order.payment.PaymentInfoDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PaymentInfo first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "paymentinfos")
public class PaymentInfosDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PaymentInfoDTO*/
	private List<PaymentInfoDTO>  paymentinfosList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PaymentInfosDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PaymentInfosDTO(final List<PaymentInfoDTO> paymentinfosList)
	{
		super();
		this.paymentinfosList=paymentinfosList;
	}
	
	
	/**
	 * @return the paymentinfos
	 */
	@XmlElement(name = "paymentinfo")
	public List<PaymentInfoDTO> getPaymentInfos()
	{
		return	paymentinfosList;
	}
	
	/**
	 * @param paymentinfosList 
	 *  the paymentinfosList to set   
	 */
	public void setPaymentInfos(final List<PaymentInfoDTO> paymentinfosList)
	{
		this.paymentinfosList=paymentinfosList;
	}
	
}