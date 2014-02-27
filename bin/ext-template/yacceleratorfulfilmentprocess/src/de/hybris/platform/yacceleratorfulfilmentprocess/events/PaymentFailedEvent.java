/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package de.hybris.platform.yacceleratorfulfilmentprocess.events;

import de.hybris.platform.orderprocessing.events.OrderProcessingEvent;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;


/**
 * Event representing a failure to capture payment
 */
public class PaymentFailedEvent extends OrderProcessingEvent
{
	private static final long serialVersionUID = -4143696687348230520L;

	public PaymentFailedEvent(final OrderProcessModel process)
	{
		super(process);
	}
}
