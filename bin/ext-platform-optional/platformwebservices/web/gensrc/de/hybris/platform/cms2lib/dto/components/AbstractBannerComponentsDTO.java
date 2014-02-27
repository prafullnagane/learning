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
package de.hybris.platform.cms2lib.dto.components;

import de.hybris.platform.cms2lib.dto.components.AbstractBannerComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AbstractBannerComponent first defined at extension cms2lib
 */
@SuppressWarnings("all")
@XmlRootElement(name = "abstractbannercomponents")
public class AbstractBannerComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AbstractBannerComponentDTO*/
	private List<AbstractBannerComponentDTO>  abstractbannercomponentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractBannerComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractBannerComponentsDTO(final List<AbstractBannerComponentDTO> abstractbannercomponentsList)
	{
		super();
		this.abstractbannercomponentsList=abstractbannercomponentsList;
	}
	
	
	/**
	 * @return the abstractbannercomponents
	 */
	@XmlElement(name = "abstractbannercomponent")
	public List<AbstractBannerComponentDTO> getAbstractBannerComponents()
	{
		return	abstractbannercomponentsList;
	}
	
	/**
	 * @param abstractbannercomponentsList 
	 *  the abstractbannercomponentsList to set   
	 */
	public void setAbstractBannerComponents(final List<AbstractBannerComponentDTO> abstractbannercomponentsList)
	{
		this.abstractbannercomponentsList=abstractbannercomponentsList;
	}
	
}
