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
package de.hybris.platform.payment.dto;

import de.hybris.platform.payment.dto.PaymentTransactionEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PaymentTransactionEntry first defined at extension payment
 */
@SuppressWarnings("all")
@XmlRootElement(name = "paymenttransactionentries")
public class PaymentTransactionEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PaymentTransactionEntryDTO*/
	private List<PaymentTransactionEntryDTO>  paymenttransactionentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PaymentTransactionEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PaymentTransactionEntriesDTO(final List<PaymentTransactionEntryDTO> paymenttransactionentriesList)
	{
		super();
		this.paymenttransactionentriesList=paymenttransactionentriesList;
	}
	
	
	/**
	 * @return the paymenttransactionentries
	 */
	@XmlElement(name = "paymenttransactionentry")
	public List<PaymentTransactionEntryDTO> getPaymentTransactionEntries()
	{
		return	paymenttransactionentriesList;
	}
	
	/**
	 * @param paymenttransactionentriesList 
	 *  the paymenttransactionentriesList to set   
	 */
	public void setPaymentTransactionEntries(final List<PaymentTransactionEntryDTO> paymenttransactionentriesList)
	{
		this.paymenttransactionentriesList=paymenttransactionentriesList;
	}
	
}
