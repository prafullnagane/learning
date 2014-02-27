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
package de.hybris.platform.cms2lib.resource.components;

import de.hybris.platform.cms2lib.dto.components.BannerComponentsDTO;
import de.hybris.platform.cms2lib.model.components.BannerComponentModel;
import de.hybris.platform.cms2lib.resource.components.BannerComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BannerComponent defined at extension cms2lib Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/bannercomponents")
public class BannerComponentsResource extends AbstractCollectionResource <Collection<BannerComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BannerComponentsResource()
	{
		super("BannerComponent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBannerComponents()
	{
		return createGetResponse().build(BannerComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BannerComponentResource} for current root resource 
	 */
	@Path("{bannercomponent}")
	public AbstractYResource getBannerComponentResource(@PathParam("bannercomponent")  final String resourceKey)
	{
		final BannerComponentResource  resource  = resourceCtx.getResource(BannerComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BannerComponentModel> getBannerComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBannerComponentsCollection(final Collection<BannerComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
