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
import de.hybris.platform.core.dto.order.AbstractOrderDTO;
import de.hybris.platform.promotions.dto.AbstractPromotionActionDTO;
import de.hybris.platform.promotions.dto.AbstractPromotionDTO;
import de.hybris.platform.promotions.dto.PromotionOrderEntryConsumedDTO;
import de.hybris.platform.promotions.model.PromotionResultModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PromotionResult first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = PromotionResultModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "promotionresult")
public class PromotionResultDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>PromotionResult.actions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.AbstractPromotionActionDTO> _actions;
	/** <i>Generated variable</i> - Variable of <code>PromotionResult.promotion</code> attribute defined at extension <code> */
	private de.hybris.platform.promotions.dto.AbstractPromotionDTO _promotion;
	/** <i>Generated variable</i> - Variable of <code>PromotionResult.certainty</code> attribute defined at extension <code> */
	private java.lang.Float _certainty;
	/** <i>Generated variable</i> - Variable of <code>PromotionResult.consumedEntries</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.PromotionOrderEntryConsumedDTO> _consumedEntries;
	/** <i>Generated variable</i> - Variable of <code>PromotionResult.custom</code> attribute defined at extension <code> */
	private java.lang.String _custom;
	/** <i>Generated variable</i> - Variable of <code>PromotionResult.allPromotionActions</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.promotions.dto.AbstractPromotionActionDTO> _allPromotionActions;
	/** <i>Generated variable</i> - Variable of <code>PromotionResult.order</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.AbstractOrderDTO _order;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionResultDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "actions")
	@XmlElement(name = "abstractPromotionAction")
	public Collection<AbstractPromotionActionDTO> getActions()
	{
		return this._actions;
	}
	
	@XmlElementWrapper(name = "allPromotionActions")
	@XmlElement(name = "abstractPromotionAction")
	public Set<AbstractPromotionActionDTO> getAllPromotionActions()
	{
		return this._allPromotionActions;
	}
	
	public Float getCertainty()
	{
		return this._certainty;
	}
	
	@XmlElementWrapper(name = "consumedEntries")
	@XmlElement(name = "promotionOrderEntryConsumed")
	public Collection<PromotionOrderEntryConsumedDTO> getConsumedEntries()
	{
		return this._consumedEntries;
	}
	
	public String getCustom()
	{
		return this._custom;
	}
	
	public AbstractOrderDTO getOrder()
	{
		return this._order;
	}
	
	public AbstractPromotionDTO getPromotion()
	{
		return this._promotion;
	}
	
	public void setActions(final Collection<AbstractPromotionActionDTO> value)
	{
		this.modifiedPropsSet.add("actions");
		this._actions = value;
	}
	
	public void setAllPromotionActions(final Set<AbstractPromotionActionDTO> value)
	{
		this.modifiedPropsSet.add("allPromotionActions");
		this._allPromotionActions = value;
	}
	
	public void setCertainty(final Float value)
	{
		this.modifiedPropsSet.add("certainty");
		this._certainty = value;
	}
	
	public void setConsumedEntries(final Collection<PromotionOrderEntryConsumedDTO> value)
	{
		this.modifiedPropsSet.add("consumedEntries");
		this._consumedEntries = value;
	}
	
	public void setCustom(final String value)
	{
		this.modifiedPropsSet.add("custom");
		this._custom = value;
	}
	
	public void setOrder(final AbstractOrderDTO value)
	{
		this.modifiedPropsSet.add("order");
		this._order = value;
	}
	
	public void setPromotion(final AbstractPromotionDTO value)
	{
		this.modifiedPropsSet.add("promotion");
		this._promotion = value;
	}
	
}
