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
import de.hybris.platform.acceleratorservices.dto.email.EmailAttachmentDTO;
import de.hybris.platform.acceleratorservices.model.email.EmailMessageModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.processengine.dto.BusinessProcessDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type EmailMessage first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@GraphNode(target = EmailMessageModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "emailmessage")
public class EmailMessageDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.process</code> attribute defined at extension <code> */
	private de.hybris.platform.processengine.dto.BusinessProcessDTO _process;
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.sent</code> attribute defined at extension <code> */
	private boolean _sent;
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.subject</code> attribute defined at extension <code> */
	private java.lang.String _subject;
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.toAddresses</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.acceleratorservices.dto.email.EmailAddressDTO> _toAddresses;
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.attachments</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.acceleratorservices.dto.email.EmailAttachmentDTO> _attachments;
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.bccAddresses</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.acceleratorservices.dto.email.EmailAddressDTO> _bccAddresses;
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.fromAddress</code> attribute defined at extension <code> */
	private de.hybris.platform.acceleratorservices.dto.email.EmailAddressDTO _fromAddress;
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.ccAddresses</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.acceleratorservices.dto.email.EmailAddressDTO> _ccAddresses;
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.bodyMedia</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _bodyMedia;
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.sentDate</code> attribute defined at extension <code> */
	private java.util.Date _sentDate;
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.replyToAddress</code> attribute defined at extension <code> */
	private java.lang.String _replyToAddress;
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.sentMessageID</code> attribute defined at extension <code> */
	private java.lang.String _sentMessageID;
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.body</code> attribute defined at extension <code> */
	private java.lang.String _body;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailMessageDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "attachments")
	@XmlElement(name = "emailAttachment")
	public List<EmailAttachmentDTO> getAttachments()
	{
		return this._attachments;
	}
	
	@XmlElementWrapper(name = "bccAddresses")
	@XmlElement(name = "emailAddress")
	public List<EmailAddressDTO> getBccAddresses()
	{
		return this._bccAddresses;
	}
	
	public String getBody()
	{
		return this._body;
	}
	
	public MediaDTO getBodyMedia()
	{
		return this._bodyMedia;
	}
	
	@XmlElementWrapper(name = "ccAddresses")
	@XmlElement(name = "emailAddress")
	public List<EmailAddressDTO> getCcAddresses()
	{
		return this._ccAddresses;
	}
	
	public EmailAddressDTO getFromAddress()
	{
		return this._fromAddress;
	}
	
	public BusinessProcessDTO getProcess()
	{
		return this._process;
	}
	
	public String getReplyToAddress()
	{
		return this._replyToAddress;
	}
	
	public Date getSentDate()
	{
		return this._sentDate;
	}
	
	public String getSentMessageID()
	{
		return this._sentMessageID;
	}
	
	public String getSubject()
	{
		return this._subject;
	}
	
	@XmlElementWrapper(name = "toAddresses")
	@XmlElement(name = "emailAddress")
	public List<EmailAddressDTO> getToAddresses()
	{
		return this._toAddresses;
	}
	
	public boolean isSent()
	{
		return this._sent;
	}
	
	public void setAttachments(final List<EmailAttachmentDTO> value)
	{
		this.modifiedPropsSet.add("attachments");
		this._attachments = value;
	}
	
	public void setBccAddresses(final List<EmailAddressDTO> value)
	{
		this.modifiedPropsSet.add("bccAddresses");
		this._bccAddresses = value;
	}
	
	public void setBody(final String value)
	{
		this.modifiedPropsSet.add("body");
		this._body = value;
	}
	
	public void setBodyMedia(final MediaDTO value)
	{
		this.modifiedPropsSet.add("bodyMedia");
		this._bodyMedia = value;
	}
	
	public void setCcAddresses(final List<EmailAddressDTO> value)
	{
		this.modifiedPropsSet.add("ccAddresses");
		this._ccAddresses = value;
	}
	
	public void setFromAddress(final EmailAddressDTO value)
	{
		this.modifiedPropsSet.add("fromAddress");
		this._fromAddress = value;
	}
	
	public void setProcess(final BusinessProcessDTO value)
	{
		this.modifiedPropsSet.add("process");
		this._process = value;
	}
	
	public void setReplyToAddress(final String value)
	{
		this.modifiedPropsSet.add("replyToAddress");
		this._replyToAddress = value;
	}
	
	public void setSent(final boolean value)
	{
		this.modifiedPropsSet.add("sent");
		this._sent = value;
	}
	
	public void setSentDate(final Date value)
	{
		this.modifiedPropsSet.add("sentDate");
		this._sentDate = value;
	}
	
	public void setSentMessageID(final String value)
	{
		this.modifiedPropsSet.add("sentMessageID");
		this._sentMessageID = value;
	}
	
	public void setSubject(final String value)
	{
		this.modifiedPropsSet.add("subject");
		this._subject = value;
	}
	
	public void setToAddresses(final List<EmailAddressDTO> value)
	{
		this.modifiedPropsSet.add("toAddresses");
		this._toAddresses = value;
	}
	
}
