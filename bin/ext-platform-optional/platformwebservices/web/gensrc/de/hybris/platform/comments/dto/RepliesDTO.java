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

import de.hybris.platform.comments.dto.ReplyDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Reply first defined at extension comments
 */
@SuppressWarnings("all")
@XmlRootElement(name = "replies")
public class RepliesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ReplyDTO*/
	private List<ReplyDTO>  repliesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RepliesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RepliesDTO(final List<ReplyDTO> repliesList)
	{
		super();
		this.repliesList=repliesList;
	}
	
	
	/**
	 * @return the replies
	 */
	@XmlElement(name = "reply")
	public List<ReplyDTO> getReplies()
	{
		return	repliesList;
	}
	
	/**
	 * @param repliesList 
	 *  the repliesList to set   
	 */
	public void setReplies(final List<ReplyDTO> repliesList)
	{
		this.repliesList=repliesList;
	}
	
}
