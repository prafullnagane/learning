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

import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ComposedType first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "composedtypes")
public class ComposedTypesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ComposedTypeDTO*/
	private List<ComposedTypeDTO>  composedtypesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ComposedTypesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ComposedTypesDTO(final List<ComposedTypeDTO> composedtypesList)
	{
		super();
		this.composedtypesList=composedtypesList;
	}
	
	
	/**
	 * @return the composedtypes
	 */
	@XmlElement(name = "composedtype")
	public List<ComposedTypeDTO> getComposedTypes()
	{
		return	composedtypesList;
	}
	
	/**
	 * @param composedtypesList 
	 *  the composedtypesList to set   
	 */
	public void setComposedTypes(final List<ComposedTypeDTO> composedtypesList)
	{
		this.composedtypesList=composedtypesList;
	}
	
}
