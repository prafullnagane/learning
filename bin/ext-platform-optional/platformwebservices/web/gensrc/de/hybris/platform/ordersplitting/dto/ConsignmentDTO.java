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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.order.AbstractOrderDTO;
import de.hybris.platform.core.dto.order.delivery.DeliveryModeDTO;
import de.hybris.platform.core.dto.user.AddressDTO;
import de.hybris.platform.ordersplitting.dto.ConsignmentEntryDTO;
import de.hybris.platform.ordersplitting.dto.ConsignmentProcessDTO;
import de.hybris.platform.ordersplitting.dto.WarehouseDTO;
import de.hybris.platform.ordersplitting.model.ConsignmentModel;
import de.hybris.platform.storelocator.dto.PointOfServiceDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Consignment first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = ConsignmentModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "consignment")
public class ConsignmentDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Consignment.shippingDate</code> attribute defined at extension <code> */
	private java.util.Date _shippingDate;
	/** <i>Generated variable</i> - Variable of <code>Consignment.carrier</code> attribute defined at extension <code> */
	private java.lang.String _carrier;
	/** <i>Generated variable</i> - Variable of <code>Consignment.warehouse</code> attribute defined at extension <code> */
	private de.hybris.platform.ordersplitting.dto.WarehouseDTO _warehouse;
	/** <i>Generated variable</i> - Variable of <code>Consignment.deliveryPointOfService</code> attribute defined at extension <code> */
	private de.hybris.platform.storelocator.dto.PointOfServiceDTO _deliveryPointOfService;
	/** <i>Generated variable</i> - Variable of <code>Consignment.statusDisplay</code> attribute defined at extension <code> */
	private java.lang.String _statusDisplay;
	/** <i>Generated variable</i> - Variable of <code>Consignment.status</code> attribute defined at extension <code> */
	private java.lang.String _status;
	/** <i>Generated variable</i> - Variable of <code>Consignment.consignmentProcesses</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.ordersplitting.dto.ConsignmentProcessDTO> _consignmentProcesses;
	/** <i>Generated variable</i> - Variable of <code>Consignment.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>Consignment.consignmentEntries</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.ordersplitting.dto.ConsignmentEntryDTO> _consignmentEntries;
	/** <i>Generated variable</i> - Variable of <code>Consignment.namedDeliveryDate</code> attribute defined at extension <code> */
	private java.util.Date _namedDeliveryDate;
	/** <i>Generated variable</i> - Variable of <code>Consignment.shippingAddress</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.AddressDTO _shippingAddress;
	/** <i>Generated variable</i> - Variable of <code>Consignment.trackingID</code> attribute defined at extension <code> */
	private java.lang.String _trackingID;
	/** <i>Generated variable</i> - Variable of <code>Consignment.order</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.AbstractOrderDTO _order;
	/** <i>Generated variable</i> - Variable of <code>Consignment.deliveryMode</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.delivery.DeliveryModeDTO _deliveryMode;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConsignmentDTO()
	{
		super();
	}
	
	
	public String getCarrier()
	{
		return this._carrier;
	}
	
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "consignmentEntries")
	@XmlElement(name = "consignmentEntry")
	public Set<ConsignmentEntryDTO> getConsignmentEntries()
	{
		return this._consignmentEntries;
	}
	
	@XmlElementWrapper(name = "consignmentProcesses")
	@XmlElement(name = "consignmentProcess")
	public Collection<ConsignmentProcessDTO> getConsignmentProcesses()
	{
		return this._consignmentProcesses;
	}
	
	public DeliveryModeDTO getDeliveryMode()
	{
		return this._deliveryMode;
	}
	
	public PointOfServiceDTO getDeliveryPointOfService()
	{
		return this._deliveryPointOfService;
	}
	
	public Date getNamedDeliveryDate()
	{
		return this._namedDeliveryDate;
	}
	
	public AbstractOrderDTO getOrder()
	{
		return this._order;
	}
	
	public AddressDTO getShippingAddress()
	{
		return this._shippingAddress;
	}
	
	public Date getShippingDate()
	{
		return this._shippingDate;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getStatus()
	{
		return this._status;
	}
	
	public String getStatusDisplay()
	{
		return this._statusDisplay;
	}
	
	public String getTrackingID()
	{
		return this._trackingID;
	}
	
	public WarehouseDTO getWarehouse()
	{
		return this._warehouse;
	}
	
	public void setCarrier(final String value)
	{
		this.modifiedPropsSet.add("carrier");
		this._carrier = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setConsignmentEntries(final Set<ConsignmentEntryDTO> value)
	{
		this.modifiedPropsSet.add("consignmentEntries");
		this._consignmentEntries = value;
	}
	
	public void setConsignmentProcesses(final Collection<ConsignmentProcessDTO> value)
	{
		this.modifiedPropsSet.add("consignmentProcesses");
		this._consignmentProcesses = value;
	}
	
	public void setDeliveryMode(final DeliveryModeDTO value)
	{
		this.modifiedPropsSet.add("deliveryMode");
		this._deliveryMode = value;
	}
	
	public void setDeliveryPointOfService(final PointOfServiceDTO value)
	{
		this.modifiedPropsSet.add("deliveryPointOfService");
		this._deliveryPointOfService = value;
	}
	
	public void setNamedDeliveryDate(final Date value)
	{
		this.modifiedPropsSet.add("namedDeliveryDate");
		this._namedDeliveryDate = value;
	}
	
	public void setOrder(final AbstractOrderDTO value)
	{
		this.modifiedPropsSet.add("order");
		this._order = value;
	}
	
	public void setShippingAddress(final AddressDTO value)
	{
		this.modifiedPropsSet.add("shippingAddress");
		this._shippingAddress = value;
	}
	
	public void setShippingDate(final Date value)
	{
		this.modifiedPropsSet.add("shippingDate");
		this._shippingDate = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setStatus(final String value)
	{
		this.modifiedPropsSet.add("status");
		this._status = value;
	}
	
	public void setStatusDisplay(final String value)
	{
		this.modifiedPropsSet.add("statusDisplay");
		this._statusDisplay = value;
	}
	
	public void setTrackingID(final String value)
	{
		this.modifiedPropsSet.add("trackingID");
		this._trackingID = value;
	}
	
	public void setWarehouse(final WarehouseDTO value)
	{
		this.modifiedPropsSet.add("warehouse");
		this._warehouse = value;
	}
	
}
