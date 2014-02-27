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

import de.hybris.platform.btg.dto.BTGAbstractOrderOperandDTO;
import de.hybris.platform.btg.model.BTGNumberOfOrdersOperandModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGNumberOfOrdersOperand first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGNumberOfOrdersOperandModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "btgnumberofordersoperand")
public class BTGNumberOfOrdersOperandDTO extends BTGAbstractOrderOperandDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGNumberOfOrdersOperand.to</code> attribute defined at extension <code> */
	private java.util.Date _to;
	/** <i>Generated variable</i> - Variable of <code>BTGNumberOfOrdersOperand.from</code> attribute defined at extension <code> */
	private java.util.Date _from;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGNumberOfOrdersOperandDTO()
	{
		super();
	}
	
	
	public Date getFrom()
	{
		return this._from;
	}
	
	public Date getTo()
	{
		return this._to;
	}
	
	public void setFrom(final Date value)
	{
		this.modifiedPropsSet.add("from");
		this._from = value;
	}
	
	public void setTo(final Date value)
	{
		this.modifiedPropsSet.add("to");
		this._to = value;
	}
	
}
