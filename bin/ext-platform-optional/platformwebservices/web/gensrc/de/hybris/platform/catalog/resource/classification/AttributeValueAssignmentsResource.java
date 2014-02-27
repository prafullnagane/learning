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
package de.hybris.platform.catalog.resource.classification;

import de.hybris.platform.catalog.dto.classification.AttributeValueAssignmentDTO;
import de.hybris.platform.catalog.dto.classification.AttributeValueAssignmentsDTO;
import de.hybris.platform.catalog.model.classification.AttributeValueAssignmentModel;
import de.hybris.platform.catalog.resource.classification.AttributeValueAssignmentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AttributeValueAssignment defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/attributevalueassignments")
public class AttributeValueAssignmentsResource extends AbstractCollectionResource <Collection<AttributeValueAssignmentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AttributeValueAssignmentsResource()
	{
		super("AttributeValueAssignment");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAttributeValueAssignments()
	{
		return createGetResponse().build(AttributeValueAssignmentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AttributeValueAssignmentResource} for current root resource 
	 */
	@Path("{attributevalueassignment}")
	public AbstractYResource getAttributeValueAssignmentResource(@PathParam("attributevalueassignment")  final String resourceKey)
	{
		final AttributeValueAssignmentResource  resource  = resourceCtx.getResource(AttributeValueAssignmentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AttributeValueAssignmentModel> getAttributeValueAssignmentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postAttributeValueAssignment(final AttributeValueAssignmentDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAttributeValueAssignmentsCollection(final Collection<AttributeValueAssignmentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
