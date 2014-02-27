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
package de.hybris.platform.europe1.dto;

import de.hybris.platform.europe1.dto.PDTRowDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PDTRow first defined at extension europe1
 */
@SuppressWarnings("all")
@XmlRootElement(name = "pdtrows")
public class PDTRowsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PDTRowDTO*/
	private List<PDTRowDTO>  pdtrowsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PDTRowsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PDTRowsDTO(final List<PDTRowDTO> pdtrowsList)
	{
		super();
		this.pdtrowsList=pdtrowsList;
	}
	
	
	/**
	 * @return the pdtrows
	 */
	@XmlElement(name = "pdtrow")
	public List<PDTRowDTO> getPDTRows()
	{
		return	pdtrowsList;
	}
	
	/**
	 * @param pdtrowsList 
	 *  the pdtrowsList to set   
	 */
	public void setPDTRows(final List<PDTRowDTO> pdtrowsList)
	{
		this.pdtrowsList=pdtrowsList;
	}
	
}
