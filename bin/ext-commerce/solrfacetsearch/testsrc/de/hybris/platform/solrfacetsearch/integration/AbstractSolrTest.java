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

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.type.TypeService;
import de.hybris.platform.solrfacetsearch.config.FacetSearchConfig;
import de.hybris.platform.solrfacetsearch.config.FacetSearchConfigService;
import de.hybris.platform.solrfacetsearch.config.IndexedType;
import de.hybris.platform.solrfacetsearch.config.SolrConfig;
import de.hybris.platform.solrfacetsearch.config.impl.FacetSearchConfigDao;
import de.hybris.platform.solrfacetsearch.embedded.SolrFacetSearchEmbeddedTest;
import de.hybris.platform.solrfacetsearch.enums.IndexMode;
import de.hybris.platform.solrfacetsearch.enums.IndexerOperationValues;
import de.hybris.platform.solrfacetsearch.enums.SolrPropertiesTypes;
import de.hybris.platform.solrfacetsearch.indexer.IndexerService;
import de.hybris.platform.solrfacetsearch.indexer.SolrIndexedTypeCodeResolver;
import de.hybris.platform.solrfacetsearch.indexer.exceptions.IndexerException;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexConfigModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedPropertyModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedTypeModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexerQueryModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrSearchConfigModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrServerConfigModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrValueRangeModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrValueRangeSetModel;
import de.hybris.platform.solrfacetsearch.search.SolrQueryConverter;
import de.hybris.platform.solrfacetsearch.solr.SolrService;
import de.hybris.platform.solrfacetsearch.solr.exceptions.SolrServiceException;
import de.hybris.platform.solrfacetsearch.solr.impl.SolrServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;


/**
 * Abstract test class for solrfacetsearch integration tests. Its set up routine initializes: <br>
 * <ul>
 * <li>basic data</li>
 * <li>catalog and product data</li>
 * <li>solrFacetSearchConfiguration instance</li>
 * </ul>
 * 
 * The class provides a protected hooks, that you can use in a subclass, to define your own basic data, product data or
 * SOLR configuration options.
 */
@Ignore
public abstract class AbstractSolrTest extends ServicelayerTest
{

	protected static final String SOLR_QUERY_SELECT_ALL = "*:*";
	private final static Logger LOG = Logger.getLogger(AbstractSolrTest.class);

	@Resource
	protected IndexerService indexerService;
	@Resource
	protected CatalogVersionService catalogVersionService;
	@Resource
	protected ModelService modelService;
	@Resource
	protected CommonI18NService commonI18NService;
	@Resource
	protected TypeService typeService;
	@Resource
	protected FacetSearchConfigService facetSearchConfigService;
	@Resource(name = "solrQueryConverter")
	protected SolrQueryConverter converter;
	@Resource
	protected FacetSearchConfigDao facetSearchConfigDao;
	@Resource
	private SolrIndexedTypeCodeResolver solrIndexedTypeCodeResolver;

	protected FacetSearchConfig facetSearchConfig;
	protected SolrFacetSearchConfigModel localConfig;

	protected IndexedType indexedType;
	protected SolrIndexedTypeModel indexedTypeModel;

	protected SolrConfig solrConfig;

	protected CatalogVersionModel cv;

	protected final static String INDEXED_TYPE_NAME = "Product";
	protected static final String SOLR_CONFIG_NAME = "solrTestConfig";

	protected static final String TESTCATALOG1 = "testCatalog1";
	protected static final String WINTER = "Winter";


	@Before
	public void setUp() throws Exception
	{
		setUpBasic();
		setUpProductData();
		removeDuplicateSolrConfig();
		localConfig = setUpSolrFacetSearchConfig();
		modelService.save(localConfig);
		facetSearchConfig = facetSearchConfigService.getConfiguration(getSolrConfigName());
		indexedType = facetSearchConfig.getIndexConfig().getIndexedTypes()
				.get(solrIndexedTypeCodeResolver.resolveIndexedTypeCode(indexedTypeModel));
		solrConfig = facetSearchConfig.getSolrConfig();
	}


	protected SolrIndexedTypeModel findIndexedTypeModel(final SolrFacetSearchConfigModel facetSearchConfigModel,
			final IndexedType indexedType) throws IndexerException
	{
		for (final SolrIndexedTypeModel type : facetSearchConfigModel.getSolrIndexedTypes())
		{
			if (solrIndexedTypeCodeResolver.resolveIndexedTypeCode(type).equals(indexedType.getUniqueIndexedTypeCode()))
			{
				return type;
			}
		}
		throw new IndexerException("Could not find matching model for type: " + indexedType.getCode());
	}


	@After
	public void tearDown()
	{
		if (localConfig != null && !modelService.isNew(localConfig))
		{
			modelService.remove(localConfig);
		}
	}

	private void removeDuplicateSolrConfig()
	{
		final SolrFacetSearchConfigModel previousConfig = facetSearchConfigDao.findSolrFacetSearchConfigByName(getSolrConfigName());
		if (previousConfig != null)
		{
			modelService.remove(previousConfig);
		}
	}

	/**
	 * Drops the index content for the current {@link #indexedType}
	 */
	protected void dropIndex() throws SolrServiceException, SolrServerException, IOException
	{
		final SolrServer solrServer = getSolrService().getSolrServerMaster(solrConfig, indexedType);
		assertNotNull(solrServer);
		solrServer.deleteByQuery(SOLR_QUERY_SELECT_ALL);
		solrServer.commit();
		final SolrQuery query = new SolrQuery(SOLR_QUERY_SELECT_ALL);
		final QueryResponse response = solrServer.query(query);
		final int resultSize = response.getResults().size();
		assertEquals("Result size", 0, resultSize);
	}


	protected abstract SolrService getSolrService();


	/**
	 * Hook to initialize tests basic data, i.e languages, currencies, users..
	 */
	protected void setUpBasic() throws Exception
	{
		final LanguageModel de = modelService.get(getOrCreateLanguage("de"));
		de.setActive(Boolean.TRUE);

		final CurrencyModel eur = modelService.get(getOrCreateCurrency("EUR"));
		eur.setActive(Boolean.TRUE);
		eur.setDigits(Integer.valueOf(2));
		eur.setSymbol("\u20AC");
		eur.setName("Euro");

		final CurrencyModel usd = modelService.get(getOrCreateCurrency("USD"));
		usd.setActive(Boolean.TRUE);
		usd.setIsocode("USD");
		usd.setDigits(Integer.valueOf(2));
		usd.setSymbol("USD");
		usd.setName("Dolar");

		modelService.saveAll(de, eur, usd);

		final UnitModel piece = new UnitModel();
		piece.setCode("piece");
		piece.setUnitType("piece");
		modelService.saveAll(piece);
	}


	/**
	 * Hook to initialize products, categories and catalogs for the test cases.
	 */
	protected void setUpProductData() throws Exception
	{
		final CatalogModel catalog = modelService.create(CatalogModel.class);
		catalog.setId("testCatalog");

		cv = modelService.create(CatalogVersionModel.class);
		cv.setCatalog(catalog);
		cv.setVersion("online");

		modelService.save(cv);
	}


	/**
	 * Override to define {@link CatalogVersionModel}s for your {@link SolrFacetSearchConfigModel} instance
	 */
	protected List<CatalogVersionModel> getCatalogVersionsForSolrFacetSearchConfig()
	{
		return Arrays.asList(cv);
	}


	protected String readXmlFile(final String pathName)
	{
		final InputStream is = SolrFacetSearchEmbeddedTest.class.getResourceAsStream(pathName);
		if (is == null)
		{
			LOG.error("file [" + pathName + "] cannot be found.");
		}
		else
		{
			try
			{
				final BufferedReader br = new BufferedReader(new InputStreamReader(is));
				String s = "";
				final StringBuffer sb = new StringBuffer(s);
				while ((s = br.readLine()) != null)
				{
					sb.append(s);
				}
				return sb.toString();
			}
			catch (final IOException ioe)
			{
				LOG.error(ioe.getMessage());
			}
		}
		return null;
	}

	/**
	 * Sets up a not persisted {@link SolrFacetSearchConfigModel} for the test cases. Please note, that the method itself
	 * calls a number of hook in methods for initializing several configuration options, like solr server config, search
	 * and index configurations..
	 */
	protected SolrFacetSearchConfigModel setUpSolrFacetSearchConfig()
	{
		final SolrFacetSearchConfigModel config = modelService.create(SolrFacetSearchConfigModel.class);
		config.setName(getSolrConfigName());
		config.setCatalogVersions(getCatalogVersionsForSolrFacetSearchConfig());
		config.setSolrValueRangeSets(setUpValueRanges());
		config.setSolrSearchConfig(setUpSearchConfig());
		config.setCurrencies(setUpCurrencies());
		config.setLanguages(setUpLanguages());
		config.setEnabledLanguageFallbackMechanism(isEnabledFallbackMechanismFlag());

		if (isItemBasedConfig())
		{
			indexedTypeModel = setUpIndexedType();
			config.setSolrIndexedTypes(Collections.singletonList(indexedTypeModel));
			config.setSolrServerConfig(setUpSolrServerConfig());
			config.setSolrIndexConfig(setUpIndexConfig());
		}
		else
		{
			config.setDocument(setUpXmlConfiguration());
		}
		return config;
	}



	/**
	 * Determines {@link SolrFacetSearchConfigModel} instance name.
	 */
	protected String getSolrConfigName()
	{
		return SOLR_CONFIG_NAME;
	}

	protected boolean isEnabledFallbackMechanismFlag()
	{
		return false;
	}



	/**
	 * Determines if the test deals with item or XML based configuration. Use it if you want to test obsolete xml based
	 * {@link SolrFacetSearchConfigModel} instances.
	 */
	protected boolean isItemBasedConfig()
	{
		return true;
	}

	/**
	 * if {@link #isItemBasedConfig()} returns false, you need to provide xml media document for the depreceted xml based
	 * {@link SolrFacetSearchConfigModel} instances.
	 */
	protected MediaModel setUpXmlConfiguration()
	{
		return null;
	}

	/**
	 * Determines languages for your {@link SolrFacetSearchConfigModel}
	 */
	protected List<LanguageModel> setUpLanguages()
	{
		final List<LanguageModel> languages = new ArrayList<LanguageModel>();
		languages.add(modelService.<LanguageModel> get(getOrCreateLanguage("de")));
		languages.add(modelService.<LanguageModel> get(getOrCreateLanguage("en")));
		return languages;
	}

	/**
	 * Determines currencies for your {@link SolrFacetSearchConfigModel}
	 */
	protected List<CurrencyModel> setUpCurrencies()
	{
		final List<CurrencyModel> currencies = new ArrayList<CurrencyModel>();
		currencies.add(commonI18NService.getCurrency("EUR"));
		currencies.add(commonI18NService.getCurrency("USD"));
		return currencies;
	}

	/**
	 * Sets up {@link SolrValueRangeSetModel}s for your {@link SolrFacetSearchConfigModel}
	 */
	protected List<SolrValueRangeSetModel> setUpValueRanges()
	{
		final SolrValueRangeSetModel rangeSetModel = modelService.create(SolrValueRangeSetModel.class);
		rangeSetModel.setName("defaultSet");
		rangeSetModel.setType("double");

		final SolrValueRangeModel rangeModel = modelService.create(SolrValueRangeModel.class);
		rangeModel.setName("doubleRange");
		rangeModel.setFrom("1");
		rangeModel.setTo("999");
		rangeModel.setSolrValueRangeSet(rangeSetModel);

		rangeSetModel.setSolrValueRanges(Arrays.asList(rangeModel));
		return Arrays.asList(rangeSetModel);
	}

	/**
	 * Sets up {@link SolrSearchConfigModel} for your {@link SolrFacetSearchConfigModel}
	 */
	protected SolrSearchConfigModel setUpSearchConfig()
	{
		final SolrSearchConfigModel searchContext = modelService.create(SolrSearchConfigModel.class);
		searchContext.setPageSize(Integer.valueOf(5));
		searchContext.setDefaultSortOrder(Arrays.asList("score"));
		modelService.save(searchContext);
		return searchContext;
	}


	/**
	 * Sets up {@link SolrIndexConfigModel} for your {@link SolrFacetSearchConfigModel}
	 */
	protected SolrIndexConfigModel setUpIndexConfig()
	{
		final SolrIndexConfigModel config = modelService.create(SolrIndexConfigModel.class);
		config.setBatchSize(100);
		config.setIndexMode(IndexMode.DIRECT);
		config.setName("testIndexConfig");
		config.setNumberOfThreads(1);
		return config;
	}


	/**
	 * Sets up {@link SolrSearchConfigModel} for your {@link SolrFacetSearchConfigModel}. This Method determines if your
	 * test will deal with embedded or standalone solr instance.
	 */
	protected abstract SolrServerConfigModel setUpSolrServerConfig();


	/**
	 * Sets up the indexed type ({@link SolrIndexedTypeModel}) in your {@link SolrFacetSearchConfigModel} instance for
	 * the test cases. By default, its of Product type. The method calls hook in methods for configuraing indexed
	 * properties and indexer queries.
	 */
	protected SolrIndexedTypeModel setUpIndexedType()
	{
		final SolrIndexedTypeModel indexedTypeModel = modelService.create(SolrIndexedTypeModel.class);
		indexedTypeModel.setIdentifier(getIndexedTypeIdentifier());
		indexedTypeModel.setSolrIndexedProperties(setUpIndexProperties());
		indexedTypeModel.setSolrIndexerQueries(setUpIndexerQueries());
		indexedTypeModel.setType(typeService.getComposedTypeForCode("Product"));
		indexedTypeModel.setIndexName(getIndexedTypeIdentifier());
		return indexedTypeModel;
	}


	/**
	 * Determines the indexed type name of the indexed type in your test scenario.
	 */
	protected String getIndexedTypeIdentifier()
	{
		return INDEXED_TYPE_NAME;
	}



	/**
	 * Sets up indexer queries - {@link SolrIndexerQueryModel} for full-index, update and delete operations By default it
	 * produced only one, full index query.
	 */
	protected List<SolrIndexerQueryModel> setUpIndexerQueries()
	{
		final SolrIndexerQueryModel fullQueryModel = modelService.create(SolrIndexerQueryModel.class);
		fullQueryModel.setType(IndexerOperationValues.FULL);
		fullQueryModel.setQuery("select {pk} from {Product}");
		fullQueryModel.setIdentifier("fullQuery");

		return Arrays.asList(fullQueryModel);
	}

	/**
	 * Sets up all indexed properties of your {@link SolrIndexedTypeModel}.
	 */
	protected List<SolrIndexedPropertyModel> setUpIndexProperties()
	{
		final SolrIndexedPropertyModel codeProperty = modelService.create(SolrIndexedPropertyModel.class);
		codeProperty.setName("code");
		codeProperty.setType(SolrPropertiesTypes.STRING);
		final SolrIndexedPropertyModel descriptionProperty = modelService.create(SolrIndexedPropertyModel.class);
		descriptionProperty.setName("description");
		descriptionProperty.setType(SolrPropertiesTypes.TEXT);
		descriptionProperty.setLocalized(true);
		return Arrays.asList(codeProperty, descriptionProperty);
	}
}
