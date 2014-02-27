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

import de.hybris.platform.btg.dto.BTGAbstractLiteralOperandDTO;
import de.hybris.platform.btg.model.BTGStringLiteralOperandModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGStringLiteralOperand first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGStringLiteralOperandModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "btgstringliteraloperand")
public class BTGStringLiteralOperandDTO extends BTGAbstractLiteralOperandDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGStringLiteralOperand.literal</code> attribute defined at extension <code> */
	private java.lang.String _literal;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGStringLiteralOperandDTO()
	{
		super();
	}
	
	
	public String getLiteral()
	{
		return this._literal;
	}
	
	public void setLiteral(final String value)
	{
		this.modifiedPropsSet.add("literal");
		this._literal = value;
	}
	
}