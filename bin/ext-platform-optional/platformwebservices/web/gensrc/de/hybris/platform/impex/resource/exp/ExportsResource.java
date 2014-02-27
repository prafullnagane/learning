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

import de.hybris.platform.impex.dto.exp.ExportsDTO;
import de.hybris.platform.impex.model.exp.ExportModel;
import de.hybris.platform.impex.resource.exp.ExportResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Export defined at extension impex Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/exports")
public class ExportsResource extends AbstractCollectionResource <Collection<ExportModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExportsResource()
	{
		super("Export");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllExports()
	{
		return createGetResponse().build(ExportsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ExportResource} for current root resource 
	 */
	@Path("{export}")
	public AbstractYResource getExportResource(@PathParam("export")  final String resourceKey)
	{
		final ExportResource  resource  = resourceCtx.getResource(ExportResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ExportModel> getExportsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setExportsCollection(final Collection<ExportModel> value)
	{
		super.setResourceValue(value);
	}
	
}
