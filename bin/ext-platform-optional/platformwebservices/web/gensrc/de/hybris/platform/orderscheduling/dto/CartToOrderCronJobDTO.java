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
package de.hybris.platform.orderscheduling.dto;

import de.hybris.platform.core.dto.order.CartDTO;
import de.hybris.platform.core.dto.order.payment.PaymentInfoDTO;
import de.hybris.platform.core.dto.user.AddressDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.orderscheduling.model.CartToOrderCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CartToOrderCronJob first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = CartToOrderCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "carttoordercronjob")
public class CartToOrderCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>CartToOrderCronJob.paymentInfo</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.payment.PaymentInfoDTO _paymentInfo;
	/** <i>Generated variable</i> - Variable of <code>CartToOrderCronJob.paymentAddress</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.AddressDTO _paymentAddress;
	/** <i>Generated variable</i> - Variable of <code>CartToOrderCronJob.deliveryAddress</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.AddressDTO _deliveryAddress;
	/** <i>Generated variable</i> - Variable of <code>CartToOrderCronJob.cart</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.CartDTO _cart;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CartToOrderCronJobDTO()
	{
		super();
	}
	
	
	public CartDTO getCart()
	{
		return this._cart;
	}
	
	public AddressDTO getDeliveryAddress()
	{
		return this._deliveryAddress;
	}
	
	public AddressDTO getPaymentAddress()
	{
		return this._paymentAddress;
	}
	
	public PaymentInfoDTO getPaymentInfo()
	{
		return this._paymentInfo;
	}
	
	public void setCart(final CartDTO value)
	{
		this.modifiedPropsSet.add("cart");
		this._cart = value;
	}
	
	public void setDeliveryAddress(final AddressDTO value)
	{
		this.modifiedPropsSet.add("deliveryAddress");
		this._deliveryAddress = value;
	}
	
	public void setPaymentAddress(final AddressDTO value)
	{
		this.modifiedPropsSet.add("paymentAddress");
		this._paymentAddress = value;
	}
	
	public void setPaymentInfo(final PaymentInfoDTO value)
	{
		this.modifiedPropsSet.add("paymentInfo");
		this._paymentInfo = value;
	}
	
}
