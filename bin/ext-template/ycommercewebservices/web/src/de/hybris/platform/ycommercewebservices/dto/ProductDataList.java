/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package de.hybris.platform.ycommercewebservices.dto;

import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.List;


/**
 * Product data list wrapper.
 */
public class ProductDataList
{
	private List<ProductData> products = null;
	private int totalProductCount;
	private int totalPageCount;
	private int currentPage;
	private String catalog;
	private String version;

	/**
	 * @return the products
	 */
	public List<ProductData> getProducts()
	{
		return products;
	}

	/**
	 * @param products
	 *           the products to set
	 */
	public void setProducts(final List<ProductData> products)
	{
		this.products = products;
	}

	/**
	 * @return the totalProductCount
	 */
	public int getTotalProductCount()
	{
		return totalProductCount;
	}

	/**
	 * @param totalProductCount
	 *           the totalProductCount to set
	 */
	public void setTotalProductCount(final int totalProductCount)
	{
		this.totalProductCount = totalProductCount;
	}

	/**
	 * @return the totalPageCount
	 */
	public int getTotalPageCount()
	{
		return totalPageCount;
	}

	/**
	 * @param totalPageCount
	 *           the totalPageCount to set
	 */
	public void setTotalPageCount(final int totalPageCount)
	{
		this.totalPageCount = totalPageCount;
	}

	/**
	 * @return the currentPage
	 */
	public int getCurrentPage()
	{
		return currentPage;
	}

	/**
	 * @param currentPage
	 *           the currentPage to set
	 */
	public void setCurrentPage(final int currentPage)
	{
		this.currentPage = currentPage;
	}

	/**
	 * @return the catalog
	 */
	public String getCatalog()
	{
		return catalog;
	}

	/**
	 * @param catalog
	 *           the catalog to set
	 */
	public void setCatalog(final String catalog)
	{
		this.catalog = catalog;
	}

	/**
	 * @return the version
	 */
	public String getVersion()
	{
		return version;
	}

	/**
	 * @param version
	 *           the version to set
	 */
	public void setVersion(final String version)
	{
		this.version = version;
	}

}
