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

import de.hybris.platform.promotions.dto.ProductOneToOnePerfectPartnerPromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductOneToOnePerfectPartnerPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productonetooneperfectpartnerpromotions")
public class ProductOneToOnePerfectPartnerPromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductOneToOnePerfectPartnerPromotionDTO*/
	private List<ProductOneToOnePerfectPartnerPromotionDTO>  productonetooneperfectpartnerpromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductOneToOnePerfectPartnerPromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductOneToOnePerfectPartnerPromotionsDTO(final List<ProductOneToOnePerfectPartnerPromotionDTO> productonetooneperfectpartnerpromotionsList)
	{
		super();
		this.productonetooneperfectpartnerpromotionsList=productonetooneperfectpartnerpromotionsList;
	}
	
	
	/**
	 * @return the productonetooneperfectpartnerpromotions
	 */
	@XmlElement(name = "productonetooneperfectpartnerpromotion")
	public List<ProductOneToOnePerfectPartnerPromotionDTO> getProductOneToOnePerfectPartnerPromotions()
	{
		return	productonetooneperfectpartnerpromotionsList;
	}
	
	/**
	 * @param productonetooneperfectpartnerpromotionsList 
	 *  the productonetooneperfectpartnerpromotionsList to set   
	 */
	public void setProductOneToOnePerfectPartnerPromotions(final List<ProductOneToOnePerfectPartnerPromotionDTO> productonetooneperfectpartnerpromotionsList)
	{
		this.productonetooneperfectpartnerpromotionsList=productonetooneperfectpartnerpromotionsList;
	}
	
}
