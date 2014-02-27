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
package de.hybris.platform.core.dto.util;

import de.hybris.platform.catalog.dto.CatalogDTO;
import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.core.model.util.CatalogOverviewModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CatalogOverview first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = CatalogOverviewModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "catalogoverview")
public class CatalogOverviewDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CatalogOverview.cat</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogDTO _cat;
	/** <i>Generated variable</i> - Variable of <code>CatalogOverview.amount</code> attribute defined at extension <code> */
	private java.lang.Integer _amount;
	/** <i>Generated variable</i> - Variable of <code>CatalogOverview.typeCode</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _typeCode;
	/** <i>Generated variable</i> - Variable of <code>CatalogOverview.catalogversion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _catalogversion;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogOverviewDTO()
	{
		super();
	}
	
	
	public Integer getAmount()
	{
		return this._amount;
	}
	
	public CatalogDTO getCat()
	{
		return this._cat;
	}
	
	public CatalogVersionDTO getCatalogversion()
	{
		return this._catalogversion;
	}
	
	public ComposedTypeDTO getTypeCode()
	{
		return this._typeCode;
	}
	
	public void setAmount(final Integer value)
	{
		this.modifiedPropsSet.add("amount");
		this._amount = value;
	}
	
	public void setCat(final CatalogDTO value)
	{
		this.modifiedPropsSet.add("cat");
		this._cat = value;
	}
	
	public void setCatalogversion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("catalogversion");
		this._catalogversion = value;
	}
	
	public void setTypeCode(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("typeCode");
		this._typeCode = value;
	}
	
}
