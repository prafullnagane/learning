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
import de.hybris.platform.acceleratorservices.model.email.EmailAttachmentModel;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type EmailAttachment first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@GraphNode(target = EmailAttachmentModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "emailattachment")
public class EmailAttachmentDTO extends MediaDTO
{
	/** <i>Generated variable</i> - Variable of <code>EmailAttachment.message</code> attribute defined at extension <code> */
	private de.hybris.platform.acceleratorservices.dto.email.EmailMessageDTO _message;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailAttachmentDTO()
	{
		super();
	}
	
	
	public EmailMessageDTO getMessage()
	{
		return this._message;
	}
	
	public void setMessage(final EmailMessageDTO value)
	{
		this.modifiedPropsSet.add("message");
		this._message = value;
	}
	
}
