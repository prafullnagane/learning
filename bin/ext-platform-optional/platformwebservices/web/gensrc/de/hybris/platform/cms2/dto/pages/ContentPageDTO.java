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
package de.hybris.platform.cms2.dto.pages;

import de.hybris.platform.cms2.dto.contents.components.CMSLinkComponentDTO;
import de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO;
import de.hybris.platform.cms2.dto.pages.AbstractPageDTO;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.cms2lib.dto.components.BannerComponentDTO;
import de.hybris.platform.cms2lib.dto.components.FlashComponentDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ContentPage first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = ContentPageModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "contentpage")
public class ContentPageDTO extends AbstractPageDTO
{
	/** <i>Generated variable</i> - Variable of <code>ContentPage.label</code> attribute defined at extension <code> */
	private java.lang.String _label;
	/** <i>Generated variable</i> - Variable of <code>ContentPage.flashComponents</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2lib.dto.components.FlashComponentDTO> _flashComponents;
	/** <i>Generated variable</i> - Variable of <code>ContentPage.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>ContentPage.keywords</code> attribute defined at extension <code> */
	private java.lang.String _keywords;
	/** <i>Generated variable</i> - Variable of <code>ContentPage.bannerComponets</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2lib.dto.components.BannerComponentDTO> _bannerComponets;
	/** <i>Generated variable</i> - Variable of <code>ContentPage.homepage</code> attribute defined at extension <code> */
	private boolean _homepage;
	/** <i>Generated variable</i> - Variable of <code>ContentPage.labelOrId</code> attribute defined at extension <code> */
	private java.lang.String _labelOrId;
	/** <i>Generated variable</i> - Variable of <code>ContentPage.navigationNodes</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO> _navigationNodes;
	/** <i>Generated variable</i> - Variable of <code>ContentPage.linkComponents</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.contents.components.CMSLinkComponentDTO> _linkComponents;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentPageDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "bannerComponets")
	@XmlElement(name = "bannerComponent")
	public List<BannerComponentDTO> getBannerComponets()
	{
		return this._bannerComponets;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	@XmlElementWrapper(name = "flashComponents")
	@XmlElement(name = "flashComponent")
	public List<FlashComponentDTO> getFlashComponents()
	{
		return this._flashComponents;
	}
	
	public String getKeywords()
	{
		return this._keywords;
	}
	
	public String getLabel()
	{
		return this._label;
	}
	
	public String getLabelOrId()
	{
		return this._labelOrId;
	}
	
	@XmlElementWrapper(name = "linkComponents")
	@XmlElement(name = "cMSLinkComponent")
	public List<CMSLinkComponentDTO> getLinkComponents()
	{
		return this._linkComponents;
	}
	
	@XmlElementWrapper(name = "navigationNodes")
	@XmlElement(name = "cMSNavigationNode")
	public List<CMSNavigationNodeDTO> getNavigationNodes()
	{
		return this._navigationNodes;
	}
	
	public boolean isHomepage()
	{
		return this._homepage;
	}
	
	public void setBannerComponets(final List<BannerComponentDTO> value)
	{
		this.modifiedPropsSet.add("bannerComponets");
		this._bannerComponets = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setFlashComponents(final List<FlashComponentDTO> value)
	{
		this.modifiedPropsSet.add("flashComponents");
		this._flashComponents = value;
	}
	
	public void setHomepage(final boolean value)
	{
		this.modifiedPropsSet.add("homepage");
		this._homepage = value;
	}
	
	public void setKeywords(final String value)
	{
		this.modifiedPropsSet.add("keywords");
		this._keywords = value;
	}
	
	public void setLabel(final String value)
	{
		this.modifiedPropsSet.add("label");
		this._label = value;
	}
	
	public void setLabelOrId(final String value)
	{
		this.modifiedPropsSet.add("labelOrId");
		this._labelOrId = value;
	}
	
	public void setLinkComponents(final List<CMSLinkComponentDTO> value)
	{
		this.modifiedPropsSet.add("linkComponents");
		this._linkComponents = value;
	}
	
	public void setNavigationNodes(final List<CMSNavigationNodeDTO> value)
	{
		this.modifiedPropsSet.add("navigationNodes");
		this._navigationNodes = value;
	}
	
}
