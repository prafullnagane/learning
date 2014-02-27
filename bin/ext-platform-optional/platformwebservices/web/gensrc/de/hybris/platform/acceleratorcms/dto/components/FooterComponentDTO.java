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

import de.hybris.platform.acceleratorcms.model.components.FooterComponentModel;
import de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO;
import de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type FooterComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@GraphNode(target = FooterComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "footercomponent")
public class FooterComponentDTO extends SimpleCMSComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>FooterComponent.wrapAfter</code> attribute defined at extension <code> */
	private java.lang.Integer _wrapAfter;
	/** <i>Generated variable</i> - Variable of <code>FooterComponent.notice</code> attribute defined at extension <code> */
	private java.lang.String _notice;
	/** <i>Generated variable</i> - Variable of <code>FooterComponent.navigationNodes</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO> _navigationNodes;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FooterComponentDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "navigationNodes")
	@XmlElement(name = "cMSNavigationNode")
	public List<CMSNavigationNodeDTO> getNavigationNodes()
	{
		return this._navigationNodes;
	}
	
	public String getNotice()
	{
		return this._notice;
	}
	
	public Integer getWrapAfter()
	{
		return this._wrapAfter;
	}
	
	public void setNavigationNodes(final List<CMSNavigationNodeDTO> value)
	{
		this.modifiedPropsSet.add("navigationNodes");
		this._navigationNodes = value;
	}
	
	public void setNotice(final String value)
	{
		this.modifiedPropsSet.add("notice");
		this._notice = value;
	}
	
	public void setWrapAfter(final Integer value)
	{
		this.modifiedPropsSet.add("wrapAfter");
		this._wrapAfter = value;
	}
	
}
