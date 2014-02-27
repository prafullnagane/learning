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

import de.hybris.platform.validation.dto.constraints.AttributeConstraintsDTO;
import de.hybris.platform.validation.model.constraints.AttributeConstraintModel;
import de.hybris.platform.validation.resource.constraints.AttributeConstraintResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AttributeConstraint defined at extension validation Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/attributeconstraints")
public class AttributeConstraintsResource extends AbstractCollectionResource <Collection<AttributeConstraintModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AttributeConstraintsResource()
	{
		super("AttributeConstraint");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAttributeConstraints()
	{
		return createGetResponse().build(AttributeConstraintsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AttributeConstraintResource} for current root resource 
	 */
	@Path("{attributeconstraint}")
	public AbstractYResource getAttributeConstraintResource(@PathParam("attributeconstraint")  final String resourceKey)
	{
		final AttributeConstraintResource  resource  = resourceCtx.getResource(AttributeConstraintResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AttributeConstraintModel> getAttributeConstraintsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAttributeConstraintsCollection(final Collection<AttributeConstraintModel> value)
	{
		super.setResourceValue(value);
	}
	
}
