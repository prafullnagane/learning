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
package de.hybris.platform.store;

import de.hybris.platform.basecommerce.dto.site.BaseSiteDTO;
import de.hybris.platform.catalog.dto.CatalogDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CountryDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.core.dto.user.EmployeeDTO;
import de.hybris.platform.ordersplitting.dto.WarehouseDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.storelocator.dto.PointOfServiceDTO;
import de.hybris.platform.ticket.dto.CsAgentGroupDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BaseStore first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = BaseStoreModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "basestore")
public class BaseStoreDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>BaseStore.net</code> attribute defined at extension <code> */
	private boolean _net;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.solrFacetSearchConfiguration</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO _solrFacetSearchConfiguration;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.deliveryCountries</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.c2l.CountryDTO> _deliveryCountries;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.catalogs</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.CatalogDTO> _catalogs;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.pickupInStoreMode</code> attribute defined at extension <code> */
	private java.lang.String _pickupInStoreMode;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.defaultLanguage</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.LanguageDTO _defaultLanguage;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.ticketgroups</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.ticket.dto.CsAgentGroupDTO> _ticketgroups;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.externalTaxEnabled</code> attribute defined at extension <code> */
	private java.lang.Boolean _externalTaxEnabled;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.pointsOfService</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.storelocator.dto.PointOfServiceDTO> _pointsOfService;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.ticketemployees</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.user.EmployeeDTO> _ticketemployees;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.warehouses</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.ordersplitting.dto.WarehouseDTO> _warehouses;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.languages</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.core.dto.c2l.LanguageDTO> _languages;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.taxGroup</code> attribute defined at extension <code> */
	private java.lang.String _taxGroup;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.cmsSites</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.basecommerce.dto.site.BaseSiteDTO> _cmsSites;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.submitOrderProcessCode</code> attribute defined at extension <code> */
	private java.lang.String _submitOrderProcessCode;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.paymentProvider</code> attribute defined at extension <code> */
	private java.lang.String _paymentProvider;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.currencies</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.core.dto.c2l.CurrencyDTO> _currencies;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.uid</code> attribute defined at extension <code> */
	private java.lang.String _uid;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.storelocatorDistanceUnit</code> attribute defined at extension <code> */
	private java.lang.String _storelocatorDistanceUnit;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.defaultCurrency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _defaultCurrency;
	/** <i>Generated variable</i> - Variable of <code>BaseStore.customerAllowedToIgnoreSuggestions</code> attribute defined at extension <code> */
	private boolean _customerAllowedToIgnoreSuggestions;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BaseStoreDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "catalogs")
	@XmlElement(name = "catalog")
	public List<CatalogDTO> getCatalogs()
	{
		return this._catalogs;
	}
	
	@XmlElementWrapper(name = "cmsSites")
	@XmlElement(name = "baseSite")
	public Collection<BaseSiteDTO> getCmsSites()
	{
		return this._cmsSites;
	}
	
	@XmlElementWrapper(name = "currencies")
	@XmlElement(name = "currency")
	public Set<CurrencyDTO> getCurrencies()
	{
		return this._currencies;
	}
	
	public CurrencyDTO getDefaultCurrency()
	{
		return this._defaultCurrency;
	}
	
	public LanguageDTO getDefaultLanguage()
	{
		return this._defaultLanguage;
	}
	
	@XmlElementWrapper(name = "deliveryCountries")
	@XmlElement(name = "country")
	public Collection<CountryDTO> getDeliveryCountries()
	{
		return this._deliveryCountries;
	}
	
	public Boolean getExternalTaxEnabled()
	{
		return this._externalTaxEnabled;
	}
	
	@XmlElementWrapper(name = "languages")
	@XmlElement(name = "language")
	public Set<LanguageDTO> getLanguages()
	{
		return this._languages;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public String getPaymentProvider()
	{
		return this._paymentProvider;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getPickupInStoreMode()
	{
		return this._pickupInStoreMode;
	}
	
	@XmlElementWrapper(name = "pointsOfService")
	@XmlElement(name = "pointOfService")
	public List<PointOfServiceDTO> getPointsOfService()
	{
		return this._pointsOfService;
	}
	
	public SolrFacetSearchConfigDTO getSolrFacetSearchConfiguration()
	{
		return this._solrFacetSearchConfiguration;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getStorelocatorDistanceUnit()
	{
		return this._storelocatorDistanceUnit;
	}
	
	public String getSubmitOrderProcessCode()
	{
		return this._submitOrderProcessCode;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getTaxGroup()
	{
		return this._taxGroup;
	}
	
	@XmlElementWrapper(name = "ticketemployees")
	@XmlElement(name = "employee")
	public List<EmployeeDTO> getTicketemployees()
	{
		return this._ticketemployees;
	}
	
	@XmlElementWrapper(name = "ticketgroups")
	@XmlElement(name = "csAgentGroup")
	public List<CsAgentGroupDTO> getTicketgroups()
	{
		return this._ticketgroups;
	}
	
	@XmlAttribute
	public String getUid()
	{
		return this._uid;
	}
	
	@XmlElementWrapper(name = "warehouses")
	@XmlElement(name = "warehouse")
	public List<WarehouseDTO> getWarehouses()
	{
		return this._warehouses;
	}
	
	public boolean isCustomerAllowedToIgnoreSuggestions()
	{
		return this._customerAllowedToIgnoreSuggestions;
	}
	
	public boolean isNet()
	{
		return this._net;
	}
	
	public void setCatalogs(final List<CatalogDTO> value)
	{
		this.modifiedPropsSet.add("catalogs");
		this._catalogs = value;
	}
	
	public void setCmsSites(final Collection<BaseSiteDTO> value)
	{
		this.modifiedPropsSet.add("cmsSites");
		this._cmsSites = value;
	}
	
	public void setCurrencies(final Set<CurrencyDTO> value)
	{
		this.modifiedPropsSet.add("currencies");
		this._currencies = value;
	}
	
	public void setCustomerAllowedToIgnoreSuggestions(final boolean value)
	{
		this.modifiedPropsSet.add("customerAllowedToIgnoreSuggestions");
		this._customerAllowedToIgnoreSuggestions = value;
	}
	
	public void setDefaultCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("defaultCurrency");
		this._defaultCurrency = value;
	}
	
	public void setDefaultLanguage(final LanguageDTO value)
	{
		this.modifiedPropsSet.add("defaultLanguage");
		this._defaultLanguage = value;
	}
	
	public void setDeliveryCountries(final Collection<CountryDTO> value)
	{
		this.modifiedPropsSet.add("deliveryCountries");
		this._deliveryCountries = value;
	}
	
	public void setExternalTaxEnabled(final Boolean value)
	{
		this.modifiedPropsSet.add("externalTaxEnabled");
		this._externalTaxEnabled = value;
	}
	
	public void setLanguages(final Set<LanguageDTO> value)
	{
		this.modifiedPropsSet.add("languages");
		this._languages = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setNet(final boolean value)
	{
		this.modifiedPropsSet.add("net");
		this._net = value;
	}
	
	public void setPaymentProvider(final String value)
	{
		this.modifiedPropsSet.add("paymentProvider");
		this._paymentProvider = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setPickupInStoreMode(final String value)
	{
		this.modifiedPropsSet.add("pickupInStoreMode");
		this._pickupInStoreMode = value;
	}
	
	public void setPointsOfService(final List<PointOfServiceDTO> value)
	{
		this.modifiedPropsSet.add("pointsOfService");
		this._pointsOfService = value;
	}
	
	public void setSolrFacetSearchConfiguration(final SolrFacetSearchConfigDTO value)
	{
		this.modifiedPropsSet.add("solrFacetSearchConfiguration");
		this._solrFacetSearchConfiguration = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setStorelocatorDistanceUnit(final String value)
	{
		this.modifiedPropsSet.add("storelocatorDistanceUnit");
		this._storelocatorDistanceUnit = value;
	}
	
	public void setSubmitOrderProcessCode(final String value)
	{
		this.modifiedPropsSet.add("submitOrderProcessCode");
		this._submitOrderProcessCode = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setTaxGroup(final String value)
	{
		this.modifiedPropsSet.add("taxGroup");
		this._taxGroup = value;
	}
	
	public void setTicketemployees(final List<EmployeeDTO> value)
	{
		this.modifiedPropsSet.add("ticketemployees");
		this._ticketemployees = value;
	}
	
	public void setTicketgroups(final List<CsAgentGroupDTO> value)
	{
		this.modifiedPropsSet.add("ticketgroups");
		this._ticketgroups = value;
	}
	
	public void setUid(final String value)
	{
		this.modifiedPropsSet.add("uid");
		this._uid = value;
	}
	
	public void setWarehouses(final List<WarehouseDTO> value)
	{
		this.modifiedPropsSet.add("warehouses");
		this._warehouses = value;
	}
	
}
