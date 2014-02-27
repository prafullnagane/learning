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
package de.hybris.platform.cms2.dto.contents;

import de.hybris.platform.cms2.dto.CMSComponentTypeDTO;
import de.hybris.platform.cms2.dto.ComponentTypeGroupDTO;
import de.hybris.platform.cms2.dto.pages.PageTemplateDTO;
import de.hybris.platform.cms2.model.contents.ContentSlotNameModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ContentSlotName first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = ContentSlotNameModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "contentslotname")
public class ContentSlotNameDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ContentSlotName.compTypeGroup</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.ComponentTypeGroupDTO _compTypeGroup;
	/** <i>Generated variable</i> - Variable of <code>ContentSlotName.validComponentTypes</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.cms2.dto.CMSComponentTypeDTO> _validComponentTypes;
	/** <i>Generated variable</i> - Variable of <code>ContentSlotName.template</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.pages.PageTemplateDTO _template;
	/** <i>Generated variable</i> - Variable of <code>ContentSlotName.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentSlotNameDTO()
	{
		super();
	}
	
	
	public ComponentTypeGroupDTO getCompTypeGroup()
	{
		return this._compTypeGroup;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public PageTemplateDTO getTemplate()
	{
		return this._template;
	}
	
	@XmlElementWrapper(name = "validComponentTypes")
	@XmlElement(name = "cMSComponentType")
	public Set<CMSComponentTypeDTO> getValidComponentTypes()
	{
		return this._validComponentTypes;
	}
	
	public void setCompTypeGroup(final ComponentTypeGroupDTO value)
	{
		this.modifiedPropsSet.add("compTypeGroup");
		this._compTypeGroup = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setTemplate(final PageTemplateDTO value)
	{
		this.modifiedPropsSet.add("template");
		this._template = value;
	}
	
	public void setValidComponentTypes(final Set<CMSComponentTypeDTO> value)
	{
		this.modifiedPropsSet.add("validComponentTypes");
		this._validComponentTypes = value;
	}
	
}
