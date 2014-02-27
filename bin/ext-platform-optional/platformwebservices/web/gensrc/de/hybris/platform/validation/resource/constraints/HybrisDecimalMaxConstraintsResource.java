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

import de.hybris.platform.validation.dto.constraints.HybrisDecimalMaxConstraintsDTO;
import de.hybris.platform.validation.model.constraints.HybrisDecimalMaxConstraintModel;
import de.hybris.platform.validation.resource.constraints.HybrisDecimalMaxConstraintResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type HybrisDecimalMaxConstraint defined at extension validation Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/hybrisdecimalmaxconstraints")
public class HybrisDecimalMaxConstraintsResource extends AbstractCollectionResource <Collection<HybrisDecimalMaxConstraintModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public HybrisDecimalMaxConstraintsResource()
	{
		super("HybrisDecimalMaxConstraint");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllHybrisDecimalMaxConstraints()
	{
		return createGetResponse().build(HybrisDecimalMaxConstraintsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link HybrisDecimalMaxConstraintResource} for current root resource 
	 */
	@Path("{hybrisdecimalmaxconstraint}")
	public AbstractYResource getHybrisDecimalMaxConstraintResource(@PathParam("hybrisdecimalmaxconstraint")  final String resourceKey)
	{
		final HybrisDecimalMaxConstraintResource  resource  = resourceCtx.getResource(HybrisDecimalMaxConstraintResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<HybrisDecimalMaxConstraintModel> getHybrisDecimalMaxConstraintsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setHybrisDecimalMaxConstraintsCollection(final Collection<HybrisDecimalMaxConstraintModel> value)
	{
		super.setResourceValue(value);
	}
	
}
