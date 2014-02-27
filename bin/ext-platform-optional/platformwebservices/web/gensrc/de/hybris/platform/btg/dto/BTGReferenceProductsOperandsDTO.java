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

import de.hybris.platform.btg.dto.BTGReferenceProductsOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGReferenceProductsOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgreferenceproductsoperands")
public class BTGReferenceProductsOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGReferenceProductsOperandDTO*/
	private List<BTGReferenceProductsOperandDTO>  btgreferenceproductsoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceProductsOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceProductsOperandsDTO(final List<BTGReferenceProductsOperandDTO> btgreferenceproductsoperandsList)
	{
		super();
		this.btgreferenceproductsoperandsList=btgreferenceproductsoperandsList;
	}
	
	
	/**
	 * @return the btgreferenceproductsoperands
	 */
	@XmlElement(name = "btgreferenceproductsoperand")
	public List<BTGReferenceProductsOperandDTO> getBTGReferenceProductsOperands()
	{
		return	btgreferenceproductsoperandsList;
	}
	
	/**
	 * @param btgreferenceproductsoperandsList 
	 *  the btgreferenceproductsoperandsList to set   
	 */
	public void setBTGReferenceProductsOperands(final List<BTGReferenceProductsOperandDTO> btgreferenceproductsoperandsList)
	{
		this.btgreferenceproductsoperandsList=btgreferenceproductsoperandsList;
	}
	
}
