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

import de.hybris.platform.btg.dto.BTGReferenceCategoriesOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGReferenceCategoriesOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgreferencecategoriesoperands")
public class BTGReferenceCategoriesOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGReferenceCategoriesOperandDTO*/
	private List<BTGReferenceCategoriesOperandDTO>  btgreferencecategoriesoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceCategoriesOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceCategoriesOperandsDTO(final List<BTGReferenceCategoriesOperandDTO> btgreferencecategoriesoperandsList)
	{
		super();
		this.btgreferencecategoriesoperandsList=btgreferencecategoriesoperandsList;
	}
	
	
	/**
	 * @return the btgreferencecategoriesoperands
	 */
	@XmlElement(name = "btgreferencecategoriesoperand")
	public List<BTGReferenceCategoriesOperandDTO> getBTGReferenceCategoriesOperands()
	{
		return	btgreferencecategoriesoperandsList;
	}
	
	/**
	 * @param btgreferencecategoriesoperandsList 
	 *  the btgreferencecategoriesoperandsList to set   
	 */
	public void setBTGReferenceCategoriesOperands(final List<BTGReferenceCategoriesOperandDTO> btgreferencecategoriesoperandsList)
	{
		this.btgreferencecategoriesoperandsList=btgreferencecategoriesoperandsList;
	}
	
}
