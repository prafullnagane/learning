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

import de.hybris.platform.cockpit.dto.CockpitSavedSortCriterionDTO;
import de.hybris.platform.cockpit.dto.CockpitSavedSortCriterionsDTO;
import de.hybris.platform.cockpit.model.CockpitSavedSortCriterionModel;
import de.hybris.platform.cockpit.resource.CockpitSavedSortCriterionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CockpitSavedSortCriterion defined at extension cockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cockpitsavedsortcriterions")
public class CockpitSavedSortCriterionsResource extends AbstractCollectionResource <Collection<CockpitSavedSortCriterionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitSavedSortCriterionsResource()
	{
		super("CockpitSavedSortCriterion");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCockpitSavedSortCriterions()
	{
		return createGetResponse().build(CockpitSavedSortCriterionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CockpitSavedSortCriterionResource} for current root resource 
	 */
	@Path("{cockpitsavedsortcriterion}")
	public AbstractYResource getCockpitSavedSortCriterionResource(@PathParam("cockpitsavedsortcriterion")  final String resourceKey)
	{
		final CockpitSavedSortCriterionResource  resource  = resourceCtx.getResource(CockpitSavedSortCriterionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CockpitSavedSortCriterionModel> getCockpitSavedSortCriterionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCockpitSavedSortCriterion(final CockpitSavedSortCriterionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCockpitSavedSortCriterionsCollection(final Collection<CockpitSavedSortCriterionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
