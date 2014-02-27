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
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.ordersplitting.dto.WarehouseDTO;
import de.hybris.platform.ordersplitting.model.StockLevelModel;
import de.hybris.platform.stock.dto.StockLevelHistoryEntryDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type StockLevel first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = StockLevelModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "stocklevel")
public class StockLevelDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>StockLevel.releaseDate</code> attribute defined at extension <code> */
	private java.util.Date _releaseDate;
	/** <i>Generated variable</i> - Variable of <code>StockLevel.maxStockLevelHistoryCount</code> attribute defined at extension <code> */
	private int _maxStockLevelHistoryCount;
	/** <i>Generated variable</i> - Variable of <code>StockLevel.nextDeliveryTime</code> attribute defined at extension <code> */
	private java.util.Date _nextDeliveryTime;
	/** <i>Generated variable</i> - Variable of <code>StockLevel.warehouse</code> attribute defined at extension <code> */
	private de.hybris.platform.ordersplitting.dto.WarehouseDTO _warehouse;
	/** <i>Generated variable</i> - Variable of <code>StockLevel.treatNegativeAsZero</code> attribute defined at extension <code> */
	private boolean _treatNegativeAsZero;
	/** <i>Generated variable</i> - Variable of <code>StockLevel.products</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.product.ProductDTO> _products;
	/** <i>Generated variable</i> - Variable of <code>StockLevel.preOrder</code> attribute defined at extension <code> */
	private int _preOrder;
	/** <i>Generated variable</i> - Variable of <code>StockLevel.productCode</code> attribute defined at extension <code> */
	private java.lang.String _productCode;
	/** <i>Generated variable</i> - Variable of <code>StockLevel.overSelling</code> attribute defined at extension <code> */
	private int _overSelling;
	/** <i>Generated variable</i> - Variable of <code>StockLevel.reserved</code> attribute defined at extension <code> */
	private int _reserved;
	/** <i>Generated variable</i> - Variable of <code>StockLevel.product</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _product;
	/** <i>Generated variable</i> - Variable of <code>StockLevel.inStockStatus</code> attribute defined at extension <code> */
	private java.lang.String _inStockStatus;
	/** <i>Generated variable</i> - Variable of <code>StockLevel.stockLevelHistoryEntries</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.stock.dto.StockLevelHistoryEntryDTO> _stockLevelHistoryEntries;
	/** <i>Generated variable</i> - Variable of <code>StockLevel.available</code> attribute defined at extension <code> */
	private int _available;
	/** <i>Generated variable</i> - Variable of <code>StockLevel.maxPreOrder</code> attribute defined at extension <code> */
	private int _maxPreOrder;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StockLevelDTO()
	{
		super();
	}
	
	
	public int getAvailable()
	{
		return this._available;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getInStockStatus()
	{
		return this._inStockStatus;
	}
	
	public int getMaxPreOrder()
	{
		return this._maxPreOrder;
	}
	
	public int getMaxStockLevelHistoryCount()
	{
		return this._maxStockLevelHistoryCount;
	}
	
	public Date getNextDeliveryTime()
	{
		return this._nextDeliveryTime;
	}
	
	public int getOverSelling()
	{
		return this._overSelling;
	}
	
	public int getPreOrder()
	{
		return this._preOrder;
	}
	
	public ProductDTO getProduct()
	{
		return this._product;
	}
	
	public String getProductCode()
	{
		return this._productCode;
	}
	
	@XmlElementWrapper(name = "products")
	@XmlElement(name = "product")
	public Collection<ProductDTO> getProducts()
	{
		return this._products;
	}
	
	public Date getReleaseDate()
	{
		return this._releaseDate;
	}
	
	public int getReserved()
	{
		return this._reserved;
	}
	
	@XmlElementWrapper(name = "stockLevelHistoryEntries")
	@XmlElement(name = "stockLevelHistoryEntry")
	public List<StockLevelHistoryEntryDTO> getStockLevelHistoryEntries()
	{
		return this._stockLevelHistoryEntries;
	}
	
	public WarehouseDTO getWarehouse()
	{
		return this._warehouse;
	}
	
	public boolean isTreatNegativeAsZero()
	{
		return this._treatNegativeAsZero;
	}
	
	public void setAvailable(final int value)
	{
		this.modifiedPropsSet.add("available");
		this._available = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setInStockStatus(final String value)
	{
		this.modifiedPropsSet.add("inStockStatus");
		this._inStockStatus = value;
	}
	
	public void setMaxPreOrder(final int value)
	{
		this.modifiedPropsSet.add("maxPreOrder");
		this._maxPreOrder = value;
	}
	
	public void setMaxStockLevelHistoryCount(final int value)
	{
		this.modifiedPropsSet.add("maxStockLevelHistoryCount");
		this._maxStockLevelHistoryCount = value;
	}
	
	public void setNextDeliveryTime(final Date value)
	{
		this.modifiedPropsSet.add("nextDeliveryTime");
		this._nextDeliveryTime = value;
	}
	
	public void setOverSelling(final int value)
	{
		this.modifiedPropsSet.add("overSelling");
		this._overSelling = value;
	}
	
	public void setPreOrder(final int value)
	{
		this.modifiedPropsSet.add("preOrder");
		this._preOrder = value;
	}
	
	public void setProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("product");
		this._product = value;
	}
	
	public void setProductCode(final String value)
	{
		this.modifiedPropsSet.add("productCode");
		this._productCode = value;
	}
	
	public void setProducts(final Collection<ProductDTO> value)
	{
		this.modifiedPropsSet.add("products");
		this._products = value;
	}
	
	public void setReleaseDate(final Date value)
	{
		this.modifiedPropsSet.add("releaseDate");
		this._releaseDate = value;
	}
	
	public void setReserved(final int value)
	{
		this.modifiedPropsSet.add("reserved");
		this._reserved = value;
	}
	
	public void setStockLevelHistoryEntries(final List<StockLevelHistoryEntryDTO> value)
	{
		this.modifiedPropsSet.add("stockLevelHistoryEntries");
		this._stockLevelHistoryEntries = value;
	}
	
	public void setTreatNegativeAsZero(final boolean value)
	{
		this.modifiedPropsSet.add("treatNegativeAsZero");
		this._treatNegativeAsZero = value;
	}
	
	public void setWarehouse(final WarehouseDTO value)
	{
		this.modifiedPropsSet.add("warehouse");
		this._warehouse = value;
	}
	
}
