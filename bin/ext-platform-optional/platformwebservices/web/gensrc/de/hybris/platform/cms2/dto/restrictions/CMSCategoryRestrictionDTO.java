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
package de.hybris.platform.cms2.dto.restrictions;

import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.cms2.dto.restrictions.AbstractRestrictionDTO;
import de.hybris.platform.cms2.model.restrictions.CMSCategoryRestrictionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CMSCategoryRestriction first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = CMSCategoryRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "cmscategoryrestriction")
public class CMSCategoryRestrictionDTO extends AbstractRestrictionDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSCategoryRestriction.recursive</code> attribute defined at extension <code> */
	private boolean _recursive;
	/** <i>Generated variable</i> - Variable of <code>CMSCategoryRestriction.categoryCodes</code> attribute defined at extension <code> */
	private java.util.List<java.lang.String> _categoryCodes;
	/** <i>Generated variable</i> - Variable of <code>CMSCategoryRestriction.categories</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.category.dto.CategoryDTO> _categories;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSCategoryRestrictionDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "categories")
	@XmlElement(name = "category")
	public Collection<CategoryDTO> getCategories()
	{
		return this._categories;
	}
	
	@XmlElementWrapper(name = "categoryCodes")
	@XmlElement(name = "value")
	public List<String> getCategoryCodes()
	{
		return this._categoryCodes;
	}
	
	public boolean isRecursive()
	{
		return this._recursive;
	}
	
	public void setCategories(final Collection<CategoryDTO> value)
	{
		this.modifiedPropsSet.add("categories");
		this._categories = value;
	}
	
	public void setCategoryCodes(final List<String> value)
	{
		this.modifiedPropsSet.add("categoryCodes");
		this._categoryCodes = value;
	}
	
	public void setRecursive(final boolean value)
	{
		this.modifiedPropsSet.add("recursive");
		this._recursive = value;
	}
	
}
