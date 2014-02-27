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

import de.hybris.platform.comments.dto.CommentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Comment first defined at extension comments
 */
@SuppressWarnings("all")
@XmlRootElement(name = "comments")
public class CommentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CommentDTO*/
	private List<CommentDTO>  commentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentsDTO(final List<CommentDTO> commentsList)
	{
		super();
		this.commentsList=commentsList;
	}
	
	
	/**
	 * @return the comments
	 */
	@XmlElement(name = "comment")
	public List<CommentDTO> getComments()
	{
		return	commentsList;
	}
	
	/**
	 * @param commentsList 
	 *  the commentsList to set   
	 */
	public void setComments(final List<CommentDTO> commentsList)
	{
		this.commentsList=commentsList;
	}
	
}
