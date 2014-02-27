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

import de.hybris.platform.commons.dto.FOPFormatterDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type FOPFormatter first defined at extension commons
 */
@SuppressWarnings("all")
@XmlRootElement(name = "fopformatters")
public class FOPFormattersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>FOPFormatterDTO*/
	private List<FOPFormatterDTO>  fopformattersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FOPFormattersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FOPFormattersDTO(final List<FOPFormatterDTO> fopformattersList)
	{
		super();
		this.fopformattersList=fopformattersList;
	}
	
	
	/**
	 * @return the fopformatters
	 */
	@XmlElement(name = "fopformatter")
	public List<FOPFormatterDTO> getFOPFormatters()
	{
		return	fopformattersList;
	}
	
	/**
	 * @param fopformattersList 
	 *  the fopformattersList to set   
	 */
	public void setFOPFormatters(final List<FOPFormatterDTO> fopformattersList)
	{
		this.fopformattersList=fopformattersList;
	}
	
}
