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
package de.hybris.platform.btg.dto;

import de.hybris.platform.btg.dto.BTGReferenceCountriesOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGReferenceCountriesOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgreferencecountriesoperands")
public class BTGReferenceCountriesOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGReferenceCountriesOperandDTO*/
	private List<BTGReferenceCountriesOperandDTO>  btgreferencecountriesoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceCountriesOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceCountriesOperandsDTO(final List<BTGReferenceCountriesOperandDTO> btgreferencecountriesoperandsList)
	{
		super();
		this.btgreferencecountriesoperandsList=btgreferencecountriesoperandsList;
	}
	
	
	/**
	 * @return the btgreferencecountriesoperands
	 */
	@XmlElement(name = "btgreferencecountriesoperand")
	public List<BTGReferenceCountriesOperandDTO> getBTGReferenceCountriesOperands()
	{
		return	btgreferencecountriesoperandsList;
	}
	
	/**
	 * @param btgreferencecountriesoperandsList 
	 *  the btgreferencecountriesoperandsList to set   
	 */
	public void setBTGReferenceCountriesOperands(final List<BTGReferenceCountriesOperandDTO> btgreferencecountriesoperandsList)
	{
		this.btgreferencecountriesoperandsList=btgreferencecountriesoperandsList;
	}
	
}
