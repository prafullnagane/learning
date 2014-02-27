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
package de.hybris.platform.core.dto.enumeration;

import de.hybris.platform.core.dto.enumeration.EnumerationMetaTypeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type EnumerationMetaType first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "enumerationmetatypes")
public class EnumerationMetaTypesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>EnumerationMetaTypeDTO*/
	private List<EnumerationMetaTypeDTO>  enumerationmetatypesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EnumerationMetaTypesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EnumerationMetaTypesDTO(final List<EnumerationMetaTypeDTO> enumerationmetatypesList)
	{
		super();
		this.enumerationmetatypesList=enumerationmetatypesList;
	}
	
	
	/**
	 * @return the enumerationmetatypes
	 */
	@XmlElement(name = "enumerationmetatype")
	public List<EnumerationMetaTypeDTO> getEnumerationMetaTypes()
	{
		return	enumerationmetatypesList;
	}
	
	/**
	 * @param enumerationmetatypesList 
	 *  the enumerationmetatypesList to set   
	 */
	public void setEnumerationMetaTypes(final List<EnumerationMetaTypeDTO> enumerationmetatypesList)
	{
		this.enumerationmetatypesList=enumerationmetatypesList;
	}
	
}
