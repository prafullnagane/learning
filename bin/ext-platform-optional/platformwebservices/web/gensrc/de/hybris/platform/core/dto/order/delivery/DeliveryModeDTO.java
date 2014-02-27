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
package de.hybris.platform.core.dto.order.delivery;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.order.payment.PaymentModeDTO;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type DeliveryMode first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = DeliveryModeModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "deliverymode")
public class DeliveryModeDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>DeliveryMode.supportedPaymentModes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.order.payment.PaymentModeDTO> _supportedPaymentModes;
	/** <i>Generated variable</i> - Variable of <code>DeliveryMode.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>DeliveryMode.active</code> attribute defined at extension <code> */
	private java.lang.Boolean _active;
	/** <i>Generated variable</i> - Variable of <code>DeliveryMode.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>DeliveryMode.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DeliveryModeDTO()
	{
		super();
	}
	
	
	public Boolean getActive()
	{
		return this._active;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	@XmlElementWrapper(name = "supportedPaymentModes")
	@XmlElement(name = "paymentMode")
	public Collection<PaymentModeDTO> getSupportedPaymentModes()
	{
		return this._supportedPaymentModes;
	}
	
	public void setActive(final Boolean value)
	{
		this.modifiedPropsSet.add("active");
		this._active = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setSupportedPaymentModes(final Collection<PaymentModeDTO> value)
	{
		this.modifiedPropsSet.add("supportedPaymentModes");
		this._supportedPaymentModes = value;
	}
	
}
