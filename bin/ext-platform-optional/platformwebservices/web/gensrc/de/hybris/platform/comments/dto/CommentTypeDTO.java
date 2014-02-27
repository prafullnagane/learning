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

import de.hybris.platform.comments.dto.DomainDTO;
import de.hybris.platform.comments.model.CommentTypeModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CommentType first defined at extension comments
 */
@SuppressWarnings("all")
@GraphNode(target = CommentTypeModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "commenttype")
public class CommentTypeDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CommentType.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>CommentType.metaType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _metaType;
	/** <i>Generated variable</i> - Variable of <code>CommentType.domain</code> attribute defined at extension <code> */
	private de.hybris.platform.comments.dto.DomainDTO _domain;
	/** <i>Generated variable</i> - Variable of <code>CommentType.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentTypeDTO()
	{
		super();
	}
	
	
	public String getCode()
	{
		return this._code;
	}
	
	public DomainDTO getDomain()
	{
		return this._domain;
	}
	
	public ComposedTypeDTO getMetaType()
	{
		return this._metaType;
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
	
	public void setDomain(final DomainDTO value)
	{
		this.modifiedPropsSet.add("domain");
		this._domain = value;
	}
	
	public void setMetaType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("metaType");
		this._metaType = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
}
