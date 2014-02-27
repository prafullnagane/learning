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
package de.hybris.platform.cronjob.dto;

import de.hybris.platform.cronjob.dto.GenericCSVImportStepDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type GenericCSVImportStep first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "genericcsvimportsteps")
public class GenericCSVImportStepsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>GenericCSVImportStepDTO*/
	private List<GenericCSVImportStepDTO>  genericcsvimportstepsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public GenericCSVImportStepsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public GenericCSVImportStepsDTO(final List<GenericCSVImportStepDTO> genericcsvimportstepsList)
	{
		super();
		this.genericcsvimportstepsList=genericcsvimportstepsList;
	}
	
	
	/**
	 * @return the genericcsvimportsteps
	 */
	@XmlElement(name = "genericcsvimportstep")
	public List<GenericCSVImportStepDTO> getGenericCSVImportSteps()
	{
		return	genericcsvimportstepsList;
	}
	
	/**
	 * @param genericcsvimportstepsList 
	 *  the genericcsvimportstepsList to set   
	 */
	public void setGenericCSVImportSteps(final List<GenericCSVImportStepDTO> genericcsvimportstepsList)
	{
		this.genericcsvimportstepsList=genericcsvimportstepsList;
	}
	
}
