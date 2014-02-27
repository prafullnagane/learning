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

import de.hybris.platform.acceleratorcms.model.components.NavigationBarComponentModel;
import de.hybris.platform.cms2.dto.contents.components.CMSLinkComponentDTO;
import de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO;
import de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type NavigationBarComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@GraphNode(target = NavigationBarComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "navigationbarcomponent")
public class NavigationBarComponentDTO extends SimpleCMSComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>NavigationBarComponent.wrapAfter</code> attribute defined at extension <code> */
	private java.lang.Integer _wrapAfter;
	/** <i>Generated variable</i> - Variable of <code>NavigationBarComponent.navigationNode</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO _navigationNode;
	/** <i>Generated variable</i> - Variable of <code>NavigationBarComponent.dropDownLayout</code> attribute defined at extension <code> */
	private java.lang.String _dropDownLayout;
	/** <i>Generated variable</i> - Variable of <code>NavigationBarComponent.link</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.contents.components.CMSLinkComponentDTO _link;
	/** <i>Generated variable</i> - Variable of <code>NavigationBarComponent.styleClass</code> attribute defined at extension <code> */
	private java.lang.String _styleClass;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public NavigationBarComponentDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getDropDownLayout()
	{
		return this._dropDownLayout;
	}
	
	public CMSLinkComponentDTO getLink()
	{
		return this._link;
	}
	
	public CMSNavigationNodeDTO getNavigationNode()
	{
		return this._navigationNode;
	}
	
	public String getStyleClass()
	{
		return this._styleClass;
	}
	
	public Integer getWrapAfter()
	{
		return this._wrapAfter;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setDropDownLayout(final String value)
	{
		this.modifiedPropsSet.add("dropDownLayout");
		this._dropDownLayout = value;
	}
	
	public void setLink(final CMSLinkComponentDTO value)
	{
		this.modifiedPropsSet.add("link");
		this._link = value;
	}
	
	public void setNavigationNode(final CMSNavigationNodeDTO value)
	{
		this.modifiedPropsSet.add("navigationNode");
		this._navigationNode = value;
	}
	
	public void setStyleClass(final String value)
	{
		this.modifiedPropsSet.add("styleClass");
		this._styleClass = value;
	}
	
	public void setWrapAfter(final Integer value)
	{
		this.modifiedPropsSet.add("wrapAfter");
		this._wrapAfter = value;
	}
	
}
