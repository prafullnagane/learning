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
package de.hybris.platform.acceleratorcms.dto.components;

import de.hybris.platform.acceleratorcms.dto.components.PurchasedProductReferencesComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PurchasedProductReferencesComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@XmlRootElement(name = "purchasedproductreferencescomponents")
public class PurchasedProductReferencesComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PurchasedProductReferencesComponentDTO*/
	private List<PurchasedProductReferencesComponentDTO>  purchasedproductreferencescomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PurchasedProductReferencesComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PurchasedProductReferencesComponentsDTO(final List<PurchasedProductReferencesComponentDTO> purchasedproductreferencescomponentsList)
	{
		super();
		this.purchasedproductreferencescomponentsList=purchasedproductreferencescomponentsList;
	}
	
	
	/**
	 * @return the purchasedproductreferencescomponents
	 */
	@XmlElement(name = "purchasedproductreferencescomponent")
	public List<PurchasedProductReferencesComponentDTO> getPurchasedProductReferencesComponents()
	{
		return	purchasedproductreferencescomponentsList;
	}
	
	/**
	 * @param purchasedproductreferencescomponentsList 
	 *  the purchasedproductreferencescomponentsList to set   
	 */
	public void setPurchasedProductReferencesComponents(final List<PurchasedProductReferencesComponentDTO> purchasedproductreferencescomponentsList)
	{
		this.purchasedproductreferencescomponentsList=purchasedproductreferencescomponentsList;
	}
	
}
