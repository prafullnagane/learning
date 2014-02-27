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
package de.hybris.platform.commerceservices.dto;

import de.hybris.platform.commerceservices.model.PickUpDeliveryModeModel;
import de.hybris.platform.core.dto.order.delivery.DeliveryModeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PickUpDeliveryMode first defined at extension commerceservices
 */
@SuppressWarnings("all")
@GraphNode(target = PickUpDeliveryModeModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "pickupdeliverymode")
public class PickUpDeliveryModeDTO extends DeliveryModeDTO
{
	/** <i>Generated variable</i> - Variable of <code>PickUpDeliveryMode.supportedMode</code> attribute defined at extension <code> */
	private java.lang.String _supportedMode;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PickUpDeliveryModeDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getSupportedMode()
	{
		return this._supportedMode;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setSupportedMode(final String value)
	{
		this.modifiedPropsSet.add("supportedMode");
		this._supportedMode = value;
	}
	
}
