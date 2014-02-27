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

import de.hybris.platform.btg.dto.BTGAbstractReferenceOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGAbstractReferenceOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgabstractreferenceoperands")
public class BTGAbstractReferenceOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGAbstractReferenceOperandDTO*/
	private List<BTGAbstractReferenceOperandDTO>  btgabstractreferenceoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractReferenceOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractReferenceOperandsDTO(final List<BTGAbstractReferenceOperandDTO> btgabstractreferenceoperandsList)
	{
		super();
		this.btgabstractreferenceoperandsList=btgabstractreferenceoperandsList;
	}
	
	
	/**
	 * @return the btgabstractreferenceoperands
	 */
	@XmlElement(name = "btgabstractreferenceoperand")
	public List<BTGAbstractReferenceOperandDTO> getBTGAbstractReferenceOperands()
	{
		return	btgabstractreferenceoperandsList;
	}
	
	/**
	 * @param btgabstractreferenceoperandsList 
	 *  the btgabstractreferenceoperandsList to set   
	 */
	public void setBTGAbstractReferenceOperands(final List<BTGAbstractReferenceOperandDTO> btgabstractreferenceoperandsList)
	{
		this.btgabstractreferenceoperandsList=btgabstractreferenceoperandsList;
	}
	
}
