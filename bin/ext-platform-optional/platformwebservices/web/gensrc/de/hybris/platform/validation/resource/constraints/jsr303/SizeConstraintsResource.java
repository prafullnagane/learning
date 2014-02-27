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

import de.hybris.platform.validation.dto.constraints.jsr303.SizeConstraintsDTO;
import de.hybris.platform.validation.model.constraints.jsr303.SizeConstraintModel;
import de.hybris.platform.validation.resource.constraints.jsr303.SizeConstraintResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SizeConstraint defined at extension validation Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/sizeconstraints")
public class SizeConstraintsResource extends AbstractCollectionResource <Collection<SizeConstraintModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SizeConstraintsResource()
	{
		super("SizeConstraint");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSizeConstraints()
	{
		return createGetResponse().build(SizeConstraintsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SizeConstraintResource} for current root resource 
	 */
	@Path("{sizeconstraint}")
	public AbstractYResource getSizeConstraintResource(@PathParam("sizeconstraint")  final String resourceKey)
	{
		final SizeConstraintResource  resource  = resourceCtx.getResource(SizeConstraintResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SizeConstraintModel> getSizeConstraintsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSizeConstraintsCollection(final Collection<SizeConstraintModel> value)
	{
		super.setResourceValue(value);
	}
	
}
