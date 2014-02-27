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
package de.hybris.platform.acceleratorservices.dto.email;

import de.hybris.platform.acceleratorservices.dto.email.EmailAttachmentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type EmailAttachment first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "emailattachments")
public class EmailAttachmentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>EmailAttachmentDTO*/
	private List<EmailAttachmentDTO>  emailattachmentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailAttachmentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailAttachmentsDTO(final List<EmailAttachmentDTO> emailattachmentsList)
	{
		super();
		this.emailattachmentsList=emailattachmentsList;
	}
	
	
	/**
	 * @return the emailattachments
	 */
	@XmlElement(name = "emailattachment")
	public List<EmailAttachmentDTO> getEmailAttachments()
	{
		return	emailattachmentsList;
	}
	
	/**
	 * @param emailattachmentsList 
	 *  the emailattachmentsList to set   
	 */
	public void setEmailAttachments(final List<EmailAttachmentDTO> emailattachmentsList)
	{
		this.emailattachmentsList=emailattachmentsList;
	}
	
}
