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

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.core.dto.order.price.TaxDTO;
import de.hybris.platform.europe1.dto.PDTRowDTO;
import de.hybris.platform.europe1.model.TaxRowModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type TaxRow first defined at extension europe1
 */
@SuppressWarnings("all")
@GraphNode(target = TaxRowModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "taxrow")
public class TaxRowDTO extends PDTRowDTO
{
	/** <i>Generated variable</i> - Variable of <code>TaxRow.tax</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.price.TaxDTO _tax;
	/** <i>Generated variable</i> - Variable of <code>TaxRow.absolute</code> attribute defined at extension <code> */
	private java.lang.Boolean _absolute;
	/** <i>Generated variable</i> - Variable of <code>TaxRow.catalogVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _catalogVersion;
	/** <i>Generated variable</i> - Variable of <code>TaxRow.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	/** <i>Generated variable</i> - Variable of <code>TaxRow.value</code> attribute defined at extension <code> */
	private java.lang.Double _value;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TaxRowDTO()
	{
		super();
	}
	
	
	public Boolean getAbsolute()
	{
		return this._absolute;
	}
	
	public CatalogVersionDTO getCatalogVersion()
	{
		return this._catalogVersion;
	}
	
	public CurrencyDTO getCurrency()
	{
		return this._currency;
	}
	
	public TaxDTO getTax()
	{
		return this._tax;
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
	
	public void setCatalogVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("catalogVersion");
		this._catalogVersion = value;
	}
	
	public void setCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("currency");
		this._currency = value;
	}
	
	public void setTax(final TaxDTO value)
	{
		this.modifiedPropsSet.add("tax");
		this._tax = value;
	}
	
	public void setValue(final Double value)
	{
		this.modifiedPropsSet.add("value");
		this._value = value;
	}
	
}
