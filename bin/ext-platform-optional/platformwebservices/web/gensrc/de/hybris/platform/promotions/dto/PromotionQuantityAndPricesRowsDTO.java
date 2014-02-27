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

import de.hybris.platform.promotions.dto.PromotionQuantityAndPricesRowDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PromotionQuantityAndPricesRow first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "promotionquantityandpricesrows")
public class PromotionQuantityAndPricesRowsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PromotionQuantityAndPricesRowDTO*/
	private List<PromotionQuantityAndPricesRowDTO>  promotionquantityandpricesrowsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionQuantityAndPricesRowsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionQuantityAndPricesRowsDTO(final List<PromotionQuantityAndPricesRowDTO> promotionquantityandpricesrowsList)
	{
		super();
		this.promotionquantityandpricesrowsList=promotionquantityandpricesrowsList;
	}
	
	
	/**
	 * @return the promotionquantityandpricesrows
	 */
	@XmlElement(name = "promotionquantityandpricesrow")
	public List<PromotionQuantityAndPricesRowDTO> getPromotionQuantityAndPricesRows()
	{
		return	promotionquantityandpricesrowsList;
	}
	
	/**
	 * @param promotionquantityandpricesrowsList 
	 *  the promotionquantityandpricesrowsList to set   
	 */
	public void setPromotionQuantityAndPricesRows(final List<PromotionQuantityAndPricesRowDTO> promotionquantityandpricesrowsList)
	{
		this.promotionquantityandpricesrowsList=promotionquantityandpricesrowsList;
	}
	
}
