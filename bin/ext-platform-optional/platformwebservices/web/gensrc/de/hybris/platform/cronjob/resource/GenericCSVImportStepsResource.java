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
package de.hybris.platform.cronjob.resource;

import de.hybris.platform.cronjob.dto.GenericCSVImportStepsDTO;
import de.hybris.platform.cronjob.model.GenericCSVImportStepModel;
import de.hybris.platform.cronjob.resource.GenericCSVImportStepResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type GenericCSVImportStep defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/genericcsvimportsteps")
public class GenericCSVImportStepsResource extends AbstractCollectionResource <Collection<GenericCSVImportStepModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public GenericCSVImportStepsResource()
	{
		super("GenericCSVImportStep");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllGenericCSVImportSteps()
	{
		return createGetResponse().build(GenericCSVImportStepsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link GenericCSVImportStepResource} for current root resource 
	 */
	@Path("{genericcsvimportstep}")
	public AbstractYResource getGenericCSVImportStepResource(@PathParam("genericcsvimportstep")  final String resourceKey)
	{
		final GenericCSVImportStepResource  resource  = resourceCtx.getResource(GenericCSVImportStepResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<GenericCSVImportStepModel> getGenericCSVImportStepsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setGenericCSVImportStepsCollection(final Collection<GenericCSVImportStepModel> value)
	{
		super.setResourceValue(value);
	}
	
}
