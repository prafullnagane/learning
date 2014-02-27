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
package de.hybris.platform.order.events;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;


/**
 * Event that represent submitting of order. By calling {@link #getOrder()} on it you can access submitted order.
 */
public class SubmitOrderEvent extends AbstractEvent
{
	private final OrderModel order;

	public SubmitOrderEvent(final OrderModel order)
	{
		super();
		this.order = order;
	}

	public OrderModel getOrder()
	{
		return order;
	}
}
