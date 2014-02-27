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
package de.hybris.platform.cms2lib.dto.components;

import de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO;
import de.hybris.platform.cms2lib.dto.components.BannerComponentDTO;
import de.hybris.platform.cms2lib.model.components.RotatingImagesComponentModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type RotatingImagesComponent first defined at extension cms2lib
 */
@SuppressWarnings("all")
@GraphNode(target = RotatingImagesComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "rotatingimagescomponent")
public class RotatingImagesComponentDTO extends SimpleCMSComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>RotatingImagesComponent.effect</code> attribute defined at extension <code> */
	private java.lang.String _effect;
	/** <i>Generated variable</i> - Variable of <code>RotatingImagesComponent.timeout</code> attribute defined at extension <code> */
	private java.lang.Integer _timeout;
	/** <i>Generated variable</i> - Variable of <code>RotatingImagesComponent.banners</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2lib.dto.components.BannerComponentDTO> _banners;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RotatingImagesComponentDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "banners")
	@XmlElement(name = "bannerComponent")
	public List<BannerComponentDTO> getBanners()
	{
		return this._banners;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getEffect()
	{
		return this._effect;
	}
	
	public Integer getTimeout()
	{
		return this._timeout;
	}
	
	public void setBanners(final List<BannerComponentDTO> value)
	{
		this.modifiedPropsSet.add("banners");
		this._banners = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setEffect(final String value)
	{
		this.modifiedPropsSet.add("effect");
		this._effect = value;
	}
	
	public void setTimeout(final Integer value)
	{
		this.modifiedPropsSet.add("timeout");
		this._timeout = value;
	}
	
}
