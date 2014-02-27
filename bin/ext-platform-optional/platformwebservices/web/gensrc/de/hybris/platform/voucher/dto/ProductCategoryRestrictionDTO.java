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
package de.hybris.platform.voucher.dto;

import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.voucher.dto.ProductRestrictionDTO;
import de.hybris.platform.voucher.model.ProductCategoryRestrictionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductCategoryRestriction first defined at extension voucher
 */
@SuppressWarnings("all")
@GraphNode(target = ProductCategoryRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "productcategoryrestriction")
public class ProductCategoryRestrictionDTO extends ProductRestrictionDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductCategoryRestriction.categories</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.category.dto.CategoryDTO> _categories;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductCategoryRestrictionDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "categories")
	@XmlElement(name = "category")
	public Collection<CategoryDTO> getCategories()
	{
		return this._categories;
	}
	
	public void setCategories(final Collection<CategoryDTO> value)
	{
		this.modifiedPropsSet.add("categories");
		this._categories = value;
	}
	
}
