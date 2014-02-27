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

import de.hybris.platform.btg.dto.BTGViewedCategoriesOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGViewedCategoriesOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgviewedcategoriesoperands")
public class BTGViewedCategoriesOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGViewedCategoriesOperandDTO*/
	private List<BTGViewedCategoriesOperandDTO>  btgviewedcategoriesoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGViewedCategoriesOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGViewedCategoriesOperandsDTO(final List<BTGViewedCategoriesOperandDTO> btgviewedcategoriesoperandsList)
	{
		super();
		this.btgviewedcategoriesoperandsList=btgviewedcategoriesoperandsList;
	}
	
	
	/**
	 * @return the btgviewedcategoriesoperands
	 */
	@XmlElement(name = "btgviewedcategoriesoperand")
	public List<BTGViewedCategoriesOperandDTO> getBTGViewedCategoriesOperands()
	{
		return	btgviewedcategoriesoperandsList;
	}
	
	/**
	 * @param btgviewedcategoriesoperandsList 
	 *  the btgviewedcategoriesoperandsList to set   
	 */
	public void setBTGViewedCategoriesOperands(final List<BTGViewedCategoriesOperandDTO> btgviewedcategoriesoperandsList)
	{
		this.btgviewedcategoriesoperandsList=btgviewedcategoriesoperandsList;
	}
	
}
