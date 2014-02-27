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

import de.hybris.platform.ordersplitting.dto.WarehouseDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Warehouse first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "warehouses")
public class WarehousesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>WarehouseDTO*/
	private List<WarehouseDTO>  warehousesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WarehousesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WarehousesDTO(final List<WarehouseDTO> warehousesList)
	{
		super();
		this.warehousesList=warehousesList;
	}
	
	
	/**
	 * @return the warehouses
	 */
	@XmlElement(name = "warehouse")
	public List<WarehouseDTO> getWarehouses()
	{
		return	warehousesList;
	}
	
	/**
	 * @param warehousesList 
	 *  the warehousesList to set   
	 */
	public void setWarehouses(final List<WarehouseDTO> warehousesList)
	{
		this.warehousesList=warehousesList;
	}
	
}
