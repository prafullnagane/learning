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
package de.hybris.platform.catalog.resource;

import de.hybris.platform.catalog.dto.AgreementsDTO;
import de.hybris.platform.catalog.model.AgreementModel;
import de.hybris.platform.catalog.resource.AgreementResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Agreement defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/agreements")
public class AgreementsResource extends AbstractCollectionResource <Collection<AgreementModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AgreementsResource()
	{
		super("Agreement");
	}
	
	
	/**
	 *  Generated getter for sub resource of type {@link AgreementResource} for current root resource 
	 */
	@Path("{agreement}")
	public AbstractYResource getAgreementResource(@PathParam("agreement")  final String resourceKey)
	{
		final AgreementResource  resource  = resourceCtx.getResource(AgreementResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AgreementModel> getAgreementsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAgreements()
	{
		return createGetResponse().build(AgreementsDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAgreementsCollection(final Collection<AgreementModel> value)
	{
		super.setResourceValue(value);
	}
	
}