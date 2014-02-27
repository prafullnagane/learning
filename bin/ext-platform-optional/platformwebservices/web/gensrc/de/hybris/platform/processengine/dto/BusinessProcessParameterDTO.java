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
package de.hybris.platform.processengine.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.processengine.dto.BusinessProcessDTO;
import de.hybris.platform.processengine.model.BusinessProcessParameterModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BusinessProcessParameter first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = BusinessProcessParameterModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "businessprocessparameter")
public class BusinessProcessParameterDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>BusinessProcessParameter.value</code> attribute defined at extension <code> */
	private java.lang.Object _value;
	/** <i>Generated variable</i> - Variable of <code>BusinessProcessParameter.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>BusinessProcessParameter.process</code> attribute defined at extension <code> */
	private de.hybris.platform.processengine.dto.BusinessProcessDTO _process;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BusinessProcessParameterDTO()
	{
		super();
	}
	
	
	public String getName()
	{
		return this._name;
	}
	
	public BusinessProcessDTO getProcess()
	{
		return this._process;
	}
	
	public Object getValue()
	{
		return this._value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setProcess(final BusinessProcessDTO value)
	{
		this.modifiedPropsSet.add("process");
		this._process = value;
	}
	
	public void setValue(final Object value)
	{
		this.modifiedPropsSet.add("value");
		this._value = value;
	}
	
}
