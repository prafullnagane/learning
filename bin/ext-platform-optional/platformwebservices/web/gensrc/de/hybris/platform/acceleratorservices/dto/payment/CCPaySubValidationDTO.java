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
package de.hybris.platform.acceleratorservices.dto.payment;

import de.hybris.platform.acceleratorservices.model.payment.CCPaySubValidationModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CCPaySubValidation first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@GraphNode(target = CCPaySubValidationModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "ccpaysubvalidation")
public class CCPaySubValidationDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CCPaySubValidation.subscriptionId</code> attribute defined at extension <code> */
	private java.lang.String _subscriptionId;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CCPaySubValidationDTO()
	{
		super();
	}
	
	
	public String getSubscriptionId()
	{
		return this._subscriptionId;
	}
	
	public void setSubscriptionId(final String value)
	{
		this.modifiedPropsSet.add("subscriptionId");
		this._subscriptionId = value;
	}
	
}
