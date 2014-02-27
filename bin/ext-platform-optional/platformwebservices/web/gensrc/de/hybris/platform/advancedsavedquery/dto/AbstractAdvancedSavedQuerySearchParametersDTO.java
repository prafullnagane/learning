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

import de.hybris.platform.advancedsavedquery.dto.AbstractAdvancedSavedQuerySearchParameterDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AbstractAdvancedSavedQuerySearchParameter first defined at extension advancedsavedquery
 */
@SuppressWarnings("all")
@XmlRootElement(name = "abstractadvancedsavedquerysearchparameters")
public class AbstractAdvancedSavedQuerySearchParametersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AbstractAdvancedSavedQuerySearchParameterDTO*/
	private List<AbstractAdvancedSavedQuerySearchParameterDTO>  abstractadvancedsavedquerysearchparametersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractAdvancedSavedQuerySearchParametersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractAdvancedSavedQuerySearchParametersDTO(final List<AbstractAdvancedSavedQuerySearchParameterDTO> abstractadvancedsavedquerysearchparametersList)
	{
		super();
		this.abstractadvancedsavedquerysearchparametersList=abstractadvancedsavedquerysearchparametersList;
	}
	
	
	/**
	 * @return the abstractadvancedsavedquerysearchparameters
	 */
	@XmlElement(name = "abstractadvancedsavedquerysearchparameter")
	public List<AbstractAdvancedSavedQuerySearchParameterDTO> getAbstractAdvancedSavedQuerySearchParameters()
	{
		return	abstractadvancedsavedquerysearchparametersList;
	}
	
	/**
	 * @param abstractadvancedsavedquerysearchparametersList 
	 *  the abstractadvancedsavedquerysearchparametersList to set   
	 */
	public void setAbstractAdvancedSavedQuerySearchParameters(final List<AbstractAdvancedSavedQuerySearchParameterDTO> abstractadvancedsavedquerysearchparametersList)
	{
		this.abstractadvancedsavedquerysearchparametersList=abstractadvancedsavedquerysearchparametersList;
	}
	
}
