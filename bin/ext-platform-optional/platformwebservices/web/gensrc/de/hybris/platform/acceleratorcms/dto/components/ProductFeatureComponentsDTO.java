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

import de.hybris.platform.acceleratorcms.dto.components.ProductFeatureComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductFeatureComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productfeaturecomponents")
public class ProductFeatureComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductFeatureComponentDTO*/
	private List<ProductFeatureComponentDTO>  productfeaturecomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductFeatureComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductFeatureComponentsDTO(final List<ProductFeatureComponentDTO> productfeaturecomponentsList)
	{
		super();
		this.productfeaturecomponentsList=productfeaturecomponentsList;
	}
	
	
	/**
	 * @return the productfeaturecomponents
	 */
	@XmlElement(name = "productfeaturecomponent")
	public List<ProductFeatureComponentDTO> getProductFeatureComponents()
	{
		return	productfeaturecomponentsList;
	}
	
	/**
	 * @param productfeaturecomponentsList 
	 *  the productfeaturecomponentsList to set   
	 */
	public void setProductFeatureComponents(final List<ProductFeatureComponentDTO> productfeaturecomponentsList)
	{
		this.productfeaturecomponentsList=productfeaturecomponentsList;
	}
	
}
