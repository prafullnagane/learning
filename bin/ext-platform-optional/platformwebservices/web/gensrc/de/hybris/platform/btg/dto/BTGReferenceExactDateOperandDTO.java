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
package de.hybris.platform.btg.dto;

import de.hybris.platform.btg.dto.BTGAbstractReferenceOperandDTO;
import de.hybris.platform.btg.model.BTGReferenceExactDateOperandModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGReferenceExactDateOperand first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGReferenceExactDateOperandModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "btgreferenceexactdateoperand")
public class BTGReferenceExactDateOperandDTO extends BTGAbstractReferenceOperandDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGReferenceExactDateOperand.referenceDate</code> attribute defined at extension <code> */
	private java.util.Date _referenceDate;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceExactDateOperandDTO()
	{
		super();
	}
	
	
	public Date getReferenceDate()
	{
		return this._referenceDate;
	}
	
	public void setReferenceDate(final Date value)
	{
		this.modifiedPropsSet.add("referenceDate");
		this._referenceDate = value;
	}
	
}
