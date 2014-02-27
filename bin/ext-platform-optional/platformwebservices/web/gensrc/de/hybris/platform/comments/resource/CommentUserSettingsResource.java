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
package de.hybris.platform.comments.resource;

import de.hybris.platform.comments.dto.CommentUserSettingDTO;
import de.hybris.platform.comments.dto.CommentUserSettingsDTO;
import de.hybris.platform.comments.model.CommentUserSettingModel;
import de.hybris.platform.comments.resource.CommentUserSettingResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CommentUserSetting defined at extension comments Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/commentusersettings")
public class CommentUserSettingsResource extends AbstractCollectionResource <Collection<CommentUserSettingModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentUserSettingsResource()
	{
		super("CommentUserSetting");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCommentUserSettings()
	{
		return createGetResponse().build(CommentUserSettingsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CommentUserSettingResource} for current root resource 
	 */
	@Path("{commentusersetting}")
	public AbstractYResource getCommentUserSettingResource(@PathParam("commentusersetting")  final String resourceKey)
	{
		final CommentUserSettingResource  resource  = resourceCtx.getResource(CommentUserSettingResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CommentUserSettingModel> getCommentUserSettingsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCommentUserSetting(final CommentUserSettingDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCommentUserSettingsCollection(final Collection<CommentUserSettingModel> value)
	{
		super.setResourceValue(value);
	}
	
}
