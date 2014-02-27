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
package de.hybris.platform.ordermodify.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.order.OrderDTO;
import de.hybris.platform.ordermodify.dto.OrderModificationRecordEntryDTO;
import de.hybris.platform.ordermodify.model.OrderModificationRecordModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OrderModificationRecord first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = OrderModificationRecordModel.class, factory = GenericNodeFactory.class, uidProperties="identifier")
@XmlRootElement(name = "ordermodificationrecord")
public class OrderModificationRecordDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecord.modificationRecordEntries</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.ordermodify.dto.OrderModificationRecordEntryDTO> _modificationRecordEntries;
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecord.inProgress</code> attribute defined at extension <code> */
	private boolean _inProgress;
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecord.identifier</code> attribute defined at extension <code> */
	private java.lang.String _identifier;
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecord.order</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.OrderDTO _order;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderModificationRecordDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getIdentifier()
	{
		return this._identifier;
	}
	
	@XmlElementWrapper(name = "modificationRecordEntries")
	@XmlElement(name = "orderModificationRecordEntry")
	public Collection<OrderModificationRecordEntryDTO> getModificationRecordEntries()
	{
		return this._modificationRecordEntries;
	}
	
	public OrderDTO getOrder()
	{
		return this._order;
	}
	
	public boolean isInProgress()
	{
		return this._inProgress;
	}
	
	public void setIdentifier(final String value)
	{
		this.modifiedPropsSet.add("identifier");
		this._identifier = value;
	}
	
	public void setInProgress(final boolean value)
	{
		this.modifiedPropsSet.add("inProgress");
		this._inProgress = value;
	}
	
	public void setModificationRecordEntries(final Collection<OrderModificationRecordEntryDTO> value)
	{
		this.modifiedPropsSet.add("modificationRecordEntries");
		this._modificationRecordEntries = value;
	}
	
	public void setOrder(final OrderDTO value)
	{
		this.modifiedPropsSet.add("order");
		this._order = value;
	}
	
}
