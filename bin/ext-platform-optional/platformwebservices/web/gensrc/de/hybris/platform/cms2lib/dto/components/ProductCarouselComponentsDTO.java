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

import de.hybris.platform.cms2lib.dto.components.ProductCarouselComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductCarouselComponent first defined at extension cms2lib
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productcarouselcomponents")
public class ProductCarouselComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductCarouselComponentDTO*/
	private List<ProductCarouselComponentDTO>  productcarouselcomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductCarouselComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductCarouselComponentsDTO(final List<ProductCarouselComponentDTO> productcarouselcomponentsList)
	{
		super();
		this.productcarouselcomponentsList=productcarouselcomponentsList;
	}
	
	
	/**
	 * @return the productcarouselcomponents
	 */
	@XmlElement(name = "productcarouselcomponent")
	public List<ProductCarouselComponentDTO> getProductCarouselComponents()
	{
		return	productcarouselcomponentsList;
	}
	
	/**
	 * @param productcarouselcomponentsList 
	 *  the productcarouselcomponentsList to set   
	 */
	public void setProductCarouselComponents(final List<ProductCarouselComponentDTO> productcarouselcomponentsList)
	{
		this.productcarouselcomponentsList=productcarouselcomponentsList;
	}
	
}
