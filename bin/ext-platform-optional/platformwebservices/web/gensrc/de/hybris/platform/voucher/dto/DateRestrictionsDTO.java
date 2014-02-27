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
package de.hybris.platform.voucher.dto;

import de.hybris.platform.voucher.dto.DateRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type DateRestriction first defined at extension voucher
 */
@SuppressWarnings("all")
@XmlRootElement(name = "daterestrictions")
public class DateRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DateRestrictionDTO*/
	private List<DateRestrictionDTO>  daterestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DateRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DateRestrictionsDTO(final List<DateRestrictionDTO> daterestrictionsList)
	{
		super();
		this.daterestrictionsList=daterestrictionsList;
	}
	
	
	/**
	 * @return the daterestrictions
	 */
	@XmlElement(name = "daterestriction")
	public List<DateRestrictionDTO> getDateRestrictions()
	{
		return	daterestrictionsList;
	}
	
	/**
	 * @param daterestrictionsList 
	 *  the daterestrictionsList to set   
	 */
	public void setDateRestrictions(final List<DateRestrictionDTO> daterestrictionsList)
	{
		this.daterestrictionsList=daterestrictionsList;
	}
	
}
