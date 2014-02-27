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
package de.hybris.platform.core.dto;

import de.hybris.platform.comments.dto.CommentDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.webservices.dto.AbstractItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.PkToLongConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Item first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = ItemModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "item")
public class ItemDTO extends AbstractItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Item.itemtype</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _itemtype;
	/** <i>Generated variable</i> - Variable of <code>Item.creationtime</code> attribute defined at extension <code> */
	private java.util.Date _creationtime;
	/** <i>Generated variable</i> - Variable of <code>Item.pk</code> attribute defined at extension <code> */
	private java.lang.Long _pk;
	/** <i>Generated variable</i> - Variable of <code>Item.comments</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.comments.dto.CommentDTO> _comments;
	/** <i>Generated variable</i> - Variable of <code>Item.modifiedtime</code> attribute defined at extension <code> */
	private java.util.Date _modifiedtime;
	/** <i>Generated variable</i> - Variable of <code>Item.owner</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _owner;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "comments")
	@XmlElement(name = "comment")
	public List<CommentDTO> getComments()
	{
		return this._comments;
	}
	
	public Date getCreationtime()
	{
		return this._creationtime;
	}
	
	public ComposedTypeDTO getItemtype()
	{
		return this._itemtype;
	}
	
	public Date getModifiedtime()
	{
		return this._modifiedtime;
	}
	
	public ItemDTO getOwner()
	{
		return this._owner;
	}
	
	@XmlAttribute
	public Long getPk()
	{
		return this._pk;
	}
	
	public void setComments(final List<CommentDTO> value)
	{
		this.modifiedPropsSet.add("comments");
		this._comments = value;
	}
	
	public void setCreationtime(final Date value)
	{
		this.modifiedPropsSet.add("creationtime");
		this._creationtime = value;
	}
	
	public void setItemtype(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("itemtype");
		this._itemtype = value;
	}
	
	public void setModifiedtime(final Date value)
	{
		this.modifiedPropsSet.add("modifiedtime");
		this._modifiedtime = value;
	}
	
	public void setOwner(final ItemDTO value)
	{
		this.modifiedPropsSet.add("owner");
		this._owner = value;
	}
	
	@GraphProperty(interceptor = PkToLongConverter.class)
	public void setPk(final Long value)
	{
		this.modifiedPropsSet.add("pk");
		this._pk = value;
	}
	
}
