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

import de.hybris.platform.btg.dto.BTGProductsInCartOperandsDTO;
import de.hybris.platform.btg.model.BTGProductsInCartOperandModel;
import de.hybris.platform.btg.resource.BTGProductsInCartOperandResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGProductsInCartOperand defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btgproductsincartoperands")
public class BTGProductsInCartOperandsResource extends AbstractCollectionResource <Collection<BTGProductsInCartOperandModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGProductsInCartOperandsResource()
	{
		super("BTGProductsInCartOperand");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGProductsInCartOperands()
	{
		return createGetResponse().build(BTGProductsInCartOperandsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGProductsInCartOperandResource} for current root resource 
	 */
	@Path("{btgproductsincartoperand}")
	public AbstractYResource getBTGProductsInCartOperandResource(@PathParam("btgproductsincartoperand")  final String resourceKey)
	{
		final BTGProductsInCartOperandResource  resource  = resourceCtx.getResource(BTGProductsInCartOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGProductsInCartOperandModel> getBTGProductsInCartOperandsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGProductsInCartOperandsCollection(final Collection<BTGProductsInCartOperandModel> value)
	{
		super.setResourceValue(value);
	}
	
}
