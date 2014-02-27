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

import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Currency first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "currencies")
public class CurrenciesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CurrencyDTO*/
	private List<CurrencyDTO>  currenciesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CurrenciesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CurrenciesDTO(final List<CurrencyDTO> currenciesList)
	{
		super();
		this.currenciesList=currenciesList;
	}
	
	
	/**
	 * @return the currencies
	 */
	@XmlElement(name = "currency")
	public List<CurrencyDTO> getCurrencies()
	{
		return	currenciesList;
	}
	
	/**
	 * @param currenciesList 
	 *  the currenciesList to set   
	 */
	public void setCurrencies(final List<CurrencyDTO> currenciesList)
	{
		this.currenciesList=currenciesList;
	}
	
}
