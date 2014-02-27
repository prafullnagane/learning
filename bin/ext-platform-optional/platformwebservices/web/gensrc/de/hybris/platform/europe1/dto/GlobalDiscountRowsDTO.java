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

import de.hybris.platform.europe1.dto.GlobalDiscountRowDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type GlobalDiscountRow first defined at extension europe1
 */
@SuppressWarnings("all")
@XmlRootElement(name = "globaldiscountrows")
public class GlobalDiscountRowsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>GlobalDiscountRowDTO*/
	private List<GlobalDiscountRowDTO>  globaldiscountrowsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public GlobalDiscountRowsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public GlobalDiscountRowsDTO(final List<GlobalDiscountRowDTO> globaldiscountrowsList)
	{
		super();
		this.globaldiscountrowsList=globaldiscountrowsList;
	}
	
	
	/**
	 * @return the globaldiscountrows
	 */
	@XmlElement(name = "globaldiscountrow")
	public List<GlobalDiscountRowDTO> getGlobalDiscountRows()
	{
		return	globaldiscountrowsList;
	}
	
	/**
	 * @param globaldiscountrowsList 
	 *  the globaldiscountrowsList to set   
	 */
	public void setGlobalDiscountRows(final List<GlobalDiscountRowDTO> globaldiscountrowsList)
	{
		this.globaldiscountrowsList=globaldiscountrowsList;
	}
	
}
