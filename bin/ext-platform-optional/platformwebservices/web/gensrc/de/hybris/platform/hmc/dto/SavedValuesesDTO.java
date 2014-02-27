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
package de.hybris.platform.hmc.dto;

import de.hybris.platform.hmc.dto.SavedValuesDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SavedValues first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "savedvalueses")
public class SavedValuesesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SavedValuesDTO*/
	private List<SavedValuesDTO>  savedvaluesesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SavedValuesesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SavedValuesesDTO(final List<SavedValuesDTO> savedvaluesesList)
	{
		super();
		this.savedvaluesesList=savedvaluesesList;
	}
	
	
	/**
	 * @return the savedvalueses
	 */
	@XmlElement(name = "savedvalues")
	public List<SavedValuesDTO> getSavedValueses()
	{
		return	savedvaluesesList;
	}
	
	/**
	 * @param savedvaluesesList 
	 *  the savedvaluesesList to set   
	 */
	public void setSavedValueses(final List<SavedValuesDTO> savedvaluesesList)
	{
		this.savedvaluesesList=savedvaluesesList;
	}
	
}
