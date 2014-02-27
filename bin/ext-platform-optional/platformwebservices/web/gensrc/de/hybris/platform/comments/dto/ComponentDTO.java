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
package de.hybris.platform.comments.dto;

import de.hybris.platform.comments.dto.CommentTypeDTO;
import de.hybris.platform.comments.dto.DomainDTO;
import de.hybris.platform.comments.model.ComponentModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Component first defined at extension comments
 */
@SuppressWarnings("all")
@GraphNode(target = ComponentModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "component")
public class ComponentDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Component.removePermitted</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.security.PrincipalDTO> _removePermitted;
	/** <i>Generated variable</i> - Variable of <code>Component.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>Component.writePermitted</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.security.PrincipalDTO> _writePermitted;
	/** <i>Generated variable</i> - Variable of <code>Component.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>Component.createPermitted</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.security.PrincipalDTO> _createPermitted;
	/** <i>Generated variable</i> - Variable of <code>Component.availableCommentTypes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.comments.dto.CommentTypeDTO> _availableCommentTypes;
	/** <i>Generated variable</i> - Variable of <code>Component.domain</code> attribute defined at extension <code> */
	private de.hybris.platform.comments.dto.DomainDTO _domain;
	/** <i>Generated variable</i> - Variable of <code>Component.readPermitted</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.security.PrincipalDTO> _readPermitted;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ComponentDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "availableCommentTypes")
	@XmlElement(name = "commentType")
	public Collection<CommentTypeDTO> getAvailableCommentTypes()
	{
		return this._availableCommentTypes;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public Collection<PrincipalDTO> getCreatePermitted()
	{
		return this._createPermitted;
	}
	
	public DomainDTO getDomain()
	{
		return this._domain;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public Collection<PrincipalDTO> getReadPermitted()
	{
		return this._readPermitted;
	}
	
	public Collection<PrincipalDTO> getRemovePermitted()
	{
		return this._removePermitted;
	}
	
	public Collection<PrincipalDTO> getWritePermitted()
	{
		return this._writePermitted;
	}
	
	public void setAvailableCommentTypes(final Collection<CommentTypeDTO> value)
	{
		this.modifiedPropsSet.add("availableCommentTypes");
		this._availableCommentTypes = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setCreatePermitted(final Collection<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("createPermitted");
		this._createPermitted = value;
	}
	
	public void setDomain(final DomainDTO value)
	{
		this.modifiedPropsSet.add("domain");
		this._domain = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setReadPermitted(final Collection<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("readPermitted");
		this._readPermitted = value;
	}
	
	public void setRemovePermitted(final Collection<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("removePermitted");
		this._removePermitted = value;
	}
	
	public void setWritePermitted(final Collection<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("writePermitted");
		this._writePermitted = value;
	}
	
}
