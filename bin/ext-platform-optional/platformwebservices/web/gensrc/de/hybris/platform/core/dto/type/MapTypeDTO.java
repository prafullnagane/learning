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
package de.hybris.platform.core.dto.type;

import de.hybris.platform.core.dto.type.TypeDTO;
import de.hybris.platform.core.model.type.MapTypeModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type MapType first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = MapTypeModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "maptype")
public class MapTypeDTO extends TypeDTO
{
	/** <i>Generated variable</i> - Variable of <code>MapType.argumentType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.TypeDTO _argumentType;
	/** <i>Generated variable</i> - Variable of <code>MapType.returntype</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.TypeDTO _returntype;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MapTypeDTO()
	{
		super();
	}
	
	
	public TypeDTO getArgumentType()
	{
		return this._argumentType;
	}
	
	public TypeDTO getReturntype()
	{
		return this._returntype;
	}
	
	public void setArgumentType(final TypeDTO value)
	{
		this.modifiedPropsSet.add("argumentType");
		this._argumentType = value;
	}
	
	public void setReturntype(final TypeDTO value)
	{
		this.modifiedPropsSet.add("returntype");
		this._returntype = value;
	}
	
}
