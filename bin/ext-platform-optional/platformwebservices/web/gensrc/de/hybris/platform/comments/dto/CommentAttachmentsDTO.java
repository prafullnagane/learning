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
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CommentAttachment first defined at extension comments
 */
@SuppressWarnings("all")
@XmlRootElement(name = "commentattachments")
public class CommentAttachmentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CommentAttachmentDTO*/
	private List<CommentAttachmentDTO>  commentattachmentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentAttachmentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentAttachmentsDTO(final List<CommentAttachmentDTO> commentattachmentsList)
	{
		super();
		this.commentattachmentsList=commentattachmentsList;
	}
	
	
	/**
	 * @return the commentattachments
	 */
	@XmlElement(name = "commentattachment")
	public List<CommentAttachmentDTO> getCommentAttachments()
	{
		return	commentattachmentsList;
	}
	
	/**
	 * @param commentattachmentsList 
	 *  the commentattachmentsList to set   
	 */
	public void setCommentAttachments(final List<CommentAttachmentDTO> commentattachmentsList)
	{
		this.commentattachmentsList=commentattachmentsList;
	}
	
}
