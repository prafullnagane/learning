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
package de.hybris.platform.solrfacetsearch.model.redirect;

import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.redirect.SolrAbstractKeywordRedirectModel;

/**
 * Generated model class for type SolrCategoryRedirect first defined at extension solrfacetsearch.
 */
@SuppressWarnings("all")
public class SolrCategoryRedirectModel extends SolrAbstractKeywordRedirectModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SolrCategoryRedirect";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolrCategoryRedirect.redirectItem</code> attribute defined at extension <code>solrfacetsearch</code>. */
	public static final String REDIRECTITEM = "redirectItem";
	
	
	/** <i>Generated variable</i> - Variable of <code>SolrCategoryRedirect.redirectItem</code> attribute defined at extension <code>solrfacetsearch</code>. */
	private CategoryModel _redirectItem;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolrCategoryRedirectModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolrCategoryRedirectModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _redirectItem initial attribute declared by type <code>SolrCategoryRedirect</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrCategoryRedirectModel(final CategoryModel _redirectItem)
	{
		super();
		setRedirectItem(_redirectItem);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _redirectItem initial attribute declared by type <code>SolrCategoryRedirect</code> at extension <code>solrfacetsearch</code>
	 */
	@Deprecated
	public SolrCategoryRedirectModel(final ItemModel _owner, final CategoryModel _redirectItem)
	{
		super();
		setOwner(_owner);
		setRedirectItem(_redirectItem);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrCategoryRedirect.redirectItem</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 * @return the redirectItem
	 */
	public CategoryModel getRedirectItem()
	{
		return _redirectItem = getPersistenceContext().getValue(REDIRECTITEM, _redirectItem);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolrCategoryRedirect.redirectItem</code> attribute defined at extension <code>solrfacetsearch</code>. 
	 *  
	 * @param value the redirectItem
	 */
	public void setRedirectItem(final CategoryModel value)
	{
		_redirectItem = getPersistenceContext().setValue(REDIRECTITEM, value);
	}
	
}
