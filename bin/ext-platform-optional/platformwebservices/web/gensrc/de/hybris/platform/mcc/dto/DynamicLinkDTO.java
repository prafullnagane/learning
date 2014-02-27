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
package de.hybris.platform.mcc.dto;

import de.hybris.platform.mcc.dto.StaticLinkDTO;
import de.hybris.platform.mcc.model.DynamicLinkModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type DynamicLink first defined at extension mcc
 */
@SuppressWarnings("all")
@GraphNode(target = DynamicLinkModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "dynamiclink")
public class DynamicLinkDTO extends StaticLinkDTO
{
	/** <i>Generated variable</i> - Variable of <code>DynamicLink.script</code> attribute defined at extension <code> */
	private java.lang.String _script;
	/** <i>Generated variable</i> - Variable of <code>DynamicLink.visibleScript</code> attribute defined at extension <code> */
	private java.lang.String _visibleScript;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DynamicLinkDTO()
	{
		super();
	}
	
	
	public String getScript()
	{
		return this._script;
	}
	
	public String getVisibleScript()
	{
		return this._visibleScript;
	}
	
	public void setScript(final String value)
	{
		this.modifiedPropsSet.add("script");
		this._script = value;
	}
	
	public void setVisibleScript(final String value)
	{
		this.modifiedPropsSet.add("visibleScript");
		this._visibleScript = value;
	}
	
}
