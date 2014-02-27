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

import de.hybris.platform.cms2.dto.ComponentTypeGroupDTO;
import de.hybris.platform.cms2.dto.contents.ContentSlotNameDTO;
import de.hybris.platform.cms2.dto.site.CMSSiteDTO;
import de.hybris.platform.cms2.model.CMSComponentTypeModel;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CMSComponentType first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = CMSComponentTypeModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "cmscomponenttype")
public class CMSComponentTypeDTO extends ComposedTypeDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSComponentType.contentSlotNames</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.cms2.dto.contents.ContentSlotNameDTO> _contentSlotNames;
	/** <i>Generated variable</i> - Variable of <code>CMSComponentType.componentTypeGroups</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.cms2.dto.ComponentTypeGroupDTO> _componentTypeGroups;
	/** <i>Generated variable</i> - Variable of <code>CMSComponentType.cmsSites</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.cms2.dto.site.CMSSiteDTO> _cmsSites;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSComponentTypeDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "cmsSites")
	@XmlElement(name = "cMSSite")
	public Set<CMSSiteDTO> getCmsSites()
	{
		return this._cmsSites;
	}
	
	@XmlElementWrapper(name = "componentTypeGroups")
	@XmlElement(name = "componentTypeGroup")
	public Set<ComponentTypeGroupDTO> getComponentTypeGroups()
	{
		return this._componentTypeGroups;
	}
	
	@XmlElementWrapper(name = "contentSlotNames")
	@XmlElement(name = "contentSlotName")
	public Set<ContentSlotNameDTO> getContentSlotNames()
	{
		return this._contentSlotNames;
	}
	
	public void setCmsSites(final Set<CMSSiteDTO> value)
	{
		this.modifiedPropsSet.add("cmsSites");
		this._cmsSites = value;
	}
	
	public void setComponentTypeGroups(final Set<ComponentTypeGroupDTO> value)
	{
		this.modifiedPropsSet.add("componentTypeGroups");
		this._componentTypeGroups = value;
	}
	
	public void setContentSlotNames(final Set<ContentSlotNameDTO> value)
	{
		this.modifiedPropsSet.add("contentSlotNames");
		this._contentSlotNames = value;
	}
	
}
