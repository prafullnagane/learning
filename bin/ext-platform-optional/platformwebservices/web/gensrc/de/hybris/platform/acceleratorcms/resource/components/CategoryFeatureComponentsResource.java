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
package de.hybris.platform.acceleratorcms.resource.components;

import de.hybris.platform.acceleratorcms.dto.components.CategoryFeatureComponentsDTO;
import de.hybris.platform.acceleratorcms.model.components.CategoryFeatureComponentModel;
import de.hybris.platform.acceleratorcms.resource.components.CategoryFeatureComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CategoryFeatureComponent defined at extension acceleratorcms Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/categoryfeaturecomponents")
public class CategoryFeatureComponentsResource extends AbstractCollectionResource <Collection<CategoryFeatureComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CategoryFeatureComponentsResource()
	{
		super("CategoryFeatureComponent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCategoryFeatureComponents()
	{
		return createGetResponse().build(CategoryFeatureComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CategoryFeatureComponentResource} for current root resource 
	 */
	@Path("{categoryfeaturecomponent}")
	public AbstractYResource getCategoryFeatureComponentResource(@PathParam("categoryfeaturecomponent")  final String resourceKey)
	{
		final CategoryFeatureComponentResource  resource  = resourceCtx.getResource(CategoryFeatureComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CategoryFeatureComponentModel> getCategoryFeatureComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCategoryFeatureComponentsCollection(final Collection<CategoryFeatureComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
