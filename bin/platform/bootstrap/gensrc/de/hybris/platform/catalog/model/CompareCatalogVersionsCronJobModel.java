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
package de.hybris.platform.catalog.model;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type CompareCatalogVersionsCronJob first defined at extension catalog.
 */
@SuppressWarnings("all")
public class CompareCatalogVersionsCronJobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CompareCatalogVersionsCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>CompareCatalogVersionsCronJob.targetVersion</code> attribute defined at extension <code>catalog</code>. */
	public static final String TARGETVERSION = "targetVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>CompareCatalogVersionsCronJob.searchNewCategories</code> attribute defined at extension <code>catalog</code>. */
	public static final String SEARCHNEWCATEGORIES = "searchNewCategories";
	
	/** <i>Generated constant</i> - Attribute key of <code>CompareCatalogVersionsCronJob.searchMissingProducts</code> attribute defined at extension <code>catalog</code>. */
	public static final String SEARCHMISSINGPRODUCTS = "searchMissingProducts";
	
	/** <i>Generated constant</i> - Attribute key of <code>CompareCatalogVersionsCronJob.priceCompareCustomer</code> attribute defined at extension <code>catalog</code>. */
	public static final String PRICECOMPARECUSTOMER = "priceCompareCustomer";
	
	/** <i>Generated constant</i> - Attribute key of <code>CompareCatalogVersionsCronJob.searchPriceDifferences</code> attribute defined at extension <code>catalog</code>. */
	public static final String SEARCHPRICEDIFFERENCES = "searchPriceDifferences";
	
	/** <i>Generated constant</i> - Attribute key of <code>CompareCatalogVersionsCronJob.sourceVersion</code> attribute defined at extension <code>catalog</code>. */
	public static final String SOURCEVERSION = "sourceVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>CompareCatalogVersionsCronJob.missingProducts</code> attribute defined at extension <code>catalog</code>. */
	public static final String MISSINGPRODUCTS = "missingProducts";
	
	/** <i>Generated constant</i> - Attribute key of <code>CompareCatalogVersionsCronJob.processedItemsCount</code> attribute defined at extension <code>catalog</code>. */
	public static final String PROCESSEDITEMSCOUNT = "processedItemsCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>CompareCatalogVersionsCronJob.newProducts</code> attribute defined at extension <code>catalog</code>. */
	public static final String NEWPRODUCTS = "newProducts";
	
	/** <i>Generated constant</i> - Attribute key of <code>CompareCatalogVersionsCronJob.searchNewProducts</code> attribute defined at extension <code>catalog</code>. */
	public static final String SEARCHNEWPRODUCTS = "searchNewProducts";
	
	/** <i>Generated constant</i> - Attribute key of <code>CompareCatalogVersionsCronJob.searchMissingCategories</code> attribute defined at extension <code>catalog</code>. */
	public static final String SEARCHMISSINGCATEGORIES = "searchMissingCategories";
	
	/** <i>Generated constant</i> - Attribute key of <code>CompareCatalogVersionsCronJob.maxPriceTolerance</code> attribute defined at extension <code>catalog</code>. */
	public static final String MAXPRICETOLERANCE = "maxPriceTolerance";
	
	/** <i>Generated constant</i> - Attribute key of <code>CompareCatalogVersionsCronJob.overwriteProductApprovalStatus</code> attribute defined at extension <code>catalog</code>. */
	public static final String OVERWRITEPRODUCTAPPROVALSTATUS = "overwriteProductApprovalStatus";
	
	
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.targetVersion</code> attribute defined at extension <code>catalog</code>. */
	private CatalogVersionModel _targetVersion;
	
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.searchNewCategories</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _searchNewCategories;
	
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.searchMissingProducts</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _searchMissingProducts;
	
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.priceCompareCustomer</code> attribute defined at extension <code>catalog</code>. */
	private UserModel _priceCompareCustomer;
	
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.searchPriceDifferences</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _searchPriceDifferences;
	
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.sourceVersion</code> attribute defined at extension <code>catalog</code>. */
	private CatalogVersionModel _sourceVersion;
	
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.missingProducts</code> attribute defined at extension <code>catalog</code>. */
	private Integer _missingProducts;
	
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.processedItemsCount</code> attribute defined at extension <code>catalog</code>. */
	private Integer _processedItemsCount;
	
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.newProducts</code> attribute defined at extension <code>catalog</code>. */
	private Integer _newProducts;
	
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.searchNewProducts</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _searchNewProducts;
	
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.searchMissingCategories</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _searchMissingCategories;
	
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.maxPriceTolerance</code> attribute defined at extension <code>catalog</code>. */
	private Double _maxPriceTolerance;
	
	/** <i>Generated variable</i> - Variable of <code>CompareCatalogVersionsCronJob.overwriteProductApprovalStatus</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _overwriteProductApprovalStatus;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CompareCatalogVersionsCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CompareCatalogVersionsCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _missingProducts initial attribute declared by type <code>CompareCatalogVersionsCronJob</code> at extension <code>catalog</code>
	 * @param _newProducts initial attribute declared by type <code>CompareCatalogVersionsCronJob</code> at extension <code>catalog</code>
	 * @param _processedItemsCount initial attribute declared by type <code>CompareCatalogVersionsCronJob</code> at extension <code>catalog</code>
	 * @param _sourceVersion initial attribute declared by type <code>CompareCatalogVersionsCronJob</code> at extension <code>catalog</code>
	 * @param _targetVersion initial attribute declared by type <code>CompareCatalogVersionsCronJob</code> at extension <code>catalog</code>
	 */
	@Deprecated
	public CompareCatalogVersionsCronJobModel(final JobModel _job, final int _missingProducts, final int _newProducts, final int _processedItemsCount, final CatalogVersionModel _sourceVersion, final CatalogVersionModel _targetVersion)
	{
		super();
		setJob(_job);
		setMissingProducts(_missingProducts);
		setNewProducts(_newProducts);
		setProcessedItemsCount(_processedItemsCount);
		setSourceVersion(_sourceVersion);
		setTargetVersion(_targetVersion);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _missingProducts initial attribute declared by type <code>CompareCatalogVersionsCronJob</code> at extension <code>catalog</code>
	 * @param _newProducts initial attribute declared by type <code>CompareCatalogVersionsCronJob</code> at extension <code>catalog</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _processedItemsCount initial attribute declared by type <code>CompareCatalogVersionsCronJob</code> at extension <code>catalog</code>
	 * @param _sourceVersion initial attribute declared by type <code>CompareCatalogVersionsCronJob</code> at extension <code>catalog</code>
	 * @param _targetVersion initial attribute declared by type <code>CompareCatalogVersionsCronJob</code> at extension <code>catalog</code>
	 */
	@Deprecated
	public CompareCatalogVersionsCronJobModel(final JobModel _job, final int _missingProducts, final int _newProducts, final ItemModel _owner, final int _processedItemsCount, final CatalogVersionModel _sourceVersion, final CatalogVersionModel _targetVersion)
	{
		super();
		setJob(_job);
		setMissingProducts(_missingProducts);
		setNewProducts(_newProducts);
		setOwner(_owner);
		setProcessedItemsCount(_processedItemsCount);
		setSourceVersion(_sourceVersion);
		setTargetVersion(_targetVersion);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompareCatalogVersionsCronJob.maxPriceTolerance</code> attribute defined at extension <code>catalog</code>. 
	 * @return the maxPriceTolerance
	 */
	public Double getMaxPriceTolerance()
	{
		return _maxPriceTolerance = getPersistenceContext().getValue(MAXPRICETOLERANCE, _maxPriceTolerance);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompareCatalogVersionsCronJob.missingProducts</code> attribute defined at extension <code>catalog</code>. 
	 * @return the missingProducts
	 */
	public int getMissingProducts()
	{
		return toPrimitive( _missingProducts = getPersistenceContext().getValue(MISSINGPRODUCTS, _missingProducts));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompareCatalogVersionsCronJob.newProducts</code> attribute defined at extension <code>catalog</code>. 
	 * @return the newProducts
	 */
	public int getNewProducts()
	{
		return toPrimitive( _newProducts = getPersistenceContext().getValue(NEWPRODUCTS, _newProducts));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompareCatalogVersionsCronJob.overwriteProductApprovalStatus</code> attribute defined at extension <code>catalog</code>. 
	 * @return the overwriteProductApprovalStatus
	 */
	public Boolean getOverwriteProductApprovalStatus()
	{
		return _overwriteProductApprovalStatus = getPersistenceContext().getValue(OVERWRITEPRODUCTAPPROVALSTATUS, _overwriteProductApprovalStatus);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompareCatalogVersionsCronJob.priceCompareCustomer</code> attribute defined at extension <code>catalog</code>. 
	 * @return the priceCompareCustomer
	 */
	public UserModel getPriceCompareCustomer()
	{
		return _priceCompareCustomer = getPersistenceContext().getValue(PRICECOMPARECUSTOMER, _priceCompareCustomer);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompareCatalogVersionsCronJob.processedItemsCount</code> attribute defined at extension <code>catalog</code>. 
	 * @return the processedItemsCount
	 */
	public int getProcessedItemsCount()
	{
		return toPrimitive( _processedItemsCount = getPersistenceContext().getValue(PROCESSEDITEMSCOUNT, _processedItemsCount));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompareCatalogVersionsCronJob.searchMissingCategories</code> attribute defined at extension <code>catalog</code>. 
	 * @return the searchMissingCategories
	 */
	public Boolean getSearchMissingCategories()
	{
		return _searchMissingCategories = getPersistenceContext().getValue(SEARCHMISSINGCATEGORIES, _searchMissingCategories);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompareCatalogVersionsCronJob.searchMissingProducts</code> attribute defined at extension <code>catalog</code>. 
	 * @return the searchMissingProducts
	 */
	public Boolean getSearchMissingProducts()
	{
		return _searchMissingProducts = getPersistenceContext().getValue(SEARCHMISSINGPRODUCTS, _searchMissingProducts);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompareCatalogVersionsCronJob.searchNewCategories</code> attribute defined at extension <code>catalog</code>. 
	 * @return the searchNewCategories
	 */
	public Boolean getSearchNewCategories()
	{
		return _searchNewCategories = getPersistenceContext().getValue(SEARCHNEWCATEGORIES, _searchNewCategories);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompareCatalogVersionsCronJob.searchNewProducts</code> attribute defined at extension <code>catalog</code>. 
	 * @return the searchNewProducts
	 */
	public Boolean getSearchNewProducts()
	{
		return _searchNewProducts = getPersistenceContext().getValue(SEARCHNEWPRODUCTS, _searchNewProducts);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompareCatalogVersionsCronJob.searchPriceDifferences</code> attribute defined at extension <code>catalog</code>. 
	 * @return the searchPriceDifferences
	 */
	public Boolean getSearchPriceDifferences()
	{
		return _searchPriceDifferences = getPersistenceContext().getValue(SEARCHPRICEDIFFERENCES, _searchPriceDifferences);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompareCatalogVersionsCronJob.sourceVersion</code> attribute defined at extension <code>catalog</code>. 
	 * @return the sourceVersion
	 */
	public CatalogVersionModel getSourceVersion()
	{
		return _sourceVersion = getPersistenceContext().getValue(SOURCEVERSION, _sourceVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompareCatalogVersionsCronJob.targetVersion</code> attribute defined at extension <code>catalog</code>. 
	 * @return the targetVersion
	 */
	public CatalogVersionModel getTargetVersion()
	{
		return _targetVersion = getPersistenceContext().getValue(TARGETVERSION, _targetVersion);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CompareCatalogVersionsCronJob.maxPriceTolerance</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the maxPriceTolerance
	 */
	public void setMaxPriceTolerance(final Double value)
	{
		_maxPriceTolerance = getPersistenceContext().setValue(MAXPRICETOLERANCE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CompareCatalogVersionsCronJob.missingProducts</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the missingProducts
	 */
	public void setMissingProducts(final int value)
	{
		_missingProducts = getPersistenceContext().setValue(MISSINGPRODUCTS, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CompareCatalogVersionsCronJob.newProducts</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the newProducts
	 */
	public void setNewProducts(final int value)
	{
		_newProducts = getPersistenceContext().setValue(NEWPRODUCTS, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CompareCatalogVersionsCronJob.overwriteProductApprovalStatus</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the overwriteProductApprovalStatus
	 */
	public void setOverwriteProductApprovalStatus(final Boolean value)
	{
		_overwriteProductApprovalStatus = getPersistenceContext().setValue(OVERWRITEPRODUCTAPPROVALSTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CompareCatalogVersionsCronJob.priceCompareCustomer</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the priceCompareCustomer
	 */
	public void setPriceCompareCustomer(final UserModel value)
	{
		_priceCompareCustomer = getPersistenceContext().setValue(PRICECOMPARECUSTOMER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CompareCatalogVersionsCronJob.processedItemsCount</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the processedItemsCount
	 */
	public void setProcessedItemsCount(final int value)
	{
		_processedItemsCount = getPersistenceContext().setValue(PROCESSEDITEMSCOUNT, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CompareCatalogVersionsCronJob.searchMissingCategories</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the searchMissingCategories
	 */
	public void setSearchMissingCategories(final Boolean value)
	{
		_searchMissingCategories = getPersistenceContext().setValue(SEARCHMISSINGCATEGORIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CompareCatalogVersionsCronJob.searchMissingProducts</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the searchMissingProducts
	 */
	public void setSearchMissingProducts(final Boolean value)
	{
		_searchMissingProducts = getPersistenceContext().setValue(SEARCHMISSINGPRODUCTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CompareCatalogVersionsCronJob.searchNewCategories</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the searchNewCategories
	 */
	public void setSearchNewCategories(final Boolean value)
	{
		_searchNewCategories = getPersistenceContext().setValue(SEARCHNEWCATEGORIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CompareCatalogVersionsCronJob.searchNewProducts</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the searchNewProducts
	 */
	public void setSearchNewProducts(final Boolean value)
	{
		_searchNewProducts = getPersistenceContext().setValue(SEARCHNEWPRODUCTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CompareCatalogVersionsCronJob.searchPriceDifferences</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the searchPriceDifferences
	 */
	public void setSearchPriceDifferences(final Boolean value)
	{
		_searchPriceDifferences = getPersistenceContext().setValue(SEARCHPRICEDIFFERENCES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CompareCatalogVersionsCronJob.sourceVersion</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the sourceVersion
	 */
	public void setSourceVersion(final CatalogVersionModel value)
	{
		_sourceVersion = getPersistenceContext().setValue(SOURCEVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CompareCatalogVersionsCronJob.targetVersion</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the targetVersion
	 */
	public void setTargetVersion(final CatalogVersionModel value)
	{
		_targetVersion = getPersistenceContext().setValue(TARGETVERSION, value);
	}
	
}
