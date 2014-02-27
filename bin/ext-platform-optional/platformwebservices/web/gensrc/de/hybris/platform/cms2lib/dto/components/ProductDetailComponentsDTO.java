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

import de.hybris.platform.cms2lib.dto.components.ProductDetailComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductDetailComponent first defined at extension cms2lib
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productdetailcomponents")
public class ProductDetailComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductDetailComponentDTO*/
	private List<ProductDetailComponentDTO>  productdetailcomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductDetailComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductDetailComponentsDTO(final List<ProductDetailComponentDTO> productdetailcomponentsList)
	{
		super();
		this.productdetailcomponentsList=productdetailcomponentsList;
	}
	
	
	/**
	 * @return the productdetailcomponents
	 */
	@XmlElement(name = "productdetailcomponent")
	public List<ProductDetailComponentDTO> getProductDetailComponents()
	{
		return	productdetailcomponentsList;
	}
	
	/**
	 * @param productdetailcomponentsList 
	 *  the productdetailcomponentsList to set   
	 */
	public void setProductDetailComponents(final List<ProductDetailComponentDTO> productdetailcomponentsList)
	{
		this.productdetailcomponentsList=productdetailcomponentsList;
	}
	
}
