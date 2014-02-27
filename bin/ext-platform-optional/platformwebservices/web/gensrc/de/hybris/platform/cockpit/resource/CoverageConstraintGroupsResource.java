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

import de.hybris.platform.cockpit.dto.CoverageConstraintGroupsDTO;
import de.hybris.platform.cockpit.model.CoverageConstraintGroupModel;
import de.hybris.platform.cockpit.resource.CoverageConstraintGroupResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CoverageConstraintGroup defined at extension validation Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/coverageconstraintgroups")
public class CoverageConstraintGroupsResource extends AbstractCollectionResource <Collection<CoverageConstraintGroupModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CoverageConstraintGroupsResource()
	{
		super("CoverageConstraintGroup");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCoverageConstraintGroups()
	{
		return createGetResponse().build(CoverageConstraintGroupsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CoverageConstraintGroupResource} for current root resource 
	 */
	@Path("{coverageconstraintgroup}")
	public AbstractYResource getCoverageConstraintGroupResource(@PathParam("coverageconstraintgroup")  final String resourceKey)
	{
		final CoverageConstraintGroupResource  resource  = resourceCtx.getResource(CoverageConstraintGroupResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CoverageConstraintGroupModel> getCoverageConstraintGroupsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCoverageConstraintGroupsCollection(final Collection<CoverageConstraintGroupModel> value)
	{
		super.setResourceValue(value);
	}
	
}
