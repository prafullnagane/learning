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
package de.hybris.platform.core.dto.media;

import de.hybris.platform.core.dto.media.DerivedMediaDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type DerivedMedia first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "derivedmedias")
public class DerivedMediasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DerivedMediaDTO*/
	private List<DerivedMediaDTO>  derivedmediasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DerivedMediasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DerivedMediasDTO(final List<DerivedMediaDTO> derivedmediasList)
	{
		super();
		this.derivedmediasList=derivedmediasList;
	}
	
	
	/**
	 * @return the derivedmedias
	 */
	@XmlElement(name = "derivedmedia")
	public List<DerivedMediaDTO> getDerivedMedias()
	{
		return	derivedmediasList;
	}
	
	/**
	 * @param derivedmediasList 
	 *  the derivedmediasList to set   
	 */
	public void setDerivedMedias(final List<DerivedMediaDTO> derivedmediasList)
	{
		this.derivedmediasList=derivedmediasList;
	}
	
}
