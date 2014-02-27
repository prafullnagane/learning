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
package de.hybris.platform.catalog.dto;

import de.hybris.platform.catalog.dto.ProductReferenceDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductReference first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productreferences")
public class ProductReferencesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductReferenceDTO*/
	private List<ProductReferenceDTO>  productreferencesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductReferencesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductReferencesDTO(final List<ProductReferenceDTO> productreferencesList)
	{
		super();
		this.productreferencesList=productreferencesList;
	}
	
	
	/**
	 * @return the productreferences
	 */
	@XmlElement(name = "productreference")
	public List<ProductReferenceDTO> getProductReferences()
	{
		return	productreferencesList;
	}
	
	/**
	 * @param productreferencesList 
	 *  the productreferencesList to set   
	 */
	public void setProductReferences(final List<ProductReferenceDTO> productreferencesList)
	{
		this.productreferencesList=productreferencesList;
	}
	
}
