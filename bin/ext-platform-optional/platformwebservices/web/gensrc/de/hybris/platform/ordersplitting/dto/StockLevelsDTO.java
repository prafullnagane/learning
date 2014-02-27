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

import de.hybris.platform.ordersplitting.dto.StockLevelDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type StockLevel first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "stocklevels")
public class StockLevelsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>StockLevelDTO*/
	private List<StockLevelDTO>  stocklevelsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StockLevelsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StockLevelsDTO(final List<StockLevelDTO> stocklevelsList)
	{
		super();
		this.stocklevelsList=stocklevelsList;
	}
	
	
	/**
	 * @return the stocklevels
	 */
	@XmlElement(name = "stocklevel")
	public List<StockLevelDTO> getStockLevels()
	{
		return	stocklevelsList;
	}
	
	/**
	 * @param stocklevelsList 
	 *  the stocklevelsList to set   
	 */
	public void setStockLevels(final List<StockLevelDTO> stocklevelsList)
	{
		this.stocklevelsList=stocklevelsList;
	}
	
}
