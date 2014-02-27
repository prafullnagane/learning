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
package de.hybris.platform.acceleratorservices.resource.payment;

import de.hybris.platform.acceleratorservices.dto.payment.CCPaySubValidationDTO;
import de.hybris.platform.acceleratorservices.dto.payment.CCPaySubValidationsDTO;
import de.hybris.platform.acceleratorservices.model.payment.CCPaySubValidationModel;
import de.hybris.platform.acceleratorservices.resource.payment.CCPaySubValidationResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CCPaySubValidation defined at extension acceleratorservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/ccpaysubvalidations")
public class CCPaySubValidationsResource extends AbstractCollectionResource <Collection<CCPaySubValidationModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CCPaySubValidationsResource()
	{
		super("CCPaySubValidation");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCCPaySubValidations()
	{
		return createGetResponse().build(CCPaySubValidationsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CCPaySubValidationResource} for current root resource 
	 */
	@Path("{ccpaysubvalidation}")
	public AbstractYResource getCCPaySubValidationResource(@PathParam("ccpaysubvalidation")  final String resourceKey)
	{
		final CCPaySubValidationResource  resource  = resourceCtx.getResource(CCPaySubValidationResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CCPaySubValidationModel> getCCPaySubValidationsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCCPaySubValidation(final CCPaySubValidationDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCCPaySubValidationsCollection(final Collection<CCPaySubValidationModel> value)
	{
		super.setResourceValue(value);
	}
	
}
