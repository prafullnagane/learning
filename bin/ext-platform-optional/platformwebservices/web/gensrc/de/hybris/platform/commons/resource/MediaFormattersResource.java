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
package de.hybris.platform.commons.resource;

import de.hybris.platform.commons.dto.MediaFormattersDTO;
import de.hybris.platform.commons.model.MediaFormatterModel;
import de.hybris.platform.commons.resource.MediaFormatterResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type MediaFormatter defined at extension commons Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/mediaformatters")
public class MediaFormattersResource extends AbstractCollectionResource <Collection<MediaFormatterModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaFormattersResource()
	{
		super("MediaFormatter");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllMediaFormatters()
	{
		return createGetResponse().build(MediaFormattersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link MediaFormatterResource} for current root resource 
	 */
	@Path("{mediaformatter}")
	public AbstractYResource getMediaFormatterResource(@PathParam("mediaformatter")  final String resourceKey)
	{
		final MediaFormatterResource  resource  = resourceCtx.getResource(MediaFormatterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<MediaFormatterModel> getMediaFormattersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setMediaFormattersCollection(final Collection<MediaFormatterModel> value)
	{
		super.setResourceValue(value);
	}
	
}
