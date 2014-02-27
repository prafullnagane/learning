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

import de.hybris.platform.comments.dto.CommentUserSettingDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CommentUserSetting first defined at extension comments
 */
@SuppressWarnings("all")
@XmlRootElement(name = "commentusersettings")
public class CommentUserSettingsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CommentUserSettingDTO*/
	private List<CommentUserSettingDTO>  commentusersettingsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentUserSettingsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CommentUserSettingsDTO(final List<CommentUserSettingDTO> commentusersettingsList)
	{
		super();
		this.commentusersettingsList=commentusersettingsList;
	}
	
	
	/**
	 * @return the commentusersettings
	 */
	@XmlElement(name = "commentusersetting")
	public List<CommentUserSettingDTO> getCommentUserSettings()
	{
		return	commentusersettingsList;
	}
	
	/**
	 * @param commentusersettingsList 
	 *  the commentusersettingsList to set   
	 */
	public void setCommentUserSettings(final List<CommentUserSettingDTO> commentusersettingsList)
	{
		this.commentusersettingsList=commentusersettingsList;
	}
	
}
