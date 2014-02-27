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
package de.hybris.platform.solrfacetsearch.dto.redirect;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO;
import de.hybris.platform.solrfacetsearch.dto.redirect.SolrAbstractKeywordRedirectDTO;
import de.hybris.platform.solrfacetsearch.model.redirect.SolrFacetSearchKeywordRedirectModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrFacetSearchKeywordRedirect first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrFacetSearchKeywordRedirectModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "solrfacetsearchkeywordredirect")
public class SolrFacetSearchKeywordRedirectDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchKeywordRedirect.matchType</code> attribute defined at extension <code> */
	private java.lang.String _matchType;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchKeywordRedirect.redirect</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.redirect.SolrAbstractKeywordRedirectDTO _redirect;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchKeywordRedirect.language</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.LanguageDTO _language;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchKeywordRedirect.facetSearchConfig</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO _facetSearchConfig;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchKeywordRedirect.ignoreCase</code> attribute defined at extension <code> */
	private java.lang.Boolean _ignoreCase;
	/** <i>Generated variable</i> - Variable of <code>SolrFacetSearchKeywordRedirect.keyword</code> attribute defined at extension <code> */
	private java.lang.String _keyword;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrFacetSearchKeywordRedirectDTO()
	{
		super();
	}
	
	
	public SolrFacetSearchConfigDTO getFacetSearchConfig()
	{
		return this._facetSearchConfig;
	}
	
	public Boolean getIgnoreCase()
	{
		return this._ignoreCase;
	}
	
	public String getKeyword()
	{
		return this._keyword;
	}
	
	public LanguageDTO getLanguage()
	{
		return this._language;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getMatchType()
	{
		return this._matchType;
	}
	
	public SolrAbstractKeywordRedirectDTO getRedirect()
	{
		return this._redirect;
	}
	
	public void setFacetSearchConfig(final SolrFacetSearchConfigDTO value)
	{
		this.modifiedPropsSet.add("facetSearchConfig");
		this._facetSearchConfig = value;
	}
	
	public void setIgnoreCase(final Boolean value)
	{
		this.modifiedPropsSet.add("ignoreCase");
		this._ignoreCase = value;
	}
	
	public void setKeyword(final String value)
	{
		this.modifiedPropsSet.add("keyword");
		this._keyword = value;
	}
	
	public void setLanguage(final LanguageDTO value)
	{
		this.modifiedPropsSet.add("language");
		this._language = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setMatchType(final String value)
	{
		this.modifiedPropsSet.add("matchType");
		this._matchType = value;
	}
	
	public void setRedirect(final SolrAbstractKeywordRedirectDTO value)
	{
		this.modifiedPropsSet.add("redirect");
		this._redirect = value;
	}
	
}
