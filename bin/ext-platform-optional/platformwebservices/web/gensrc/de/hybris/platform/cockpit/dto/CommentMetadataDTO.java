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

import de.hybris.platform.cockpit.model.CommentMetadataModel;
import de.hybris.platform.comments.dto.CommentDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CommentMetadata first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = CommentMetadataModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "commentmetadata")
public class CommentMetadataDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CommentMetadata.x</code> attribute defined at extension <code> */
	private java.lang.Integer _x;
	/** <i>Generated variable</i> - Variable of <code>CommentMetadata.item</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _item;
	/** <i>Generated variable</i> - Variable of <code>CommentMetadata.y</code> attribute defined at extension <code> */
	private java.lang.Integer _y;
	/** <i>Generated variable</i> - Variable of <code>CommentMetadata.comment</code> attribute defined at extension <code> */
	private de.hybris.platform.comments.dto.CommentDTO _comment;
	/** <i>Generated variable</i> - Variable of <code>CommentMetadata.pageIndex</code> attribute defined at extension <code> */
	private java.lang.Integer _pageIndex;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentMetadataDTO()
	{
		super();
	}
	
	
	public CommentDTO getComment()
	{
		return this._comment;
	}
	
	public ItemDTO getItem()
	{
		return this._item;
	}
	
	public Integer getPageIndex()
	{
		return this._pageIndex;
	}
	
	public Integer getX()
	{
		return this._x;
	}
	
	public Integer getY()
	{
		return this._y;
	}
	
	public void setComment(final CommentDTO value)
	{
		this.modifiedPropsSet.add("comment");
		this._comment = value;
	}
	
	public void setItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("item");
		this._item = value;
	}
	
	public void setPageIndex(final Integer value)
	{
		this.modifiedPropsSet.add("pageIndex");
		this._pageIndex = value;
	}
	
	public void setX(final Integer value)
	{
		this.modifiedPropsSet.add("x");
		this._x = value;
	}
	
	public void setY(final Integer value)
	{
		this.modifiedPropsSet.add("y");
		this._y = value;
	}
	
}
