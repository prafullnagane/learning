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
import de.hybris.platform.core.dto.c2l.CountryDTO;
import de.hybris.platform.core.model.c2l.RegionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Region first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = RegionModel.class, factory = GenericNodeFactory.class, uidProperties="isocode")
@XmlRootElement(name = "region")
public class RegionDTO extends C2LItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Region.isocodeShort</code> attribute defined at extension <code> */
	private java.lang.String _isocodeShort;
	/** <i>Generated variable</i> - Variable of <code>Region.country</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CountryDTO _country;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RegionDTO()
	{
		super();
	}
	
	
	public CountryDTO getCountry()
	{
		return this._country;
	}
	
	public String getIsocodeShort()
	{
		return this._isocodeShort;
	}
	
	public void setCountry(final CountryDTO value)
	{
		this.modifiedPropsSet.add("country");
		this._country = value;
	}
	
	public void setIsocodeShort(final String value)
	{
		this.modifiedPropsSet.add("isocodeShort");
		this._isocodeShort = value;
	}
	
}
