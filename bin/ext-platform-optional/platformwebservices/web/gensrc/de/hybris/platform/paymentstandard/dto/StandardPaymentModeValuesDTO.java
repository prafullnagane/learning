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
package de.hybris.platform.paymentstandard.dto;

import de.hybris.platform.paymentstandard.dto.StandardPaymentModeValueDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type StandardPaymentModeValue first defined at extension paymentstandard
 */
@SuppressWarnings("all")
@XmlRootElement(name = "standardpaymentmodevalues")
public class StandardPaymentModeValuesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>StandardPaymentModeValueDTO*/
	private List<StandardPaymentModeValueDTO>  standardpaymentmodevaluesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StandardPaymentModeValuesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StandardPaymentModeValuesDTO(final List<StandardPaymentModeValueDTO> standardpaymentmodevaluesList)
	{
		super();
		this.standardpaymentmodevaluesList=standardpaymentmodevaluesList;
	}
	
	
	/**
	 * @return the standardpaymentmodevalues
	 */
	@XmlElement(name = "standardpaymentmodevalue")
	public List<StandardPaymentModeValueDTO> getStandardPaymentModeValues()
	{
		return	standardpaymentmodevaluesList;
	}
	
	/**
	 * @param standardpaymentmodevaluesList 
	 *  the standardpaymentmodevaluesList to set   
	 */
	public void setStandardPaymentModeValues(final List<StandardPaymentModeValueDTO> standardpaymentmodevaluesList)
	{
		this.standardpaymentmodevaluesList=standardpaymentmodevaluesList;
	}
	
}
