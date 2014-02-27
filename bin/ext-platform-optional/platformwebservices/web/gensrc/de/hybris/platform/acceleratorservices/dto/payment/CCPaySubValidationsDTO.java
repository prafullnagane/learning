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
package de.hybris.platform.acceleratorservices.dto.payment;

import de.hybris.platform.acceleratorservices.dto.payment.CCPaySubValidationDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CCPaySubValidation first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "ccpaysubvalidations")
public class CCPaySubValidationsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CCPaySubValidationDTO*/
	private List<CCPaySubValidationDTO>  ccpaysubvalidationsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CCPaySubValidationsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CCPaySubValidationsDTO(final List<CCPaySubValidationDTO> ccpaysubvalidationsList)
	{
		super();
		this.ccpaysubvalidationsList=ccpaysubvalidationsList;
	}
	
	
	/**
	 * @return the ccpaysubvalidations
	 */
	@XmlElement(name = "ccpaysubvalidation")
	public List<CCPaySubValidationDTO> getCCPaySubValidations()
	{
		return	ccpaysubvalidationsList;
	}
	
	/**
	 * @param ccpaysubvalidationsList 
	 *  the ccpaysubvalidationsList to set   
	 */
	public void setCCPaySubValidations(final List<CCPaySubValidationDTO> ccpaysubvalidationsList)
	{
		this.ccpaysubvalidationsList=ccpaysubvalidationsList;
	}
	
}
