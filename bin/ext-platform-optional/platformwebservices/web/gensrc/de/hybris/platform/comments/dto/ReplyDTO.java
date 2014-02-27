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
import de.hybris.platform.comments.dto.CommentDTO;
import de.hybris.platform.comments.dto.ReplyDTO;
import de.hybris.platform.comments.model.ReplyModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Reply first defined at extension comments
 */
@SuppressWarnings("all")
@GraphNode(target = ReplyModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "reply")
public class ReplyDTO extends AbstractCommentDTO
{
	/** <i>Generated variable</i> - Variable of <code>Reply.comment</code> attribute defined at extension <code> */
	private de.hybris.platform.comments.dto.CommentDTO _comment;
	/** <i>Generated variable</i> - Variable of <code>Reply.parent</code> attribute defined at extension <code> */
	private de.hybris.platform.comments.dto.ReplyDTO _parent;
	/** <i>Generated variable</i> - Variable of <code>Reply.replies</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.comments.dto.ReplyDTO> _replies;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReplyDTO()
	{
		super();
	}
	
	
	public CommentDTO getComment()
	{
		return this._comment;
	}
	
	public ReplyDTO getParent()
	{
		return this._parent;
	}
	
	@XmlElementWrapper(name = "replies")
	@XmlElement(name = "reply")
	public List<ReplyDTO> getReplies()
	{
		return this._replies;
	}
	
	public void setComment(final CommentDTO value)
	{
		this.modifiedPropsSet.add("comment");
		this._comment = value;
	}
	
	public void setParent(final ReplyDTO value)
	{
		this.modifiedPropsSet.add("parent");
		this._parent = value;
	}
	
	public void setReplies(final List<ReplyDTO> value)
	{
		this.modifiedPropsSet.add("replies");
		this._replies = value;
	}
	
}
