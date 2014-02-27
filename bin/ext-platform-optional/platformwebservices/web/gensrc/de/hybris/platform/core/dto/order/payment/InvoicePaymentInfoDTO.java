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
import de.hybris.platform.core.model.order.payment.InvoicePaymentInfoModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type InvoicePaymentInfo first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = InvoicePaymentInfoModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "invoicepaymentinfo")
public class InvoicePaymentInfoDTO extends PaymentInfoDTO
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public InvoicePaymentInfoDTO()
	{
		super();
	}
	
	
}
