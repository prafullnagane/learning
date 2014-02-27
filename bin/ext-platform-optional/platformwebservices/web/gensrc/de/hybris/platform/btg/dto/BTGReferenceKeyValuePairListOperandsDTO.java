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

import de.hybris.platform.btg.dto.BTGReferenceKeyValuePairListOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGReferenceKeyValuePairListOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgreferencekeyvaluepairlistoperands")
public class BTGReferenceKeyValuePairListOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGReferenceKeyValuePairListOperandDTO*/
	private List<BTGReferenceKeyValuePairListOperandDTO>  btgreferencekeyvaluepairlistoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceKeyValuePairListOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceKeyValuePairListOperandsDTO(final List<BTGReferenceKeyValuePairListOperandDTO> btgreferencekeyvaluepairlistoperandsList)
	{
		super();
		this.btgreferencekeyvaluepairlistoperandsList=btgreferencekeyvaluepairlistoperandsList;
	}
	
	
	/**
	 * @return the btgreferencekeyvaluepairlistoperands
	 */
	@XmlElement(name = "btgreferencekeyvaluepairlistoperand")
	public List<BTGReferenceKeyValuePairListOperandDTO> getBTGReferenceKeyValuePairListOperands()
	{
		return	btgreferencekeyvaluepairlistoperandsList;
	}
	
	/**
	 * @param btgreferencekeyvaluepairlistoperandsList 
	 *  the btgreferencekeyvaluepairlistoperandsList to set   
	 */
	public void setBTGReferenceKeyValuePairListOperands(final List<BTGReferenceKeyValuePairListOperandDTO> btgreferencekeyvaluepairlistoperandsList)
	{
		this.btgreferencekeyvaluepairlistoperandsList=btgreferencekeyvaluepairlistoperandsList;
	}
	
}
