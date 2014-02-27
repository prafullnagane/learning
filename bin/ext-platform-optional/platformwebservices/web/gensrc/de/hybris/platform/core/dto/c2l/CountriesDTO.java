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

import de.hybris.platform.core.dto.c2l.CountryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Country first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "countries")
public class CountriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CountryDTO*/
	private List<CountryDTO>  countriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CountriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CountriesDTO(final List<CountryDTO> countriesList)
	{
		super();
		this.countriesList=countriesList;
	}
	
	
	/**
	 * @return the countries
	 */
	@XmlElement(name = "country")
	public List<CountryDTO> getCountries()
	{
		return	countriesList;
	}
	
	/**
	 * @param countriesList 
	 *  the countriesList to set   
	 */
	public void setCountries(final List<CountryDTO> countriesList)
	{
		this.countriesList=countriesList;
	}
	
}
