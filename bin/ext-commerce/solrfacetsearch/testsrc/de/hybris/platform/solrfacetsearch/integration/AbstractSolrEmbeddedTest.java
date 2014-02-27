/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package de.hybris.platform.solrfacetsearch.integration;

import de.hybris.platform.solrfacetsearch.enums.SolrServerModes;
import de.hybris.platform.solrfacetsearch.model.config.SolrServerConfigModel;
import de.hybris.platform.solrfacetsearch.solr.SolrService;

import java.util.Collections;

import javax.annotation.Resource;




public class AbstractSolrEmbeddedTest extends AbstractSolrTest
{

	@Resource(name = "embeddedSolrService")
	private SolrService solrService;

	@Override
	protected SolrServerConfigModel setUpSolrServerConfig()
	{
		final SolrServerConfigModel solrConfig = modelService.create(SolrServerConfigModel.class);
		final Integer interval = Integer.valueOf(1000);
		solrConfig.setAliveCheckInterval(interval);
		solrConfig.setConnectionTimeout(interval);
		solrConfig.setMode(SolrServerModes.EMBEDDED);
		solrConfig.setEmbeddedMaster(true);
		solrConfig.setSolrEndpointUrls(Collections.EMPTY_LIST);
		solrConfig.setName("embeddedSOLRConfig");
		return solrConfig;
	}

	@Override
	protected SolrService getSolrService()
	{
		return solrService;
	}

}
