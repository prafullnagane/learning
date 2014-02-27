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

import de.hybris.platform.comments.dto.CommentAttachmentDTO;
import de.hybris.platform.comments.model.AbstractCommentModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractComment first defined at extension comments
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractCommentModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "abstractcomment")
public class AbstractCommentDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractComment.author</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _author;
	/** <i>Generated variable</i> - Variable of <code>AbstractComment.text</code> attribute defined at extension <code> */
	private java.lang.String _text;
	/** <i>Generated variable</i> - Variable of <code>AbstractComment.subject</code> attribute defined at extension <code> */
	private java.lang.String _subject;
	/** <i>Generated variable</i> - Variable of <code>AbstractComment.attachments</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.comments.dto.CommentAttachmentDTO> _attachments;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractCommentDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "attachments")
	@XmlElement(name = "commentAttachment")
	public Collection<CommentAttachmentDTO> getAttachments()
	{
		return this._attachments;
	}
	
	public UserDTO getAuthor()
	{
		return this._author;
	}
	
	public String getSubject()
	{
		return this._subject;
	}
	
	public String getText()
	{
		return this._text;
	}
	
	public void setAttachments(final Collection<CommentAttachmentDTO> value)
	{
		this.modifiedPropsSet.add("attachments");
		this._attachments = value;
	}
	
	public void setAuthor(final UserDTO value)
	{
		this.modifiedPropsSet.add("author");
		this._author = value;
	}
	
	public void setSubject(final String value)
	{
		this.modifiedPropsSet.add("subject");
		this._subject = value;
	}
	
	public void setText(final String value)
	{
		this.modifiedPropsSet.add("text");
		this._text = value;
	}
	
}
