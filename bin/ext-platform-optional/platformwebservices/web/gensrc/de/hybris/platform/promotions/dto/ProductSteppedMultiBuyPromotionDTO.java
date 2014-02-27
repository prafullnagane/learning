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

import de.hybris.platform.promotions.dto.ProductPromotionDTO;
import de.hybris.platform.promotions.dto.PromotionQuantityAndPricesRowDTO;
import de.hybris.platform.promotions.model.ProductSteppedMultiBuyPromotionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductSteppedMultiBuyPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = ProductSteppedMultiBuyPromotionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "productsteppedmultibuypromotion")
public class ProductSteppedMultiBuyPromotionDTO extends ProductPromotionDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductSteppedMultiBuyPromotion.messageFired</code> attribute defined at extension <code> */
	private java.lang.String _messageFired;
	/** <i>Generated variable</i> - Variable of <code>ProductSteppedMultiBuyPromotion.messageCouldHaveFired</code> attribute defined at extension <code> */
	private java.lang.String _messageCouldHaveFired;
	/** <i>Generated variable</i> - Variable of <code>ProductSteppedMultiBuyPromotion.qualifyingCountsAndBundlePrices</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.PromotionQuantityAndPricesRowDTO> _qualifyingCountsAndBundlePrices;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductSteppedMultiBuyPromotionDTO()
	{
		super();
	}
	
	
	public String getMessageCouldHaveFired()
	{
		return this._messageCouldHaveFired;
	}
	
	public String getMessageFired()
	{
		return this._messageFired;
	}
	
	@XmlElementWrapper(name = "qualifyingCountsAndBundlePrices")
	@XmlElement(name = "promotionQuantityAndPricesRow")
	public Collection<PromotionQuantityAndPricesRowDTO> getQualifyingCountsAndBundlePrices()
	{
		return this._qualifyingCountsAndBundlePrices;
	}
	
	public void setMessageCouldHaveFired(final String value)
	{
		this.modifiedPropsSet.add("messageCouldHaveFired");
		this._messageCouldHaveFired = value;
	}
	
	public void setMessageFired(final String value)
	{
		this.modifiedPropsSet.add("messageFired");
		this._messageFired = value;
	}
	
	public void setQualifyingCountsAndBundlePrices(final Collection<PromotionQuantityAndPricesRowDTO> value)
	{
		this.modifiedPropsSet.add("qualifyingCountsAndBundlePrices");
		this._qualifyingCountsAndBundlePrices = value;
	}
	
}
