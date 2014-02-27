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
package de.hybris.platform.advancedsavedquery.dto;

import de.hybris.platform.advancedsavedquery.dto.SimpleAdvancedSavedQuerySearchParameterDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SimpleAdvancedSavedQuerySearchParameter first defined at extension advancedsavedquery
 */
@SuppressWarnings("all")
@XmlRootElement(name = "simpleadvancedsavedquerysearchparameters")
public class SimpleAdvancedSavedQuerySearchParametersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SimpleAdvancedSavedQuerySearchParameterDTO*/
	private List<SimpleAdvancedSavedQuerySearchParameterDTO>  simpleadvancedsavedquerysearchparametersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SimpleAdvancedSavedQuerySearchParametersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SimpleAdvancedSavedQuerySearchParametersDTO(final List<SimpleAdvancedSavedQuerySearchParameterDTO> simpleadvancedsavedquerysearchparametersList)
	{
		super();
		this.simpleadvancedsavedquerysearchparametersList=simpleadvancedsavedquerysearchparametersList;
	}
	
	
	/**
	 * @return the simpleadvancedsavedquerysearchparameters
	 */
	@XmlElement(name = "simpleadvancedsavedquerysearchparameter")
	public List<SimpleAdvancedSavedQuerySearchParameterDTO> getSimpleAdvancedSavedQuerySearchParameters()
	{
		return	simpleadvancedsavedquerysearchparametersList;
	}
	
	/**
	 * @param simpleadvancedsavedquerysearchparametersList 
	 *  the simpleadvancedsavedquerysearchparametersList to set   
	 */
	public void setSimpleAdvancedSavedQuerySearchParameters(final List<SimpleAdvancedSavedQuerySearchParameterDTO> simpleadvancedsavedquerysearchparametersList)
	{
		this.simpleadvancedsavedquerysearchparametersList=simpleadvancedsavedquerysearchparametersList;
	}
	
}
