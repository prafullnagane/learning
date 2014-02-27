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
package de.hybris.platform.impex.resource.exp;

import de.hybris.platform.impex.dto.exp.ImpExExportMediasDTO;
import de.hybris.platform.impex.model.exp.ImpExExportMediaModel;
import de.hybris.platform.impex.resource.exp.ImpExExportMediaResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ImpExExportMedia defined at extension impex Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/impexexportmedias")
public class ImpExExportMediasResource extends AbstractCollectionResource <Collection<ImpExExportMediaModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExExportMediasResource()
	{
		super("ImpExExportMedia");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllImpExExportMedias()
	{
		return createGetResponse().build(ImpExExportMediasDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ImpExExportMediaResource} for current root resource 
	 */
	@Path("{impexexportmedia}")
	public AbstractYResource getImpExExportMediaResource(@PathParam("impexexportmedia")  final String resourceKey)
	{
		final ImpExExportMediaResource  resource  = resourceCtx.getResource(ImpExExportMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ImpExExportMediaModel> getImpExExportMediasCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setImpExExportMediasCollection(final Collection<ImpExExportMediaModel> value)
	{
		super.setResourceValue(value);
	}
	
}
