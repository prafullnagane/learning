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
package de.hybris.platform.ordercancel.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.ordercancel.model.OrderCancelConfigModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OrderCancelConfig first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = OrderCancelConfigModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "ordercancelconfig")
public class OrderCancelConfigDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>OrderCancelConfig.partialOrderEntryCancelAllowed</code> attribute defined at extension <code> */
	private boolean _partialOrderEntryCancelAllowed;
	/** <i>Generated variable</i> - Variable of <code>OrderCancelConfig.orderCancelAllowed</code> attribute defined at extension <code> */
	private boolean _orderCancelAllowed;
	/** <i>Generated variable</i> - Variable of <code>OrderCancelConfig.completeCancelAfterShippingStartedAllowed</code> attribute defined at extension <code> */
	private boolean _completeCancelAfterShippingStartedAllowed;
	/** <i>Generated variable</i> - Variable of <code>OrderCancelConfig.partialCancelAllowed</code> attribute defined at extension <code> */
	private boolean _partialCancelAllowed;
	/** <i>Generated variable</i> - Variable of <code>OrderCancelConfig.cancelAfterWarehouseAllowed</code> attribute defined at extension <code> */
	private boolean _cancelAfterWarehouseAllowed;
	/** <i>Generated variable</i> - Variable of <code>OrderCancelConfig.queuedOrderWaitingTime</code> attribute defined at extension <code> */
	private int _queuedOrderWaitingTime;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderCancelConfigDTO()
	{
		super();
	}
	
	
	public int getQueuedOrderWaitingTime()
	{
		return this._queuedOrderWaitingTime;
	}
	
	public boolean isCancelAfterWarehouseAllowed()
	{
		return this._cancelAfterWarehouseAllowed;
	}
	
	public boolean isCompleteCancelAfterShippingStartedAllowed()
	{
		return this._completeCancelAfterShippingStartedAllowed;
	}
	
	public boolean isOrderCancelAllowed()
	{
		return this._orderCancelAllowed;
	}
	
	public boolean isPartialCancelAllowed()
	{
		return this._partialCancelAllowed;
	}
	
	public boolean isPartialOrderEntryCancelAllowed()
	{
		return this._partialOrderEntryCancelAllowed;
	}
	
	public void setCancelAfterWarehouseAllowed(final boolean value)
	{
		this.modifiedPropsSet.add("cancelAfterWarehouseAllowed");
		this._cancelAfterWarehouseAllowed = value;
	}
	
	public void setCompleteCancelAfterShippingStartedAllowed(final boolean value)
	{
		this.modifiedPropsSet.add("completeCancelAfterShippingStartedAllowed");
		this._completeCancelAfterShippingStartedAllowed = value;
	}
	
	public void setOrderCancelAllowed(final boolean value)
	{
		this.modifiedPropsSet.add("orderCancelAllowed");
		this._orderCancelAllowed = value;
	}
	
	public void setPartialCancelAllowed(final boolean value)
	{
		this.modifiedPropsSet.add("partialCancelAllowed");
		this._partialCancelAllowed = value;
	}
	
	public void setPartialOrderEntryCancelAllowed(final boolean value)
	{
		this.modifiedPropsSet.add("partialOrderEntryCancelAllowed");
		this._partialOrderEntryCancelAllowed = value;
	}
	
	public void setQueuedOrderWaitingTime(final int value)
	{
		this.modifiedPropsSet.add("queuedOrderWaitingTime");
		this._queuedOrderWaitingTime = value;
	}
	
}
