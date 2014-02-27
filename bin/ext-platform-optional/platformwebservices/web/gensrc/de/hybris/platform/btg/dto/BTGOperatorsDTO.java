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

import de.hybris.platform.btg.dto.BTGOperatorDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGOperator first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgoperators")
public class BTGOperatorsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGOperatorDTO*/
	private List<BTGOperatorDTO>  btgoperatorsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGOperatorsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGOperatorsDTO(final List<BTGOperatorDTO> btgoperatorsList)
	{
		super();
		this.btgoperatorsList=btgoperatorsList;
	}
	
	
	/**
	 * @return the btgoperators
	 */
	@XmlElement(name = "btgoperator")
	public List<BTGOperatorDTO> getBTGOperators()
	{
		return	btgoperatorsList;
	}
	
	/**
	 * @param btgoperatorsList 
	 *  the btgoperatorsList to set   
	 */
	public void setBTGOperators(final List<BTGOperatorDTO> btgoperatorsList)
	{
		this.btgoperatorsList=btgoperatorsList;
	}
	
}
