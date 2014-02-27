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
package de.hybris.platform.deeplink.dto.rules;

import de.hybris.platform.deeplink.dto.rules.DeeplinkUrlDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type DeeplinkUrl first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "deeplinkurls")
public class DeeplinkUrlsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DeeplinkUrlDTO*/
	private List<DeeplinkUrlDTO>  deeplinkurlsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DeeplinkUrlsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DeeplinkUrlsDTO(final List<DeeplinkUrlDTO> deeplinkurlsList)
	{
		super();
		this.deeplinkurlsList=deeplinkurlsList;
	}
	
	
	/**
	 * @return the deeplinkurls
	 */
	@XmlElement(name = "deeplinkurl")
	public List<DeeplinkUrlDTO> getDeeplinkUrls()
	{
		return	deeplinkurlsList;
	}
	
	/**
	 * @param deeplinkurlsList 
	 *  the deeplinkurlsList to set   
	 */
	public void setDeeplinkUrls(final List<DeeplinkUrlDTO> deeplinkurlsList)
	{
		this.deeplinkurlsList=deeplinkurlsList;
	}
	
}
