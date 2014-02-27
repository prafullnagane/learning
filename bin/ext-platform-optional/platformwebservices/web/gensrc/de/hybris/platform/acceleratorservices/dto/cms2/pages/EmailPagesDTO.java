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
package de.hybris.platform.acceleratorservices.dto.cms2.pages;

import de.hybris.platform.acceleratorservices.dto.cms2.pages.EmailPageDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type EmailPage first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "emailpages")
public class EmailPagesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>EmailPageDTO*/
	private List<EmailPageDTO>  emailpagesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailPagesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailPagesDTO(final List<EmailPageDTO> emailpagesList)
	{
		super();
		this.emailpagesList=emailpagesList;
	}
	
	
	/**
	 * @return the emailpages
	 */
	@XmlElement(name = "emailpage")
	public List<EmailPageDTO> getEmailPages()
	{
		return	emailpagesList;
	}
	
	/**
	 * @param emailpagesList 
	 *  the emailpagesList to set   
	 */
	public void setEmailPages(final List<EmailPageDTO> emailpagesList)
	{
		this.emailpagesList=emailpagesList;
	}
	
}
