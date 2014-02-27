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

import de.hybris.platform.core.dto.type.AtomicTypeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AtomicType first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "atomictypes")
public class AtomicTypesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AtomicTypeDTO*/
	private List<AtomicTypeDTO>  atomictypesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AtomicTypesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AtomicTypesDTO(final List<AtomicTypeDTO> atomictypesList)
	{
		super();
		this.atomictypesList=atomictypesList;
	}
	
	
	/**
	 * @return the atomictypes
	 */
	@XmlElement(name = "atomictype")
	public List<AtomicTypeDTO> getAtomicTypes()
	{
		return	atomictypesList;
	}
	
	/**
	 * @param atomictypesList 
	 *  the atomictypesList to set   
	 */
	public void setAtomicTypes(final List<AtomicTypeDTO> atomictypesList)
	{
		this.atomictypesList=atomictypesList;
	}
	
}
