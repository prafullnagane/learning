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

import de.hybris.platform.btg.dto.BTGConditionResultDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGConditionResult first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgconditionresults")
public class BTGConditionResultsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGConditionResultDTO*/
	private List<BTGConditionResultDTO>  btgconditionresultsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGConditionResultsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGConditionResultsDTO(final List<BTGConditionResultDTO> btgconditionresultsList)
	{
		super();
		this.btgconditionresultsList=btgconditionresultsList;
	}
	
	
	/**
	 * @return the btgconditionresults
	 */
	@XmlElement(name = "btgconditionresult")
	public List<BTGConditionResultDTO> getBTGConditionResults()
	{
		return	btgconditionresultsList;
	}
	
	/**
	 * @param btgconditionresultsList 
	 *  the btgconditionresultsList to set   
	 */
	public void setBTGConditionResults(final List<BTGConditionResultDTO> btgconditionresultsList)
	{
		this.btgconditionresultsList=btgconditionresultsList;
	}
	
}
