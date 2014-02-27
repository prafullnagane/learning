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
package de.hybris.platform.catalog.dto;

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.catalog.model.CompareCatalogVersionsCronJobModel;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CompareCatalogVersionsCronJob first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = CompareCatalogVersionsCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "comparecatalogversionscronjob")
public class CompareCatalogVersionsCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.targetVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _targetVersion;
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.searchNewCategories</code> attribute defined at extension <code> */
	private java.lang.Boolean _searchNewCategories;
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.searchMissingProducts</code> attribute defined at extension <code> */
	private java.lang.Boolean _searchMissingProducts;
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.sourceVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _sourceVersion;
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.overwriteProductApprovalStatus</code> attribute defined at extension <code> */
	private java.lang.Boolean _overwriteProductApprovalStatus;
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.priceCompareCustomer</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _priceCompareCustomer;
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.searchPriceDifferences</code> attribute defined at extension <code> */
	private java.lang.Boolean _searchPriceDifferences;
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.missingProducts</code> attribute defined at extension <code> */
	private int _missingProducts;
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.processedItemsCount</code> attribute defined at extension <code> */
	private int _processedItemsCount;
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.newProducts</code> attribute defined at extension <code> */
	private int _newProducts;
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.searchNewProducts</code> attribute defined at extension <code> */
	private java.lang.Boolean _searchNewProducts;
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.searchMissingCategories</code> attribute defined at extension <code> */
	private java.lang.Boolean _searchMissingCategories;
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.maxPriceTolerance</code> attribute defined at extension <code> */
	private java.lang.Double _maxPriceTolerance;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompareCatalogVersionsCronJobDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public Double getMaxPriceTolerance()
	{
		return this._maxPriceTolerance;
	}
	
	public int getMissingProducts()
	{
		return this._missingProducts;
	}
	
	public int getNewProducts()
	{
		return this._newProducts;
	}
	
	public Boolean getOverwriteProductApprovalStatus()
	{
		return this._overwriteProductApprovalStatus;
	}
	
	public UserDTO getPriceCompareCustomer()
	{
		return this._priceCompareCustomer;
	}
	
	public int getProcessedItemsCount()
	{
		return this._processedItemsCount;
	}
	
	public Boolean getSearchMissingCategories()
	{
		return this._searchMissingCategories;
	}
	
	public Boolean getSearchMissingProducts()
	{
		return this._searchMissingProducts;
	}
	
	public Boolean getSearchNewCategories()
	{
		return this._searchNewCategories;
	}
	
	public Boolean getSearchNewProducts()
	{
		return this._searchNewProducts;
	}
	
	public Boolean getSearchPriceDifferences()
	{
		return this._searchPriceDifferences;
	}
	
	public CatalogVersionDTO getSourceVersion()
	{
		return this._sourceVersion;
	}
	
	public CatalogVersionDTO getTargetVersion()
	{
		return this._targetVersion;
	}
	
	public void setMaxPriceTolerance(final Double value)
	{
		this.modifiedPropsSet.add("maxPriceTolerance");
		this._maxPriceTolerance = value;
	}
	
	public void setMissingProducts(final int value)
	{
		this.modifiedPropsSet.add("missingProducts");
		this._missingProducts = value;
	}
	
	public void setNewProducts(final int value)
	{
		this.modifiedPropsSet.add("newProducts");
		this._newProducts = value;
	}
	
	public void setOverwriteProductApprovalStatus(final Boolean value)
	{
		this.modifiedPropsSet.add("overwriteProductApprovalStatus");
		this._overwriteProductApprovalStatus = value;
	}
	
	public void setPriceCompareCustomer(final UserDTO value)
	{
		this.modifiedPropsSet.add("priceCompareCustomer");
		this._priceCompareCustomer = value;
	}
	
	public void setProcessedItemsCount(final int value)
	{
		this.modifiedPropsSet.add("processedItemsCount");
		this._processedItemsCount = value;
	}
	
	public void setSearchMissingCategories(final Boolean value)
	{
		this.modifiedPropsSet.add("searchMissingCategories");
		this._searchMissingCategories = value;
	}
	
	public void setSearchMissingProducts(final Boolean value)
	{
		this.modifiedPropsSet.add("searchMissingProducts");
		this._searchMissingProducts = value;
	}
	
	public void setSearchNewCategories(final Boolean value)
	{
		this.modifiedPropsSet.add("searchNewCategories");
		this._searchNewCategories = value;
	}
	
	public void setSearchNewProducts(final Boolean value)
	{
		this.modifiedPropsSet.add("searchNewProducts");
		this._searchNewProducts = value;
	}
	
	public void setSearchPriceDifferences(final Boolean value)
	{
		this.modifiedPropsSet.add("searchPriceDifferences");
		this._searchPriceDifferences = value;
	}
	
	public void setSourceVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("sourceVersion");
		this._sourceVersion = value;
	}
	
	public void setTargetVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("targetVersion");
		this._targetVersion = value;
	}
	
}
