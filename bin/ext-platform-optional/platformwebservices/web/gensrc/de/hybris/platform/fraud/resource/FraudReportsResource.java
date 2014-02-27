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
package de.hybris.platform.fraud.resource;

import de.hybris.platform.fraud.dto.FraudReportDTO;
import de.hybris.platform.fraud.dto.FraudReportsDTO;
import de.hybris.platform.fraud.model.FraudReportModel;
import de.hybris.platform.fraud.resource.FraudReportResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type FraudReport defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/fraudreports")
public class FraudReportsResource extends AbstractCollectionResource <Collection<FraudReportModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FraudReportsResource()
	{
		super("FraudReport");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllFraudReports()
	{
		return createGetResponse().build(FraudReportsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link FraudReportResource} for current root resource 
	 */
	@Path("{fraudreport}")
	public AbstractYResource getFraudReportResource(@PathParam("fraudreport")  final String resourceKey)
	{
		final FraudReportResource  resource  = resourceCtx.getResource(FraudReportResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<FraudReportModel> getFraudReportsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postFraudReport(final FraudReportDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setFraudReportsCollection(final Collection<FraudReportModel> value)
	{
		super.setResourceValue(value);
	}
	
}
