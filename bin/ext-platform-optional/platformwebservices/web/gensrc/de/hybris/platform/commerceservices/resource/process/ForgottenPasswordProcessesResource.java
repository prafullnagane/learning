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
package de.hybris.platform.commerceservices.resource.process;

import de.hybris.platform.commerceservices.dto.process.ForgottenPasswordProcessesDTO;
import de.hybris.platform.commerceservices.model.process.ForgottenPasswordProcessModel;
import de.hybris.platform.commerceservices.resource.process.ForgottenPasswordProcessResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ForgottenPasswordProcess defined at extension commerceservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/forgottenpasswordprocesses")
public class ForgottenPasswordProcessesResource extends AbstractCollectionResource <Collection<ForgottenPasswordProcessModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ForgottenPasswordProcessesResource()
	{
		super("ForgottenPasswordProcess");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllForgottenPasswordProcesses()
	{
		return createGetResponse().build(ForgottenPasswordProcessesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ForgottenPasswordProcessModel> getForgottenPasswordProcessesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ForgottenPasswordProcessResource} for current root resource 
	 */
	@Path("{forgottenpasswordprocess}")
	public AbstractYResource getForgottenPasswordProcessResource(@PathParam("forgottenpasswordprocess")  final String resourceKey)
	{
		final ForgottenPasswordProcessResource  resource  = resourceCtx.getResource(ForgottenPasswordProcessResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setForgottenPasswordProcessesCollection(final Collection<ForgottenPasswordProcessModel> value)
	{
		super.setResourceValue(value);
	}
	
}
