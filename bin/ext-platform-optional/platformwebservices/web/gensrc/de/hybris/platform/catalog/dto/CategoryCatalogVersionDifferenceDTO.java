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

import de.hybris.platform.catalog.dto.CatalogVersionDifferenceDTO;
import de.hybris.platform.catalog.model.CategoryCatalogVersionDifferenceModel;
import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CategoryCatalogVersionDifference first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = CategoryCatalogVersionDifferenceModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "categorycatalogversiondifference")
public class CategoryCatalogVersionDifferenceDTO extends CatalogVersionDifferenceDTO
{
	/** <i>Generated variable</i> - Variable of <code>CategoryCatalogVersionDifference.sourceCategory</code> attribute defined at extension <code> */
	private de.hybris.platform.category.dto.CategoryDTO _sourceCategory;
	/** <i>Generated variable</i> - Variable of <code>CategoryCatalogVersionDifference.targetCategory</code> attribute defined at extension <code> */
	private de.hybris.platform.category.dto.CategoryDTO _targetCategory;
	/** <i>Generated variable</i> - Variable of <code>CategoryCatalogVersionDifference.mode</code> attribute defined at extension <code> */
	private java.lang.String _mode;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CategoryCatalogVersionDifferenceDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getMode()
	{
		return this._mode;
	}
	
	public CategoryDTO getSourceCategory()
	{
		return this._sourceCategory;
	}
	
	public CategoryDTO getTargetCategory()
	{
		return this._targetCategory;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setMode(final String value)
	{
		this.modifiedPropsSet.add("mode");
		this._mode = value;
	}
	
	public void setSourceCategory(final CategoryDTO value)
	{
		this.modifiedPropsSet.add("sourceCategory");
		this._sourceCategory = value;
	}
	
	public void setTargetCategory(final CategoryDTO value)
	{
		this.modifiedPropsSet.add("targetCategory");
		this._targetCategory = value;
	}
	
}
