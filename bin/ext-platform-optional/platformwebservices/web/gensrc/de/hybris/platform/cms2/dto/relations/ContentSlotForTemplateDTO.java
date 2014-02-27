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
package de.hybris.platform.cms2.dto.relations;

import de.hybris.platform.cms2.dto.contents.contentslot.ContentSlotDTO;
import de.hybris.platform.cms2.dto.pages.PageTemplateDTO;
import de.hybris.platform.cms2.dto.relations.CMSRelationDTO;
import de.hybris.platform.cms2.model.relations.ContentSlotForTemplateModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ContentSlotForTemplate first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = ContentSlotForTemplateModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "contentslotfortemplate")
public class ContentSlotForTemplateDTO extends CMSRelationDTO
{
	/** <i>Generated variable</i> - Variable of <code>ContentSlotForTemplate.pageTemplate</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.pages.PageTemplateDTO _pageTemplate;
	/** <i>Generated variable</i> - Variable of <code>ContentSlotForTemplate.allowOverwrite</code> attribute defined at extension <code> */
	private java.lang.Boolean _allowOverwrite;
	/** <i>Generated variable</i> - Variable of <code>ContentSlotForTemplate.contentSlot</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.contents.contentslot.ContentSlotDTO _contentSlot;
	/** <i>Generated variable</i> - Variable of <code>ContentSlotForTemplate.position</code> attribute defined at extension <code> */
	private java.lang.String _position;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentSlotForTemplateDTO()
	{
		super();
	}
	
	
	public Boolean getAllowOverwrite()
	{
		return this._allowOverwrite;
	}
	
	public ContentSlotDTO getContentSlot()
	{
		return this._contentSlot;
	}
	
	public PageTemplateDTO getPageTemplate()
	{
		return this._pageTemplate;
	}
	
	public String getPosition()
	{
		return this._position;
	}
	
	public void setAllowOverwrite(final Boolean value)
	{
		this.modifiedPropsSet.add("allowOverwrite");
		this._allowOverwrite = value;
	}
	
	public void setContentSlot(final ContentSlotDTO value)
	{
		this.modifiedPropsSet.add("contentSlot");
		this._contentSlot = value;
	}
	
	public void setPageTemplate(final PageTemplateDTO value)
	{
		this.modifiedPropsSet.add("pageTemplate");
		this._pageTemplate = value;
	}
	
	public void setPosition(final String value)
	{
		this.modifiedPropsSet.add("position");
		this._position = value;
	}
	
}
