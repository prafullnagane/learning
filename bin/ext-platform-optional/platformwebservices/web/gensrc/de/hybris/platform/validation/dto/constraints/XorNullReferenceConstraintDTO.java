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
package de.hybris.platform.validation.dto.constraints;

import de.hybris.platform.validation.dto.constraints.TypeConstraintDTO;
import de.hybris.platform.validation.model.constraints.XorNullReferenceConstraintModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type XorNullReferenceConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@GraphNode(target = XorNullReferenceConstraintModel.class, factory = GenericNodeFactory.class, uidProperties="id")
@XmlRootElement(name = "xornullreferenceconstraint")
public class XorNullReferenceConstraintDTO extends TypeConstraintDTO
{
	/** <i>Generated variable</i> - Variable of <code>XorNullReferenceConstraint.secondFieldName</code> attribute defined at extension <code> */
	private java.lang.String _secondFieldName;
	/** <i>Generated variable</i> - Variable of <code>XorNullReferenceConstraint.firstFieldName</code> attribute defined at extension <code> */
	private java.lang.String _firstFieldName;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public XorNullReferenceConstraintDTO()
	{
		super();
	}
	
	
	public String getFirstFieldName()
	{
		return this._firstFieldName;
	}
	
	public String getSecondFieldName()
	{
		return this._secondFieldName;
	}
	
	public void setFirstFieldName(final String value)
	{
		this.modifiedPropsSet.add("firstFieldName");
		this._firstFieldName = value;
	}
	
	public void setSecondFieldName(final String value)
	{
		this.modifiedPropsSet.add("secondFieldName");
		this._secondFieldName = value;
	}
	
}
