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
package de.hybris.platform.ldap.dto;

import de.hybris.platform.ldap.dto.LDIFMediaDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type LDIFMedia first defined at extension ldap
 */
@SuppressWarnings("all")
@XmlRootElement(name = "ldifmedias")
public class LDIFMediasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>LDIFMediaDTO*/
	private List<LDIFMediaDTO>  ldifmediasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDIFMediasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDIFMediasDTO(final List<LDIFMediaDTO> ldifmediasList)
	{
		super();
		this.ldifmediasList=ldifmediasList;
	}
	
	
	/**
	 * @return the ldifmedias
	 */
	@XmlElement(name = "ldifmedia")
	public List<LDIFMediaDTO> getLDIFMedias()
	{
		return	ldifmediasList;
	}
	
	/**
	 * @param ldifmediasList 
	 *  the ldifmediasList to set   
	 */
	public void setLDIFMedias(final List<LDIFMediaDTO> ldifmediasList)
	{
		this.ldifmediasList=ldifmediasList;
	}
	
}
