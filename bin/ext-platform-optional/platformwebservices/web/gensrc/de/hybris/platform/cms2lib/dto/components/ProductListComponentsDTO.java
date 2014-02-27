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
package de.hybris.platform.cms2lib.dto.components;

import de.hybris.platform.cms2lib.dto.components.ProductListComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductListComponent first defined at extension cms2lib
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productlistcomponents")
public class ProductListComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductListComponentDTO*/
	private List<ProductListComponentDTO>  productlistcomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductListComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductListComponentsDTO(final List<ProductListComponentDTO> productlistcomponentsList)
	{
		super();
		this.productlistcomponentsList=productlistcomponentsList;
	}
	
	
	/**
	 * @return the productlistcomponents
	 */
	@XmlElement(name = "productlistcomponent")
	public List<ProductListComponentDTO> getProductListComponents()
	{
		return	productlistcomponentsList;
	}
	
	/**
	 * @param productlistcomponentsList 
	 *  the productlistcomponentsList to set   
	 */
	public void setProductListComponents(final List<ProductListComponentDTO> productlistcomponentsList)
	{
		this.productlistcomponentsList=productlistcomponentsList;
	}
	
}
