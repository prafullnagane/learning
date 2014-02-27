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

import de.hybris.platform.acceleratorservices.dto.cms2.pages.EmailPageTemplateDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type EmailPageTemplate first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "emailpagetemplates")
public class EmailPageTemplatesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>EmailPageTemplateDTO*/
	private List<EmailPageTemplateDTO>  emailpagetemplatesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailPageTemplatesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailPageTemplatesDTO(final List<EmailPageTemplateDTO> emailpagetemplatesList)
	{
		super();
		this.emailpagetemplatesList=emailpagetemplatesList;
	}
	
	
	/**
	 * @return the emailpagetemplates
	 */
	@XmlElement(name = "emailpagetemplate")
	public List<EmailPageTemplateDTO> getEmailPageTemplates()
	{
		return	emailpagetemplatesList;
	}
	
	/**
	 * @param emailpagetemplatesList 
	 *  the emailpagetemplatesList to set   
	 */
	public void setEmailPageTemplates(final List<EmailPageTemplateDTO> emailpagetemplatesList)
	{
		this.emailpagetemplatesList=emailpagetemplatesList;
	}
	
}
