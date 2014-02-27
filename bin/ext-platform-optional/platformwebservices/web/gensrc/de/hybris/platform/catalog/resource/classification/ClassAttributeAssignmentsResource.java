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

import de.hybris.platform.catalog.dto.classification.ClassAttributeAssignmentDTO;
import de.hybris.platform.catalog.dto.classification.ClassAttributeAssignmentsDTO;
import de.hybris.platform.catalog.model.classification.ClassAttributeAssignmentModel;
import de.hybris.platform.catalog.resource.classification.ClassAttributeAssignmentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ClassAttributeAssignment defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/classattributeassignments")
public class ClassAttributeAssignmentsResource extends AbstractCollectionResource <Collection<ClassAttributeAssignmentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassAttributeAssignmentsResource()
	{
		super("ClassAttributeAssignment");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllClassAttributeAssignments()
	{
		return createGetResponse().build(ClassAttributeAssignmentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ClassAttributeAssignmentResource} for current root resource 
	 */
	@Path("{classattributeassignment}")
	public AbstractYResource getClassAttributeAssignmentResource(@PathParam("classattributeassignment")  final String resourceKey)
	{
		final ClassAttributeAssignmentResource  resource  = resourceCtx.getResource(ClassAttributeAssignmentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ClassAttributeAssignmentModel> getClassAttributeAssignmentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postClassAttributeAssignment(final ClassAttributeAssignmentDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setClassAttributeAssignmentsCollection(final Collection<ClassAttributeAssignmentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
