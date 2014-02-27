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

import de.hybris.platform.acceleratorservices.dto.email.EmailMessageDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type EmailMessage first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "emailmessages")
public class EmailMessagesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>EmailMessageDTO*/
	private List<EmailMessageDTO>  emailmessagesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailMessagesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailMessagesDTO(final List<EmailMessageDTO> emailmessagesList)
	{
		super();
		this.emailmessagesList=emailmessagesList;
	}
	
	
	/**
	 * @return the emailmessages
	 */
	@XmlElement(name = "emailmessage")
	public List<EmailMessageDTO> getEmailMessages()
	{
		return	emailmessagesList;
	}
	
	/**
	 * @param emailmessagesList 
	 *  the emailmessagesList to set   
	 */
	public void setEmailMessages(final List<EmailMessageDTO> emailmessagesList)
	{
		this.emailmessagesList=emailmessagesList;
	}
	
}
