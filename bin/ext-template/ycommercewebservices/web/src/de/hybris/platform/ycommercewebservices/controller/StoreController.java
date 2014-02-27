/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package de.hybris.platform.ycommercewebservices.controller;

import de.hybris.platform.commercefacades.order.CheckoutFacade;
import de.hybris.platform.commercefacades.storesession.StoreSessionFacade;
import de.hybris.platform.commercefacades.user.UserFacade;
import de.hybris.platform.ycommercewebservices.dto.CardTypeDataList;
import de.hybris.platform.ycommercewebservices.dto.CountryDataList;
import de.hybris.platform.ycommercewebservices.dto.CurrencyDataList;
import de.hybris.platform.ycommercewebservices.dto.LanguageDataList;
import de.hybris.platform.ycommercewebservices.dto.TitleDataList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Main Controller for available data
 */
@Controller
public class StoreController extends BaseController
{
	@Resource(name = "userFacade")
	private UserFacade userFacade;

	@Resource(name = "storeSessionFacade")
	private StoreSessionFacade storeSessionFacade;

	@Resource(name = "checkoutFacade")
	private CheckoutFacade checkoutFacade;

	/**
	 * returns all languages defined for the base store.<br>
	 * Sample call : http://localhost:9001/rest/v1/{SITE}/languages<br>
	 * Request method : <code>GET</code>
	 * 
	 * @return list of languages
	 */
	@RequestMapping(value = "/v1/{baseSiteId}/languages", method = RequestMethod.GET)
	@ResponseBody
	public LanguageDataList getLanguages()
	{
		return new LanguageDataList(storeSessionFacade.getAllLanguages());
	}

	/**
	 * returns all currencies defined for the current store.<br>
	 * Sample call : http://localhost:9001/rest/v1/{SITE}/currencies<br>
	 * Request method : <code>GET</code>
	 * 
	 * @return list of currencies
	 */
	@RequestMapping(value = "/v1/{baseSiteId}/currencies", method = RequestMethod.GET)
	@ResponseBody
	public CurrencyDataList getCurrencies()
	{
		return new CurrencyDataList(storeSessionFacade.getAllCurrencies());
	}

	/**
	 * returns all delivery countries defined for the curent store.<br>
	 * Sample call : http://localhost:9001/rest/v1/{SITE}/deliverycountries<br>
	 * Request method : <code>GET</code>
	 * 
	 * @return list of countries
	 */
	@RequestMapping(value = "/v1/{baseSiteId}/deliverycountries", method = RequestMethod.GET)
	@ResponseBody
	public CountryDataList getDeliveryCountries()
	{
		return new CountryDataList(checkoutFacade.getDeliveryCountries());
	}

	/**
	 * returns all possible titles (code and name).<br>
	 * Sample call : http://localhost:9001/rest/v1/titles<br>
	 * Request method : <code>GET</code>
	 * 
	 * @return list of titles
	 */
	@RequestMapping(value = "/v1/{baseSiteId}/titles", method = RequestMethod.GET)
	@ResponseBody
	public TitleDataList getTitles()
	{
		return new TitleDataList(userFacade.getTitles());
	}

	/**
	 * returns all possible card types.<br>
	 * Sample call : http://localhost:9001/rest/v1/cardtypes<br>
	 * Request method : <code>GET</code>
	 * 
	 * @return list of card types
	 */
	@RequestMapping(value = "/v1/{baseSiteId}/cardtypes", method = RequestMethod.GET)
	@ResponseBody
	public CardTypeDataList getCardTypes()
	{
		return new CardTypeDataList(checkoutFacade.getSupportedCardTypes());
	}

}
