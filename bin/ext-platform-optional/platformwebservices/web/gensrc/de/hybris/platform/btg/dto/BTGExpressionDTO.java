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

import de.hybris.platform.btg.dto.BTGConditionDTO;
import de.hybris.platform.btg.dto.BTGOperandDTO;
import de.hybris.platform.btg.dto.BTGOperatorDTO;
import de.hybris.platform.btg.model.BTGExpressionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGExpression first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGExpressionModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "btgexpression")
public class BTGExpressionDTO extends BTGConditionDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGExpression.leftOperand</code> attribute defined at extension <code> */
	private de.hybris.platform.btg.dto.BTGOperandDTO _leftOperand;
	/** <i>Generated variable</i> - Variable of <code>BTGExpression.rightOperand</code> attribute defined at extension <code> */
	private de.hybris.platform.btg.dto.BTGOperandDTO _rightOperand;
	/** <i>Generated variable</i> - Variable of <code>BTGExpression.operator</code> attribute defined at extension <code> */
	private de.hybris.platform.btg.dto.BTGOperatorDTO _operator;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGExpressionDTO()
	{
		super();
	}
	
	
	public BTGOperandDTO getLeftOperand()
	{
		return this._leftOperand;
	}
	
	public BTGOperatorDTO getOperator()
	{
		return this._operator;
	}
	
	public BTGOperandDTO getRightOperand()
	{
		return this._rightOperand;
	}
	
	public void setLeftOperand(final BTGOperandDTO value)
	{
		this.modifiedPropsSet.add("leftOperand");
		this._leftOperand = value;
	}
	
	public void setOperator(final BTGOperatorDTO value)
	{
		this.modifiedPropsSet.add("operator");
		this._operator = value;
	}
	
	public void setRightOperand(final BTGOperandDTO value)
	{
		this.modifiedPropsSet.add("rightOperand");
		this._rightOperand = value;
	}
	
}
