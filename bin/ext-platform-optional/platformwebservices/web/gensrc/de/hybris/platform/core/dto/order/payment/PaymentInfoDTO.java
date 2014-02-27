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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.user.AddressDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.orderscheduling.dto.CartToOrderCronJobDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PaymentInfo first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = PaymentInfoModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "paymentinfo")
public class PaymentInfoDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>PaymentInfo.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>PaymentInfo.original</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _original;
	/** <i>Generated variable</i> - Variable of <code>PaymentInfo.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	/** <i>Generated variable</i> - Variable of <code>PaymentInfo.billingAddress</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.AddressDTO _billingAddress;
	/** <i>Generated variable</i> - Variable of <code>PaymentInfo.saved</code> attribute defined at extension <code> */
	private boolean _saved;
	/** <i>Generated variable</i> - Variable of <code>PaymentInfo.cartToOrderCronJob</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.orderscheduling.dto.CartToOrderCronJobDTO> _cartToOrderCronJob;
	/** <i>Generated variable</i> - Variable of <code>PaymentInfo.duplicate</code> attribute defined at extension <code> */
	private java.lang.Boolean _duplicate;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PaymentInfoDTO()
	{
		super();
	}
	
	
	public AddressDTO getBillingAddress()
	{
		return this._billingAddress;
	}
	
	@XmlElementWrapper(name = "cartToOrderCronJob")
	@XmlElement(name = "cartToOrderCronJob")
	public Collection<CartToOrderCronJobDTO> getCartToOrderCronJob()
	{
		return this._cartToOrderCronJob;
	}
	
	public String getCode()
	{
		return this._code;
	}
	
	public Boolean getDuplicate()
	{
		return this._duplicate;
	}
	
	public ItemDTO getOriginal()
	{
		return this._original;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	public boolean isSaved()
	{
		return this._saved;
	}
	
	public void setBillingAddress(final AddressDTO value)
	{
		this.modifiedPropsSet.add("billingAddress");
		this._billingAddress = value;
	}
	
	public void setCartToOrderCronJob(final Collection<CartToOrderCronJobDTO> value)
	{
		this.modifiedPropsSet.add("cartToOrderCronJob");
		this._cartToOrderCronJob = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setDuplicate(final Boolean value)
	{
		this.modifiedPropsSet.add("duplicate");
		this._duplicate = value;
	}
	
	public void setOriginal(final ItemDTO value)
	{
		this.modifiedPropsSet.add("original");
		this._original = value;
	}
	
	public void setSaved(final boolean value)
	{
		this.modifiedPropsSet.add("saved");
		this._saved = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
}
