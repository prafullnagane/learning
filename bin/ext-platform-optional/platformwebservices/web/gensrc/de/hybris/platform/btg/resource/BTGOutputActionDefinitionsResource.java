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

import de.hybris.platform.btg.dto.BTGOutputActionDefinitionsDTO;
import de.hybris.platform.btg.model.BTGOutputActionDefinitionModel;
import de.hybris.platform.btg.resource.BTGOutputActionDefinitionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGOutputActionDefinition defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btgoutputactiondefinitions")
public class BTGOutputActionDefinitionsResource extends AbstractCollectionResource <Collection<BTGOutputActionDefinitionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGOutputActionDefinitionsResource()
	{
		super("BTGOutputActionDefinition");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGOutputActionDefinitions()
	{
		return createGetResponse().build(BTGOutputActionDefinitionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGOutputActionDefinitionResource} for current root resource 
	 */
	@Path("{btgoutputactiondefinition}")
	public AbstractYResource getBTGOutputActionDefinitionResource(@PathParam("btgoutputactiondefinition")  final String resourceKey)
	{
		final BTGOutputActionDefinitionResource  resource  = resourceCtx.getResource(BTGOutputActionDefinitionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGOutputActionDefinitionModel> getBTGOutputActionDefinitionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGOutputActionDefinitionsCollection(final Collection<BTGOutputActionDefinitionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
