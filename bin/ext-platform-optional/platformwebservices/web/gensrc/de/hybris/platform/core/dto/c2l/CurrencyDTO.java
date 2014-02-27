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
package de.hybris.platform.core.dto.c2l;

import de.hybris.platform.core.dto.c2l.C2LItemDTO;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO;
import de.hybris.platform.store.BaseStoreDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Currency first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = CurrencyModel.class, factory = GenericNodeFactory.class, uidProperties="isocode")
@XmlRootElement(name = "currency")
public class CurrencyDTO extends C2LItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Currency.baseStores</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.store.BaseStoreDTO> _baseStores;
	/** <i>Generated variable</i> - Variable of <code>Currency.conversion</code> attribute defined at extension <code> */
	private java.lang.Double _conversion;
	/** <i>Generated variable</i> - Variable of <code>Currency.base</code> attribute defined at extension <code> */
	private java.lang.Boolean _base;
	/** <i>Generated variable</i> - Variable of <code>Currency.digits</code> attribute defined at extension <code> */
	private java.lang.Integer _digits;
	/** <i>Generated variable</i> - Variable of <code>Currency.symbol</code> attribute defined at extension <code> */
	private java.lang.String _symbol;
	/** <i>Generated variable</i> - Variable of <code>Currency.facetSearchConfigs</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO> _facetSearchConfigs;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CurrencyDTO()
	{
		super();
	}
	
	
	public Boolean getBase()
	{
		return this._base;
	}
	
	@XmlElementWrapper(name = "baseStores")
	@XmlElement(name = "baseStore")
	public Collection<BaseStoreDTO> getBaseStores()
	{
		return this._baseStores;
	}
	
	public Double getConversion()
	{
		return this._conversion;
	}
	
	public Integer getDigits()
	{
		return this._digits;
	}
	
	@XmlElementWrapper(name = "facetSearchConfigs")
	@XmlElement(name = "solrFacetSearchConfig")
	public List<SolrFacetSearchConfigDTO> getFacetSearchConfigs()
	{
		return this._facetSearchConfigs;
	}
	
	public String getSymbol()
	{
		return this._symbol;
	}
	
	public void setBase(final Boolean value)
	{
		this.modifiedPropsSet.add("base");
		this._base = value;
	}
	
	public void setBaseStores(final Collection<BaseStoreDTO> value)
	{
		this.modifiedPropsSet.add("baseStores");
		this._baseStores = value;
	}
	
	public void setConversion(final Double value)
	{
		this.modifiedPropsSet.add("conversion");
		this._conversion = value;
	}
	
	public void setDigits(final Integer value)
	{
		this.modifiedPropsSet.add("digits");
		this._digits = value;
	}
	
	public void setFacetSearchConfigs(final List<SolrFacetSearchConfigDTO> value)
	{
		this.modifiedPropsSet.add("facetSearchConfigs");
		this._facetSearchConfigs = value;
	}
	
	public void setSymbol(final String value)
	{
		this.modifiedPropsSet.add("symbol");
		this._symbol = value;
	}
	
}
