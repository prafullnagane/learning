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

import de.hybris.platform.core.dto.util.DuplicateCatalogItemCodesViewDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type DuplicateCatalogItemCodesView first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "duplicatecatalogitemcodesviews")
public class DuplicateCatalogItemCodesViewsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DuplicateCatalogItemCodesViewDTO*/
	private List<DuplicateCatalogItemCodesViewDTO>  duplicatecatalogitemcodesviewsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DuplicateCatalogItemCodesViewsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DuplicateCatalogItemCodesViewsDTO(final List<DuplicateCatalogItemCodesViewDTO> duplicatecatalogitemcodesviewsList)
	{
		super();
		this.duplicatecatalogitemcodesviewsList=duplicatecatalogitemcodesviewsList;
	}
	
	
	/**
	 * @return the duplicatecatalogitemcodesviews
	 */
	@XmlElement(name = "duplicatecatalogitemcodesview")
	public List<DuplicateCatalogItemCodesViewDTO> getDuplicateCatalogItemCodesViews()
	{
		return	duplicatecatalogitemcodesviewsList;
	}
	
	/**
	 * @param duplicatecatalogitemcodesviewsList 
	 *  the duplicatecatalogitemcodesviewsList to set   
	 */
	public void setDuplicateCatalogItemCodesViews(final List<DuplicateCatalogItemCodesViewDTO> duplicatecatalogitemcodesviewsList)
	{
		this.duplicatecatalogitemcodesviewsList=duplicatecatalogitemcodesviewsList;
	}
	
}
