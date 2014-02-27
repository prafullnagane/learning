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
package de.hybris.platform.orderprocessing.dto;

import de.hybris.platform.core.dto.order.OrderDTO;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.ordersplitting.dto.ConsignmentProcessDTO;
import de.hybris.platform.processengine.dto.BusinessProcessDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OrderProcess first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = OrderProcessModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "orderprocess")
public class OrderProcessDTO extends BusinessProcessDTO
{
	/** <i>Generated variable</i> - Variable of <code>OrderProcess.consignmentProcesses</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.ordersplitting.dto.ConsignmentProcessDTO> _consignmentProcesses;
	/** <i>Generated variable</i> - Variable of <code>OrderProcess.order</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.OrderDTO _order;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderProcessDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "consignmentProcesses")
	@XmlElement(name = "consignmentProcess")
	public Collection<ConsignmentProcessDTO> getConsignmentProcesses()
	{
		return this._consignmentProcesses;
	}
	
	public OrderDTO getOrder()
	{
		return this._order;
	}
	
	public void setConsignmentProcesses(final Collection<ConsignmentProcessDTO> value)
	{
		this.modifiedPropsSet.add("consignmentProcesses");
		this._consignmentProcesses = value;
	}
	
	public void setOrder(final OrderDTO value)
	{
		this.modifiedPropsSet.add("order");
		this._order = value;
	}
	
}
