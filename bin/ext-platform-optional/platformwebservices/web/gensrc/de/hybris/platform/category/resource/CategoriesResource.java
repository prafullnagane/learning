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
package de.hybris.platform.category.resource;

import de.hybris.platform.category.dto.CategoriesDTO;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.category.resource.CategoryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Category defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/categories")
public class CategoriesResource extends AbstractCollectionResource <Collection<CategoryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CategoriesResource()
	{
		super("Category");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCategories()
	{
		return createGetResponse().build(CategoriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CategoryModel> getCategoriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CategoryResource} for current root resource 
	 */
	@Path("{category}")
	public AbstractYResource getCategoryResource(@PathParam("category")  final String resourceKey)
	{
		final CategoryResource  resource  = resourceCtx.getResource(CategoryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCategoriesCollection(final Collection<CategoryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
