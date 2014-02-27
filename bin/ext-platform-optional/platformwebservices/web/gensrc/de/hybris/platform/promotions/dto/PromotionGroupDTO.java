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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.promotions.dto.AbstractPromotionDTO;
import de.hybris.platform.promotions.model.PromotionGroupModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PromotionGroup first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = PromotionGroupModel.class, factory = GenericNodeFactory.class, uidProperties="Identifier")
@XmlRootElement(name = "promotiongroup")
public class PromotionGroupDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>PromotionGroup.Identifier</code> attribute defined at extension <code> */
	private java.lang.String _Identifier;
	/** <i>Generated variable</i> - Variable of <code>PromotionGroup.Promotions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.AbstractPromotionDTO> _Promotions;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionGroupDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getIdentifier()
	{
		return this._Identifier;
	}
	
	@XmlElementWrapper(name = "Promotions")
	@XmlElement(name = "abstractPromotion")
	public Collection<AbstractPromotionDTO> getPromotions()
	{
		return this._Promotions;
	}
	
	public void setIdentifier(final String value)
	{
		this.modifiedPropsSet.add("Identifier");
		this._Identifier = value;
	}
	
	public void setPromotions(final Collection<AbstractPromotionDTO> value)
	{
		this.modifiedPropsSet.add("Promotions");
		this._Promotions = value;
	}
	
}
