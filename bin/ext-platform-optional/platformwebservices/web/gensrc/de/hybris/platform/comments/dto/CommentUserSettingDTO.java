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
import de.hybris.platform.comments.model.CommentUserSettingModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CommentUserSetting first defined at extension comments
 */
@SuppressWarnings("all")
@GraphNode(target = CommentUserSettingModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "commentusersetting")
public class CommentUserSettingDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CommentUserSetting.read</code> attribute defined at extension <code> */
	private java.lang.Boolean _read;
	/** <i>Generated variable</i> - Variable of <code>CommentUserSetting.ignored</code> attribute defined at extension <code> */
	private java.lang.Boolean _ignored;
	/** <i>Generated variable</i> - Variable of <code>CommentUserSetting.priority</code> attribute defined at extension <code> */
	private java.lang.Integer _priority;
	/** <i>Generated variable</i> - Variable of <code>CommentUserSetting.hidden</code> attribute defined at extension <code> */
	private java.lang.Boolean _hidden;
	/** <i>Generated variable</i> - Variable of <code>CommentUserSetting.workStatus</code> attribute defined at extension <code> */
	private java.lang.Boolean _workStatus;
	/** <i>Generated variable</i> - Variable of <code>CommentUserSetting.comment</code> attribute defined at extension <code> */
	private de.hybris.platform.comments.dto.AbstractCommentDTO _comment;
	/** <i>Generated variable</i> - Variable of <code>CommentUserSetting.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentUserSettingDTO()
	{
		super();
	}
	
	
	public AbstractCommentDTO getComment()
	{
		return this._comment;
	}
	
	public Boolean getHidden()
	{
		return this._hidden;
	}
	
	public Boolean getIgnored()
	{
		return this._ignored;
	}
	
	public Integer getPriority()
	{
		return this._priority;
	}
	
	public Boolean getRead()
	{
		return this._read;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	public Boolean getWorkStatus()
	{
		return this._workStatus;
	}
	
	public void setComment(final AbstractCommentDTO value)
	{
		this.modifiedPropsSet.add("comment");
		this._comment = value;
	}
	
	public void setHidden(final Boolean value)
	{
		this.modifiedPropsSet.add("hidden");
		this._hidden = value;
	}
	
	public void setIgnored(final Boolean value)
	{
		this.modifiedPropsSet.add("ignored");
		this._ignored = value;
	}
	
	public void setPriority(final Integer value)
	{
		this.modifiedPropsSet.add("priority");
		this._priority = value;
	}
	
	public void setRead(final Boolean value)
	{
		this.modifiedPropsSet.add("read");
		this._read = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
	public void setWorkStatus(final Boolean value)
	{
		this.modifiedPropsSet.add("workStatus");
		this._workStatus = value;
	}
	
}
