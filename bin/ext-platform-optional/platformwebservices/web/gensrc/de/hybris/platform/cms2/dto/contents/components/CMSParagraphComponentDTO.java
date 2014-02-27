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
package de.hybris.platform.cms2.dto.contents.components;

import de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO;
import de.hybris.platform.cms2.model.contents.components.CMSParagraphComponentModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CMSParagraphComponent first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = CMSParagraphComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "cmsparagraphcomponent")
public class CMSParagraphComponentDTO extends SimpleCMSComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSParagraphComponent.content</code> attribute defined at extension <code> */
	private java.lang.String _content;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSParagraphComponentDTO()
	{
		super();
	}
	
	
	public String getContent()
	{
		return this._content;
	}
	
	public void setContent(final String value)
	{
		this.modifiedPropsSet.add("content");
		this._content = value;
	}
	
}
