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

import de.hybris.platform.validation.dto.constraints.TypeConstraintsDTO;
import de.hybris.platform.validation.model.constraints.TypeConstraintModel;
import de.hybris.platform.validation.resource.constraints.TypeConstraintResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type TypeConstraint defined at extension validation Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/typeconstraints")
public class TypeConstraintsResource extends AbstractCollectionResource <Collection<TypeConstraintModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypeConstraintsResource()
	{
		super("TypeConstraint");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllTypeConstraints()
	{
		return createGetResponse().build(TypeConstraintsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link TypeConstraintResource} for current root resource 
	 */
	@Path("{typeconstraint}")
	public AbstractYResource getTypeConstraintResource(@PathParam("typeconstraint")  final String resourceKey)
	{
		final TypeConstraintResource  resource  = resourceCtx.getResource(TypeConstraintResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<TypeConstraintModel> getTypeConstraintsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setTypeConstraintsCollection(final Collection<TypeConstraintModel> value)
	{
		super.setResourceValue(value);
	}
	
}
