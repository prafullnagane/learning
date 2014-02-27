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
package de.hybris.platform.stock.dto;

import de.hybris.platform.stock.dto.StockLevelHistoryEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type StockLevelHistoryEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "stocklevelhistoryentries")
public class StockLevelHistoryEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>StockLevelHistoryEntryDTO*/
	private List<StockLevelHistoryEntryDTO>  stocklevelhistoryentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StockLevelHistoryEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StockLevelHistoryEntriesDTO(final List<StockLevelHistoryEntryDTO> stocklevelhistoryentriesList)
	{
		super();
		this.stocklevelhistoryentriesList=stocklevelhistoryentriesList;
	}
	
	
	/**
	 * @return the stocklevelhistoryentries
	 */
	@XmlElement(name = "stocklevelhistoryentry")
	public List<StockLevelHistoryEntryDTO> getStockLevelHistoryEntries()
	{
		return	stocklevelhistoryentriesList;
	}
	
	/**
	 * @param stocklevelhistoryentriesList 
	 *  the stocklevelhistoryentriesList to set   
	 */
	public void setStockLevelHistoryEntries(final List<StockLevelHistoryEntryDTO> stocklevelhistoryentriesList)
	{
		this.stocklevelhistoryentriesList=stocklevelhistoryentriesList;
	}
	
}
