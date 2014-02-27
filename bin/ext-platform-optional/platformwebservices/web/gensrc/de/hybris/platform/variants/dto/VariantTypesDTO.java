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
package de.hybris.platform.variants.dto;

import de.hybris.platform.variants.dto.VariantTypeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type VariantType first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "varianttypes")
public class VariantTypesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>VariantTypeDTO*/
	private List<VariantTypeDTO>  varianttypesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VariantTypesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VariantTypesDTO(final List<VariantTypeDTO> varianttypesList)
	{
		super();
		this.varianttypesList=varianttypesList;
	}
	
	
	/**
	 * @return the varianttypes
	 */
	@XmlElement(name = "varianttype")
	public List<VariantTypeDTO> getVariantTypes()
	{
		return	varianttypesList;
	}
	
	/**
	 * @param varianttypesList 
	 *  the varianttypesList to set   
	 */
	public void setVariantTypes(final List<VariantTypeDTO> varianttypesList)
	{
		this.varianttypesList=varianttypesList;
	}
	
}
