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
package de.hybris.platform.validation.resource.constraints.jsr303;

import de.hybris.platform.validation.dto.constraints.jsr303.PastConstraintsDTO;
import de.hybris.platform.validation.model.constraints.jsr303.PastConstraintModel;
import de.hybris.platform.validation.resource.constraints.jsr303.PastConstraintResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PastConstraint defined at extension validation Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/pastconstraints")
public class PastConstraintsResource extends AbstractCollectionResource <Collection<PastConstraintModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PastConstraintsResource()
	{
		super("PastConstraint");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPastConstraints()
	{
		return createGetResponse().build(PastConstraintsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PastConstraintResource} for current root resource 
	 */
	@Path("{pastconstraint}")
	public AbstractYResource getPastConstraintResource(@PathParam("pastconstraint")  final String resourceKey)
	{
		final PastConstraintResource  resource  = resourceCtx.getResource(PastConstraintResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PastConstraintModel> getPastConstraintsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPastConstraintsCollection(final Collection<PastConstraintModel> value)
	{
		super.setResourceValue(value);
	}
	
}
