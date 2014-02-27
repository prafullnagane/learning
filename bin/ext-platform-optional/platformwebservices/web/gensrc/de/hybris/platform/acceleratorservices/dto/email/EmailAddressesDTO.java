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

import de.hybris.platform.acceleratorservices.dto.email.EmailAddressDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type EmailAddress first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "emailaddresses")
public class EmailAddressesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>EmailAddressDTO*/
	private List<EmailAddressDTO>  emailaddressesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailAddressesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailAddressesDTO(final List<EmailAddressDTO> emailaddressesList)
	{
		super();
		this.emailaddressesList=emailaddressesList;
	}
	
	
	/**
	 * @return the emailaddresses
	 */
	@XmlElement(name = "emailaddress")
	public List<EmailAddressDTO> getEmailAddresses()
	{
		return	emailaddressesList;
	}
	
	/**
	 * @param emailaddressesList 
	 *  the emailaddressesList to set   
	 */
	public void setEmailAddresses(final List<EmailAddressDTO> emailaddressesList)
	{
		this.emailaddressesList=emailaddressesList;
	}
	
}
