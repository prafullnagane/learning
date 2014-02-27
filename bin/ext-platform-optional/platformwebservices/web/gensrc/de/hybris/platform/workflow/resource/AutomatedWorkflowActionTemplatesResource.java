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
package de.hybris.platform.workflow.resource;

import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import de.hybris.platform.workflow.dto.AutomatedWorkflowActionTemplatesDTO;
import de.hybris.platform.workflow.model.AutomatedWorkflowActionTemplateModel;
import de.hybris.platform.workflow.resource.AutomatedWorkflowActionTemplateResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AutomatedWorkflowActionTemplate defined at extension workflow Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/automatedworkflowactiontemplates")
public class AutomatedWorkflowActionTemplatesResource extends AbstractCollectionResource <Collection<AutomatedWorkflowActionTemplateModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AutomatedWorkflowActionTemplatesResource()
	{
		super("AutomatedWorkflowActionTemplate");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAutomatedWorkflowActionTemplates()
	{
		return createGetResponse().build(AutomatedWorkflowActionTemplatesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AutomatedWorkflowActionTemplateResource} for current root resource 
	 */
	@Path("{automatedworkflowactiontemplate}")
	public AbstractYResource getAutomatedWorkflowActionTemplateResource(@PathParam("automatedworkflowactiontemplate")  final String resourceKey)
	{
		final AutomatedWorkflowActionTemplateResource  resource  = resourceCtx.getResource(AutomatedWorkflowActionTemplateResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AutomatedWorkflowActionTemplateModel> getAutomatedWorkflowActionTemplatesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAutomatedWorkflowActionTemplatesCollection(final Collection<AutomatedWorkflowActionTemplateModel> value)
	{
		super.setResourceValue(value);
	}
	
}
