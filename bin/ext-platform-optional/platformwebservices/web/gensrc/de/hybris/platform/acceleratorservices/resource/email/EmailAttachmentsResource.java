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
package de.hybris.platform.acceleratorservices.resource.email;

import de.hybris.platform.acceleratorservices.dto.email.EmailAttachmentsDTO;
import de.hybris.platform.acceleratorservices.model.email.EmailAttachmentModel;
import de.hybris.platform.acceleratorservices.resource.email.EmailAttachmentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type EmailAttachment defined at extension acceleratorservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/emailattachments")
public class EmailAttachmentsResource extends AbstractCollectionResource <Collection<EmailAttachmentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailAttachmentsResource()
	{
		super("EmailAttachment");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllEmailAttachments()
	{
		return createGetResponse().build(EmailAttachmentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link EmailAttachmentResource} for current root resource 
	 */
	@Path("{emailattachment}")
	public AbstractYResource getEmailAttachmentResource(@PathParam("emailattachment")  final String resourceKey)
	{
		final EmailAttachmentResource  resource  = resourceCtx.getResource(EmailAttachmentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<EmailAttachmentModel> getEmailAttachmentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setEmailAttachmentsCollection(final Collection<EmailAttachmentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
