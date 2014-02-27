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

import de.hybris.platform.btg.dto.BTGUserAddressPostalCodeOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGUserAddressPostalCodeOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btguseraddresspostalcodeoperands")
public class BTGUserAddressPostalCodeOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGUserAddressPostalCodeOperandDTO*/
	private List<BTGUserAddressPostalCodeOperandDTO>  btguseraddresspostalcodeoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGUserAddressPostalCodeOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGUserAddressPostalCodeOperandsDTO(final List<BTGUserAddressPostalCodeOperandDTO> btguseraddresspostalcodeoperandsList)
	{
		super();
		this.btguseraddresspostalcodeoperandsList=btguseraddresspostalcodeoperandsList;
	}
	
	
	/**
	 * @return the btguseraddresspostalcodeoperands
	 */
	@XmlElement(name = "btguseraddresspostalcodeoperand")
	public List<BTGUserAddressPostalCodeOperandDTO> getBTGUserAddressPostalCodeOperands()
	{
		return	btguseraddresspostalcodeoperandsList;
	}
	
	/**
	 * @param btguseraddresspostalcodeoperandsList 
	 *  the btguseraddresspostalcodeoperandsList to set   
	 */
	public void setBTGUserAddressPostalCodeOperands(final List<BTGUserAddressPostalCodeOperandDTO> btguseraddresspostalcodeoperandsList)
	{
		this.btguseraddresspostalcodeoperandsList=btguseraddresspostalcodeoperandsList;
	}
	
}
