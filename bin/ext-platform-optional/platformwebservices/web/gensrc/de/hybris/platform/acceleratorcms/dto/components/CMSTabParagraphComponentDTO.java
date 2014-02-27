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
package de.hybris.platform.acceleratorcms.dto.components;

import de.hybris.platform.acceleratorcms.model.components.CMSTabParagraphComponentModel;
import de.hybris.platform.cms2.dto.contents.components.CMSParagraphComponentDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CMSTabParagraphComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@GraphNode(target = CMSTabParagraphComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "cmstabparagraphcomponent")
public class CMSTabParagraphComponentDTO extends CMSParagraphComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSTabParagraphComponent.title</code> attribute defined at extension <code> */
	private java.lang.String _title;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSTabParagraphComponentDTO()
	{
		super();
	}
	
	
	public String getTitle()
	{
		return this._title;
	}
	
	public void setTitle(final String value)
	{
		this.modifiedPropsSet.add("title");
		this._title = value;
	}
	
}
