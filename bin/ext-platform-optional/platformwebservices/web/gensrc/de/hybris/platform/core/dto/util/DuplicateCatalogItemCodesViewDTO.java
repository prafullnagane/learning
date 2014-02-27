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

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.core.model.util.DuplicateCatalogItemCodesViewModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type DuplicateCatalogItemCodesView first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = DuplicateCatalogItemCodesViewModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "duplicatecatalogitemcodesview")
public class DuplicateCatalogItemCodesViewDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>DuplicateCatalogItemCodesView.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>DuplicateCatalogItemCodesView.count</code> attribute defined at extension <code> */
	private java.lang.Integer _count;
	/** <i>Generated variable</i> - Variable of <code>DuplicateCatalogItemCodesView.catalogVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _catalogVersion;
	/** <i>Generated variable</i> - Variable of <code>DuplicateCatalogItemCodesView.typeCode</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _typeCode;
	/** <i>Generated variable</i> - Variable of <code>DuplicateCatalogItemCodesView.cv</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _cv;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DuplicateCatalogItemCodesViewDTO()
	{
		super();
	}
	
	
	public CatalogVersionDTO getCatalogVersion()
	{
		return this._catalogVersion;
	}
	
	public String getCode()
	{
		return this._code;
	}
	
	public Integer getCount()
	{
		return this._count;
	}
	
	public CatalogVersionDTO getCv()
	{
		return this._cv;
	}
	
	public ComposedTypeDTO getTypeCode()
	{
		return this._typeCode;
	}
	
	public void setCatalogVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("catalogVersion");
		this._catalogVersion = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setCount(final Integer value)
	{
		this.modifiedPropsSet.add("count");
		this._count = value;
	}
	
	public void setCv(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("cv");
		this._cv = value;
	}
	
	public void setTypeCode(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("typeCode");
		this._typeCode = value;
	}
	
}
