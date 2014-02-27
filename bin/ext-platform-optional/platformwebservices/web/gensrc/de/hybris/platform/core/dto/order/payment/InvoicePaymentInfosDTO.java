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

import de.hybris.platform.core.dto.order.payment.InvoicePaymentInfoDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type InvoicePaymentInfo first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "invoicepaymentinfos")
public class InvoicePaymentInfosDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>InvoicePaymentInfoDTO*/
	private List<InvoicePaymentInfoDTO>  invoicepaymentinfosList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public InvoicePaymentInfosDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public InvoicePaymentInfosDTO(final List<InvoicePaymentInfoDTO> invoicepaymentinfosList)
	{
		super();
		this.invoicepaymentinfosList=invoicepaymentinfosList;
	}
	
	
	/**
	 * @return the invoicepaymentinfos
	 */
	@XmlElement(name = "invoicepaymentinfo")
	public List<InvoicePaymentInfoDTO> getInvoicePaymentInfos()
	{
		return	invoicepaymentinfosList;
	}
	
	/**
	 * @param invoicepaymentinfosList 
	 *  the invoicepaymentinfosList to set   
	 */
	public void setInvoicePaymentInfos(final List<InvoicePaymentInfoDTO> invoicepaymentinfosList)
	{
		this.invoicepaymentinfosList=invoicepaymentinfosList;
	}
	
}
