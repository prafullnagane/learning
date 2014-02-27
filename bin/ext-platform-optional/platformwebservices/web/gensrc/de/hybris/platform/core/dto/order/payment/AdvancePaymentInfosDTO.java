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
package de.hybris.platform.core.dto.order.payment;

import de.hybris.platform.core.dto.order.payment.AdvancePaymentInfoDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AdvancePaymentInfo first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "advancepaymentinfos")
public class AdvancePaymentInfosDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AdvancePaymentInfoDTO*/
	private List<AdvancePaymentInfoDTO>  advancepaymentinfosList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AdvancePaymentInfosDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AdvancePaymentInfosDTO(final List<AdvancePaymentInfoDTO> advancepaymentinfosList)
	{
		super();
		this.advancepaymentinfosList=advancepaymentinfosList;
	}
	
	
	/**
	 * @return the advancepaymentinfos
	 */
	@XmlElement(name = "advancepaymentinfo")
	public List<AdvancePaymentInfoDTO> getAdvancePaymentInfos()
	{
		return	advancepaymentinfosList;
	}
	
	/**
	 * @param advancepaymentinfosList 
	 *  the advancepaymentinfosList to set   
	 */
	public void setAdvancePaymentInfos(final List<AdvancePaymentInfoDTO> advancepaymentinfosList)
	{
		this.advancepaymentinfosList=advancepaymentinfosList;
	}
	
}
