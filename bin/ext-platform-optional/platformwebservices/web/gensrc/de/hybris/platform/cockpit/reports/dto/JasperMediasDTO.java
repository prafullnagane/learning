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
package de.hybris.platform.cockpit.reports.dto;

import de.hybris.platform.cockpit.reports.dto.JasperMediaDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type JasperMedia first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "jaspermedias")
public class JasperMediasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>JasperMediaDTO*/
	private List<JasperMediaDTO>  jaspermediasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JasperMediasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JasperMediasDTO(final List<JasperMediaDTO> jaspermediasList)
	{
		super();
		this.jaspermediasList=jaspermediasList;
	}
	
	
	/**
	 * @return the jaspermedias
	 */
	@XmlElement(name = "jaspermedia")
	public List<JasperMediaDTO> getJasperMedias()
	{
		return	jaspermediasList;
	}
	
	/**
	 * @param jaspermediasList 
	 *  the jaspermediasList to set   
	 */
	public void setJasperMedias(final List<JasperMediaDTO> jaspermediasList)
	{
		this.jaspermediasList=jaspermediasList;
	}
	
}
