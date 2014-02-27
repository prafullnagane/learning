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

import de.hybris.platform.btg.dto.BTGReferenceRegExpListOperandsDTO;
import de.hybris.platform.btg.model.BTGReferenceRegExpListOperandModel;
import de.hybris.platform.btg.resource.BTGReferenceRegExpListOperandResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGReferenceRegExpListOperand defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btgreferenceregexplistoperands")
public class BTGReferenceRegExpListOperandsResource extends AbstractCollectionResource <Collection<BTGReferenceRegExpListOperandModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceRegExpListOperandsResource()
	{
		super("BTGReferenceRegExpListOperand");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGReferenceRegExpListOperands()
	{
		return createGetResponse().build(BTGReferenceRegExpListOperandsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferenceRegExpListOperandResource} for current root resource 
	 */
	@Path("{btgreferenceregexplistoperand}")
	public AbstractYResource getBTGReferenceRegExpListOperandResource(@PathParam("btgreferenceregexplistoperand")  final String resourceKey)
	{
		final BTGReferenceRegExpListOperandResource  resource  = resourceCtx.getResource(BTGReferenceRegExpListOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGReferenceRegExpListOperandModel> getBTGReferenceRegExpListOperandsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGReferenceRegExpListOperandsCollection(final Collection<BTGReferenceRegExpListOperandModel> value)
	{
		super.setResourceValue(value);
	}
	
}
