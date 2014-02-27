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
package de.hybris.platform.cockpit.dto;

import de.hybris.platform.cockpit.dto.ObjectCollectionElementDTO;
import de.hybris.platform.cockpit.model.CockpitObjectAbstractCollectionModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CockpitObjectAbstractCollection first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = CockpitObjectAbstractCollectionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "cockpitobjectabstractcollection")
public class CockpitObjectAbstractCollectionDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CockpitObjectAbstractCollection.qualifier</code> attribute defined at extension <code> */
	private java.lang.String _qualifier;
	/** <i>Generated variable</i> - Variable of <code>CockpitObjectAbstractCollection.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>CockpitObjectAbstractCollection.label</code> attribute defined at extension <code> */
	private java.lang.String _label;
	/** <i>Generated variable</i> - Variable of <code>CockpitObjectAbstractCollection.readPrincipals</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.security.PrincipalDTO> _readPrincipals;
	/** <i>Generated variable</i> - Variable of <code>CockpitObjectAbstractCollection.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	/** <i>Generated variable</i> - Variable of <code>CockpitObjectAbstractCollection.writePrincipals</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.security.PrincipalDTO> _writePrincipals;
	/** <i>Generated variable</i> - Variable of <code>CockpitObjectAbstractCollection.elements</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cockpit.dto.ObjectCollectionElementDTO> _elements;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitObjectAbstractCollectionDTO()
	{
		super();
	}
	
	
	public String getDescription()
	{
		return this._description;
	}
	
	@XmlElementWrapper(name = "elements")
	@XmlElement(name = "objectCollectionElement")
	public List<ObjectCollectionElementDTO> getElements()
	{
		return this._elements;
	}
	
	public String getLabel()
	{
		return this._label;
	}
	
	public String getQualifier()
	{
		return this._qualifier;
	}
	
	@XmlElementWrapper(name = "readPrincipals")
	@XmlElement(name = "principal")
	public Collection<PrincipalDTO> getReadPrincipals()
	{
		return this._readPrincipals;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	@XmlElementWrapper(name = "writePrincipals")
	@XmlElement(name = "principal")
	public Collection<PrincipalDTO> getWritePrincipals()
	{
		return this._writePrincipals;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setElements(final List<ObjectCollectionElementDTO> value)
	{
		this.modifiedPropsSet.add("elements");
		this._elements = value;
	}
	
	public void setLabel(final String value)
	{
		this.modifiedPropsSet.add("label");
		this._label = value;
	}
	
	public void setQualifier(final String value)
	{
		this.modifiedPropsSet.add("qualifier");
		this._qualifier = value;
	}
	
	public void setReadPrincipals(final Collection<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("readPrincipals");
		this._readPrincipals = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
	public void setWritePrincipals(final Collection<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("writePrincipals");
		this._writePrincipals = value;
	}
	
}
