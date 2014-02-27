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

import de.hybris.platform.catalog.dto.classification.ClassificationAttributeDTO;
import de.hybris.platform.catalog.model.classification.ClassificationAttributeModel;
import de.hybris.platform.catalog.resource.classification.AttributeValueAssignmentResource;
import de.hybris.platform.catalog.resource.classification.ClassAttributeAssignmentResource;
import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.hmc.resource.HMCHistoryEntryResource;
import de.hybris.platform.webservices.AbstractYResource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated resource class for type ClassificationAttribute first defined at extension catalog
 */
@SuppressWarnings("all")
public class ClassificationAttributeResource extends AbstractYResource<ClassificationAttributeModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationAttributeResource()
	{
		super("ClassificationAttribute");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteClassificationAttribute()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AttributeValueAssignmentResource} for current root resource 
	 */
	@Path("/attributevalueassignments/{attributevalueassignment}")
	public AbstractYResource getAttributeValueAssignmentResource(@PathParam("attributevalueassignment")  final String resourceKey)
	{
		final AttributeValueAssignmentResource  resource  = resourceCtx.getResource(AttributeValueAssignmentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ClassAttributeAssignmentResource} for current root resource 
	 */
	@Path("/classattributeassignments/{classattributeassignment}")
	public AbstractYResource getClassAttributeAssignmentResource(@PathParam("classattributeassignment")  final String resourceKey)
	{
		final ClassAttributeAssignmentResource  resource  = resourceCtx.getResource(ClassAttributeAssignmentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getClassificationAttribute()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public ClassificationAttributeModel getClassificationAttributeModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link HMCHistoryEntryResource} for current root resource 
	 */
	@Path("/hmchistoryentries/{hmchistoryentry}")
	public AbstractYResource getHMCHistoryEntryResource(@PathParam("hmchistoryentry")  final String resourceKey)
	{
		final HMCHistoryEntryResource  resource  = resourceCtx.getResource(HMCHistoryEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LinkResource} for current root resource 
	 */
	@Path("/links/{link}")
	public AbstractYResource getLinkResource(@PathParam("link")  final String resourceKey)
	{
		final LinkResource  resource  = resourceCtx.getResource(LinkResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering PUT requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@PUT
	public Response putClassificationAttribute(final ClassificationAttributeDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link ClassificationAttributeModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected ClassificationAttributeModel readResource(final String resourceId) throws Exception
	{
		ClassificationAttributeModel model = new ClassificationAttributeModel();
		model.setCode(resourceId);
		return (ClassificationAttributeModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(ClassificationAttributeModel)}
	 */
	public void setClassificationAttributeModel(final ClassificationAttributeModel value)
	{
		super.setResourceValue(value);
	}
	
}
