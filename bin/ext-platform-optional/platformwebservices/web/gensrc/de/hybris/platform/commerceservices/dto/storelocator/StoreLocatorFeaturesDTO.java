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

import de.hybris.platform.commerceservices.dto.storelocator.StoreLocatorFeatureDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type StoreLocatorFeature first defined at extension commerceservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "storelocatorfeatures")
public class StoreLocatorFeaturesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>StoreLocatorFeatureDTO*/
	private List<StoreLocatorFeatureDTO>  storelocatorfeaturesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreLocatorFeaturesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreLocatorFeaturesDTO(final List<StoreLocatorFeatureDTO> storelocatorfeaturesList)
	{
		super();
		this.storelocatorfeaturesList=storelocatorfeaturesList;
	}
	
	
	/**
	 * @return the storelocatorfeatures
	 */
	@XmlElement(name = "storelocatorfeature")
	public List<StoreLocatorFeatureDTO> getStoreLocatorFeatures()
	{
		return	storelocatorfeaturesList;
	}
	
	/**
	 * @param storelocatorfeaturesList 
	 *  the storelocatorfeaturesList to set   
	 */
	public void setStoreLocatorFeatures(final List<StoreLocatorFeatureDTO> storelocatorfeaturesList)
	{
		this.storelocatorfeaturesList=storelocatorfeaturesList;
	}
	
}
