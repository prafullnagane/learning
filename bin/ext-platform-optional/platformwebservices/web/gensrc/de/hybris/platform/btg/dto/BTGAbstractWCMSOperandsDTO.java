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

import de.hybris.platform.btg.dto.BTGAbstractWCMSOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGAbstractWCMSOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgabstractwcmsoperands")
public class BTGAbstractWCMSOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGAbstractWCMSOperandDTO*/
	private List<BTGAbstractWCMSOperandDTO>  btgabstractwcmsoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractWCMSOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractWCMSOperandsDTO(final List<BTGAbstractWCMSOperandDTO> btgabstractwcmsoperandsList)
	{
		super();
		this.btgabstractwcmsoperandsList=btgabstractwcmsoperandsList;
	}
	
	
	/**
	 * @return the btgabstractwcmsoperands
	 */
	@XmlElement(name = "btgabstractwcmsoperand")
	public List<BTGAbstractWCMSOperandDTO> getBTGAbstractWCMSOperands()
	{
		return	btgabstractwcmsoperandsList;
	}
	
	/**
	 * @param btgabstractwcmsoperandsList 
	 *  the btgabstractwcmsoperandsList to set   
	 */
	public void setBTGAbstractWCMSOperands(final List<BTGAbstractWCMSOperandDTO> btgabstractwcmsoperandsList)
	{
		this.btgabstractwcmsoperandsList=btgabstractwcmsoperandsList;
	}
	
}
