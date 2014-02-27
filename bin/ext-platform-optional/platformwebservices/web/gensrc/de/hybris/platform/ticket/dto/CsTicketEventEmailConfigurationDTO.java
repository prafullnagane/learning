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
package de.hybris.platform.ticket.dto;

import de.hybris.platform.comments.dto.CommentTypeDTO;
import de.hybris.platform.commons.dto.renderer.RendererTemplateDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.AttributeDescriptorDTO;
import de.hybris.platform.ticket.model.CsTicketEventEmailConfigurationModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Set;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CsTicketEventEmailConfiguration first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@GraphNode(target = CsTicketEventEmailConfigurationModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "csticketeventemailconfiguration")
public class CsTicketEventEmailConfigurationDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CsTicketEventEmailConfiguration.subject</code> attribute defined at extension <code> */
	private java.lang.String _subject;
	/** <i>Generated variable</i> - Variable of <code>CsTicketEventEmailConfiguration.htmlTemplate</code> attribute defined at extension <code> */
	private de.hybris.platform.commons.dto.renderer.RendererTemplateDTO _htmlTemplate;
	/** <i>Generated variable</i> - Variable of <code>CsTicketEventEmailConfiguration.recipientType</code> attribute defined at extension <code> */
	private java.lang.String _recipientType;
	/** <i>Generated variable</i> - Variable of <code>CsTicketEventEmailConfiguration.eventType</code> attribute defined at extension <code> */
	private de.hybris.platform.comments.dto.CommentTypeDTO _eventType;
	/** <i>Generated variable</i> - Variable of <code>CsTicketEventEmailConfiguration.plainTextTemplate</code> attribute defined at extension <code> */
	private de.hybris.platform.commons.dto.renderer.RendererTemplateDTO _plainTextTemplate;
	/** <i>Generated variable</i> - Variable of <code>CsTicketEventEmailConfiguration.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>CsTicketEventEmailConfiguration.alteredAttributes</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.core.dto.type.AttributeDescriptorDTO> _alteredAttributes;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketEventEmailConfigurationDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "alteredAttributes")
	@XmlElement(name = "attributeDescriptor")
	public Set<AttributeDescriptorDTO> getAlteredAttributes()
	{
		return this._alteredAttributes;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public CommentTypeDTO getEventType()
	{
		return this._eventType;
	}
	
	public RendererTemplateDTO getHtmlTemplate()
	{
		return this._htmlTemplate;
	}
	
	public RendererTemplateDTO getPlainTextTemplate()
	{
		return this._plainTextTemplate;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getRecipientType()
	{
		return this._recipientType;
	}
	
	public String getSubject()
	{
		return this._subject;
	}
	
	public void setAlteredAttributes(final Set<AttributeDescriptorDTO> value)
	{
		this.modifiedPropsSet.add("alteredAttributes");
		this._alteredAttributes = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setEventType(final CommentTypeDTO value)
	{
		this.modifiedPropsSet.add("eventType");
		this._eventType = value;
	}
	
	public void setHtmlTemplate(final RendererTemplateDTO value)
	{
		this.modifiedPropsSet.add("htmlTemplate");
		this._htmlTemplate = value;
	}
	
	public void setPlainTextTemplate(final RendererTemplateDTO value)
	{
		this.modifiedPropsSet.add("plainTextTemplate");
		this._plainTextTemplate = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setRecipientType(final String value)
	{
		this.modifiedPropsSet.add("recipientType");
		this._recipientType = value;
	}
	
	public void setSubject(final String value)
	{
		this.modifiedPropsSet.add("subject");
		this._subject = value;
	}
	
}
