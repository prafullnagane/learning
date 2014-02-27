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

import de.hybris.platform.lucenesearch.dto.AbstractLuceneItemDTO;
import de.hybris.platform.lucenesearch.dto.IndexConfigurationDTO;
import de.hybris.platform.lucenesearch.dto.LanguageConfigurationDTO;
import de.hybris.platform.lucenesearch.model.LuceneIndexModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type LuceneIndex first defined at extension lucenesearch
 */
@SuppressWarnings("all")
@GraphNode(target = LuceneIndexModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "luceneindex")
public class LuceneIndexDTO extends AbstractLuceneItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.languageConfigurations</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.lucenesearch.dto.LanguageConfigurationDTO> _languageConfigurations;
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.postQueryFilterClassName</code> attribute defined at extension <code> */
	private java.lang.String _postQueryFilterClassName;
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.testLoc</code> attribute defined at extension <code> */
	private java.util.Collection<java.lang.String> _testLoc;
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.indexConfigurations</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.lucenesearch.dto.IndexConfigurationDTO> _indexConfigurations;
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.rebuildEndTimestamp</code> attribute defined at extension <code> */
	private java.util.Date _rebuildEndTimestamp;
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.rebuildStartTimestamp</code> attribute defined at extension <code> */
	private java.util.Date _rebuildStartTimestamp;
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.pendingUpdatesCount</code> attribute defined at extension <code> */
	private java.lang.Integer _pendingUpdatesCount;
	/** <i>Generated variable</i> - Variable of <code>LuceneIndex.upToDate</code> attribute defined at extension <code> */
	private java.lang.Boolean _upToDate;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LuceneIndexDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "indexConfigurations")
	@XmlElement(name = "indexConfiguration")
	public Collection<IndexConfigurationDTO> getIndexConfigurations()
	{
		return this._indexConfigurations;
	}
	
	@XmlElementWrapper(name = "languageConfigurations")
	@XmlElement(name = "languageConfiguration")
	public Collection<LanguageConfigurationDTO> getLanguageConfigurations()
	{
		return this._languageConfigurations;
	}
	
	public Integer getPendingUpdatesCount()
	{
		return this._pendingUpdatesCount;
	}
	
	public String getPostQueryFilterClassName()
	{
		return this._postQueryFilterClassName;
	}
	
	public Date getRebuildEndTimestamp()
	{
		return this._rebuildEndTimestamp;
	}
	
	public Date getRebuildStartTimestamp()
	{
		return this._rebuildStartTimestamp;
	}
	
	public Collection<String> getTestLoc()
	{
		return this._testLoc;
	}
	
	public Boolean getUpToDate()
	{
		return this._upToDate;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setIndexConfigurations(final Collection<IndexConfigurationDTO> value)
	{
		this.modifiedPropsSet.add("indexConfigurations");
		this._indexConfigurations = value;
	}
	
	public void setLanguageConfigurations(final Collection<LanguageConfigurationDTO> value)
	{
		this.modifiedPropsSet.add("languageConfigurations");
		this._languageConfigurations = value;
	}
	
	public void setPendingUpdatesCount(final Integer value)
	{
		this.modifiedPropsSet.add("pendingUpdatesCount");
		this._pendingUpdatesCount = value;
	}
	
	public void setPostQueryFilterClassName(final String value)
	{
		this.modifiedPropsSet.add("postQueryFilterClassName");
		this._postQueryFilterClassName = value;
	}
	
	public void setRebuildEndTimestamp(final Date value)
	{
		this.modifiedPropsSet.add("rebuildEndTimestamp");
		this._rebuildEndTimestamp = value;
	}
	
	public void setRebuildStartTimestamp(final Date value)
	{
		this.modifiedPropsSet.add("rebuildStartTimestamp");
		this._rebuildStartTimestamp = value;
	}
	
	public void setTestLoc(final Collection<String> value)
	{
		this.modifiedPropsSet.add("testLoc");
		this._testLoc = value;
	}
	
	public void setUpToDate(final Boolean value)
	{
		this.modifiedPropsSet.add("upToDate");
		this._upToDate = value;
	}
	
}
