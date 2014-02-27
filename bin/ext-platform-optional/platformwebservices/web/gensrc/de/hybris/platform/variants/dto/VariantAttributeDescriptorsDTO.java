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

import de.hybris.platform.variants.dto.VariantAttributeDescriptorDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type VariantAttributeDescriptor first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "variantattributedescriptors")
public class VariantAttributeDescriptorsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>VariantAttributeDescriptorDTO*/
	private List<VariantAttributeDescriptorDTO>  variantattributedescriptorsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VariantAttributeDescriptorsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VariantAttributeDescriptorsDTO(final List<VariantAttributeDescriptorDTO> variantattributedescriptorsList)
	{
		super();
		this.variantattributedescriptorsList=variantattributedescriptorsList;
	}
	
	
	/**
	 * @return the variantattributedescriptors
	 */
	@XmlElement(name = "variantattributedescriptor")
	public List<VariantAttributeDescriptorDTO> getVariantAttributeDescriptors()
	{
		return	variantattributedescriptorsList;
	}
	
	/**
	 * @param variantattributedescriptorsList 
	 *  the variantattributedescriptorsList to set   
	 */
	public void setVariantAttributeDescriptors(final List<VariantAttributeDescriptorDTO> variantattributedescriptorsList)
	{
		this.variantattributedescriptorsList=variantattributedescriptorsList;
	}
	
}
