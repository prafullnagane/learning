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
package de.hybris.platform.commons.resource;

import de.hybris.platform.commons.dto.FormattersDTO;
import de.hybris.platform.commons.model.FormatterModel;
import de.hybris.platform.commons.resource.FormatterResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Formatter defined at extension commons Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/formatters")
public class FormattersResource extends AbstractCollectionResource <Collection<FormatterModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FormattersResource()
	{
		super("Formatter");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllFormatters()
	{
		return createGetResponse().build(FormattersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link FormatterResource} for current root resource 
	 */
	@Path("{formatter}")
	public AbstractYResource getFormatterResource(@PathParam("formatter")  final String resourceKey)
	{
		final FormatterResource  resource  = resourceCtx.getResource(FormatterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<FormatterModel> getFormattersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setFormattersCollection(final Collection<FormatterModel> value)
	{
		super.setResourceValue(value);
	}
	
}
