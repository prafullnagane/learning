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
package de.hybris.platform.cockpit.dto;

import de.hybris.platform.cockpit.dto.CockpitSavedSortCriterionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CockpitSavedSortCriterion first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cockpitsavedsortcriterions")
public class CockpitSavedSortCriterionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CockpitSavedSortCriterionDTO*/
	private List<CockpitSavedSortCriterionDTO>  cockpitsavedsortcriterionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitSavedSortCriterionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitSavedSortCriterionsDTO(final List<CockpitSavedSortCriterionDTO> cockpitsavedsortcriterionsList)
	{
		super();
		this.cockpitsavedsortcriterionsList=cockpitsavedsortcriterionsList;
	}
	
	
	/**
	 * @return the cockpitsavedsortcriterions
	 */
	@XmlElement(name = "cockpitsavedsortcriterion")
	public List<CockpitSavedSortCriterionDTO> getCockpitSavedSortCriterions()
	{
		return	cockpitsavedsortcriterionsList;
	}
	
	/**
	 * @param cockpitsavedsortcriterionsList 
	 *  the cockpitsavedsortcriterionsList to set   
	 */
	public void setCockpitSavedSortCriterions(final List<CockpitSavedSortCriterionDTO> cockpitsavedsortcriterionsList)
	{
		this.cockpitsavedsortcriterionsList=cockpitsavedsortcriterionsList;
	}
	
}