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
package de.hybris.platform.cronjob.dto.config;

import de.hybris.platform.cronjob.dto.config.CronJobConfigProxyItemDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CronJobConfigProxyItem first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cronjobconfigproxyitems")
public class CronJobConfigProxyItemsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CronJobConfigProxyItemDTO*/
	private List<CronJobConfigProxyItemDTO>  cronjobconfigproxyitemsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CronJobConfigProxyItemsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CronJobConfigProxyItemsDTO(final List<CronJobConfigProxyItemDTO> cronjobconfigproxyitemsList)
	{
		super();
		this.cronjobconfigproxyitemsList=cronjobconfigproxyitemsList;
	}
	
	
	/**
	 * @return the cronjobconfigproxyitems
	 */
	@XmlElement(name = "cronjobconfigproxyitem")
	public List<CronJobConfigProxyItemDTO> getCronJobConfigProxyItems()
	{
		return	cronjobconfigproxyitemsList;
	}
	
	/**
	 * @param cronjobconfigproxyitemsList 
	 *  the cronjobconfigproxyitemsList to set   
	 */
	public void setCronJobConfigProxyItems(final List<CronJobConfigProxyItemDTO> cronjobconfigproxyitemsList)
	{
		this.cronjobconfigproxyitemsList=cronjobconfigproxyitemsList;
	}
	
}
