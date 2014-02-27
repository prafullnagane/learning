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

import de.hybris.platform.acceleratorcms.dto.components.ProductReferencesComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductReferencesComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productreferencescomponents")
public class ProductReferencesComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductReferencesComponentDTO*/
	private List<ProductReferencesComponentDTO>  productreferencescomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductReferencesComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductReferencesComponentsDTO(final List<ProductReferencesComponentDTO> productreferencescomponentsList)
	{
		super();
		this.productreferencescomponentsList=productreferencescomponentsList;
	}
	
	
	/**
	 * @return the productreferencescomponents
	 */
	@XmlElement(name = "productreferencescomponent")
	public List<ProductReferencesComponentDTO> getProductReferencesComponents()
	{
		return	productreferencescomponentsList;
	}
	
	/**
	 * @param productreferencescomponentsList 
	 *  the productreferencescomponentsList to set   
	 */
	public void setProductReferencesComponents(final List<ProductReferencesComponentDTO> productreferencescomponentsList)
	{
		this.productreferencescomponentsList=productreferencescomponentsList;
	}
	
}
