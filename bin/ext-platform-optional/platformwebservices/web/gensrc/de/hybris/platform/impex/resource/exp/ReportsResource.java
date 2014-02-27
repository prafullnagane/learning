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

import de.hybris.platform.impex.dto.exp.ReportsDTO;
import de.hybris.platform.impex.model.exp.ReportModel;
import de.hybris.platform.impex.resource.exp.ReportResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Report defined at extension impex Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/reports")
public class ReportsResource extends AbstractCollectionResource <Collection<ReportModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReportsResource()
	{
		super("Report");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllReports()
	{
		return createGetResponse().build(ReportsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ReportResource} for current root resource 
	 */
	@Path("{report}")
	public AbstractYResource getReportResource(@PathParam("report")  final String resourceKey)
	{
		final ReportResource  resource  = resourceCtx.getResource(ReportResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ReportModel> getReportsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setReportsCollection(final Collection<ReportModel> value)
	{
		super.setResourceValue(value);
	}
	
}
