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

import de.hybris.platform.payment.dto.PaymentTransactionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PaymentTransaction first defined at extension payment
 */
@SuppressWarnings("all")
@XmlRootElement(name = "paymenttransactions")
public class PaymentTransactionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PaymentTransactionDTO*/
	private List<PaymentTransactionDTO>  paymenttransactionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PaymentTransactionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PaymentTransactionsDTO(final List<PaymentTransactionDTO> paymenttransactionsList)
	{
		super();
		this.paymenttransactionsList=paymenttransactionsList;
	}
	
	
	/**
	 * @return the paymenttransactions
	 */
	@XmlElement(name = "paymenttransaction")
	public List<PaymentTransactionDTO> getPaymentTransactions()
	{
		return	paymenttransactionsList;
	}
	
	/**
	 * @param paymenttransactionsList 
	 *  the paymenttransactionsList to set   
	 */
	public void setPaymentTransactions(final List<PaymentTransactionDTO> paymenttransactionsList)
	{
		this.paymenttransactionsList=paymenttransactionsList;
	}
	
}
