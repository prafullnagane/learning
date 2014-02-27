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

import de.hybris.platform.btg.dto.BTGReferencePriceOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGReferencePriceOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgreferencepriceoperands")
public class BTGReferencePriceOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGReferencePriceOperandDTO*/
	private List<BTGReferencePriceOperandDTO>  btgreferencepriceoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferencePriceOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferencePriceOperandsDTO(final List<BTGReferencePriceOperandDTO> btgreferencepriceoperandsList)
	{
		super();
		this.btgreferencepriceoperandsList=btgreferencepriceoperandsList;
	}
	
	
	/**
	 * @return the btgreferencepriceoperands
	 */
	@XmlElement(name = "btgreferencepriceoperand")
	public List<BTGReferencePriceOperandDTO> getBTGReferencePriceOperands()
	{
		return	btgreferencepriceoperandsList;
	}
	
	/**
	 * @param btgreferencepriceoperandsList 
	 *  the btgreferencepriceoperandsList to set   
	 */
	public void setBTGReferencePriceOperands(final List<BTGReferencePriceOperandDTO> btgreferencepriceoperandsList)
	{
		this.btgreferencepriceoperandsList=btgreferencepriceoperandsList;
	}
	
}
