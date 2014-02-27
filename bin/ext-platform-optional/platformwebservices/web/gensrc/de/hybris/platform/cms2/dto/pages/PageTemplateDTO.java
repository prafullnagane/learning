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
package de.hybris.platform.cms2.dto.pages;

import de.hybris.platform.cms2.dto.CMSPageTypeDTO;
import de.hybris.platform.cms2.dto.contents.CMSItemDTO;
import de.hybris.platform.cms2.dto.contents.ContentSlotNameDTO;
import de.hybris.platform.cms2.dto.relations.ContentSlotForTemplateDTO;
import de.hybris.platform.cms2.model.pages.PageTemplateModel;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PageTemplate first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = PageTemplateModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "pagetemplate")
public class PageTemplateDTO extends CMSItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>PageTemplate.contentSlots</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.relations.ContentSlotForTemplateDTO> _contentSlots;
	/** <i>Generated variable</i> - Variable of <code>PageTemplate.velocityTemplate</code> attribute defined at extension <code> */
	private java.lang.String _velocityTemplate;
	/** <i>Generated variable</i> - Variable of <code>PageTemplate.availableContentSlots</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.contents.ContentSlotNameDTO> _availableContentSlots;
	/** <i>Generated variable</i> - Variable of <code>PageTemplate.active</code> attribute defined at extension <code> */
	private java.lang.Boolean _active;
	/** <i>Generated variable</i> - Variable of <code>PageTemplate.restrictedPageTypes</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.cms2.dto.CMSPageTypeDTO> _restrictedPageTypes;
	/** <i>Generated variable</i> - Variable of <code>PageTemplate.frontendTemplateName</code> attribute defined at extension <code> */
	private java.lang.String _frontendTemplateName;
	/** <i>Generated variable</i> - Variable of <code>PageTemplate.previewIcon</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _previewIcon;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PageTemplateDTO()
	{
		super();
	}
	
	
	public Boolean getActive()
	{
		return this._active;
	}
	
	@XmlElementWrapper(name = "availableContentSlots")
	@XmlElement(name = "contentSlotName")
	public List<ContentSlotNameDTO> getAvailableContentSlots()
	{
		return this._availableContentSlots;
	}
	
	@XmlElementWrapper(name = "contentSlots")
	@XmlElement(name = "contentSlotForTemplate")
	public List<ContentSlotForTemplateDTO> getContentSlots()
	{
		return this._contentSlots;
	}
	
	public String getFrontendTemplateName()
	{
		return this._frontendTemplateName;
	}
	
	public MediaDTO getPreviewIcon()
	{
		return this._previewIcon;
	}
	
	@XmlElementWrapper(name = "restrictedPageTypes")
	@XmlElement(name = "cMSPageType")
	public Set<CMSPageTypeDTO> getRestrictedPageTypes()
	{
		return this._restrictedPageTypes;
	}
	
	public String getVelocityTemplate()
	{
		return this._velocityTemplate;
	}
	
	public void setActive(final Boolean value)
	{
		this.modifiedPropsSet.add("active");
		this._active = value;
	}
	
	public void setAvailableContentSlots(final List<ContentSlotNameDTO> value)
	{
		this.modifiedPropsSet.add("availableContentSlots");
		this._availableContentSlots = value;
	}
	
	public void setContentSlots(final List<ContentSlotForTemplateDTO> value)
	{
		this.modifiedPropsSet.add("contentSlots");
		this._contentSlots = value;
	}
	
	public void setFrontendTemplateName(final String value)
	{
		this.modifiedPropsSet.add("frontendTemplateName");
		this._frontendTemplateName = value;
	}
	
	public void setPreviewIcon(final MediaDTO value)
	{
		this.modifiedPropsSet.add("previewIcon");
		this._previewIcon = value;
	}
	
	public void setRestrictedPageTypes(final Set<CMSPageTypeDTO> value)
	{
		this.modifiedPropsSet.add("restrictedPageTypes");
		this._restrictedPageTypes = value;
	}
	
	public void setVelocityTemplate(final String value)
	{
		this.modifiedPropsSet.add("velocityTemplate");
		this._velocityTemplate = value;
	}
	
}
