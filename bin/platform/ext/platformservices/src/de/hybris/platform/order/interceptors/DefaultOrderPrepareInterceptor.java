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
package de.hybris.platform.order.interceptors;

import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.order.strategies.ordercloning.OrderPartOfMembersCloningStrategy;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import org.springframework.beans.factory.annotation.Required;


/**
 * Automatically clones the order's elements:
 * <ul>
 * <li>{@link AbstractOrderModel#PAYMENTINFO},</li>
 * <li>{@link AbstractOrderModel#PAYMENTADDRESS}</li>
 * <li>{@link AbstractOrderModel#DELIVERYADDRESS}</li>
 * </ul>
 * and sets the <b>clones</b> as actual values.<br>
 * If the cloned elements are clones themselves, the interceptor removes them.
 */
public class DefaultOrderPrepareInterceptor implements PrepareInterceptor
{
	private OrderPartOfMembersCloningStrategy orderPartOfMembersCloningStrategy;


	@Override
	public void onPrepare(final Object model, final InterceptorContext ctx) throws InterceptorException
	{
		if (model instanceof OrderModel)
		{
			final OrderModel order = (OrderModel) model;

			//check if payment address was changed to a non null value
			if (order.getPaymentAddress() != null && ctx.isModified(order, OrderModel.PAYMENTADDRESS))
			{
				final AddressModel paymentAddress = order.getPaymentAddress();
				//if the new payment address needs cloning, we need to clone it to be a part of this order's contract:				
				if (orderPartOfMembersCloningStrategy.addressNeedsCloning(paymentAddress, order))
				{
					final AddressModel paymentAddressClone = handleAddressCloning(paymentAddress, order);
					order.setPaymentAddress(paymentAddressClone);
					ctx.registerElement(paymentAddressClone, null);
				}
			}

			//check if payment address was changed to a non null value
			if (order.getDeliveryAddress() != null && ctx.isModified(order, OrderModel.DELIVERYADDRESS))
			{
				final AddressModel deliveryAddress = order.getDeliveryAddress();
				//if the new delivery address needs cloning, we need to clone it to be a part of this order's contract:				
				if (orderPartOfMembersCloningStrategy.addressNeedsCloning(deliveryAddress, order))
				{
					final AddressModel deliveryAddressClone = handleAddressCloning(deliveryAddress, order);
					order.setDeliveryAddress(deliveryAddressClone);
					ctx.registerElement(deliveryAddressClone, null);
				}
			}

			//check if payment info was changed to a non null value
			if (order.getPaymentInfo() != null && ctx.isModified(order, OrderModel.PAYMENTINFO))
			{
				final PaymentInfoModel paymentInfo = order.getPaymentInfo();
				//if the new payment info needs cloning, we need to clone it to be a part of this order's contract:				
				if (orderPartOfMembersCloningStrategy.paymentInfoNeedsCloning(paymentInfo, order))
				{
					final PaymentInfoModel paymentInfoClone = orderPartOfMembersCloningStrategy.clonePaymentInfoForOrder(paymentInfo,
							order);
					order.setPaymentInfo(paymentInfoClone);
					ctx.registerElement(paymentInfoClone, null);
				}
			}
		}
	}

	private AddressModel handleAddressCloning(final AddressModel address, final OrderModel order)
	{
		return orderPartOfMembersCloningStrategy.cloneAddressForOrder(address, order);
	}


	@Required
	public void setOrderPartOfMembersCloningStrategy(final OrderPartOfMembersCloningStrategy orderPartOfMembersCloningStrategy)
	{
		this.orderPartOfMembersCloningStrategy = orderPartOfMembersCloningStrategy;
	}

}
