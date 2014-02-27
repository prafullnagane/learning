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

import de.hybris.platform.core.dto.order.delivery.DeliveryModeDTO;
import de.hybris.platform.deliveryzone.dto.ZoneDeliveryModeValueDTO;
import de.hybris.platform.deliveryzone.model.ZoneDeliveryModeModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ZoneDeliveryMode first defined at extension deliveryzone
 */
@SuppressWarnings("all")
@GraphNode(target = ZoneDeliveryModeModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "zonedeliverymode")
public class ZoneDeliveryModeDTO extends DeliveryModeDTO
{
	/** <i>Generated variable</i> - Variable of <code>ZoneDeliveryMode.values</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.deliveryzone.dto.ZoneDeliveryModeValueDTO> _values;
	/** <i>Generated variable</i> - Variable of <code>ZoneDeliveryMode.propertyName</code> attribute defined at extension <code> */
	private java.lang.String _propertyName;
	/** <i>Generated variable</i> - Variable of <code>ZoneDeliveryMode.net</code> attribute defined at extension <code> */
	private java.lang.Boolean _net;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ZoneDeliveryModeDTO()
	{
		super();
	}
	
	
	public Boolean getNet()
	{
		return this._net;
	}
	
	public String getPropertyName()
	{
		return this._propertyName;
	}
	
	@XmlElementWrapper(name = "values")
	@XmlElement(name = "zoneDeliveryModeValue")
	public Set<ZoneDeliveryModeValueDTO> getValues()
	{
		return this._values;
	}
	
	public void setNet(final Boolean value)
	{
		this.modifiedPropsSet.add("net");
		this._net = value;
	}
	
	public void setPropertyName(final String value)
	{
		this.modifiedPropsSet.add("propertyName");
		this._propertyName = value;
	}
	
	public void setValues(final Set<ZoneDeliveryModeValueDTO> value)
	{
		this.modifiedPropsSet.add("values");
		this._values = value;
	}
	
}
