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
package de.hybris.platform.core.dto.product;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Unit first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = UnitModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "unit")
public class UnitDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Unit.unitType</code> attribute defined at extension <code> */
	private java.lang.String _unitType;
	/** <i>Generated variable</i> - Variable of <code>Unit.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>Unit.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>Unit.conversion</code> attribute defined at extension <code> */
	private java.lang.Double _conversion;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UnitDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public Double getConversion()
	{
		return this._conversion;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public String getUnitType()
	{
		return this._unitType;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setConversion(final Double value)
	{
		this.modifiedPropsSet.add("conversion");
		this._conversion = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setUnitType(final String value)
	{
		this.modifiedPropsSet.add("unitType");
		this._unitType = value;
	}
	
}
