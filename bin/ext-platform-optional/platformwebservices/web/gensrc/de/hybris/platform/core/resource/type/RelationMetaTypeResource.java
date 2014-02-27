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
package de.hybris.platform.core.resource.type;

import de.hybris.platform.core.dto.type.RelationMetaTypeDTO;
import de.hybris.platform.core.model.type.RelationMetaTypeModel;
import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.core.resource.type.AttributeDescriptorResource;
import de.hybris.platform.core.resource.type.ExpressionAttributeDescriptorResource;
import de.hybris.platform.core.resource.type.RelationDescriptorResource;
import de.hybris.platform.core.resource.type.SearchRestrictionResource;
import de.hybris.platform.core.resource.type.ViewAttributeDescriptorResource;
import de.hybris.platform.core.resource.util.ConfigAttributeDescriptorResource;
import de.hybris.platform.hmc.resource.HMCHistoryEntryResource;
import de.hybris.platform.variants.resource.VariantAttributeDescriptorResource;
import de.hybris.platform.webservices.AbstractYResource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated resource class for type RelationMetaType first defined at extension core
 */
@SuppressWarnings("all")
public class RelationMetaTypeResource extends AbstractYResource<RelationMetaTypeModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RelationMetaTypeResource()
	{
		super("RelationMetaType");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteRelationMetaType()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AttributeDescriptorResource} for current root resource 
	 */
	@Path("/attributedescriptors/{attributedescriptor}")
	public AbstractYResource getAttributeDescriptorResource(@PathParam("attributedescriptor")  final String resourceKey)
	{
		final AttributeDescriptorResource  resource  = resourceCtx.getResource(AttributeDescriptorResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ConfigAttributeDescriptorResource} for current root resource 
	 */
	@Path("/configattributedescriptors/{configattributedescriptor}")
	public AbstractYResource getConfigAttributeDescriptorResource(@PathParam("configattributedescriptor")  final String resourceKey)
	{
		final ConfigAttributeDescriptorResource  resource  = resourceCtx.getResource(ConfigAttributeDescriptorResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ExpressionAttributeDescriptorResource} for current root resource 
	 */
	@Path("/expressionattributedescriptors/{expressionattributedescriptor}")
	public AbstractYResource getExpressionAttributeDescriptorResource(@PathParam("expressionattributedescriptor")  final String resourceKey)
	{
		final ExpressionAttributeDescriptorResource  resource  = resourceCtx.getResource(ExpressionAttributeDescriptorResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
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
	 *  Generated getter for sub resource of type {@link RelationDescriptorResource} for current root resource 
	 */
	@Path("/relationdescriptors/{relationdescriptor}")
	public AbstractYResource getRelationDescriptorResource(@PathParam("relationdescriptor")  final String resourceKey)
	{
		final RelationDescriptorResource  resource  = resourceCtx.getResource(RelationDescriptorResource.class);
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
	public Response getRelationMetaType()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public RelationMetaTypeModel getRelationMetaTypeModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SearchRestrictionResource} for current root resource 
	 */
	@Path("/searchrestrictions/{searchrestriction}")
	public AbstractYResource getSearchRestrictionResource(@PathParam("searchrestriction")  final String resourceKey)
	{
		final SearchRestrictionResource  resource  = resourceCtx.getResource(SearchRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link VariantAttributeDescriptorResource} for current root resource 
	 */
	@Path("/variantattributedescriptors/{variantattributedescriptor}")
	public AbstractYResource getVariantAttributeDescriptorResource(@PathParam("variantattributedescriptor")  final String resourceKey)
	{
		final VariantAttributeDescriptorResource  resource  = resourceCtx.getResource(VariantAttributeDescriptorResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ViewAttributeDescriptorResource} for current root resource 
	 */
	@Path("/viewattributedescriptors/{viewattributedescriptor}")
	public AbstractYResource getViewAttributeDescriptorResource(@PathParam("viewattributedescriptor")  final String resourceKey)
	{
		final ViewAttributeDescriptorResource  resource  = resourceCtx.getResource(ViewAttributeDescriptorResource.class);
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
	public Response putRelationMetaType(final RelationMetaTypeDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link RelationMetaTypeModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected RelationMetaTypeModel readResource(final String resourceId) throws Exception
	{
		RelationMetaTypeModel model = new RelationMetaTypeModel();
		model.setCode(resourceId);
		return (RelationMetaTypeModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(RelationMetaTypeModel)}
	 */
	public void setRelationMetaTypeModel(final RelationMetaTypeModel value)
	{
		super.setResourceValue(value);
	}
	
}
