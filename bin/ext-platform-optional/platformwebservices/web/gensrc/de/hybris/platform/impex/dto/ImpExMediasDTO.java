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
package de.hybris.platform.impex.dto;

import de.hybris.platform.impex.dto.ImpExMediaDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ImpExMedia first defined at extension impex
 */
@SuppressWarnings("all")
@XmlRootElement(name = "impexmedias")
public class ImpExMediasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ImpExMediaDTO*/
	private List<ImpExMediaDTO>  impexmediasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExMediasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExMediasDTO(final List<ImpExMediaDTO> impexmediasList)
	{
		super();
		this.impexmediasList=impexmediasList;
	}
	
	
	/**
	 * @return the impexmedias
	 */
	@XmlElement(name = "impexmedia")
	public List<ImpExMediaDTO> getImpExMedias()
	{
		return	impexmediasList;
	}
	
	/**
	 * @param impexmediasList 
	 *  the impexmediasList to set   
	 */
	public void setImpExMedias(final List<ImpExMediaDTO> impexmediasList)
	{
		this.impexmediasList=impexmediasList;
	}
	
}
