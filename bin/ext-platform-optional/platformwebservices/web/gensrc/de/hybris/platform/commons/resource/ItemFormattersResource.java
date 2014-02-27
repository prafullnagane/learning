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

import de.hybris.platform.commons.dto.ItemFormattersDTO;
import de.hybris.platform.commons.model.ItemFormatterModel;
import de.hybris.platform.commons.resource.ItemFormatterResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ItemFormatter defined at extension commons Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/itemformatters")
public class ItemFormattersResource extends AbstractCollectionResource <Collection<ItemFormatterModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemFormattersResource()
	{
		super("ItemFormatter");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllItemFormatters()
	{
		return createGetResponse().build(ItemFormattersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ItemFormatterResource} for current root resource 
	 */
	@Path("{itemformatter}")
	public AbstractYResource getItemFormatterResource(@PathParam("itemformatter")  final String resourceKey)
	{
		final ItemFormatterResource  resource  = resourceCtx.getResource(ItemFormatterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ItemFormatterModel> getItemFormattersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setItemFormattersCollection(final Collection<ItemFormatterModel> value)
	{
		super.setResourceValue(value);
	}
	
}
