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

import de.hybris.platform.cms2.dto.CMSPageTypeDTO;
import de.hybris.platform.cms2.model.RestrictionTypeModel;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type RestrictionType first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = RestrictionTypeModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "restrictiontype")
public class RestrictionTypeDTO extends ComposedTypeDTO
{
	/** <i>Generated variable</i> - Variable of <code>RestrictionType.pageTypes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.CMSPageTypeDTO> _pageTypes;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RestrictionTypeDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "pageTypes")
	@XmlElement(name = "cMSPageType")
	public Collection<CMSPageTypeDTO> getPageTypes()
	{
		return this._pageTypes;
	}
	
	public void setPageTypes(final Collection<CMSPageTypeDTO> value)
	{
		this.modifiedPropsSet.add("pageTypes");
		this._pageTypes = value;
	}
	
}
