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
package de.hybris.platform.europe1.dto;

import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.core.dto.order.price.DiscountDTO;
import de.hybris.platform.europe1.dto.PDTRowDTO;
import de.hybris.platform.europe1.model.AbstractDiscountRowModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractDiscountRow first defined at extension europe1
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractDiscountRowModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "abstractdiscountrow")
public class AbstractDiscountRowDTO extends PDTRowDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractDiscountRow.absolute</code> attribute defined at extension <code> */
	private java.lang.Boolean _absolute;
	/** <i>Generated variable</i> - Variable of <code>AbstractDiscountRow.value</code> attribute defined at extension <code> */
	private java.lang.Double _value;
	/** <i>Generated variable</i> - Variable of <code>AbstractDiscountRow.discountString</code> attribute defined at extension <code> */
	private java.lang.String _discountString;
	/** <i>Generated variable</i> - Variable of <code>AbstractDiscountRow.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	/** <i>Generated variable</i> - Variable of <code>AbstractDiscountRow.discount</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.price.DiscountDTO _discount;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractDiscountRowDTO()
	{
		super();
	}
	
	
	public Boolean getAbsolute()
	{
		return this._absolute;
	}
	
	public CurrencyDTO getCurrency()
	{
		return this._currency;
	}
	
	public DiscountDTO getDiscount()
	{
		return this._discount;
	}
	
	public String getDiscountString()
	{
		return this._discountString;
	}
	
	public Double getValue()
	{
		return this._value;
	}
	
	public void setAbsolute(final Boolean value)
	{
		this.modifiedPropsSet.add("absolute");
		this._absolute = value;
	}
	
	public void setCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("currency");
		this._currency = value;
	}
	
	public void setDiscount(final DiscountDTO value)
	{
		this.modifiedPropsSet.add("discount");
		this._discount = value;
	}
	
	public void setDiscountString(final String value)
	{
		this.modifiedPropsSet.add("discountString");
		this._discountString = value;
	}
	
	public void setValue(final Double value)
	{
		this.modifiedPropsSet.add("value");
		this._value = value;
	}
	
}
