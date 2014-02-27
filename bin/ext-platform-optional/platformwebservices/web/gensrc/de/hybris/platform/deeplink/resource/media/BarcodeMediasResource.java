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
package de.hybris.platform.deeplink.resource.media;

import de.hybris.platform.deeplink.dto.media.BarcodeMediasDTO;
import de.hybris.platform.deeplink.model.media.BarcodeMediaModel;
import de.hybris.platform.deeplink.resource.media.BarcodeMediaResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BarcodeMedia defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/barcodemedias")
public class BarcodeMediasResource extends AbstractCollectionResource <Collection<BarcodeMediaModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BarcodeMediasResource()
	{
		super("BarcodeMedia");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBarcodeMedias()
	{
		return createGetResponse().build(BarcodeMediasDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BarcodeMediaResource} for current root resource 
	 */
	@Path("{barcodemedia}")
	public AbstractYResource getBarcodeMediaResource(@PathParam("barcodemedia")  final String resourceKey)
	{
		final BarcodeMediaResource  resource  = resourceCtx.getResource(BarcodeMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BarcodeMediaModel> getBarcodeMediasCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBarcodeMediasCollection(final Collection<BarcodeMediaModel> value)
	{
		super.setResourceValue(value);
	}
	
}
