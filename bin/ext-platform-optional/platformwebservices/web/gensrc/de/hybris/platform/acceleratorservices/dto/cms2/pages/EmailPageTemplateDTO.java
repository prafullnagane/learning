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

import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageTemplateModel;
import de.hybris.platform.cms2.dto.pages.PageTemplateDTO;
import de.hybris.platform.commons.dto.renderer.RendererTemplateDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type EmailPageTemplate first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@GraphNode(target = EmailPageTemplateModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "emailpagetemplate")
public class EmailPageTemplateDTO extends PageTemplateDTO
{
	/** <i>Generated variable</i> - Variable of <code>EmailPageTemplate.htmlTemplate</code> attribute defined at extension <code> */
	private de.hybris.platform.commons.dto.renderer.RendererTemplateDTO _htmlTemplate;
	/** <i>Generated variable</i> - Variable of <code>EmailPageTemplate.subject</code> attribute defined at extension <code> */
	private de.hybris.platform.commons.dto.renderer.RendererTemplateDTO _subject;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailPageTemplateDTO()
	{
		super();
	}
	
	
	public RendererTemplateDTO getHtmlTemplate()
	{
		return this._htmlTemplate;
	}
	
	public RendererTemplateDTO getSubject()
	{
		return this._subject;
	}
	
	public void setHtmlTemplate(final RendererTemplateDTO value)
	{
		this.modifiedPropsSet.add("htmlTemplate");
		this._htmlTemplate = value;
	}
	
	public void setSubject(final RendererTemplateDTO value)
	{
		this.modifiedPropsSet.add("subject");
		this._subject = value;
	}
	
}
