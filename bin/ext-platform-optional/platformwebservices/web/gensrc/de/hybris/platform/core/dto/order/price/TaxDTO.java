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
package de.hybris.platform.core.dto.order.price;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.core.model.order.price.TaxModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Tax first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = TaxModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "tax")
public class TaxDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Tax.absolute</code> attribute defined at extension <code> */
	private java.lang.Boolean _absolute;
	/** <i>Generated variable</i> - Variable of <code>Tax.value</code> attribute defined at extension <code> */
	private java.lang.Double _value;
	/** <i>Generated variable</i> - Variable of <code>Tax.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>Tax.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>Tax.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TaxDTO()
	{
		super();
	}
	
	
	public Boolean getAbsolute()
	{
		return this._absolute;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public CurrencyDTO getCurrency()
	{
		return this._currency;
	}
	
	public String getName()
	{
		return this._name;
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
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("currency");
		this._currency = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setValue(final Double value)
	{
		this.modifiedPropsSet.add("value");
		this._value = value;
	}
	
}
