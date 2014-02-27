/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 13, 2013 6:34:48 PM                     ---
 * ----------------------------------------------------------------
 */
package com.hybris.backoffice.resource.user;

import com.hybris.backoffice.dto.user.BackofficeRolesDTO;
import com.hybris.backoffice.model.user.BackofficeRoleModel;
import com.hybris.backoffice.resource.user.BackofficeRoleResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BackofficeRole defined at extension backoffice Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/backofficeroles")
public class BackofficeRolesResource extends AbstractCollectionResource <Collection<BackofficeRoleModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BackofficeRolesResource()
	{
		super("BackofficeRole");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBackofficeRoles()
	{
		return createGetResponse().build(BackofficeRolesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BackofficeRoleResource} for current root resource 
	 */
	@Path("{backofficerole}")
	public AbstractYResource getBackofficeRoleResource(@PathParam("backofficerole")  final String resourceKey)
	{
		final BackofficeRoleResource  resource  = resourceCtx.getResource(BackofficeRoleResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BackofficeRoleModel> getBackofficeRolesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBackofficeRolesCollection(final Collection<BackofficeRoleModel> value)
	{
		super.setResourceValue(value);
	}
	
}
