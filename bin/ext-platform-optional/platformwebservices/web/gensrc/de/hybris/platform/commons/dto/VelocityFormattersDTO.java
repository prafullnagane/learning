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
package de.hybris.platform.commons.dto;

import de.hybris.platform.commons.dto.VelocityFormatterDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type VelocityFormatter first defined at extension commons
 */
@SuppressWarnings("all")
@XmlRootElement(name = "velocityformatters")
public class VelocityFormattersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>VelocityFormatterDTO*/
	private List<VelocityFormatterDTO>  velocityformattersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VelocityFormattersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VelocityFormattersDTO(final List<VelocityFormatterDTO> velocityformattersList)
	{
		super();
		this.velocityformattersList=velocityformattersList;
	}
	
	
	/**
	 * @return the velocityformatters
	 */
	@XmlElement(name = "velocityformatter")
	public List<VelocityFormatterDTO> getVelocityFormatters()
	{
		return	velocityformattersList;
	}
	
	/**
	 * @param velocityformattersList 
	 *  the velocityformattersList to set   
	 */
	public void setVelocityFormatters(final List<VelocityFormatterDTO> velocityformattersList)
	{
		this.velocityformattersList=velocityformattersList;
	}
	
}
