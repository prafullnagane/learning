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

import de.hybris.platform.btg.dto.BTGReferenceProductsOperandsDTO;
import de.hybris.platform.btg.model.BTGReferenceProductsOperandModel;
import de.hybris.platform.btg.resource.BTGReferenceProductsOperandResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGReferenceProductsOperand defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btgreferenceproductsoperands")
public class BTGReferenceProductsOperandsResource extends AbstractCollectionResource <Collection<BTGReferenceProductsOperandModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceProductsOperandsResource()
	{
		super("BTGReferenceProductsOperand");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGReferenceProductsOperands()
	{
		return createGetResponse().build(BTGReferenceProductsOperandsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferenceProductsOperandResource} for current root resource 
	 */
	@Path("{btgreferenceproductsoperand}")
	public AbstractYResource getBTGReferenceProductsOperandResource(@PathParam("btgreferenceproductsoperand")  final String resourceKey)
	{
		final BTGReferenceProductsOperandResource  resource  = resourceCtx.getResource(BTGReferenceProductsOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGReferenceProductsOperandModel> getBTGReferenceProductsOperandsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGReferenceProductsOperandsCollection(final Collection<BTGReferenceProductsOperandModel> value)
	{
		super.setResourceValue(value);
	}
	
}
