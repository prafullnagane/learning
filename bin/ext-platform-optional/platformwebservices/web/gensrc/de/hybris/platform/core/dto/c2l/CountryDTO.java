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
import de.hybris.platform.core.dto.c2l.RegionDTO;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.deliveryzone.dto.ZoneDTO;
import de.hybris.platform.store.BaseStoreDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Country first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = CountryModel.class, factory = GenericNodeFactory.class, uidProperties="isocode")
@XmlRootElement(name = "country")
public class CountryDTO extends C2LItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Country.baseStores</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.store.BaseStoreDTO> _baseStores;
	/** <i>Generated variable</i> - Variable of <code>Country.regions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.c2l.RegionDTO> _regions;
	/** <i>Generated variable</i> - Variable of <code>Country.zones</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.deliveryzone.dto.ZoneDTO> _zones;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CountryDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "baseStores")
	@XmlElement(name = "baseStore")
	public Set<BaseStoreDTO> getBaseStores()
	{
		return this._baseStores;
	}
	
	@XmlElementWrapper(name = "regions")
	@XmlElement(name = "region")
	public Collection<RegionDTO> getRegions()
	{
		return this._regions;
	}
	
	@XmlElementWrapper(name = "zones")
	@XmlElement(name = "zone")
	public Set<ZoneDTO> getZones()
	{
		return this._zones;
	}
	
	public void setBaseStores(final Set<BaseStoreDTO> value)
	{
		this.modifiedPropsSet.add("baseStores");
		this._baseStores = value;
	}
	
	public void setRegions(final Collection<RegionDTO> value)
	{
		this.modifiedPropsSet.add("regions");
		this._regions = value;
	}
	
	public void setZones(final Set<ZoneDTO> value)
	{
		this.modifiedPropsSet.add("zones");
		this._zones = value;
	}
	
}
