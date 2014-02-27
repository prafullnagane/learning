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
package de.hybris.platform.solrfacetsearch.dto.cron;

import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO;
import de.hybris.platform.solrfacetsearch.model.cron.SolrUpdateStopWordsCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrUpdateStopWordsCronJob first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrUpdateStopWordsCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "solrupdatestopwordscronjob")
public class SolrUpdateStopWordsCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrUpdateStopWordsCronJob.language</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.LanguageDTO _language;
	/** <i>Generated variable</i> - Variable of <code>SolrUpdateStopWordsCronJob.solrFacetSearchConfig</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO _solrFacetSearchConfig;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrUpdateStopWordsCronJobDTO()
	{
		super();
	}
	
	
	public LanguageDTO getLanguage()
	{
		return this._language;
	}
	
	public SolrFacetSearchConfigDTO getSolrFacetSearchConfig()
	{
		return this._solrFacetSearchConfig;
	}
	
	public void setLanguage(final LanguageDTO value)
	{
		this.modifiedPropsSet.add("language");
		this._language = value;
	}
	
	public void setSolrFacetSearchConfig(final SolrFacetSearchConfigDTO value)
	{
		this.modifiedPropsSet.add("solrFacetSearchConfig");
		this._solrFacetSearchConfig = value;
	}
	
}
