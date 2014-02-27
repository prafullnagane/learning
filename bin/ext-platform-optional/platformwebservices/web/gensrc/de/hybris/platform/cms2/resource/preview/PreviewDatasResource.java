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
package de.hybris.platform.cms2.resource.preview;

import de.hybris.platform.cms2.dto.preview.PreviewDataDTO;
import de.hybris.platform.cms2.dto.preview.PreviewDatasDTO;
import de.hybris.platform.cms2.model.preview.PreviewDataModel;
import de.hybris.platform.cms2.resource.preview.PreviewDataResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PreviewData defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/previewdatas")
public class PreviewDatasResource extends AbstractCollectionResource <Collection<PreviewDataModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PreviewDatasResource()
	{
		super("PreviewData");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPreviewDatas()
	{
		return createGetResponse().build(PreviewDatasDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PreviewDataResource} for current root resource 
	 */
	@Path("{previewdata}")
	public AbstractYResource getPreviewDataResource(@PathParam("previewdata")  final String resourceKey)
	{
		final PreviewDataResource  resource  = resourceCtx.getResource(PreviewDataResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PreviewDataModel> getPreviewDatasCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postPreviewData(final PreviewDataDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPreviewDatasCollection(final Collection<PreviewDataModel> value)
	{
		super.setResourceValue(value);
	}
	
}
