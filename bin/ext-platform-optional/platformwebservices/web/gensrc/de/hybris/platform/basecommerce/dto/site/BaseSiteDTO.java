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
package de.hybris.platform.basecommerce.dto.site;

import de.hybris.platform.acceleratorservices.dto.CartRemovalCronJobDTO;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.promotions.dto.PromotionGroupDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO;
import de.hybris.platform.store.BaseStoreDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BaseSite first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = BaseSiteModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "basesite")
public class BaseSiteDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>BaseSite.locale</code> attribute defined at extension <code> */
	private java.lang.String _locale;
	/** <i>Generated variable</i> - Variable of <code>BaseSite.defaultLanguage</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.LanguageDTO _defaultLanguage;
	/** <i>Generated variable</i> - Variable of <code>BaseSite.anonymousCartRemovalAge</code> attribute defined at extension <code> */
	private java.lang.Integer _anonymousCartRemovalAge;
	/** <i>Generated variable</i> - Variable of <code>BaseSite.solrFacetSearchConfiguration</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO _solrFacetSearchConfiguration;
	/** <i>Generated variable</i> - Variable of <code>BaseSite.defaultPromotionGroup</code> attribute defined at extension <code> */
	private de.hybris.platform.promotions.dto.PromotionGroupDTO _defaultPromotionGroup;
	/** <i>Generated variable</i> - Variable of <code>BaseSite.cartRemovalAge</code> attribute defined at extension <code> */
	private java.lang.Integer _cartRemovalAge;
	/** <i>Generated variable</i> - Variable of <code>BaseSite.stores</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.store.BaseStoreDTO> _stores;
	/** <i>Generated variable</i> - Variable of <code>BaseSite.uid</code> attribute defined at extension <code> */
	private java.lang.String _uid;
	/** <i>Generated variable</i> - Variable of <code>BaseSite.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>BaseSite.cartRemovalCronJob</code> attribute defined at extension <code> */
	private de.hybris.platform.acceleratorservices.dto.CartRemovalCronJobDTO _cartRemovalCronJob;
	/** <i>Generated variable</i> - Variable of <code>BaseSite.theme</code> attribute defined at extension <code> */
	private java.lang.String _theme;
	/** <i>Generated variable</i> - Variable of <code>BaseSite.channel</code> attribute defined at extension <code> */
	private java.lang.String _channel;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BaseSiteDTO()
	{
		super();
	}
	
	
	public Integer getAnonymousCartRemovalAge()
	{
		return this._anonymousCartRemovalAge;
	}
	
	public Integer getCartRemovalAge()
	{
		return this._cartRemovalAge;
	}
	
	public CartRemovalCronJobDTO getCartRemovalCronJob()
	{
		return this._cartRemovalCronJob;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getChannel()
	{
		return this._channel;
	}
	
	public LanguageDTO getDefaultLanguage()
	{
		return this._defaultLanguage;
	}
	
	public PromotionGroupDTO getDefaultPromotionGroup()
	{
		return this._defaultPromotionGroup;
	}
	
	public String getLocale()
	{
		return this._locale;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public SolrFacetSearchConfigDTO getSolrFacetSearchConfiguration()
	{
		return this._solrFacetSearchConfiguration;
	}
	
	@XmlElementWrapper(name = "stores")
	@XmlElement(name = "baseStore")
	public List<BaseStoreDTO> getStores()
	{
		return this._stores;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getTheme()
	{
		return this._theme;
	}
	
	@XmlAttribute
	public String getUid()
	{
		return this._uid;
	}
	
	public void setAnonymousCartRemovalAge(final Integer value)
	{
		this.modifiedPropsSet.add("anonymousCartRemovalAge");
		this._anonymousCartRemovalAge = value;
	}
	
	public void setCartRemovalAge(final Integer value)
	{
		this.modifiedPropsSet.add("cartRemovalAge");
		this._cartRemovalAge = value;
	}
	
	public void setCartRemovalCronJob(final CartRemovalCronJobDTO value)
	{
		this.modifiedPropsSet.add("cartRemovalCronJob");
		this._cartRemovalCronJob = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setChannel(final String value)
	{
		this.modifiedPropsSet.add("channel");
		this._channel = value;
	}
	
	public void setDefaultLanguage(final LanguageDTO value)
	{
		this.modifiedPropsSet.add("defaultLanguage");
		this._defaultLanguage = value;
	}
	
	public void setDefaultPromotionGroup(final PromotionGroupDTO value)
	{
		this.modifiedPropsSet.add("defaultPromotionGroup");
		this._defaultPromotionGroup = value;
	}
	
	public void setLocale(final String value)
	{
		this.modifiedPropsSet.add("locale");
		this._locale = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setSolrFacetSearchConfiguration(final SolrFacetSearchConfigDTO value)
	{
		this.modifiedPropsSet.add("solrFacetSearchConfiguration");
		this._solrFacetSearchConfiguration = value;
	}
	
	public void setStores(final List<BaseStoreDTO> value)
	{
		this.modifiedPropsSet.add("stores");
		this._stores = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setTheme(final String value)
	{
		this.modifiedPropsSet.add("theme");
		this._theme = value;
	}
	
	public void setUid(final String value)
	{
		this.modifiedPropsSet.add("uid");
		this._uid = value;
	}
	
}
