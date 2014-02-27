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
import de.hybris.platform.solrfacetsearch.model.config.SolrEndpointUrlModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrServerConfigModel;
import de.hybris.platform.solrfacetsearch.solr.SolrService;
import de.hybris.platform.solrfacetsearch.solr.impl.SolrServiceStandaloneImpl;
import de.hybris.platform.util.Config;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;


@Ignore
public class AbstractSolrStandaloneTest extends AbstractSolrTest
{


	@Resource(name = "standaloneSolrService")
	private SolrService solrService;

	private String url;

	@Before
	public void clearCachedSolrServers()
	{
		((SolrServiceStandaloneImpl) solrService).clearSolrInstancesCache();
	}

	@Override
	@Before
	public void setUp() throws Exception
	{
		url = Config.getString("solr.standalone.test.instance", null);
		checkStandaloneSolr();
		super.setUp();
	}

	protected void checkStandaloneSolr()
	{
		try
		{
			final HttpClient client = new HttpClient();
			client.getParams().setParameter("http.protocol.content-charset", "UTF-8");

			final GetMethod method = new GetMethod(url);
			method.setRequestHeader("Content-Type", "text/xml; charset=utf-8");
			client.executeMethod(method);
		}
		catch (final HttpException e)
		{
			Assert.fail("Cannot connect to remote standalone SOLR : " + e.getMessage());
		}
		catch (final IOException e)
		{
			Assert.fail("Cannot connect to remote standalone SOLR : " + e.getMessage());
		}
	}

	@Override
	protected SolrServerConfigModel setUpSolrServerConfig()
	{
		final SolrServerConfigModel solrConfig = modelService.create(SolrServerConfigModel.class);
		final Integer interval = Integer.valueOf(1);
		solrConfig.setAliveCheckInterval(interval);
		solrConfig.setConnectionTimeout(interval);
		solrConfig.setReadTimeout(interval);
		solrConfig.setMode(SolrServerModes.STANDALONE);
		solrConfig.setEmbeddedMaster(false);
		solrConfig.setSolrEndpointUrls(setUpSolrEndpoints());
		solrConfig.setName("standaloneSOLRConfig");
		return solrConfig;
	}

	protected List<SolrEndpointUrlModel> setUpSolrEndpoints()
	{
		final SolrEndpointUrlModel solrEndpoint = modelService.create(SolrEndpointUrlModel.class);
		solrEndpoint.setUrl(url);
		solrEndpoint.setMaster(true);
		return Arrays.asList(solrEndpoint);
	}


	@Override
	protected SolrService getSolrService()
	{
		return solrService;
	}

}
