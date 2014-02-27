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
package de.hybris.platform.storelocator.dto;

import de.hybris.platform.commerceservices.dto.storelocator.StoreLocatorFeatureDTO;
import de.hybris.platform.commerceservices.dto.user.StoreEmployeeGroupDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.media.MediaContainerDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.dto.user.AddressDTO;
import de.hybris.platform.ordersplitting.dto.WarehouseDTO;
import de.hybris.platform.store.BaseStoreDTO;
import de.hybris.platform.storelocator.dto.OpeningScheduleDTO;
import de.hybris.platform.storelocator.model.PointOfServiceModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PointOfService first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = PointOfServiceModel.class, factory = GenericNodeFactory.class, uidProperties="name")
@XmlRootElement(name = "pointofservice")
public class PointOfServiceDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>PointOfService.features</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.commerceservices.dto.storelocator.StoreLocatorFeatureDTO> _features;
	/** <i>Generated variable</i> - Variable of <code>PointOfService.warehouses</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.ordersplitting.dto.WarehouseDTO> _warehouses;
	/** <i>Generated variable</i> - Variable of <code>PointOfService.mapIcon</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _mapIcon;
	/** <i>Generated variable</i> - Variable of <code>PointOfService.nearbyStoreRadius</code> attribute defined at extension <code> */
	private java.lang.Double _nearbyStoreRadius;
	/** <i>Generated variable</i> - Variable of <code>PointOfService.longitude</code> attribute defined at extension <code> */
	private java.lang.Double _longitude;
	/** <i>Generated variable</i> - Variable of <code>PointOfService.storeImage</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaContainerDTO _storeImage;
	/** <i>Generated variable</i> - Variable of <code>PointOfService.storeEmployeeGroups</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.commerceservices.dto.user.StoreEmployeeGroupDTO> _storeEmployeeGroups;
	/** <i>Generated variable</i> - Variable of <code>PointOfService.geocodeTimestamp</code> attribute defined at extension <code> */
	private java.util.Date _geocodeTimestamp;
	/** <i>Generated variable</i> - Variable of <code>PointOfService.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>PointOfService.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>PointOfService.type</code> attribute defined at extension <code> */
	private java.lang.String _type;
	/** <i>Generated variable</i> - Variable of <code>PointOfService.openingSchedule</code> attribute defined at extension <code> */
	private de.hybris.platform.storelocator.dto.OpeningScheduleDTO _openingSchedule;
	/** <i>Generated variable</i> - Variable of <code>PointOfService.storeContent</code> attribute defined at extension <code> */
	private java.lang.String _storeContent;
	/** <i>Generated variable</i> - Variable of <code>PointOfService.address</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.AddressDTO _address;
	/** <i>Generated variable</i> - Variable of <code>PointOfService.latitude</code> attribute defined at extension <code> */
	private java.lang.Double _latitude;
	/** <i>Generated variable</i> - Variable of <code>PointOfService.baseStore</code> attribute defined at extension <code> */
	private de.hybris.platform.store.BaseStoreDTO _baseStore;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PointOfServiceDTO()
	{
		super();
	}
	
	
	public AddressDTO getAddress()
	{
		return this._address;
	}
	
	public BaseStoreDTO getBaseStore()
	{
		return this._baseStore;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	@XmlElementWrapper(name = "features")
	@XmlElement(name = "storeLocatorFeature")
	public Set<StoreLocatorFeatureDTO> getFeatures()
	{
		return this._features;
	}
	
	public Date getGeocodeTimestamp()
	{
		return this._geocodeTimestamp;
	}
	
	public Double getLatitude()
	{
		return this._latitude;
	}
	
	public Double getLongitude()
	{
		return this._longitude;
	}
	
	public MediaDTO getMapIcon()
	{
		return this._mapIcon;
	}
	
	@XmlAttribute
	public String getName()
	{
		return this._name;
	}
	
	public Double getNearbyStoreRadius()
	{
		return this._nearbyStoreRadius;
	}
	
	public OpeningScheduleDTO getOpeningSchedule()
	{
		return this._openingSchedule;
	}
	
	public String getStoreContent()
	{
		return this._storeContent;
	}
	
	@XmlElementWrapper(name = "storeEmployeeGroups")
	@XmlElement(name = "storeEmployeeGroup")
	public Set<StoreEmployeeGroupDTO> getStoreEmployeeGroups()
	{
		return this._storeEmployeeGroups;
	}
	
	public MediaContainerDTO getStoreImage()
	{
		return this._storeImage;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getType()
	{
		return this._type;
	}
	
	@XmlElementWrapper(name = "warehouses")
	@XmlElement(name = "warehouse")
	public List<WarehouseDTO> getWarehouses()
	{
		return this._warehouses;
	}
	
	public void setAddress(final AddressDTO value)
	{
		this.modifiedPropsSet.add("address");
		this._address = value;
	}
	
	public void setBaseStore(final BaseStoreDTO value)
	{
		this.modifiedPropsSet.add("baseStore");
		this._baseStore = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setFeatures(final Set<StoreLocatorFeatureDTO> value)
	{
		this.modifiedPropsSet.add("features");
		this._features = value;
	}
	
	public void setGeocodeTimestamp(final Date value)
	{
		this.modifiedPropsSet.add("geocodeTimestamp");
		this._geocodeTimestamp = value;
	}
	
	public void setLatitude(final Double value)
	{
		this.modifiedPropsSet.add("latitude");
		this._latitude = value;
	}
	
	public void setLongitude(final Double value)
	{
		this.modifiedPropsSet.add("longitude");
		this._longitude = value;
	}
	
	public void setMapIcon(final MediaDTO value)
	{
		this.modifiedPropsSet.add("mapIcon");
		this._mapIcon = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setNearbyStoreRadius(final Double value)
	{
		this.modifiedPropsSet.add("nearbyStoreRadius");
		this._nearbyStoreRadius = value;
	}
	
	public void setOpeningSchedule(final OpeningScheduleDTO value)
	{
		this.modifiedPropsSet.add("openingSchedule");
		this._openingSchedule = value;
	}
	
	public void setStoreContent(final String value)
	{
		this.modifiedPropsSet.add("storeContent");
		this._storeContent = value;
	}
	
	public void setStoreEmployeeGroups(final Set<StoreEmployeeGroupDTO> value)
	{
		this.modifiedPropsSet.add("storeEmployeeGroups");
		this._storeEmployeeGroups = value;
	}
	
	public void setStoreImage(final MediaContainerDTO value)
	{
		this.modifiedPropsSet.add("storeImage");
		this._storeImage = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setType(final String value)
	{
		this.modifiedPropsSet.add("type");
		this._type = value;
	}
	
	public void setWarehouses(final List<WarehouseDTO> value)
	{
		this.modifiedPropsSet.add("warehouses");
		this._warehouses = value;
	}
	
}
