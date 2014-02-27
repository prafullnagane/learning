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
package de.hybris.platform.ordersplitting.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.ordersplitting.dto.WarehouseDTO;
import de.hybris.platform.ordersplitting.model.VendorModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Vendor first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = VendorModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "vendor")
public class VendorDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Vendor.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>Vendor.warehouses</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.ordersplitting.dto.WarehouseDTO> _warehouses;
	/** <i>Generated variable</i> - Variable of <code>Vendor.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VendorDTO()
	{
		super();
	}
	
	
	public String getCode()
	{
		return this._code;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	@XmlElementWrapper(name = "warehouses")
	@XmlElement(name = "warehouse")
	public Set<WarehouseDTO> getWarehouses()
	{
		return this._warehouses;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setWarehouses(final Set<WarehouseDTO> value)
	{
		this.modifiedPropsSet.add("warehouses");
		this._warehouses = value;
	}
	
}
