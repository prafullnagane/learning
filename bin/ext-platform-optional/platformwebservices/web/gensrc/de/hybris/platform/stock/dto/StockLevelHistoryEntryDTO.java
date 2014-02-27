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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.ordersplitting.dto.StockLevelDTO;
import de.hybris.platform.stock.model.StockLevelHistoryEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type StockLevelHistoryEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = StockLevelHistoryEntryModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "stocklevelhistoryentry")
public class StockLevelHistoryEntryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>StockLevelHistoryEntry.actual</code> attribute defined at extension <code> */
	private int _actual;
	/** <i>Generated variable</i> - Variable of <code>StockLevelHistoryEntry.stockLevel</code> attribute defined at extension <code> */
	private de.hybris.platform.ordersplitting.dto.StockLevelDTO _stockLevel;
	/** <i>Generated variable</i> - Variable of <code>StockLevelHistoryEntry.reserved</code> attribute defined at extension <code> */
	private int _reserved;
	/** <i>Generated variable</i> - Variable of <code>StockLevelHistoryEntry.comment</code> attribute defined at extension <code> */
	private java.lang.String _comment;
	/** <i>Generated variable</i> - Variable of <code>StockLevelHistoryEntry.updateDate</code> attribute defined at extension <code> */
	private java.util.Date _updateDate;
	/** <i>Generated variable</i> - Variable of <code>StockLevelHistoryEntry.updateType</code> attribute defined at extension <code> */
	private java.lang.String _updateType;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StockLevelHistoryEntryDTO()
	{
		super();
	}
	
	
	public int getActual()
	{
		return this._actual;
	}
	
	public String getComment()
	{
		return this._comment;
	}
	
	public int getReserved()
	{
		return this._reserved;
	}
	
	public StockLevelDTO getStockLevel()
	{
		return this._stockLevel;
	}
	
	public Date getUpdateDate()
	{
		return this._updateDate;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getUpdateType()
	{
		return this._updateType;
	}
	
	public void setActual(final int value)
	{
		this.modifiedPropsSet.add("actual");
		this._actual = value;
	}
	
	public void setComment(final String value)
	{
		this.modifiedPropsSet.add("comment");
		this._comment = value;
	}
	
	public void setReserved(final int value)
	{
		this.modifiedPropsSet.add("reserved");
		this._reserved = value;
	}
	
	public void setStockLevel(final StockLevelDTO value)
	{
		this.modifiedPropsSet.add("stockLevel");
		this._stockLevel = value;
	}
	
	public void setUpdateDate(final Date value)
	{
		this.modifiedPropsSet.add("updateDate");
		this._updateDate = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setUpdateType(final String value)
	{
		this.modifiedPropsSet.add("updateType");
		this._updateType = value;
	}
	
}
