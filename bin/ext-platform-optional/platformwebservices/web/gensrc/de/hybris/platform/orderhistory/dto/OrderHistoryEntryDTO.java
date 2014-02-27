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
package de.hybris.platform.orderhistory.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.dto.order.OrderDTO;
import de.hybris.platform.core.dto.user.EmployeeDTO;
import de.hybris.platform.orderhistory.model.OrderHistoryEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OrderHistoryEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = OrderHistoryEntryModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "orderhistoryentry")
public class OrderHistoryEntryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>OrderHistoryEntry.documents</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.core.dto.media.MediaDTO> _documents;
	/** <i>Generated variable</i> - Variable of <code>OrderHistoryEntry.order</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.OrderDTO _order;
	/** <i>Generated variable</i> - Variable of <code>OrderHistoryEntry.previousOrderVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.OrderDTO _previousOrderVersion;
	/** <i>Generated variable</i> - Variable of <code>OrderHistoryEntry.employee</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.EmployeeDTO _employee;
	/** <i>Generated variable</i> - Variable of <code>OrderHistoryEntry.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>OrderHistoryEntry.timestamp</code> attribute defined at extension <code> */
	private java.util.Date _timestamp;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderHistoryEntryDTO()
	{
		super();
	}
	
	
	public String getDescription()
	{
		return this._description;
	}
	
	@XmlElementWrapper(name = "documents")
	@XmlElement(name = "media")
	public Set<MediaDTO> getDocuments()
	{
		return this._documents;
	}
	
	public EmployeeDTO getEmployee()
	{
		return this._employee;
	}
	
	public OrderDTO getOrder()
	{
		return this._order;
	}
	
	public OrderDTO getPreviousOrderVersion()
	{
		return this._previousOrderVersion;
	}
	
	public Date getTimestamp()
	{
		return this._timestamp;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setDocuments(final Set<MediaDTO> value)
	{
		this.modifiedPropsSet.add("documents");
		this._documents = value;
	}
	
	public void setEmployee(final EmployeeDTO value)
	{
		this.modifiedPropsSet.add("employee");
		this._employee = value;
	}
	
	public void setOrder(final OrderDTO value)
	{
		this.modifiedPropsSet.add("order");
		this._order = value;
	}
	
	public void setPreviousOrderVersion(final OrderDTO value)
	{
		this.modifiedPropsSet.add("previousOrderVersion");
		this._previousOrderVersion = value;
	}
	
	public void setTimestamp(final Date value)
	{
		this.modifiedPropsSet.add("timestamp");
		this._timestamp = value;
	}
	
}
