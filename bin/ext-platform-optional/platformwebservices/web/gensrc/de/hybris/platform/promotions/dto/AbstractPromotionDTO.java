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
import de.hybris.platform.promotions.dto.AbstractPromotionRestrictionDTO;
import de.hybris.platform.promotions.dto.PromotionGroupDTO;
import de.hybris.platform.promotions.model.AbstractPromotionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractPromotionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "abstractpromotion")
public class AbstractPromotionDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.immutableKeyHash</code> attribute defined at extension <code> */
	private java.lang.String _immutableKeyHash;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.priority</code> attribute defined at extension <code> */
	private java.lang.Integer _priority;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.restrictions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.promotions.dto.AbstractPromotionRestrictionDTO> _restrictions;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.PromotionGroup</code> attribute defined at extension <code> */
	private de.hybris.platform.promotions.dto.PromotionGroupDTO _PromotionGroup;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.title</code> attribute defined at extension <code> */
	private java.lang.String _title;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.promotionType</code> attribute defined at extension <code> */
	private java.lang.String _promotionType;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.detailsURL</code> attribute defined at extension <code> */
	private java.lang.String _detailsURL;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.startDate</code> attribute defined at extension <code> */
	private java.util.Date _startDate;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.enabled</code> attribute defined at extension <code> */
	private java.lang.Boolean _enabled;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.endDate</code> attribute defined at extension <code> */
	private java.util.Date _endDate;
	/** <i>Generated variable</i> - Variable of <code>AbstractPromotion.immutableKey</code> attribute defined at extension <code> */
	private java.lang.String _immutableKey;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractPromotionDTO()
	{
		super();
	}
	
	
	public String getCode()
	{
		return this._code;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public String getDetailsURL()
	{
		return this._detailsURL;
	}
	
	public Boolean getEnabled()
	{
		return this._enabled;
	}
	
	public Date getEndDate()
	{
		return this._endDate;
	}
	
	public String getImmutableKey()
	{
		return this._immutableKey;
	}
	
	public String getImmutableKeyHash()
	{
		return this._immutableKeyHash;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public Integer getPriority()
	{
		return this._priority;
	}
	
	public PromotionGroupDTO getPromotionGroup()
	{
		return this._PromotionGroup;
	}
	
	public String getPromotionType()
	{
		return this._promotionType;
	}
	
	@XmlElementWrapper(name = "restrictions")
	@XmlElement(name = "abstractPromotionRestriction")
	public Collection<AbstractPromotionRestrictionDTO> getRestrictions()
	{
		return this._restrictions;
	}
	
	public Date getStartDate()
	{
		return this._startDate;
	}
	
	public String getTitle()
	{
		return this._title;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setDetailsURL(final String value)
	{
		this.modifiedPropsSet.add("detailsURL");
		this._detailsURL = value;
	}
	
	public void setEnabled(final Boolean value)
	{
		this.modifiedPropsSet.add("enabled");
		this._enabled = value;
	}
	
	public void setEndDate(final Date value)
	{
		this.modifiedPropsSet.add("endDate");
		this._endDate = value;
	}
	
	public void setImmutableKey(final String value)
	{
		this.modifiedPropsSet.add("immutableKey");
		this._immutableKey = value;
	}
	
	public void setImmutableKeyHash(final String value)
	{
		this.modifiedPropsSet.add("immutableKeyHash");
		this._immutableKeyHash = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setPriority(final Integer value)
	{
		this.modifiedPropsSet.add("priority");
		this._priority = value;
	}
	
	public void setPromotionGroup(final PromotionGroupDTO value)
	{
		this.modifiedPropsSet.add("PromotionGroup");
		this._PromotionGroup = value;
	}
	
	public void setPromotionType(final String value)
	{
		this.modifiedPropsSet.add("promotionType");
		this._promotionType = value;
	}
	
	public void setRestrictions(final Collection<AbstractPromotionRestrictionDTO> value)
	{
		this.modifiedPropsSet.add("restrictions");
		this._restrictions = value;
	}
	
	public void setStartDate(final Date value)
	{
		this.modifiedPropsSet.add("startDate");
		this._startDate = value;
	}
	
	public void setTitle(final String value)
	{
		this.modifiedPropsSet.add("title");
		this._title = value;
	}
	
}
