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
package de.hybris.platform.processengine.resource;

import de.hybris.platform.processengine.dto.BusinessProcessParameterDTO;
import de.hybris.platform.processengine.dto.BusinessProcessParametersDTO;
import de.hybris.platform.processengine.model.BusinessProcessParameterModel;
import de.hybris.platform.processengine.resource.BusinessProcessParameterResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BusinessProcessParameter defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/businessprocessparameters")
public class BusinessProcessParametersResource extends AbstractCollectionResource <Collection<BusinessProcessParameterModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BusinessProcessParametersResource()
	{
		super("BusinessProcessParameter");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBusinessProcessParameters()
	{
		return createGetResponse().build(BusinessProcessParametersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BusinessProcessParameterResource} for current root resource 
	 */
	@Path("{businessprocessparameter}")
	public AbstractYResource getBusinessProcessParameterResource(@PathParam("businessprocessparameter")  final String resourceKey)
	{
		final BusinessProcessParameterResource  resource  = resourceCtx.getResource(BusinessProcessParameterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BusinessProcessParameterModel> getBusinessProcessParametersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postBusinessProcessParameter(final BusinessProcessParameterDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBusinessProcessParametersCollection(final Collection<BusinessProcessParameterModel> value)
	{
		super.setResourceValue(value);
	}
	
}
