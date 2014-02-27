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
package de.hybris.platform.core.resource.user;

import de.hybris.platform.core.dto.user.EmployeeDTO;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.core.resource.type.SearchRestrictionResource;
import de.hybris.platform.customerreview.resource.CustomerReviewResource;
import de.hybris.platform.hmc.resource.HMCHistoryEntryResource;
import de.hybris.platform.webservices.AbstractYResource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated resource class for type Employee first defined at extension core
 */
@SuppressWarnings("all")
public class EmployeeResource extends AbstractYResource<EmployeeModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmployeeResource()
	{
		super("Employee");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteEmployee()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CustomerReviewResource} for current root resource 
	 */
	@Path("/customerreviews/{customerreview}")
	public AbstractYResource getCustomerReviewResource(@PathParam("customerreview")  final String resourceKey)
	{
		final CustomerReviewResource  resource  = resourceCtx.getResource(CustomerReviewResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getEmployee()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public EmployeeModel getEmployeeModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link HMCHistoryEntryResource} for current root resource 
	 */
	@Path("/hmchistoryentries/{hmchistoryentry}")
	public AbstractYResource getHMCHistoryEntryResource(@PathParam("hmchistoryentry")  final String resourceKey)
	{
		final HMCHistoryEntryResource  resource  = resourceCtx.getResource(HMCHistoryEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LinkResource} for current root resource 
	 */
	@Path("/links/{link}")
	public AbstractYResource getLinkResource(@PathParam("link")  final String resourceKey)
	{
		final LinkResource  resource  = resourceCtx.getResource(LinkResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SearchRestrictionResource} for current root resource 
	 */
	@Path("/searchrestrictions/{searchrestriction}")
	public AbstractYResource getSearchRestrictionResource(@PathParam("searchrestriction")  final String resourceKey)
	{
		final SearchRestrictionResource  resource  = resourceCtx.getResource(SearchRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering PUT requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@PUT
	public Response putEmployee(final EmployeeDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link EmployeeModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected EmployeeModel readResource(final String resourceId) throws Exception
	{
		EmployeeModel model = new EmployeeModel();
		model.setUid(resourceId);
		return (EmployeeModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(EmployeeModel)}
	 */
	public void setEmployeeModel(final EmployeeModel value)
	{
		super.setResourceValue(value);
	}
	
}
