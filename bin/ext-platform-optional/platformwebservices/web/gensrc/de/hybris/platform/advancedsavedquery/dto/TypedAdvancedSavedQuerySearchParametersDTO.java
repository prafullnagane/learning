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

import de.hybris.platform.advancedsavedquery.dto.TypedAdvancedSavedQuerySearchParameterDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type TypedAdvancedSavedQuerySearchParameter first defined at extension advancedsavedquery
 */
@SuppressWarnings("all")
@XmlRootElement(name = "typedadvancedsavedquerysearchparameters")
public class TypedAdvancedSavedQuerySearchParametersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>TypedAdvancedSavedQuerySearchParameterDTO*/
	private List<TypedAdvancedSavedQuerySearchParameterDTO>  typedadvancedsavedquerysearchparametersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypedAdvancedSavedQuerySearchParametersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypedAdvancedSavedQuerySearchParametersDTO(final List<TypedAdvancedSavedQuerySearchParameterDTO> typedadvancedsavedquerysearchparametersList)
	{
		super();
		this.typedadvancedsavedquerysearchparametersList=typedadvancedsavedquerysearchparametersList;
	}
	
	
	/**
	 * @return the typedadvancedsavedquerysearchparameters
	 */
	@XmlElement(name = "typedadvancedsavedquerysearchparameter")
	public List<TypedAdvancedSavedQuerySearchParameterDTO> getTypedAdvancedSavedQuerySearchParameters()
	{
		return	typedadvancedsavedquerysearchparametersList;
	}
	
	/**
	 * @param typedadvancedsavedquerysearchparametersList 
	 *  the typedadvancedsavedquerysearchparametersList to set   
	 */
	public void setTypedAdvancedSavedQuerySearchParameters(final List<TypedAdvancedSavedQuerySearchParameterDTO> typedadvancedsavedquerysearchparametersList)
	{
		this.typedadvancedsavedquerysearchparametersList=typedadvancedsavedquerysearchparametersList;
	}
	
}
