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

import de.hybris.platform.validation.dto.constraints.HybrisDecimalMinConstraintsDTO;
import de.hybris.platform.validation.model.constraints.HybrisDecimalMinConstraintModel;
import de.hybris.platform.validation.resource.constraints.HybrisDecimalMinConstraintResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type HybrisDecimalMinConstraint defined at extension validation Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/hybrisdecimalminconstraints")
public class HybrisDecimalMinConstraintsResource extends AbstractCollectionResource <Collection<HybrisDecimalMinConstraintModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public HybrisDecimalMinConstraintsResource()
	{
		super("HybrisDecimalMinConstraint");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllHybrisDecimalMinConstraints()
	{
		return createGetResponse().build(HybrisDecimalMinConstraintsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link HybrisDecimalMinConstraintResource} for current root resource 
	 */
	@Path("{hybrisdecimalminconstraint}")
	public AbstractYResource getHybrisDecimalMinConstraintResource(@PathParam("hybrisdecimalminconstraint")  final String resourceKey)
	{
		final HybrisDecimalMinConstraintResource  resource  = resourceCtx.getResource(HybrisDecimalMinConstraintResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<HybrisDecimalMinConstraintModel> getHybrisDecimalMinConstraintsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setHybrisDecimalMinConstraintsCollection(final Collection<HybrisDecimalMinConstraintModel> value)
	{
		super.setResourceValue(value);
	}
	
}
