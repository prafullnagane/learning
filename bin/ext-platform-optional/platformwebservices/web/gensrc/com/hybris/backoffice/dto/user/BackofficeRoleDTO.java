/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 13, 2013 6:34:48 PM                     ---
 * ----------------------------------------------------------------
 */
package com.hybris.backoffice.dto.user;

import com.hybris.backoffice.model.user.BackofficeRoleModel;
import de.hybris.platform.core.dto.user.UserGroupDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BackofficeRole first defined at extension backoffice
 */
@SuppressWarnings("all")
@GraphNode(target = BackofficeRoleModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "backofficerole")
public class BackofficeRoleDTO extends UserGroupDTO
{
	/** <i>Generated variable</i> - Variable of <code>BackofficeRole.authorities</code> attribute defined at extension <code> */
	private java.util.Collection<java.lang.String> _authorities;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BackofficeRoleDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "authorities")
	@XmlElement(name = "value")
	public Collection<String> getAuthorities()
	{
		return this._authorities;
	}
	
	public void setAuthorities(final Collection<String> value)
	{
		this.modifiedPropsSet.add("authorities");
		this._authorities = value;
	}
	
}
