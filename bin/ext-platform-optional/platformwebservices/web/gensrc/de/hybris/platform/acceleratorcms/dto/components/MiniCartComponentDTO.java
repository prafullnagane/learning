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

import de.hybris.platform.acceleratorcms.dto.components.SimpleBannerComponentDTO;
import de.hybris.platform.acceleratorcms.model.components.MiniCartComponentModel;
import de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type MiniCartComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@GraphNode(target = MiniCartComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "minicartcomponent")
public class MiniCartComponentDTO extends SimpleCMSComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>MiniCartComponent.title</code> attribute defined at extension <code> */
	private java.lang.String _title;
	/** <i>Generated variable</i> - Variable of <code>MiniCartComponent.shownProductCount</code> attribute defined at extension <code> */
	private int _shownProductCount;
	/** <i>Generated variable</i> - Variable of <code>MiniCartComponent.totalDisplay</code> attribute defined at extension <code> */
	private java.lang.String _totalDisplay;
	/** <i>Generated variable</i> - Variable of <code>MiniCartComponent.lightboxBannerComponent</code> attribute defined at extension <code> */
	private de.hybris.platform.acceleratorcms.dto.components.SimpleBannerComponentDTO _lightboxBannerComponent;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MiniCartComponentDTO()
	{
		super();
	}
	
	
	public SimpleBannerComponentDTO getLightboxBannerComponent()
	{
		return this._lightboxBannerComponent;
	}
	
	public int getShownProductCount()
	{
		return this._shownProductCount;
	}
	
	public String getTitle()
	{
		return this._title;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getTotalDisplay()
	{
		return this._totalDisplay;
	}
	
	public void setLightboxBannerComponent(final SimpleBannerComponentDTO value)
	{
		this.modifiedPropsSet.add("lightboxBannerComponent");
		this._lightboxBannerComponent = value;
	}
	
	public void setShownProductCount(final int value)
	{
		this.modifiedPropsSet.add("shownProductCount");
		this._shownProductCount = value;
	}
	
	public void setTitle(final String value)
	{
		this.modifiedPropsSet.add("title");
		this._title = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setTotalDisplay(final String value)
	{
		this.modifiedPropsSet.add("totalDisplay");
		this._totalDisplay = value;
	}
	
}
