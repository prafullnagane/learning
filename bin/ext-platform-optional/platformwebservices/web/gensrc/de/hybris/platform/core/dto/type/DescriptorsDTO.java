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
package de.hybris.platform.core.dto.type;

import de.hybris.platform.core.dto.type.DescriptorDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Descriptor first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "descriptors")
public class DescriptorsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DescriptorDTO*/
	private List<DescriptorDTO>  descriptorsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DescriptorsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DescriptorsDTO(final List<DescriptorDTO> descriptorsList)
	{
		super();
		this.descriptorsList=descriptorsList;
	}
	
	
	/**
	 * @return the descriptors
	 */
	@XmlElement(name = "descriptor")
	public List<DescriptorDTO> getDescriptors()
	{
		return	descriptorsList;
	}
	
	/**
	 * @param descriptorsList 
	 *  the descriptorsList to set   
	 */
	public void setDescriptors(final List<DescriptorDTO> descriptorsList)
	{
		this.descriptorsList=descriptorsList;
	}
	
}
