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
import de.hybris.platform.promotions.model.AbstractPromotionRestrictionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractPromotionRestriction first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractPromotionRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "abstractpromotionrestriction")
public class AbstractPromotionRestrictionDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotionRestriction.renderedDescription</code> attribute defined at extension <code> */
	private java.lang.String _renderedDescription;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotionRestriction.restrictionType</code> attribute defined at extension <code> */
	private java.lang.String _restrictionType;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotionRestriction.descriptionPattern</code> attribute defined at extension <code> */
	private java.lang.String _descriptionPattern;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotionRestriction.promotion</code> attribute defined at extension <code> */
	private de.hybris.platform.promotions.dto.AbstractPromotionDTO _promotion;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractPromotionRestrictionDTO()
	{
		super();
	}
	
	
	public String getDescriptionPattern()
	{
		return this._descriptionPattern;
	}
	
	public AbstractPromotionDTO getPromotion()
	{
		return this._promotion;
	}
	
	public String getRenderedDescription()
	{
		return this._renderedDescription;
	}
	
	public String getRestrictionType()
	{
		return this._restrictionType;
	}
	
	public void setDescriptionPattern(final String value)
	{
		this.modifiedPropsSet.add("descriptionPattern");
		this._descriptionPattern = value;
	}
	
	public void setPromotion(final AbstractPromotionDTO value)
	{
		this.modifiedPropsSet.add("promotion");
		this._promotion = value;
	}
	
	public void setRenderedDescription(final String value)
	{
		this.modifiedPropsSet.add("renderedDescription");
		this._renderedDescription = value;
	}
	
	public void setRestrictionType(final String value)
	{
		this.modifiedPropsSet.add("restrictionType");
		this._restrictionType = value;
	}
	
}
