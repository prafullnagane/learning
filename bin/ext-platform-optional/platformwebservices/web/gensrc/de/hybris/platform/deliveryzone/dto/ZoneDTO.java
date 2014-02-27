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
package de.hybris.platform.deliveryzone.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CountryDTO;
import de.hybris.platform.deliveryzone.model.ZoneModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Set;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Zone first defined at extension deliveryzone
 */
@SuppressWarnings("all")
@GraphNode(target = ZoneModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "zone")
public class ZoneDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Zone.countries</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.core.dto.c2l.CountryDTO> _countries;
	/** <i>Generated variable</i> - Variable of <code>Zone.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ZoneDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "countries")
	@XmlElement(name = "country")
	public Set<CountryDTO> getCountries()
	{
		return this._countries;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setCountries(final Set<CountryDTO> value)
	{
		this.modifiedPropsSet.add("countries");
		this._countries = value;
	}
	
}
