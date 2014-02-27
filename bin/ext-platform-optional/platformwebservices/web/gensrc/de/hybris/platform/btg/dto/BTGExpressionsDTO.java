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

import de.hybris.platform.btg.dto.BTGExpressionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGExpression first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgexpressions")
public class BTGExpressionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGExpressionDTO*/
	private List<BTGExpressionDTO>  btgexpressionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGExpressionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGExpressionsDTO(final List<BTGExpressionDTO> btgexpressionsList)
	{
		super();
		this.btgexpressionsList=btgexpressionsList;
	}
	
	
	/**
	 * @return the btgexpressions
	 */
	@XmlElement(name = "btgexpression")
	public List<BTGExpressionDTO> getBTGExpressions()
	{
		return	btgexpressionsList;
	}
	
	/**
	 * @param btgexpressionsList 
	 *  the btgexpressionsList to set   
	 */
	public void setBTGExpressions(final List<BTGExpressionDTO> btgexpressionsList)
	{
		this.btgexpressionsList=btgexpressionsList;
	}
	
}
