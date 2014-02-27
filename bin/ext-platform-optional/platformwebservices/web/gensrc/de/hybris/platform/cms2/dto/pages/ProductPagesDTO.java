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
package de.hybris.platform.cms2.dto.pages;

import de.hybris.platform.cms2.dto.pages.ProductPageDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductPage first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productpages")
public class ProductPagesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductPageDTO*/
	private List<ProductPageDTO>  productpagesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPagesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPagesDTO(final List<ProductPageDTO> productpagesList)
	{
		super();
		this.productpagesList=productpagesList;
	}
	
	
	/**
	 * @return the productpages
	 */
	@XmlElement(name = "productpage")
	public List<ProductPageDTO> getProductPages()
	{
		return	productpagesList;
	}
	
	/**
	 * @param productpagesList 
	 *  the productpagesList to set   
	 */
	public void setProductPages(final List<ProductPageDTO> productpagesList)
	{
		this.productpagesList=productpagesList;
	}
	
}
