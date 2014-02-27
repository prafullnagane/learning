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
import de.hybris.platform.promotions.dto.PromotionResultDTO;
import de.hybris.platform.promotions.model.AbstractPromotionActionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractPromotionAction first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractPromotionActionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "abstractpromotionaction")
public class AbstractPromotionActionDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotionAction.guid</code> attribute defined at extension <code> */
	private java.lang.String _guid;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotionAction.promotionResult</code> attribute defined at extension <code> */
	private de.hybris.platform.promotions.dto.PromotionResultDTO _promotionResult;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotionAction.markedApplied</code> attribute defined at extension <code> */
	private java.lang.Boolean _markedApplied;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractPromotionActionDTO()
	{
		super();
	}
	
	
	public String getGuid()
	{
		return this._guid;
	}
	
	public Boolean getMarkedApplied()
	{
		return this._markedApplied;
	}
	
	public PromotionResultDTO getPromotionResult()
	{
		return this._promotionResult;
	}
	
	public void setGuid(final String value)
	{
		this.modifiedPropsSet.add("guid");
		this._guid = value;
	}
	
	public void setMarkedApplied(final Boolean value)
	{
		this.modifiedPropsSet.add("markedApplied");
		this._markedApplied = value;
	}
	
	public void setPromotionResult(final PromotionResultDTO value)
	{
		this.modifiedPropsSet.add("promotionResult");
		this._promotionResult = value;
	}
	
}
