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

import de.hybris.platform.btg.dto.BTGCategoriesInOrdersOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGCategoriesInOrdersOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgcategoriesinordersoperands")
public class BTGCategoriesInOrdersOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGCategoriesInOrdersOperandDTO*/
	private List<BTGCategoriesInOrdersOperandDTO>  btgcategoriesinordersoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGCategoriesInOrdersOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGCategoriesInOrdersOperandsDTO(final List<BTGCategoriesInOrdersOperandDTO> btgcategoriesinordersoperandsList)
	{
		super();
		this.btgcategoriesinordersoperandsList=btgcategoriesinordersoperandsList;
	}
	
	
	/**
	 * @return the btgcategoriesinordersoperands
	 */
	@XmlElement(name = "btgcategoriesinordersoperand")
	public List<BTGCategoriesInOrdersOperandDTO> getBTGCategoriesInOrdersOperands()
	{
		return	btgcategoriesinordersoperandsList;
	}
	
	/**
	 * @param btgcategoriesinordersoperandsList 
	 *  the btgcategoriesinordersoperandsList to set   
	 */
	public void setBTGCategoriesInOrdersOperands(final List<BTGCategoriesInOrdersOperandDTO> btgcategoriesinordersoperandsList)
	{
		this.btgcategoriesinordersoperandsList=btgcategoriesinordersoperandsList;
	}
	
}
