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
package de.hybris.platform.commons.resource.translator;

import de.hybris.platform.commons.dto.translator.ParserPropertiesDTO;
import de.hybris.platform.commons.model.translator.ParserPropertyModel;
import de.hybris.platform.commons.resource.translator.ParserPropertyResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ParserProperty defined at extension commons Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/parserproperties")
public class ParserPropertiesResource extends AbstractCollectionResource <Collection<ParserPropertyModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ParserPropertiesResource()
	{
		super("ParserProperty");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllParserProperties()
	{
		return createGetResponse().build(ParserPropertiesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ParserPropertyModel> getParserPropertiesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ParserPropertyResource} for current root resource 
	 */
	@Path("{parserproperty}")
	public AbstractYResource getParserPropertyResource(@PathParam("parserproperty")  final String resourceKey)
	{
		final ParserPropertyResource  resource  = resourceCtx.getResource(ParserPropertyResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setParserPropertiesCollection(final Collection<ParserPropertyModel> value)
	{
		super.setResourceValue(value);
	}
	
}
