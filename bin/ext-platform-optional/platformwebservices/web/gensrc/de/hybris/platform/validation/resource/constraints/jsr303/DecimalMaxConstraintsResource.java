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

import de.hybris.platform.validation.dto.constraints.jsr303.DecimalMaxConstraintsDTO;
import de.hybris.platform.validation.model.constraints.jsr303.DecimalMaxConstraintModel;
import de.hybris.platform.validation.resource.constraints.jsr303.DecimalMaxConstraintResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type DecimalMaxConstraint defined at extension validation Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/decimalmaxconstraints")
public class DecimalMaxConstraintsResource extends AbstractCollectionResource <Collection<DecimalMaxConstraintModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DecimalMaxConstraintsResource()
	{
		super("DecimalMaxConstraint");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllDecimalMaxConstraints()
	{
		return createGetResponse().build(DecimalMaxConstraintsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link DecimalMaxConstraintResource} for current root resource 
	 */
	@Path("{decimalmaxconstraint}")
	public AbstractYResource getDecimalMaxConstraintResource(@PathParam("decimalmaxconstraint")  final String resourceKey)
	{
		final DecimalMaxConstraintResource  resource  = resourceCtx.getResource(DecimalMaxConstraintResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<DecimalMaxConstraintModel> getDecimalMaxConstraintsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setDecimalMaxConstraintsCollection(final Collection<DecimalMaxConstraintModel> value)
	{
		super.setResourceValue(value);
	}
	
}
