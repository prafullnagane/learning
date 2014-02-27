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

import de.hybris.platform.core.dto.media.AbstractMediaDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AbstractMedia first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "abstractmedias")
public class AbstractMediasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AbstractMediaDTO*/
	private List<AbstractMediaDTO>  abstractmediasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractMediasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractMediasDTO(final List<AbstractMediaDTO> abstractmediasList)
	{
		super();
		this.abstractmediasList=abstractmediasList;
	}
	
	
	/**
	 * @return the abstractmedias
	 */
	@XmlElement(name = "abstractmedia")
	public List<AbstractMediaDTO> getAbstractMedias()
	{
		return	abstractmediasList;
	}
	
	/**
	 * @param abstractmediasList 
	 *  the abstractmediasList to set   
	 */
	public void setAbstractMedias(final List<AbstractMediaDTO> abstractmediasList)
	{
		this.abstractmediasList=abstractmediasList;
	}
	
}