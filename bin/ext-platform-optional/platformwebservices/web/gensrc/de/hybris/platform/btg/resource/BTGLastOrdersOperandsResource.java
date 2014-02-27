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

import de.hybris.platform.btg.dto.BTGLastOrdersOperandsDTO;
import de.hybris.platform.btg.model.BTGLastOrdersOperandModel;
import de.hybris.platform.btg.resource.BTGLastOrdersOperandResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGLastOrdersOperand defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btglastordersoperands")
public class BTGLastOrdersOperandsResource extends AbstractCollectionResource <Collection<BTGLastOrdersOperandModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGLastOrdersOperandsResource()
	{
		super("BTGLastOrdersOperand");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGLastOrdersOperands()
	{
		return createGetResponse().build(BTGLastOrdersOperandsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGLastOrdersOperandResource} for current root resource 
	 */
	@Path("{btglastordersoperand}")
	public AbstractYResource getBTGLastOrdersOperandResource(@PathParam("btglastordersoperand")  final String resourceKey)
	{
		final BTGLastOrdersOperandResource  resource  = resourceCtx.getResource(BTGLastOrdersOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGLastOrdersOperandModel> getBTGLastOrdersOperandsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGLastOrdersOperandsCollection(final Collection<BTGLastOrdersOperandModel> value)
	{
		super.setResourceValue(value);
	}
	
}
