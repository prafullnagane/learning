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

import de.hybris.platform.cockpit.dto.CommentMetadataDTO;
import de.hybris.platform.comments.dto.AbstractCommentDTO;
import de.hybris.platform.comments.dto.CommentTypeDTO;
import de.hybris.platform.comments.dto.ComponentDTO;
import de.hybris.platform.comments.dto.ReplyDTO;
import de.hybris.platform.comments.model.CommentModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Comment first defined at extension comments
 */
@SuppressWarnings("all")
@GraphNode(target = CommentModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "comment")
public class CommentDTO extends AbstractCommentDTO
{
	/** <i>Generated variable</i> - Variable of <code>Comment.component</code> attribute defined at extension <code> */
	private de.hybris.platform.comments.dto.ComponentDTO _component;
	/** <i>Generated variable</i> - Variable of <code>Comment.assignedTo</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.user.UserDTO> _assignedTo;
	/** <i>Generated variable</i> - Variable of <code>Comment.replies</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.comments.dto.ReplyDTO> _replies;
	/** <i>Generated variable</i> - Variable of <code>Comment.relatedItems</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.ItemDTO> _relatedItems;
	/** <i>Generated variable</i> - Variable of <code>Comment.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>Comment.commentType</code> attribute defined at extension <code> */
	private de.hybris.platform.comments.dto.CommentTypeDTO _commentType;
	/** <i>Generated variable</i> - Variable of <code>Comment.watchers</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.security.PrincipalDTO> _watchers;
	/** <i>Generated variable</i> - Variable of <code>Comment.commentMetadata</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cockpit.dto.CommentMetadataDTO> _commentMetadata;
	/** <i>Generated variable</i> - Variable of <code>Comment.priority</code> attribute defined at extension <code> */
	private java.lang.Integer _priority;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "assignedTo")
	@XmlElement(name = "user")
	public Collection<UserDTO> getAssignedTo()
	{
		return this._assignedTo;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "commentMetadata")
	@XmlElement(name = "commentMetadata")
	public Collection<CommentMetadataDTO> getCommentMetadata()
	{
		return this._commentMetadata;
	}
	
	public CommentTypeDTO getCommentType()
	{
		return this._commentType;
	}
	
	public ComponentDTO getComponent()
	{
		return this._component;
	}
	
	public Integer getPriority()
	{
		return this._priority;
	}
	
	@XmlElementWrapper(name = "relatedItems")
	@XmlElement(name = "item")
	public Collection<ItemDTO> getRelatedItems()
	{
		return this._relatedItems;
	}
	
	@XmlElementWrapper(name = "replies")
	@XmlElement(name = "reply")
	public List<ReplyDTO> getReplies()
	{
		return this._replies;
	}
	
	@XmlElementWrapper(name = "watchers")
	@XmlElement(name = "principal")
	public Collection<PrincipalDTO> getWatchers()
	{
		return this._watchers;
	}
	
	public void setAssignedTo(final Collection<UserDTO> value)
	{
		this.modifiedPropsSet.add("assignedTo");
		this._assignedTo = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setCommentMetadata(final Collection<CommentMetadataDTO> value)
	{
		this.modifiedPropsSet.add("commentMetadata");
		this._commentMetadata = value;
	}
	
	public void setCommentType(final CommentTypeDTO value)
	{
		this.modifiedPropsSet.add("commentType");
		this._commentType = value;
	}
	
	public void setComponent(final ComponentDTO value)
	{
		this.modifiedPropsSet.add("component");
		this._component = value;
	}
	
	public void setPriority(final Integer value)
	{
		this.modifiedPropsSet.add("priority");
		this._priority = value;
	}
	
	public void setRelatedItems(final Collection<ItemDTO> value)
	{
		this.modifiedPropsSet.add("relatedItems");
		this._relatedItems = value;
	}
	
	public void setReplies(final List<ReplyDTO> value)
	{
		this.modifiedPropsSet.add("replies");
		this._replies = value;
	}
	
	public void setWatchers(final Collection<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("watchers");
		this._watchers = value;
	}
	
}
