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
package de.hybris.platform.cms2.dto;

import de.hybris.platform.cms2.dto.RestrictionTypeDTO;
import de.hybris.platform.cms2.dto.pages.PageTemplateDTO;
import de.hybris.platform.cms2.model.CMSPageTypeModel;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CMSPageType first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = CMSPageTypeModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "cmspagetype")
public class CMSPageTypeDTO extends ComposedTypeDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSPageType.templates</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.cms2.dto.pages.PageTemplateDTO> _templates;
	/** <i>Generated variable</i> - Variable of <code>CMSPageType.restrictionTypes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.RestrictionTypeDTO> _restrictionTypes;
	/** <i>Generated variable</i> - Variable of <code>CMSPageType.previewDisabled</code> attribute defined at extension <code> */
	private boolean _previewDisabled;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSPageTypeDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "restrictionTypes")
	@XmlElement(name = "restrictionType")
	public Collection<RestrictionTypeDTO> getRestrictionTypes()
	{
		return this._restrictionTypes;
	}
	
	@XmlElementWrapper(name = "templates")
	@XmlElement(name = "pageTemplate")
	public Set<PageTemplateDTO> getTemplates()
	{
		return this._templates;
	}
	
	public boolean isPreviewDisabled()
	{
		return this._previewDisabled;
	}
	
	public void setPreviewDisabled(final boolean value)
	{
		this.modifiedPropsSet.add("previewDisabled");
		this._previewDisabled = value;
	}
	
	public void setRestrictionTypes(final Collection<RestrictionTypeDTO> value)
	{
		this.modifiedPropsSet.add("restrictionTypes");
		this._restrictionTypes = value;
	}
	
	public void setTemplates(final Set<PageTemplateDTO> value)
	{
		this.modifiedPropsSet.add("templates");
		this._templates = value;
	}
	
}
