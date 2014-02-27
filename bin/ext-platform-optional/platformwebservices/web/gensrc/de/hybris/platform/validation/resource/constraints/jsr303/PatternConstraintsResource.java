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
package de.hybris.platform.validation.resource.constraints.jsr303;

import de.hybris.platform.validation.dto.constraints.jsr303.PatternConstraintsDTO;
import de.hybris.platform.validation.model.constraints.jsr303.PatternConstraintModel;
import de.hybris.platform.validation.resource.constraints.jsr303.PatternConstraintResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PatternConstraint defined at extension validation Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/patternconstraints")
public class PatternConstraintsResource extends AbstractCollectionResource <Collection<PatternConstraintModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PatternConstraintsResource()
	{
		super("PatternConstraint");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPatternConstraints()
	{
		return createGetResponse().build(PatternConstraintsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PatternConstraintResource} for current root resource 
	 */
	@Path("{patternconstraint}")
	public AbstractYResource getPatternConstraintResource(@PathParam("patternconstraint")  final String resourceKey)
	{
		final PatternConstraintResource  resource  = resourceCtx.getResource(PatternConstraintResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PatternConstraintModel> getPatternConstraintsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPatternConstraintsCollection(final Collection<PatternConstraintModel> value)
	{
		super.setResourceValue(value);
	}
	
}
