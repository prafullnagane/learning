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
package de.hybris.platform.validation.resource.constraints;

import de.hybris.platform.validation.dto.constraints.AbstractConstraintsDTO;
import de.hybris.platform.validation.model.constraints.AbstractConstraintModel;
import de.hybris.platform.validation.resource.constraints.AbstractConstraintResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AbstractConstraint defined at extension validation Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/abstractconstraints")
public class AbstractConstraintsResource extends AbstractCollectionResource <Collection<AbstractConstraintModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractConstraintsResource()
	{
		super("AbstractConstraint");
	}
	
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractConstraintResource} for current root resource 
	 */
	@Path("{abstractconstraint}")
	public AbstractYResource getAbstractConstraintResource(@PathParam("abstractconstraint")  final String resourceKey)
	{
		final AbstractConstraintResource  resource  = resourceCtx.getResource(AbstractConstraintResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AbstractConstraintModel> getAbstractConstraintsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAbstractConstraints()
	{
		return createGetResponse().build(AbstractConstraintsDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAbstractConstraintsCollection(final Collection<AbstractConstraintModel> value)
	{
		super.setResourceValue(value);
	}
	
}
