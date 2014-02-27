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
package de.hybris.platform.core.resource.c2l;

import de.hybris.platform.core.dto.c2l.CurrenciesDTO;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.resource.c2l.CurrencyResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Currency defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/currencies")
public class CurrenciesResource extends AbstractCollectionResource <Collection<CurrencyModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CurrenciesResource()
	{
		super("Currency");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCurrencies()
	{
		return createGetResponse().build(CurrenciesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CurrencyModel> getCurrenciesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CurrencyResource} for current root resource 
	 */
	@Path("{currency}")
	public AbstractYResource getCurrencyResource(@PathParam("currency")  final String resourceKey)
	{
		final CurrencyResource  resource  = resourceCtx.getResource(CurrencyResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCurrenciesCollection(final Collection<CurrencyModel> value)
	{
		super.setResourceValue(value);
	}
	
}
