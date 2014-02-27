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
package de.hybris.platform.lucenesearch.dto;

import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.lucenesearch.dto.AbstractLuceneItemDTO;
import de.hybris.platform.lucenesearch.dto.LuceneIndexDTO;
import de.hybris.platform.lucenesearch.model.LanguageConfigurationModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type LanguageConfiguration first defined at extension lucenesearch
 */
@SuppressWarnings("all")
@GraphNode(target = LanguageConfigurationModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "languageconfiguration")
public class LanguageConfigurationDTO extends AbstractLuceneItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>LanguageConfiguration.analyzerDefinition</code> attribute defined at extension <code> */
	private java.lang.String _analyzerDefinition;
	/** <i>Generated variable</i> - Variable of <code>LanguageConfiguration.indexedLanguage</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.LanguageDTO _indexedLanguage;
	/** <i>Generated variable</i> - Variable of <code>LanguageConfiguration.luceneIndex</code> attribute defined at extension <code> */
	private de.hybris.platform.lucenesearch.dto.LuceneIndexDTO _luceneIndex;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LanguageConfigurationDTO()
	{
		super();
	}
	
	
	public String getAnalyzerDefinition()
	{
		return this._analyzerDefinition;
	}
	
	public LanguageDTO getIndexedLanguage()
	{
		return this._indexedLanguage;
	}
	
	public LuceneIndexDTO getLuceneIndex()
	{
		return this._luceneIndex;
	}
	
	public void setAnalyzerDefinition(final String value)
	{
		this.modifiedPropsSet.add("analyzerDefinition");
		this._analyzerDefinition = value;
	}
	
	public void setIndexedLanguage(final LanguageDTO value)
	{
		this.modifiedPropsSet.add("indexedLanguage");
		this._indexedLanguage = value;
	}
	
	public void setLuceneIndex(final LuceneIndexDTO value)
	{
		this.modifiedPropsSet.add("luceneIndex");
		this._luceneIndex = value;
	}
	
}
