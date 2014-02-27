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
import de.hybris.platform.core.dto.product.UnitDTO;
import de.hybris.platform.europe1.dto.PDTRowDTO;
import de.hybris.platform.europe1.model.PriceRowModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PriceRow first defined at extension europe1
 */
@SuppressWarnings("all")
@GraphNode(target = PriceRowModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "pricerow")
public class PriceRowDTO extends PDTRowDTO
{
	/** <i>Generated variable</i> - Variable of <code>PriceRow.catalogVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _catalogVersion;
	/** <i>Generated variable</i> - Variable of <code>PriceRow.unitFactor</code> attribute defined at extension <code> */
	private java.lang.Integer _unitFactor;
	/** <i>Generated variable</i> - Variable of <code>PriceRow.giveAwayPrice</code> attribute defined at extension <code> */
	private java.lang.Boolean _giveAwayPrice;
	/** <i>Generated variable</i> - Variable of <code>PriceRow.minqtd</code> attribute defined at extension <code> */
	private java.lang.Long _minqtd;
	/** <i>Generated variable</i> - Variable of <code>PriceRow.unit</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.UnitDTO _unit;
	/** <i>Generated variable</i> - Variable of <code>PriceRow.price</code> attribute defined at extension <code> */
	private java.lang.Double _price;
	/** <i>Generated variable</i> - Variable of <code>PriceRow.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	/** <i>Generated variable</i> - Variable of <code>PriceRow.net</code> attribute defined at extension <code> */
	private java.lang.Boolean _net;
	/** <i>Generated variable</i> - Variable of <code>PriceRow.sequenceId</code> attribute defined at extension <code> */
	private java.lang.Long _sequenceId;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PriceRowDTO()
	{
		super();
	}
	
	
	public CatalogVersionDTO getCatalogVersion()
	{
		return this._catalogVersion;
	}
	
	public CurrencyDTO getCurrency()
	{
		return this._currency;
	}
	
	public Boolean getGiveAwayPrice()
	{
		return this._giveAwayPrice;
	}
	
	public Long getMinqtd()
	{
		return this._minqtd;
	}
	
	public Boolean getNet()
	{
		return this._net;
	}
	
	public Double getPrice()
	{
		return this._price;
	}
	
	public Long getSequenceId()
	{
		return this._sequenceId;
	}
	
	public UnitDTO getUnit()
	{
		return this._unit;
	}
	
	public Integer getUnitFactor()
	{
		return this._unitFactor;
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
	
	public void setGiveAwayPrice(final Boolean value)
	{
		this.modifiedPropsSet.add("giveAwayPrice");
		this._giveAwayPrice = value;
	}
	
	public void setMinqtd(final Long value)
	{
		this.modifiedPropsSet.add("minqtd");
		this._minqtd = value;
	}
	
	public void setNet(final Boolean value)
	{
		this.modifiedPropsSet.add("net");
		this._net = value;
	}
	
	public void setPrice(final Double value)
	{
		this.modifiedPropsSet.add("price");
		this._price = value;
	}
	
	public void setSequenceId(final Long value)
	{
		this.modifiedPropsSet.add("sequenceId");
		this._sequenceId = value;
	}
	
	public void setUnit(final UnitDTO value)
	{
		this.modifiedPropsSet.add("unit");
		this._unit = value;
	}
	
	public void setUnitFactor(final Integer value)
	{
		this.modifiedPropsSet.add("unitFactor");
		this._unitFactor = value;
	}
	
}
