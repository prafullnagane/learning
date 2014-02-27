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
package de.hybris.platform.customerreview.dto;

import de.hybris.platform.customerreview.dto.CustomerReviewDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CustomerReview first defined at extension customerreview
 */
@SuppressWarnings("all")
@XmlRootElement(name = "customerreviews")
public class CustomerReviewsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CustomerReviewDTO*/
	private List<CustomerReviewDTO>  customerreviewsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CustomerReviewsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CustomerReviewsDTO(final List<CustomerReviewDTO> customerreviewsList)
	{
		super();
		this.customerreviewsList=customerreviewsList;
	}
	
	
	/**
	 * @return the customerreviews
	 */
	@XmlElement(name = "customerreview")
	public List<CustomerReviewDTO> getCustomerReviews()
	{
		return	customerreviewsList;
	}
	
	/**
	 * @param customerreviewsList 
	 *  the customerreviewsList to set   
	 */
	public void setCustomerReviews(final List<CustomerReviewDTO> customerreviewsList)
	{
		this.customerreviewsList=customerreviewsList;
	}
	
}
