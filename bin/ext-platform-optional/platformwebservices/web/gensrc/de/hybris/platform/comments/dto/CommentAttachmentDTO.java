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

import de.hybris.platform.comments.dto.AbstractCommentDTO;
import de.hybris.platform.comments.model.CommentAttachmentModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CommentAttachment first defined at extension comments
 */
@SuppressWarnings("all")
@GraphNode(target = CommentAttachmentModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "commentattachment")
public class CommentAttachmentDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CommentAttachment.item</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _item;
	/** <i>Generated variable</i> - Variable of <code>CommentAttachment.abstractComment</code> attribute defined at extension <code> */
	private de.hybris.platform.comments.dto.AbstractCommentDTO _abstractComment;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentAttachmentDTO()
	{
		super();
	}
	
	
	public AbstractCommentDTO getAbstractComment()
	{
		return this._abstractComment;
	}
	
	public ItemDTO getItem()
	{
		return this._item;
	}
	
	public void setAbstractComment(final AbstractCommentDTO value)
	{
		this.modifiedPropsSet.add("abstractComment");
		this._abstractComment = value;
	}
	
	public void setItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("item");
		this._item = value;
	}
	
}
