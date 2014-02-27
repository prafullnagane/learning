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
import de.hybris.platform.btg.model.BTGReferenceRegExpListOperandModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGReferenceRegExpListOperand first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGReferenceRegExpListOperandModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "btgreferenceregexplistoperand")
public class BTGReferenceRegExpListOperandDTO extends BTGAbstractReferenceOperandDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGReferenceRegExpListOperand.regularExpressions</code> attribute defined at extension <code> */
	private java.util.Collection<java.lang.String> _regularExpressions;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceRegExpListOperandDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "regularExpressions")
	@XmlElement(name = "value")
	public Collection<String> getRegularExpressions()
	{
		return this._regularExpressions;
	}
	
	public void setRegularExpressions(final Collection<String> value)
	{
		this.modifiedPropsSet.add("regularExpressions");
		this._regularExpressions = value;
	}
	
}
