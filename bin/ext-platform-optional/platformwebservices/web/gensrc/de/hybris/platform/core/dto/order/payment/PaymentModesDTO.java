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

import de.hybris.platform.core.dto.order.payment.PaymentModeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PaymentMode first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "paymentmodes")
public class PaymentModesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PaymentModeDTO*/
	private List<PaymentModeDTO>  paymentmodesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PaymentModesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PaymentModesDTO(final List<PaymentModeDTO> paymentmodesList)
	{
		super();
		this.paymentmodesList=paymentmodesList;
	}
	
	
	/**
	 * @return the paymentmodes
	 */
	@XmlElement(name = "paymentmode")
	public List<PaymentModeDTO> getPaymentModes()
	{
		return	paymentmodesList;
	}
	
	/**
	 * @param paymentmodesList 
	 *  the paymentmodesList to set   
	 */
	public void setPaymentModes(final List<PaymentModeDTO> paymentmodesList)
	{
		this.paymentmodesList=paymentmodesList;
	}
	
}
