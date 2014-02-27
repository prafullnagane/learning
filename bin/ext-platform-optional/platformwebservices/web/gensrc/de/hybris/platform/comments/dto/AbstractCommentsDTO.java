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
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AbstractComment first defined at extension comments
 */
@SuppressWarnings("all")
@XmlRootElement(name = "abstractcomments")
public class AbstractCommentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AbstractCommentDTO*/
	private List<AbstractCommentDTO>  abstractcommentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractCommentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractCommentsDTO(final List<AbstractCommentDTO> abstractcommentsList)
	{
		super();
		this.abstractcommentsList=abstractcommentsList;
	}
	
	
	/**
	 * @return the abstractcomments
	 */
	@XmlElement(name = "abstractcomment")
	public List<AbstractCommentDTO> getAbstractComments()
	{
		return	abstractcommentsList;
	}
	
	/**
	 * @param abstractcommentsList 
	 *  the abstractcommentsList to set   
	 */
	public void setAbstractComments(final List<AbstractCommentDTO> abstractcommentsList)
	{
		this.abstractcommentsList=abstractcommentsList;
	}
	
}
