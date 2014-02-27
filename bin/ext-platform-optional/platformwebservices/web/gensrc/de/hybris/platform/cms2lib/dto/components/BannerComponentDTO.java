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
import de.hybris.platform.cms2lib.dto.components.RotatingImagesComponentDTO;
import de.hybris.platform.cms2lib.model.components.BannerComponentModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BannerComponent first defined at extension cms2lib
 */
@SuppressWarnings("all")
@GraphNode(target = BannerComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "bannercomponent")
public class BannerComponentDTO extends AbstractBannerComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>BannerComponent.page</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.pages.ContentPageDTO _page;
	/** <i>Generated variable</i> - Variable of <code>BannerComponent.headline</code> attribute defined at extension <code> */
	private java.lang.String _headline;
	/** <i>Generated variable</i> - Variable of <code>BannerComponent.content</code> attribute defined at extension <code> */
	private java.lang.String _content;
	/** <i>Generated variable</i> - Variable of <code>BannerComponent.rotatingComponent</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2lib.dto.components.RotatingImagesComponentDTO> _rotatingComponent;
	/** <i>Generated variable</i> - Variable of <code>BannerComponent.pageLabelOrId</code> attribute defined at extension <code> */
	private java.lang.String _pageLabelOrId;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BannerComponentDTO()
	{
		super();
	}
	
	
	public String getContent()
	{
		return this._content;
	}
	
	public String getHeadline()
	{
		return this._headline;
	}
	
	public ContentPageDTO getPage()
	{
		return this._page;
	}
	
	public String getPageLabelOrId()
	{
		return this._pageLabelOrId;
	}
	
	@XmlElementWrapper(name = "rotatingComponent")
	@XmlElement(name = "rotatingImagesComponent")
	public Collection<RotatingImagesComponentDTO> getRotatingComponent()
	{
		return this._rotatingComponent;
	}
	
	public void setContent(final String value)
	{
		this.modifiedPropsSet.add("content");
		this._content = value;
	}
	
	public void setHeadline(final String value)
	{
		this.modifiedPropsSet.add("headline");
		this._headline = value;
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
	
	public void setRotatingComponent(final Collection<RotatingImagesComponentDTO> value)
	{
		this.modifiedPropsSet.add("rotatingComponent");
		this._rotatingComponent = value;
	}
	
}
