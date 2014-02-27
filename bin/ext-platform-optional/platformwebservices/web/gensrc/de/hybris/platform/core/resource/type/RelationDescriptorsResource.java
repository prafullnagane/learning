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

import de.hybris.platform.core.dto.type.RelationDescriptorsDTO;
import de.hybris.platform.core.model.type.RelationDescriptorModel;
import de.hybris.platform.core.resource.type.RelationDescriptorResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type RelationDescriptor defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/relationdescriptors")
public class RelationDescriptorsResource extends AbstractCollectionResource <Collection<RelationDescriptorModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RelationDescriptorsResource()
	{
		super("RelationDescriptor");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllRelationDescriptors()
	{
		return createGetResponse().build(RelationDescriptorsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link RelationDescriptorResource} for current root resource 
	 */
	@Path("{relationdescriptor}")
	public AbstractYResource getRelationDescriptorResource(@PathParam("relationdescriptor")  final String resourceKey)
	{
		final RelationDescriptorResource  resource  = resourceCtx.getResource(RelationDescriptorResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<RelationDescriptorModel> getRelationDescriptorsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setRelationDescriptorsCollection(final Collection<RelationDescriptorModel> value)
	{
		super.setResourceValue(value);
	}
	
}
