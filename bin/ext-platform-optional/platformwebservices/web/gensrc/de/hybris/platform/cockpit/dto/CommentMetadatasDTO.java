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

import de.hybris.platform.cockpit.dto.CommentMetadataDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CommentMetadata first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "commentmetadatas")
public class CommentMetadatasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CommentMetadataDTO*/
	private List<CommentMetadataDTO>  commentmetadatasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentMetadatasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentMetadatasDTO(final List<CommentMetadataDTO> commentmetadatasList)
	{
		super();
		this.commentmetadatasList=commentmetadatasList;
	}
	
	
	/**
	 * @return the commentmetadatas
	 */
	@XmlElement(name = "commentmetadata")
	public List<CommentMetadataDTO> getCommentMetadatas()
	{
		return	commentmetadatasList;
	}
	
	/**
	 * @param commentmetadatasList 
	 *  the commentmetadatasList to set   
	 */
	public void setCommentMetadatas(final List<CommentMetadataDTO> commentmetadatasList)
	{
		this.commentmetadatasList=commentmetadatasList;
	}
	
}
