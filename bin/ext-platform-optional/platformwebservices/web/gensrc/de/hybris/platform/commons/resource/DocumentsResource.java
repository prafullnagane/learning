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

import de.hybris.platform.commons.dto.DocumentsDTO;
import de.hybris.platform.commons.model.DocumentModel;
import de.hybris.platform.commons.resource.DocumentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Document defined at extension commons Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/documents")
public class DocumentsResource extends AbstractCollectionResource <Collection<DocumentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DocumentsResource()
	{
		super("Document");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllDocuments()
	{
		return createGetResponse().build(DocumentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link DocumentResource} for current root resource 
	 */
	@Path("{document}")
	public AbstractYResource getDocumentResource(@PathParam("document")  final String resourceKey)
	{
		final DocumentResource  resource  = resourceCtx.getResource(DocumentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<DocumentModel> getDocumentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setDocumentsCollection(final Collection<DocumentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
