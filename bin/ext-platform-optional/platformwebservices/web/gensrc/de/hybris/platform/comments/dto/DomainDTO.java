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
import de.hybris.platform.comments.dto.ComponentDTO;
import de.hybris.platform.comments.model.DomainModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Domain first defined at extension comments
 */
@SuppressWarnings("all")
@GraphNode(target = DomainModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "domain")
public class DomainDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Domain.components</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.comments.dto.ComponentDTO> _components;
	/** <i>Generated variable</i> - Variable of <code>Domain.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>Domain.commentTypes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.comments.dto.CommentTypeDTO> _commentTypes;
	/** <i>Generated variable</i> - Variable of <code>Domain.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DomainDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "commentTypes")
	@XmlElement(name = "commentType")
	public Collection<CommentTypeDTO> getCommentTypes()
	{
		return this._commentTypes;
	}
	
	@XmlElementWrapper(name = "components")
	@XmlElement(name = "component")
	public Collection<ComponentDTO> getComponents()
	{
		return this._components;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setCommentTypes(final Collection<CommentTypeDTO> value)
	{
		this.modifiedPropsSet.add("commentTypes");
		this._commentTypes = value;
	}
	
	public void setComponents(final Collection<ComponentDTO> value)
	{
		this.modifiedPropsSet.add("components");
		this._components = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
}
