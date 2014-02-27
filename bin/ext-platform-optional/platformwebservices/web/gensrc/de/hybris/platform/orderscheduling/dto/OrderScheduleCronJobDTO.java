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

import de.hybris.platform.core.dto.order.OrderDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.orderscheduling.model.OrderScheduleCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OrderScheduleCronJob first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = OrderScheduleCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "orderschedulecronjob")
public class OrderScheduleCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>OrderScheduleCronJob.order</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.OrderDTO _order;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderScheduleCronJobDTO()
	{
		super();
	}
	
	
	public OrderDTO getOrder()
	{
		return this._order;
	}
	
	public void setOrder(final OrderDTO value)
	{
		this.modifiedPropsSet.add("order");
		this._order = value;
	}
	
}
