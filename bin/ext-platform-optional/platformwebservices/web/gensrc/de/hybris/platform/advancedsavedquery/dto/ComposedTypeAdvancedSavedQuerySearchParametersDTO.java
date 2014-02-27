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

import de.hybris.platform.advancedsavedquery.dto.ComposedTypeAdvancedSavedQuerySearchParameterDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ComposedTypeAdvancedSavedQuerySearchParameter first defined at extension advancedsavedquery
 */
@SuppressWarnings("all")
@XmlRootElement(name = "composedtypeadvancedsavedquerysearchparameters")
public class ComposedTypeAdvancedSavedQuerySearchParametersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ComposedTypeAdvancedSavedQuerySearchParameterDTO*/
	private List<ComposedTypeAdvancedSavedQuerySearchParameterDTO>  composedtypeadvancedsavedquerysearchparametersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ComposedTypeAdvancedSavedQuerySearchParametersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ComposedTypeAdvancedSavedQuerySearchParametersDTO(final List<ComposedTypeAdvancedSavedQuerySearchParameterDTO> composedtypeadvancedsavedquerysearchparametersList)
	{
		super();
		this.composedtypeadvancedsavedquerysearchparametersList=composedtypeadvancedsavedquerysearchparametersList;
	}
	
	
	/**
	 * @return the composedtypeadvancedsavedquerysearchparameters
	 */
	@XmlElement(name = "composedtypeadvancedsavedquerysearchparameter")
	public List<ComposedTypeAdvancedSavedQuerySearchParameterDTO> getComposedTypeAdvancedSavedQuerySearchParameters()
	{
		return	composedtypeadvancedsavedquerysearchparametersList;
	}
	
	/**
	 * @param composedtypeadvancedsavedquerysearchparametersList 
	 *  the composedtypeadvancedsavedquerysearchparametersList to set   
	 */
	public void setComposedTypeAdvancedSavedQuerySearchParameters(final List<ComposedTypeAdvancedSavedQuerySearchParameterDTO> composedtypeadvancedsavedquerysearchparametersList)
	{
		this.composedtypeadvancedsavedquerysearchparametersList=composedtypeadvancedsavedquerysearchparametersList;
	}
	
}
