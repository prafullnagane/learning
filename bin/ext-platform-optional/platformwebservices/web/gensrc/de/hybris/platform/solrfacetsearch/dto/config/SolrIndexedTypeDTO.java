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
package de.hybris.platform.solrfacetsearch.dto.config;

import de.hybris.platform.commerceservices.dto.solrsearch.config.SolrSortDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedPropertyDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexerQueryDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedTypeModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrIndexedType first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrIndexedTypeModel.class, factory = GenericNodeFactory.class, uidProperties="identifier")
@XmlRootElement(name = "solrindexedtype")
public class SolrIndexedTypeDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.solrFacetSearchConfig</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO _solrFacetSearchConfig;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.modelLoader</code> attribute defined at extension <code> */
	private java.lang.String _modelLoader;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.identifier</code> attribute defined at extension <code> */
	private java.lang.String _identifier;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.solrIndexerQueries</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrIndexerQueryDTO> _solrIndexerQueries;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.type</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _type;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.indexName</code> attribute defined at extension <code> */
	private java.lang.String _indexName;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.solrIndexedProperties</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedPropertyDTO> _solrIndexedProperties;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.identityProvider</code> attribute defined at extension <code> */
	private java.lang.String _identityProvider;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.valuesProvider</code> attribute defined at extension <code> */
	private java.lang.String _valuesProvider;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.solrResultConverter</code> attribute defined at extension <code> */
	private java.lang.String _solrResultConverter;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.variant</code> attribute defined at extension <code> */
	private boolean _variant;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedType.sorts</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.commerceservices.dto.solrsearch.config.SolrSortDTO> _sorts;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexedTypeDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getIdentifier()
	{
		return this._identifier;
	}
	
	public String getIdentityProvider()
	{
		return this._identityProvider;
	}
	
	@XmlAttribute
	public String getIndexName()
	{
		return this._indexName;
	}
	
	public String getModelLoader()
	{
		return this._modelLoader;
	}
	
	public SolrFacetSearchConfigDTO getSolrFacetSearchConfig()
	{
		return this._solrFacetSearchConfig;
	}
	
	@XmlElementWrapper(name = "solrIndexedProperties")
	@XmlElement(name = "solrIndexedProperty")
	public List<SolrIndexedPropertyDTO> getSolrIndexedProperties()
	{
		return this._solrIndexedProperties;
	}
	
	@XmlElementWrapper(name = "solrIndexerQueries")
	@XmlElement(name = "solrIndexerQuery")
	public List<SolrIndexerQueryDTO> getSolrIndexerQueries()
	{
		return this._solrIndexerQueries;
	}
	
	public String getSolrResultConverter()
	{
		return this._solrResultConverter;
	}
	
	@XmlElementWrapper(name = "sorts")
	@XmlElement(name = "solrSort")
	public List<SolrSortDTO> getSorts()
	{
		return this._sorts;
	}
	
	public ComposedTypeDTO getType()
	{
		return this._type;
	}
	
	public String getValuesProvider()
	{
		return this._valuesProvider;
	}
	
	public boolean isVariant()
	{
		return this._variant;
	}
	
	public void setIdentifier(final String value)
	{
		this.modifiedPropsSet.add("identifier");
		this._identifier = value;
	}
	
	public void setIdentityProvider(final String value)
	{
		this.modifiedPropsSet.add("identityProvider");
		this._identityProvider = value;
	}
	
	public void setIndexName(final String value)
	{
		this.modifiedPropsSet.add("indexName");
		this._indexName = value;
	}
	
	public void setModelLoader(final String value)
	{
		this.modifiedPropsSet.add("modelLoader");
		this._modelLoader = value;
	}
	
	public void setSolrFacetSearchConfig(final SolrFacetSearchConfigDTO value)
	{
		this.modifiedPropsSet.add("solrFacetSearchConfig");
		this._solrFacetSearchConfig = value;
	}
	
	public void setSolrIndexedProperties(final List<SolrIndexedPropertyDTO> value)
	{
		this.modifiedPropsSet.add("solrIndexedProperties");
		this._solrIndexedProperties = value;
	}
	
	public void setSolrIndexerQueries(final List<SolrIndexerQueryDTO> value)
	{
		this.modifiedPropsSet.add("solrIndexerQueries");
		this._solrIndexerQueries = value;
	}
	
	public void setSolrResultConverter(final String value)
	{
		this.modifiedPropsSet.add("solrResultConverter");
		this._solrResultConverter = value;
	}
	
	public void setSorts(final List<SolrSortDTO> value)
	{
		this.modifiedPropsSet.add("sorts");
		this._sorts = value;
	}
	
	public void setType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("type");
		this._type = value;
	}
	
	public void setValuesProvider(final String value)
	{
		this.modifiedPropsSet.add("valuesProvider");
		this._valuesProvider = value;
	}
	
	public void setVariant(final boolean value)
	{
		this.modifiedPropsSet.add("variant");
		this._variant = value;
	}
	
}
