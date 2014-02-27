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

import de.hybris.platform.acceleratorservices.dto.cms2.pages.EmailPageTemplatesDTO;
import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageTemplateModel;
import de.hybris.platform.acceleratorservices.resource.cms2.pages.EmailPageTemplateResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type EmailPageTemplate defined at extension acceleratorservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/emailpagetemplates")
public class EmailPageTemplatesResource extends AbstractCollectionResource <Collection<EmailPageTemplateModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailPageTemplatesResource()
	{
		super("EmailPageTemplate");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllEmailPageTemplates()
	{
		return createGetResponse().build(EmailPageTemplatesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link EmailPageTemplateResource} for current root resource 
	 */
	@Path("{emailpagetemplate}")
	public AbstractYResource getEmailPageTemplateResource(@PathParam("emailpagetemplate")  final String resourceKey)
	{
		final EmailPageTemplateResource  resource  = resourceCtx.getResource(EmailPageTemplateResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<EmailPageTemplateModel> getEmailPageTemplatesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setEmailPageTemplatesCollection(final Collection<EmailPageTemplateModel> value)
	{
		super.setResourceValue(value);
	}
	
}
