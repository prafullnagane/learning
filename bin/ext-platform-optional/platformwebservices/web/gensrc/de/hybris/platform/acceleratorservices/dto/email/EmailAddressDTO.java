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
import de.hybris.platform.acceleratorservices.model.email.EmailAddressModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type EmailAddress first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@GraphNode(target = EmailAddressModel.class, factory = GenericNodeFactory.class, uidProperties="displayName")
@XmlRootElement(name = "emailaddress")
public class EmailAddressDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>EmailAddress.bccMessages</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.acceleratorservices.dto.email.EmailMessageDTO> _bccMessages;
	/** <i>Generated variable</i> - Variable of <code>EmailAddress.messagesSent</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.acceleratorservices.dto.email.EmailMessageDTO> _messagesSent;
	/** <i>Generated variable</i> - Variable of <code>EmailAddress.toMessages</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.acceleratorservices.dto.email.EmailMessageDTO> _toMessages;
	/** <i>Generated variable</i> - Variable of <code>EmailAddress.emailAddress</code> attribute defined at extension <code> */
	private java.lang.String _emailAddress;
	/** <i>Generated variable</i> - Variable of <code>EmailAddress.ccMessages</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.acceleratorservices.dto.email.EmailMessageDTO> _ccMessages;
	/** <i>Generated variable</i> - Variable of <code>EmailAddress.displayName</code> attribute defined at extension <code> */
	private java.lang.String _displayName;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailAddressDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "bccMessages")
	@XmlElement(name = "emailMessage")
	public List<EmailMessageDTO> getBccMessages()
	{
		return this._bccMessages;
	}
	
	@XmlElementWrapper(name = "ccMessages")
	@XmlElement(name = "emailMessage")
	public List<EmailMessageDTO> getCcMessages()
	{
		return this._ccMessages;
	}
	
	@XmlAttribute
	public String getDisplayName()
	{
		return this._displayName;
	}
	
	@XmlAttribute
	public String getEmailAddress()
	{
		return this._emailAddress;
	}
	
	@XmlElementWrapper(name = "messagesSent")
	@XmlElement(name = "emailMessage")
	public List<EmailMessageDTO> getMessagesSent()
	{
		return this._messagesSent;
	}
	
	@XmlElementWrapper(name = "toMessages")
	@XmlElement(name = "emailMessage")
	public List<EmailMessageDTO> getToMessages()
	{
		return this._toMessages;
	}
	
	public void setBccMessages(final List<EmailMessageDTO> value)
	{
		this.modifiedPropsSet.add("bccMessages");
		this._bccMessages = value;
	}
	
	public void setCcMessages(final List<EmailMessageDTO> value)
	{
		this.modifiedPropsSet.add("ccMessages");
		this._ccMessages = value;
	}
	
	public void setDisplayName(final String value)
	{
		this.modifiedPropsSet.add("displayName");
		this._displayName = value;
	}
	
	public void setEmailAddress(final String value)
	{
		this.modifiedPropsSet.add("emailAddress");
		this._emailAddress = value;
	}
	
	public void setMessagesSent(final List<EmailMessageDTO> value)
	{
		this.modifiedPropsSet.add("messagesSent");
		this._messagesSent = value;
	}
	
	public void setToMessages(final List<EmailMessageDTO> value)
	{
		this.modifiedPropsSet.add("toMessages");
		this._toMessages = value;
	}
	
}
