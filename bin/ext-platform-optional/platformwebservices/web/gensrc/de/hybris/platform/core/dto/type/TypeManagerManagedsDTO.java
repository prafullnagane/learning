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

import de.hybris.platform.core.dto.type.TypeManagerManagedDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type TypeManagerManaged first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "typemanagermanageds")
public class TypeManagerManagedsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>TypeManagerManagedDTO*/
	private List<TypeManagerManagedDTO>  typemanagermanagedsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypeManagerManagedsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypeManagerManagedsDTO(final List<TypeManagerManagedDTO> typemanagermanagedsList)
	{
		super();
		this.typemanagermanagedsList=typemanagermanagedsList;
	}
	
	
	/**
	 * @return the typemanagermanageds
	 */
	@XmlElement(name = "typemanagermanaged")
	public List<TypeManagerManagedDTO> getTypeManagerManageds()
	{
		return	typemanagermanagedsList;
	}
	
	/**
	 * @param typemanagermanagedsList 
	 *  the typemanagermanagedsList to set   
	 */
	public void setTypeManagerManageds(final List<TypeManagerManagedDTO> typemanagermanagedsList)
	{
		this.typemanagermanagedsList=typemanagermanagedsList;
	}
	
}
