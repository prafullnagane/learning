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
package de.hybris.platform.acceleratorcms.dto.components;

import de.hybris.platform.acceleratorcms.dto.components.ProductReferencesComponentDTO;
import de.hybris.platform.acceleratorcms.model.components.PurchasedProductReferencesComponentModel;
import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PurchasedProductReferencesComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@GraphNode(target = PurchasedProductReferencesComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "purchasedproductreferencescomponent")
public class PurchasedProductReferencesComponentDTO extends ProductReferencesComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>PurchasedProductReferencesComponent.category</code> attribute defined at extension <code> */
	private de.hybris.platform.category.dto.CategoryDTO _category;
	/** <i>Generated variable</i> - Variable of <code>PurchasedProductReferencesComponent.filterPurchased</code> attribute defined at extension <code> */
	private boolean _filterPurchased;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PurchasedProductReferencesComponentDTO()
	{
		super();
	}
	
	
	public CategoryDTO getCategory()
	{
		return this._category;
	}
	
	public boolean isFilterPurchased()
	{
		return this._filterPurchased;
	}
	
	public void setCategory(final CategoryDTO value)
	{
		this.modifiedPropsSet.add("category");
		this._category = value;
	}
	
	public void setFilterPurchased(final boolean value)
	{
		this.modifiedPropsSet.add("filterPurchased");
		this._filterPurchased = value;
	}
	
}
