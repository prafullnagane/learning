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
package de.hybris.platform.core.dto.order;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.order.AbstractOrderDTO;
import de.hybris.platform.core.dto.order.delivery.DeliveryModeDTO;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.core.dto.product.UnitDTO;
import de.hybris.platform.core.dto.user.AddressDTO;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.ordersplitting.dto.ConsignmentEntryDTO;
import de.hybris.platform.ordersplitting.dto.VendorDTO;
import de.hybris.platform.storelocator.dto.PointOfServiceDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Date;
import java.util.Set;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractOrderEntry first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractOrderEntryModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "abstractorderentry")
public class AbstractOrderEntryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.totalPrice</code> attribute defined at extension <code> */
	private java.lang.Double _totalPrice;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.quantity</code> attribute defined at extension <code> */
	private java.lang.Long _quantity;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.deliveryMode</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.delivery.DeliveryModeDTO _deliveryMode;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.info</code> attribute defined at extension <code> */
	private java.lang.String _info;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.quantityStatus</code> attribute defined at extension <code> */
	private java.lang.String _quantityStatus;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.calculated</code> attribute defined at extension <code> */
	private java.lang.Boolean _calculated;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.chosenVendor</code> attribute defined at extension <code> */
	private de.hybris.platform.ordersplitting.dto.VendorDTO _chosenVendor;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.namedDeliveryDate</code> attribute defined at extension <code> */
	private java.util.Date _namedDeliveryDate;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.giveAway</code> attribute defined at extension <code> */
	private java.lang.Boolean _giveAway;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.basePrice</code> attribute defined at extension <code> */
	private java.lang.Double _basePrice;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.product</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _product;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.unit</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.UnitDTO _unit;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.rejected</code> attribute defined at extension <code> */
	private java.lang.Boolean _rejected;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.order</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.AbstractOrderDTO _order;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.deliveryPointOfService</code> attribute defined at extension <code> */
	private de.hybris.platform.storelocator.dto.PointOfServiceDTO _deliveryPointOfService;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.consignmentEntries</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.ordersplitting.dto.ConsignmentEntryDTO> _consignmentEntries;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.deliveryAddress</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.AddressDTO _deliveryAddress;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.entryNumber</code> attribute defined at extension <code> */
	private java.lang.Integer _entryNumber;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractOrderEntryDTO()
	{
		super();
	}
	
	
	public Double getBasePrice()
	{
		return this._basePrice;
	}
	
	public Boolean getCalculated()
	{
		return this._calculated;
	}
	
	public VendorDTO getChosenVendor()
	{
		return this._chosenVendor;
	}
	
	@XmlElementWrapper(name = "consignmentEntries")
	@XmlElement(name = "consignmentEntry")
	public Set<ConsignmentEntryDTO> getConsignmentEntries()
	{
		return this._consignmentEntries;
	}
	
	public AddressDTO getDeliveryAddress()
	{
		return this._deliveryAddress;
	}
	
	public DeliveryModeDTO getDeliveryMode()
	{
		return this._deliveryMode;
	}
	
	public PointOfServiceDTO getDeliveryPointOfService()
	{
		return this._deliveryPointOfService;
	}
	
	@XmlAttribute
	public Integer getEntryNumber()
	{
		return this._entryNumber;
	}
	
	public Boolean getGiveAway()
	{
		return this._giveAway;
	}
	
	public String getInfo()
	{
		return this._info;
	}
	
	public Date getNamedDeliveryDate()
	{
		return this._namedDeliveryDate;
	}
	
	public AbstractOrderDTO getOrder()
	{
		return this._order;
	}
	
	public ProductDTO getProduct()
	{
		return this._product;
	}
	
	public Long getQuantity()
	{
		return this._quantity;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getQuantityStatus()
	{
		return this._quantityStatus;
	}
	
	public Boolean getRejected()
	{
		return this._rejected;
	}
	
	public Double getTotalPrice()
	{
		return this._totalPrice;
	}
	
	public UnitDTO getUnit()
	{
		return this._unit;
	}
	
	public void setBasePrice(final Double value)
	{
		this.modifiedPropsSet.add("basePrice");
		this._basePrice = value;
	}
	
	public void setCalculated(final Boolean value)
	{
		this.modifiedPropsSet.add("calculated");
		this._calculated = value;
	}
	
	public void setChosenVendor(final VendorDTO value)
	{
		this.modifiedPropsSet.add("chosenVendor");
		this._chosenVendor = value;
	}
	
	public void setConsignmentEntries(final Set<ConsignmentEntryDTO> value)
	{
		this.modifiedPropsSet.add("consignmentEntries");
		this._consignmentEntries = value;
	}
	
	public void setDeliveryAddress(final AddressDTO value)
	{
		this.modifiedPropsSet.add("deliveryAddress");
		this._deliveryAddress = value;
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
	
	public void setEntryNumber(final Integer value)
	{
		this.modifiedPropsSet.add("entryNumber");
		this._entryNumber = value;
	}
	
	public void setGiveAway(final Boolean value)
	{
		this.modifiedPropsSet.add("giveAway");
		this._giveAway = value;
	}
	
	public void setInfo(final String value)
	{
		this.modifiedPropsSet.add("info");
		this._info = value;
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
	
	public void setProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("product");
		this._product = value;
	}
	
	public void setQuantity(final Long value)
	{
		this.modifiedPropsSet.add("quantity");
		this._quantity = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setQuantityStatus(final String value)
	{
		this.modifiedPropsSet.add("quantityStatus");
		this._quantityStatus = value;
	}
	
	public void setRejected(final Boolean value)
	{
		this.modifiedPropsSet.add("rejected");
		this._rejected = value;
	}
	
	public void setTotalPrice(final Double value)
	{
		this.modifiedPropsSet.add("totalPrice");
		this._totalPrice = value;
	}
	
	public void setUnit(final UnitDTO value)
	{
		this.modifiedPropsSet.add("unit");
		this._unit = value;
	}
	
}
