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

import de.hybris.platform.acceleratorcms.dto.components.SubCategoryListComponentsDTO;
import de.hybris.platform.acceleratorcms.model.components.SubCategoryListComponentModel;
import de.hybris.platform.acceleratorcms.resource.components.SubCategoryListComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SubCategoryListComponent defined at extension acceleratorcms Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/subcategorylistcomponents")
public class SubCategoryListComponentsResource extends AbstractCollectionResource <Collection<SubCategoryListComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SubCategoryListComponentsResource()
	{
		super("SubCategoryListComponent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSubCategoryListComponents()
	{
		return createGetResponse().build(SubCategoryListComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SubCategoryListComponentResource} for current root resource 
	 */
	@Path("{subcategorylistcomponent}")
	public AbstractYResource getSubCategoryListComponentResource(@PathParam("subcategorylistcomponent")  final String resourceKey)
	{
		final SubCategoryListComponentResource  resource  = resourceCtx.getResource(SubCategoryListComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SubCategoryListComponentModel> getSubCategoryListComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSubCategoryListComponentsCollection(final Collection<SubCategoryListComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
