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
package de.hybris.platform.returns.dto;

import de.hybris.platform.returns.dto.ReturnRequestDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ReturnRequest first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "returnrequests")
public class ReturnRequestsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ReturnRequestDTO*/
	private List<ReturnRequestDTO>  returnrequestsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReturnRequestsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReturnRequestsDTO(final List<ReturnRequestDTO> returnrequestsList)
	{
		super();
		this.returnrequestsList=returnrequestsList;
	}
	
	
	/**
	 * @return the returnrequests
	 */
	@XmlElement(name = "returnrequest")
	public List<ReturnRequestDTO> getReturnRequests()
	{
		return	returnrequestsList;
	}
	
	/**
	 * @param returnrequestsList 
	 *  the returnrequestsList to set   
	 */
	public void setReturnRequests(final List<ReturnRequestDTO> returnrequestsList)
	{
		this.returnrequestsList=returnrequestsList;
	}
	
}