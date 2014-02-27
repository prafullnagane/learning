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
package de.hybris.platform.acceleratorcms.model.components;

import de.hybris.platform.acceleratorcms.model.components.ProductReferencesComponentModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type PurchasedProductReferencesComponent first defined at extension acceleratorcms.
 * <p>
 * Represents product references component that displays product references that can be filtered by purchased or from specified category.
 */
@SuppressWarnings("all")
public class PurchasedProductReferencesComponentModel extends ProductReferencesComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PurchasedProductReferencesComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>PurchasedProductReferencesComponent.category</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String CATEGORY = "category";
	
	/** <i>Generated constant</i> - Attribute key of <code>PurchasedProductReferencesComponent.filterPurchased</code> attribute defined at extension <code>acceleratorcms</code>. */
	public static final String FILTERPURCHASED = "filterPurchased";
	
	
	/** <i>Generated variable</i> - Variable of <code>PurchasedProductReferencesComponent.category</code> attribute defined at extension <code>acceleratorcms</code>. */
	private CategoryModel _category;
	
	/** <i>Generated variable</i> - Variable of <code>PurchasedProductReferencesComponent.filterPurchased</code> attribute defined at extension <code>acceleratorcms</code>. */
	private Boolean _filterPurchased;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PurchasedProductReferencesComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PurchasedProductReferencesComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _category initial attribute declared by type <code>PurchasedProductReferencesComponent</code> at extension <code>acceleratorcms</code>
	 * @param _maximumNumberProducts initial attribute declared by type <code>ProductReferencesComponent</code> at extension <code>acceleratorcms</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public PurchasedProductReferencesComponentModel(final CatalogVersionModel _catalogVersion, final CategoryModel _category, final Integer _maximumNumberProducts, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCategory(_category);
		setMaximumNumberProducts(_maximumNumberProducts);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _category initial attribute declared by type <code>PurchasedProductReferencesComponent</code> at extension <code>acceleratorcms</code>
	 * @param _maximumNumberProducts initial attribute declared by type <code>ProductReferencesComponent</code> at extension <code>acceleratorcms</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public PurchasedProductReferencesComponentModel(final CatalogVersionModel _catalogVersion, final CategoryModel _category, final Integer _maximumNumberProducts, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCategory(_category);
		setMaximumNumberProducts(_maximumNumberProducts);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PurchasedProductReferencesComponent.category</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the category - Category to filter displayed references with.
	 */
	public CategoryModel getCategory()
	{
		return _category = getPersistenceContext().getValue(CATEGORY, _category);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PurchasedProductReferencesComponent.filterPurchased</code> attribute defined at extension <code>acceleratorcms</code>. 
	 * @return the filterPurchased - Determines if only purchased products are displayed in the component.
	 */
	public boolean isFilterPurchased()
	{
		return toPrimitive( _filterPurchased = getPersistenceContext().getValue(FILTERPURCHASED, _filterPurchased));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PurchasedProductReferencesComponent.category</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the category - Category to filter displayed references with.
	 */
	public void setCategory(final CategoryModel value)
	{
		_category = getPersistenceContext().setValue(CATEGORY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PurchasedProductReferencesComponent.filterPurchased</code> attribute defined at extension <code>acceleratorcms</code>. 
	 *  
	 * @param value the filterPurchased - Determines if only purchased products are displayed in the component.
	 */
	public void setFilterPurchased(final boolean value)
	{
		_filterPurchased = getPersistenceContext().setValue(FILTERPURCHASED, toObject(value));
	}
	
}
