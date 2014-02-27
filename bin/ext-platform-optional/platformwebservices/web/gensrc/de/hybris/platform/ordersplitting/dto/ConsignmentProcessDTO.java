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
package de.hybris.platform.ordersplitting.dto;

import de.hybris.platform.orderprocessing.dto.OrderProcessDTO;
import de.hybris.platform.ordersplitting.dto.ConsignmentDTO;
import de.hybris.platform.ordersplitting.model.ConsignmentProcessModel;
import de.hybris.platform.processengine.dto.BusinessProcessDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ConsignmentProcess first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = ConsignmentProcessModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "consignmentprocess")
public class ConsignmentProcessDTO extends BusinessProcessDTO
{
	/** <i>Generated variable</i> - Variable of <code>ConsignmentProcess.parentProcess</code> attribute defined at extension <code> */
	private de.hybris.platform.orderprocessing.dto.OrderProcessDTO _parentProcess;
	/** <i>Generated variable</i> - Variable of <code>ConsignmentProcess.waitingForConsignment</code> attribute defined at extension <code> */
	private boolean _waitingForConsignment;
	/** <i>Generated variable</i> - Variable of <code>ConsignmentProcess.consignment</code> attribute defined at extension <code> */
	private de.hybris.platform.ordersplitting.dto.ConsignmentDTO _consignment;
	/** <i>Generated variable</i> - Variable of <code>ConsignmentProcess.warehouseConsignmentState</code> attribute defined at extension <code> */
	private java.lang.String _warehouseConsignmentState;
	/** <i>Generated variable</i> - Variable of <code>ConsignmentProcess.done</code> attribute defined at extension <code> */
	private boolean _done;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConsignmentProcessDTO()
	{
		super();
	}
	
	
	public ConsignmentDTO getConsignment()
	{
		return this._consignment;
	}
	
	public OrderProcessDTO getParentProcess()
	{
		return this._parentProcess;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getWarehouseConsignmentState()
	{
		return this._warehouseConsignmentState;
	}
	
	public boolean isDone()
	{
		return this._done;
	}
	
	public boolean isWaitingForConsignment()
	{
		return this._waitingForConsignment;
	}
	
	public void setConsignment(final ConsignmentDTO value)
	{
		this.modifiedPropsSet.add("consignment");
		this._consignment = value;
	}
	
	public void setDone(final boolean value)
	{
		this.modifiedPropsSet.add("done");
		this._done = value;
	}
	
	public void setParentProcess(final OrderProcessDTO value)
	{
		this.modifiedPropsSet.add("parentProcess");
		this._parentProcess = value;
	}
	
	public void setWaitingForConsignment(final boolean value)
	{
		this.modifiedPropsSet.add("waitingForConsignment");
		this._waitingForConsignment = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setWarehouseConsignmentState(final String value)
	{
		this.modifiedPropsSet.add("warehouseConsignmentState");
		this._warehouseConsignmentState = value;
	}
	
}
