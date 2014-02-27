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
package de.hybris.platform.promotions.dto;

import de.hybris.platform.promotions.dto.PromotionResultDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PromotionResult first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "promotionresults")
public class PromotionResultsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PromotionResultDTO*/
	private List<PromotionResultDTO>  promotionresultsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionResultsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionResultsDTO(final List<PromotionResultDTO> promotionresultsList)
	{
		super();
		this.promotionresultsList=promotionresultsList;
	}
	
	
	/**
	 * @return the promotionresults
	 */
	@XmlElement(name = "promotionresult")
	public List<PromotionResultDTO> getPromotionResults()
	{
		return	promotionresultsList;
	}
	
	/**
	 * @param promotionresultsList 
	 *  the promotionresultsList to set   
	 */
	public void setPromotionResults(final List<PromotionResultDTO> promotionresultsList)
	{
		this.promotionresultsList=promotionresultsList;
	}
	
}
