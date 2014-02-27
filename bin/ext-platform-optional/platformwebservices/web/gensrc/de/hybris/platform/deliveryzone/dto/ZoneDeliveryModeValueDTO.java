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
package de.hybris.platform.deliveryzone.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.deliveryzone.dto.ZoneDTO;
import de.hybris.platform.deliveryzone.dto.ZoneDeliveryModeDTO;
import de.hybris.platform.deliveryzone.model.ZoneDeliveryModeValueModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ZoneDeliveryModeValue first defined at extension deliveryzone
 */
@SuppressWarnings("all")
@GraphNode(target = ZoneDeliveryModeValueModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "zonedeliverymodevalue")
public class ZoneDeliveryModeValueDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ZoneDeliveryModeValue.value</code> attribute defined at extension <code> */
	private java.lang.Double _value;
	/** <i>Generated variable</i> - Variable of <code>ZoneDeliveryModeValue.minimum</code> attribute defined at extension <code> */
	private java.lang.Double _minimum;
	/** <i>Generated variable</i> - Variable of <code>ZoneDeliveryModeValue.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	/** <i>Generated variable</i> - Variable of <code>ZoneDeliveryModeValue.deliveryMode</code> attribute defined at extension <code> */
	private de.hybris.platform.deliveryzone.dto.ZoneDeliveryModeDTO _deliveryMode;
	/** <i>Generated variable</i> - Variable of <code>ZoneDeliveryModeValue.zone</code> attribute defined at extension <code> */
	private de.hybris.platform.deliveryzone.dto.ZoneDTO _zone;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ZoneDeliveryModeValueDTO()
	{
		super();
	}
	
	
	public CurrencyDTO getCurrency()
	{
		return this._currency;
	}
	
	public ZoneDeliveryModeDTO getDeliveryMode()
	{
		return this._deliveryMode;
	}
	
	@XmlAttribute
	public Double getMinimum()
	{
		return this._minimum;
	}
	
	public Double getValue()
	{
		return this._value;
	}
	
	public ZoneDTO getZone()
	{
		return this._zone;
	}
	
	public void setCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("currency");
		this._currency = value;
	}
	
	public void setDeliveryMode(final ZoneDeliveryModeDTO value)
	{
		this.modifiedPropsSet.add("deliveryMode");
		this._deliveryMode = value;
	}
	
	public void setMinimum(final Double value)
	{
		this.modifiedPropsSet.add("minimum");
		this._minimum = value;
	}
	
	public void setValue(final Double value)
	{
		this.modifiedPropsSet.add("value");
		this._value = value;
	}
	
	public void setZone(final ZoneDTO value)
	{
		this.modifiedPropsSet.add("zone");
		this._zone = value;
	}
	
}
