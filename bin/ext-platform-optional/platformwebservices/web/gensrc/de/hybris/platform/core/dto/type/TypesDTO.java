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

import de.hybris.platform.core.dto.type.TypeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Type first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "types")
public class TypesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>TypeDTO*/
	private List<TypeDTO>  typesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypesDTO(final List<TypeDTO> typesList)
	{
		super();
		this.typesList=typesList;
	}
	
	
	/**
	 * @return the types
	 */
	@XmlElement(name = "type")
	public List<TypeDTO> getTypes()
	{
		return	typesList;
	}
	
	/**
	 * @param typesList 
	 *  the typesList to set   
	 */
	public void setTypes(final List<TypeDTO> typesList)
	{
		this.typesList=typesList;
	}
	
}
