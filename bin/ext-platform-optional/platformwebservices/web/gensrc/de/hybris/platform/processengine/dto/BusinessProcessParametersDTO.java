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
package de.hybris.platform.processengine.dto;

import de.hybris.platform.processengine.dto.BusinessProcessParameterDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BusinessProcessParameter first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "businessprocessparameters")
public class BusinessProcessParametersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BusinessProcessParameterDTO*/
	private List<BusinessProcessParameterDTO>  businessprocessparametersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BusinessProcessParametersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BusinessProcessParametersDTO(final List<BusinessProcessParameterDTO> businessprocessparametersList)
	{
		super();
		this.businessprocessparametersList=businessprocessparametersList;
	}
	
	
	/**
	 * @return the businessprocessparameters
	 */
	@XmlElement(name = "businessprocessparameter")
	public List<BusinessProcessParameterDTO> getBusinessProcessParameters()
	{
		return	businessprocessparametersList;
	}
	
	/**
	 * @param businessprocessparametersList 
	 *  the businessprocessparametersList to set   
	 */
	public void setBusinessProcessParameters(final List<BusinessProcessParameterDTO> businessprocessparametersList)
	{
		this.businessprocessparametersList=businessprocessparametersList;
	}
	
}
