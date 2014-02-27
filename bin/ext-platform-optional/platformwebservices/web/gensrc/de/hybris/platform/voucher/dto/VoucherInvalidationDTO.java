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
package de.hybris.platform.voucher.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.order.OrderDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.voucher.dto.VoucherDTO;
import de.hybris.platform.voucher.model.VoucherInvalidationModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type VoucherInvalidation first defined at extension voucher
 */
@SuppressWarnings("all")
@GraphNode(target = VoucherInvalidationModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "voucherinvalidation")
public class VoucherInvalidationDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>VoucherInvalidation.voucher</code> attribute defined at extension <code> */
	private de.hybris.platform.voucher.dto.VoucherDTO _voucher;
	/** <i>Generated variable</i> - Variable of <code>VoucherInvalidation.status</code> attribute defined at extension <code> */
	private java.lang.String _status;
	/** <i>Generated variable</i> - Variable of <code>VoucherInvalidation.order</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.OrderDTO _order;
	/** <i>Generated variable</i> - Variable of <code>VoucherInvalidation.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	/** <i>Generated variable</i> - Variable of <code>VoucherInvalidation.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VoucherInvalidationDTO()
	{
		super();
	}
	
	
	public String getCode()
	{
		return this._code;
	}
	
	public OrderDTO getOrder()
	{
		return this._order;
	}
	
	public String getStatus()
	{
		return this._status;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	public VoucherDTO getVoucher()
	{
		return this._voucher;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setOrder(final OrderDTO value)
	{
		this.modifiedPropsSet.add("order");
		this._order = value;
	}
	
	public void setStatus(final String value)
	{
		this.modifiedPropsSet.add("status");
		this._status = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
	public void setVoucher(final VoucherDTO value)
	{
		this.modifiedPropsSet.add("voucher");
		this._voucher = value;
	}
	
}
