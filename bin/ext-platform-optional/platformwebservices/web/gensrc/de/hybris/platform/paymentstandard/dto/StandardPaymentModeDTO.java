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
package de.hybris.platform.paymentstandard.dto;

import de.hybris.platform.core.dto.order.payment.PaymentModeDTO;
import de.hybris.platform.paymentstandard.dto.StandardPaymentModeValueDTO;
import de.hybris.platform.paymentstandard.model.StandardPaymentModeModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type StandardPaymentMode first defined at extension paymentstandard
 */
@SuppressWarnings("all")
@GraphNode(target = StandardPaymentModeModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "standardpaymentmode")
public class StandardPaymentModeDTO extends PaymentModeDTO
{
	/** <i>Generated variable</i> - Variable of <code>StandardPaymentMode.net</code> attribute defined at extension <code> */
	private java.lang.Boolean _net;
	/** <i>Generated variable</i> - Variable of <code>StandardPaymentMode.paymentModeValues</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.paymentstandard.dto.StandardPaymentModeValueDTO> _paymentModeValues;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StandardPaymentModeDTO()
	{
		super();
	}
	
	
	public Boolean getNet()
	{
		return this._net;
	}
	
	@XmlElementWrapper(name = "paymentModeValues")
	@XmlElement(name = "standardPaymentModeValue")
	public Collection<StandardPaymentModeValueDTO> getPaymentModeValues()
	{
		return this._paymentModeValues;
	}
	
	public void setNet(final Boolean value)
	{
		this.modifiedPropsSet.add("net");
		this._net = value;
	}
	
	public void setPaymentModeValues(final Collection<StandardPaymentModeValueDTO> value)
	{
		this.modifiedPropsSet.add("paymentModeValues");
		this._paymentModeValues = value;
	}
	
}
