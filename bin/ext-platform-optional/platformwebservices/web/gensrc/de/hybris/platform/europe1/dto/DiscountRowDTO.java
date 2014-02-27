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
import de.hybris.platform.europe1.dto.AbstractDiscountRowDTO;
import de.hybris.platform.europe1.model.DiscountRowModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type DiscountRow first defined at extension europe1
 */
@SuppressWarnings("all")
@GraphNode(target = DiscountRowModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "discountrow")
public class DiscountRowDTO extends AbstractDiscountRowDTO
{
	/** <i>Generated variable</i> - Variable of <code>DiscountRow.catalogVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _catalogVersion;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DiscountRowDTO()
	{
		super();
	}
	
	
	public CatalogVersionDTO getCatalogVersion()
	{
		return this._catalogVersion;
	}
	
	public void setCatalogVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("catalogVersion");
		this._catalogVersion = value;
	}
	
}
