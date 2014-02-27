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
import de.hybris.platform.ordersplitting.dto.ConsignmentDTO;
import de.hybris.platform.ordersplitting.dto.StockLevelDTO;
import de.hybris.platform.ordersplitting.dto.VendorDTO;
import de.hybris.platform.ordersplitting.model.WarehouseModel;
import de.hybris.platform.store.BaseStoreDTO;
import de.hybris.platform.storelocator.dto.PointOfServiceDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Warehouse first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = WarehouseModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "warehouse")
public class WarehouseDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Warehouse.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>Warehouse.default</code> attribute defined at extension <code> */
	private java.lang.Boolean _default;
	/** <i>Generated variable</i> - Variable of <code>Warehouse.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>Warehouse.stockLevels</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.ordersplitting.dto.StockLevelDTO> _stockLevels;
	/** <i>Generated variable</i> - Variable of <code>Warehouse.baseStores</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.store.BaseStoreDTO> _baseStores;
	/** <i>Generated variable</i> - Variable of <code>Warehouse.consignments</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.ordersplitting.dto.ConsignmentDTO> _consignments;
	/** <i>Generated variable</i> - Variable of <code>Warehouse.vendor</code> attribute defined at extension <code> */
	private de.hybris.platform.ordersplitting.dto.VendorDTO _vendor;
	/** <i>Generated variable</i> - Variable of <code>Warehouse.pointsOfService</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.storelocator.dto.PointOfServiceDTO> _pointsOfService;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WarehouseDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "baseStores")
	@XmlElement(name = "baseStore")
	public Collection<BaseStoreDTO> getBaseStores()
	{
		return this._baseStores;
	}
	
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "consignments")
	@XmlElement(name = "consignment")
	public Set<ConsignmentDTO> getConsignments()
	{
		return this._consignments;
	}
	
	public Boolean getDefault()
	{
		return this._default;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	@XmlElementWrapper(name = "pointsOfService")
	@XmlElement(name = "pointOfService")
	public Collection<PointOfServiceDTO> getPointsOfService()
	{
		return this._pointsOfService;
	}
	
	@XmlElementWrapper(name = "stockLevels")
	@XmlElement(name = "stockLevel")
	public Set<StockLevelDTO> getStockLevels()
	{
		return this._stockLevels;
	}
	
	public VendorDTO getVendor()
	{
		return this._vendor;
	}
	
	public void setBaseStores(final Collection<BaseStoreDTO> value)
	{
		this.modifiedPropsSet.add("baseStores");
		this._baseStores = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setConsignments(final Set<ConsignmentDTO> value)
	{
		this.modifiedPropsSet.add("consignments");
		this._consignments = value;
	}
	
	public void setDefault(final Boolean value)
	{
		this.modifiedPropsSet.add("default");
		this._default = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setPointsOfService(final Collection<PointOfServiceDTO> value)
	{
		this.modifiedPropsSet.add("pointsOfService");
		this._pointsOfService = value;
	}
	
	public void setStockLevels(final Set<StockLevelDTO> value)
	{
		this.modifiedPropsSet.add("stockLevels");
		this._stockLevels = value;
	}
	
	public void setVendor(final VendorDTO value)
	{
		this.modifiedPropsSet.add("vendor");
		this._vendor = value;
	}
	
}
