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
package de.hybris.platform.commerceservices.dto.storelocator;

import de.hybris.platform.commerceservices.model.storelocator.StoreLocatorFeatureModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.storelocator.dto.PointOfServiceDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type StoreLocatorFeature first defined at extension commerceservices
 */
@SuppressWarnings("all")
@GraphNode(target = StoreLocatorFeatureModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "storelocatorfeature")
public class StoreLocatorFeatureDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>StoreLocatorFeature.icon</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _icon;
	/** <i>Generated variable</i> - Variable of <code>StoreLocatorFeature.pointOfServices</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.storelocator.dto.PointOfServiceDTO> _pointOfServices;
	/** <i>Generated variable</i> - Variable of <code>StoreLocatorFeature.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>StoreLocatorFeature.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreLocatorFeatureDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public MediaDTO getIcon()
	{
		return this._icon;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	@XmlElementWrapper(name = "pointOfServices")
	@XmlElement(name = "pointOfService")
	public Collection<PointOfServiceDTO> getPointOfServices()
	{
		return this._pointOfServices;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setIcon(final MediaDTO value)
	{
		this.modifiedPropsSet.add("icon");
		this._icon = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setPointOfServices(final Collection<PointOfServiceDTO> value)
	{
		this.modifiedPropsSet.add("pointOfServices");
		this._pointOfServices = value;
	}
	
}
