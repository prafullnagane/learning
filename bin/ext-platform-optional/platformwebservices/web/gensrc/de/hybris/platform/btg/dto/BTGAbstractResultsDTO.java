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

import de.hybris.platform.btg.dto.BTGAbstractResultDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGAbstractResult first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgabstractresults")
public class BTGAbstractResultsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGAbstractResultDTO*/
	private List<BTGAbstractResultDTO>  btgabstractresultsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractResultsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractResultsDTO(final List<BTGAbstractResultDTO> btgabstractresultsList)
	{
		super();
		this.btgabstractresultsList=btgabstractresultsList;
	}
	
	
	/**
	 * @return the btgabstractresults
	 */
	@XmlElement(name = "btgabstractresult")
	public List<BTGAbstractResultDTO> getBTGAbstractResults()
	{
		return	btgabstractresultsList;
	}
	
	/**
	 * @param btgabstractresultsList 
	 *  the btgabstractresultsList to set   
	 */
	public void setBTGAbstractResults(final List<BTGAbstractResultDTO> btgabstractresultsList)
	{
		this.btgabstractresultsList=btgabstractresultsList;
	}
	
}
