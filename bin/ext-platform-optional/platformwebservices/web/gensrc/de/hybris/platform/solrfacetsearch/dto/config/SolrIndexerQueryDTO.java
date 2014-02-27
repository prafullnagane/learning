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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedTypeDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexerQueryParameterDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexerQueryModel;
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
 * Generated dto class for type SolrIndexerQuery first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrIndexerQueryModel.class, factory = GenericNodeFactory.class, uidProperties="identifier")
@XmlRootElement(name = "solrindexerquery")
public class SolrIndexerQueryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.injectCurrentTime</code> attribute defined at extension <code> */
	private boolean _injectCurrentTime;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.type</code> attribute defined at extension <code> */
	private java.lang.String _type;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.identifier</code> attribute defined at extension <code> */
	private java.lang.String _identifier;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.injectLastIndexTime</code> attribute defined at extension <code> */
	private boolean _injectLastIndexTime;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.solrIndexedType</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedTypeDTO _solrIndexedType;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.injectCurrentDate</code> attribute defined at extension <code> */
	private boolean _injectCurrentDate;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.parameterProvider</code> attribute defined at extension <code> */
	private java.lang.String _parameterProvider;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.query</code> attribute defined at extension <code> */
	private java.lang.String _query;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQuery.solrIndexerQueryParameters</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrIndexerQueryParameterDTO> _solrIndexerQueryParameters;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexerQueryDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getIdentifier()
	{
		return this._identifier;
	}
	
	public String getParameterProvider()
	{
		return this._parameterProvider;
	}
	
	public String getQuery()
	{
		return this._query;
	}
	
	public SolrIndexedTypeDTO getSolrIndexedType()
	{
		return this._solrIndexedType;
	}
	
	@XmlElementWrapper(name = "solrIndexerQueryParameters")
	@XmlElement(name = "solrIndexerQueryParameter")
	public List<SolrIndexerQueryParameterDTO> getSolrIndexerQueryParameters()
	{
		return this._solrIndexerQueryParameters;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getType()
	{
		return this._type;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	public boolean isInjectCurrentDate()
	{
		return this._injectCurrentDate;
	}
	
	public boolean isInjectCurrentTime()
	{
		return this._injectCurrentTime;
	}
	
	public boolean isInjectLastIndexTime()
	{
		return this._injectLastIndexTime;
	}
	
	public void setIdentifier(final String value)
	{
		this.modifiedPropsSet.add("identifier");
		this._identifier = value;
	}
	
	public void setInjectCurrentDate(final boolean value)
	{
		this.modifiedPropsSet.add("injectCurrentDate");
		this._injectCurrentDate = value;
	}
	
	public void setInjectCurrentTime(final boolean value)
	{
		this.modifiedPropsSet.add("injectCurrentTime");
		this._injectCurrentTime = value;
	}
	
	public void setInjectLastIndexTime(final boolean value)
	{
		this.modifiedPropsSet.add("injectLastIndexTime");
		this._injectLastIndexTime = value;
	}
	
	public void setParameterProvider(final String value)
	{
		this.modifiedPropsSet.add("parameterProvider");
		this._parameterProvider = value;
	}
	
	public void setQuery(final String value)
	{
		this.modifiedPropsSet.add("query");
		this._query = value;
	}
	
	public void setSolrIndexedType(final SolrIndexedTypeDTO value)
	{
		this.modifiedPropsSet.add("solrIndexedType");
		this._solrIndexedType = value;
	}
	
	public void setSolrIndexerQueryParameters(final List<SolrIndexerQueryParameterDTO> value)
	{
		this.modifiedPropsSet.add("solrIndexerQueryParameters");
		this._solrIndexerQueryParameters = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setType(final String value)
	{
		this.modifiedPropsSet.add("type");
		this._type = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
}
