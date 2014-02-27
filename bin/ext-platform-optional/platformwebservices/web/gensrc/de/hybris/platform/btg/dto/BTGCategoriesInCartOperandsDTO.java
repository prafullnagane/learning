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

import de.hybris.platform.btg.dto.BTGCategoriesInCartOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGCategoriesInCartOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgcategoriesincartoperands")
public class BTGCategoriesInCartOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGCategoriesInCartOperandDTO*/
	private List<BTGCategoriesInCartOperandDTO>  btgcategoriesincartoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGCategoriesInCartOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGCategoriesInCartOperandsDTO(final List<BTGCategoriesInCartOperandDTO> btgcategoriesincartoperandsList)
	{
		super();
		this.btgcategoriesincartoperandsList=btgcategoriesincartoperandsList;
	}
	
	
	/**
	 * @return the btgcategoriesincartoperands
	 */
	@XmlElement(name = "btgcategoriesincartoperand")
	public List<BTGCategoriesInCartOperandDTO> getBTGCategoriesInCartOperands()
	{
		return	btgcategoriesincartoperandsList;
	}
	
	/**
	 * @param btgcategoriesincartoperandsList 
	 *  the btgcategoriesincartoperandsList to set   
	 */
	public void setBTGCategoriesInCartOperands(final List<BTGCategoriesInCartOperandDTO> btgcategoriesincartoperandsList)
	{
		this.btgcategoriesincartoperandsList=btgcategoriesincartoperandsList;
	}
	
}
