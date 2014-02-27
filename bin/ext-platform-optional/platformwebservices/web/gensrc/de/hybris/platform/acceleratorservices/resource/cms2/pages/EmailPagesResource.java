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
package de.hybris.platform.acceleratorservices.resource.cms2.pages;

import de.hybris.platform.acceleratorservices.dto.cms2.pages.EmailPagesDTO;
import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.resource.cms2.pages.EmailPageResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type EmailPage defined at extension acceleratorservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/emailpages")
public class EmailPagesResource extends AbstractCollectionResource <Collection<EmailPageModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailPagesResource()
	{
		super("EmailPage");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllEmailPages()
	{
		return createGetResponse().build(EmailPagesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link EmailPageResource} for current root resource 
	 */
	@Path("{emailpage}")
	public AbstractYResource getEmailPageResource(@PathParam("emailpage")  final String resourceKey)
	{
		final EmailPageResource  resource  = resourceCtx.getResource(EmailPageResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<EmailPageModel> getEmailPagesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setEmailPagesCollection(final Collection<EmailPageModel> value)
	{
		super.setResourceValue(value);
	}
	
}
