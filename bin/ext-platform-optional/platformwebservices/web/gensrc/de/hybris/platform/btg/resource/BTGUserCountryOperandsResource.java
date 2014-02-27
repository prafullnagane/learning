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
package de.hybris.platform.btg.resource;

import de.hybris.platform.btg.dto.BTGUserCountryOperandsDTO;
import de.hybris.platform.btg.model.BTGUserCountryOperandModel;
import de.hybris.platform.btg.resource.BTGUserCountryOperandResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGUserCountryOperand defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btgusercountryoperands")
public class BTGUserCountryOperandsResource extends AbstractCollectionResource <Collection<BTGUserCountryOperandModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGUserCountryOperandsResource()
	{
		super("BTGUserCountryOperand");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGUserCountryOperands()
	{
		return createGetResponse().build(BTGUserCountryOperandsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGUserCountryOperandResource} for current root resource 
	 */
	@Path("{btgusercountryoperand}")
	public AbstractYResource getBTGUserCountryOperandResource(@PathParam("btgusercountryoperand")  final String resourceKey)
	{
		final BTGUserCountryOperandResource  resource  = resourceCtx.getResource(BTGUserCountryOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGUserCountryOperandModel> getBTGUserCountryOperandsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGUserCountryOperandsCollection(final Collection<BTGUserCountryOperandModel> value)
	{
		super.setResourceValue(value);
	}
	
}
