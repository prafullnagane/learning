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

import de.hybris.platform.cms2.dto.CMSComponentTypeDTO;
import de.hybris.platform.cms2.model.ComponentTypeGroupModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Set;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ComponentTypeGroup first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = ComponentTypeGroupModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "componenttypegroup")
public class ComponentTypeGroupDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ComponentTypeGroup.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>ComponentTypeGroup.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>ComponentTypeGroup.cmsComponentTypes</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.cms2.dto.CMSComponentTypeDTO> _cmsComponentTypes;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ComponentTypeGroupDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "cmsComponentTypes")
	@XmlElement(name = "cMSComponentType")
	public Set<CMSComponentTypeDTO> getCmsComponentTypes()
	{
		return this._cmsComponentTypes;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public void setCmsComponentTypes(final Set<CMSComponentTypeDTO> value)
	{
		this.modifiedPropsSet.add("cmsComponentTypes");
		this._cmsComponentTypes = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
}
