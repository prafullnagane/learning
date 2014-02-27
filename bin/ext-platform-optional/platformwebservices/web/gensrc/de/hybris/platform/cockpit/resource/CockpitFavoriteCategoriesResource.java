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
package de.hybris.platform.cockpit.resource;

import de.hybris.platform.cockpit.dto.CockpitFavoriteCategoriesDTO;
import de.hybris.platform.cockpit.model.CockpitFavoriteCategoryModel;
import de.hybris.platform.cockpit.resource.CockpitFavoriteCategoryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CockpitFavoriteCategory defined at extension cockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cockpitfavoritecategories")
public class CockpitFavoriteCategoriesResource extends AbstractCollectionResource <Collection<CockpitFavoriteCategoryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitFavoriteCategoriesResource()
	{
		super("CockpitFavoriteCategory");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCockpitFavoriteCategories()
	{
		return createGetResponse().build(CockpitFavoriteCategoriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CockpitFavoriteCategoryModel> getCockpitFavoriteCategoriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CockpitFavoriteCategoryResource} for current root resource 
	 */
	@Path("{cockpitfavoritecategory}")
	public AbstractYResource getCockpitFavoriteCategoryResource(@PathParam("cockpitfavoritecategory")  final String resourceKey)
	{
		final CockpitFavoriteCategoryResource  resource  = resourceCtx.getResource(CockpitFavoriteCategoryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCockpitFavoriteCategoriesCollection(final Collection<CockpitFavoriteCategoryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
