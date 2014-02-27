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

import de.hybris.platform.cms2.dto.pages.ContentPageDTO;
import de.hybris.platform.cms2lib.dto.components.AbstractBannerComponentDTO;
import de.hybris.platform.cms2lib.model.components.FlashComponentModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type FlashComponent first defined at extension cms2lib
 */
@SuppressWarnings("all")
@GraphNode(target = FlashComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "flashcomponent")
public class FlashComponentDTO extends AbstractBannerComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.height</code> attribute defined at extension <code> */
	private java.lang.Integer _height;
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.menu</code> attribute defined at extension <code> */
	private java.lang.Boolean _menu;
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.play</code> attribute defined at extension <code> */
	private java.lang.Boolean _play;
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.scale</code> attribute defined at extension <code> */
	private java.lang.String _scale;
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.loop</code> attribute defined at extension <code> */
	private java.lang.Boolean _loop;
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.pageLabelOrId</code> attribute defined at extension <code> */
	private java.lang.String _pageLabelOrId;
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.width</code> attribute defined at extension <code> */
	private java.lang.Integer _width;
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.wmode</code> attribute defined at extension <code> */
	private java.lang.String _wmode;
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.sAlign</code> attribute defined at extension <code> */
	private java.lang.String _sAlign;
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.page</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.pages.ContentPageDTO _page;
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.quality</code> attribute defined at extension <code> */
	private java.lang.String _quality;
	/** <i>Generated variable</i> - Variable of <code>FlashComponent.bgcolor</code> attribute defined at extension <code> */
	private java.lang.String _bgcolor;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FlashComponentDTO()
	{
		super();
	}
	
	
	public String getBgcolor()
	{
		return this._bgcolor;
	}
	
	public Integer getHeight()
	{
		return this._height;
	}
	
	public Boolean getLoop()
	{
		return this._loop;
	}
	
	public Boolean getMenu()
	{
		return this._menu;
	}
	
	public ContentPageDTO getPage()
	{
		return this._page;
	}
	
	public String getPageLabelOrId()
	{
		return this._pageLabelOrId;
	}
	
	public Boolean getPlay()
	{
		return this._play;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getQuality()
	{
		return this._quality;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getSAlign()
	{
		return this._sAlign;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getScale()
	{
		return this._scale;
	}
	
	public Integer getWidth()
	{
		return this._width;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getWmode()
	{
		return this._wmode;
	}
	
	public void setBgcolor(final String value)
	{
		this.modifiedPropsSet.add("bgcolor");
		this._bgcolor = value;
	}
	
	public void setHeight(final Integer value)
	{
		this.modifiedPropsSet.add("height");
		this._height = value;
	}
	
	public void setLoop(final Boolean value)
	{
		this.modifiedPropsSet.add("loop");
		this._loop = value;
	}
	
	public void setMenu(final Boolean value)
	{
		this.modifiedPropsSet.add("menu");
		this._menu = value;
	}
	
	public void setPage(final ContentPageDTO value)
	{
		this.modifiedPropsSet.add("page");
		this._page = value;
	}
	
	public void setPageLabelOrId(final String value)
	{
		this.modifiedPropsSet.add("pageLabelOrId");
		this._pageLabelOrId = value;
	}
	
	public void setPlay(final Boolean value)
	{
		this.modifiedPropsSet.add("play");
		this._play = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setQuality(final String value)
	{
		this.modifiedPropsSet.add("quality");
		this._quality = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setSAlign(final String value)
	{
		this.modifiedPropsSet.add("sAlign");
		this._sAlign = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setScale(final String value)
	{
		this.modifiedPropsSet.add("scale");
		this._scale = value;
	}
	
	public void setWidth(final Integer value)
	{
		this.modifiedPropsSet.add("width");
		this._width = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setWmode(final String value)
	{
		this.modifiedPropsSet.add("wmode");
		this._wmode = value;
	}
	
}
