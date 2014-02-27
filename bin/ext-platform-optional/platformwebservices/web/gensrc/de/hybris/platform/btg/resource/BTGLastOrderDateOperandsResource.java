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

import de.hybris.platform.btg.dto.BTGLastOrderDateOperandsDTO;
import de.hybris.platform.btg.model.BTGLastOrderDateOperandModel;
import de.hybris.platform.btg.resource.BTGLastOrderDateOperandResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGLastOrderDateOperand defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btglastorderdateoperands")
public class BTGLastOrderDateOperandsResource extends AbstractCollectionResource <Collection<BTGLastOrderDateOperandModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGLastOrderDateOperandsResource()
	{
		super("BTGLastOrderDateOperand");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGLastOrderDateOperands()
	{
		return createGetResponse().build(BTGLastOrderDateOperandsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGLastOrderDateOperandResource} for current root resource 
	 */
	@Path("{btglastorderdateoperand}")
	public AbstractYResource getBTGLastOrderDateOperandResource(@PathParam("btglastorderdateoperand")  final String resourceKey)
	{
		final BTGLastOrderDateOperandResource  resource  = resourceCtx.getResource(BTGLastOrderDateOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGLastOrderDateOperandModel> getBTGLastOrderDateOperandsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGLastOrderDateOperandsCollection(final Collection<BTGLastOrderDateOperandModel> value)
	{
		super.setResourceValue(value);
	}
	
}
