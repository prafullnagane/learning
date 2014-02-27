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
package de.hybris.platform.core.resource.type;

import de.hybris.platform.core.dto.type.SearchRestrictionsDTO;
import de.hybris.platform.core.model.type.SearchRestrictionModel;
import de.hybris.platform.core.resource.type.SearchRestrictionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SearchRestriction defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/searchrestrictions")
public class SearchRestrictionsResource extends AbstractCollectionResource <Collection<SearchRestrictionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SearchRestrictionsResource()
	{
		super("SearchRestriction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSearchRestrictions()
	{
		return createGetResponse().build(SearchRestrictionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SearchRestrictionResource} for current root resource 
	 */
	@Path("{searchrestriction}")
	public AbstractYResource getSearchRestrictionResource(@PathParam("searchrestriction")  final String resourceKey)
	{
		final SearchRestrictionResource  resource  = resourceCtx.getResource(SearchRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SearchRestrictionModel> getSearchRestrictionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSearchRestrictionsCollection(final Collection<SearchRestrictionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
