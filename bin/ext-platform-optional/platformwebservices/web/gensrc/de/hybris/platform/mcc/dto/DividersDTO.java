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
package de.hybris.platform.mcc.dto;

import de.hybris.platform.mcc.dto.DividerDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Divider first defined at extension mcc
 */
@SuppressWarnings("all")
@XmlRootElement(name = "dividers")
public class DividersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DividerDTO*/
	private List<DividerDTO>  dividersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DividersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DividersDTO(final List<DividerDTO> dividersList)
	{
		super();
		this.dividersList=dividersList;
	}
	
	
	/**
	 * @return the dividers
	 */
	@XmlElement(name = "divider")
	public List<DividerDTO> getDividers()
	{
		return	dividersList;
	}
	
	/**
	 * @param dividersList 
	 *  the dividersList to set   
	 */
	public void setDividers(final List<DividerDTO> dividersList)
	{
		this.dividersList=dividersList;
	}
	
}
