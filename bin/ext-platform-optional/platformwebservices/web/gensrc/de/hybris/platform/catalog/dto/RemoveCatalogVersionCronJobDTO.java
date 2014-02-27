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
package de.hybris.platform.catalog.dto;

import de.hybris.platform.catalog.dto.CatalogDTO;
import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.catalog.model.RemoveCatalogVersionCronJobModel;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.impex.dto.ImpExMediaDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type RemoveCatalogVersionCronJob first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = RemoveCatalogVersionCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "removecatalogversioncronjob")
public class RemoveCatalogVersionCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>RemoveCatalogVersionCronJob.catalog</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogDTO _catalog;
	/** <i>Generated variable</i> - Variable of <code>RemoveCatalogVersionCronJob.dontRemoveObjects</code> attribute defined at extension <code> */
	private java.lang.Boolean _dontRemoveObjects;
	/** <i>Generated variable</i> - Variable of <code>RemoveCatalogVersionCronJob.totalDeleteItemCount</code> attribute defined at extension <code> */
	private java.lang.Integer _totalDeleteItemCount;
	/** <i>Generated variable</i> - Variable of <code>RemoveCatalogVersionCronJob.notRemovedItems</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.ImpExMediaDTO _notRemovedItems;
	/** <i>Generated variable</i> - Variable of <code>RemoveCatalogVersionCronJob.catalogVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _catalogVersion;
	/** <i>Generated variable</i> - Variable of <code>RemoveCatalogVersionCronJob.currentProcessingItemCount</code> attribute defined at extension <code> */
	private java.lang.Integer _currentProcessingItemCount;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveCatalogVersionCronJobDTO()
	{
		super();
	}
	
	
	public CatalogDTO getCatalog()
	{
		return this._catalog;
	}
	
	public CatalogVersionDTO getCatalogVersion()
	{
		return this._catalogVersion;
	}
	
	public Integer getCurrentProcessingItemCount()
	{
		return this._currentProcessingItemCount;
	}
	
	public Boolean getDontRemoveObjects()
	{
		return this._dontRemoveObjects;
	}
	
	public ImpExMediaDTO getNotRemovedItems()
	{
		return this._notRemovedItems;
	}
	
	public Integer getTotalDeleteItemCount()
	{
		return this._totalDeleteItemCount;
	}
	
	public void setCatalog(final CatalogDTO value)
	{
		this.modifiedPropsSet.add("catalog");
		this._catalog = value;
	}
	
	public void setCatalogVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("catalogVersion");
		this._catalogVersion = value;
	}
	
	public void setCurrentProcessingItemCount(final Integer value)
	{
		this.modifiedPropsSet.add("currentProcessingItemCount");
		this._currentProcessingItemCount = value;
	}
	
	public void setDontRemoveObjects(final Boolean value)
	{
		this.modifiedPropsSet.add("dontRemoveObjects");
		this._dontRemoveObjects = value;
	}
	
	public void setNotRemovedItems(final ImpExMediaDTO value)
	{
		this.modifiedPropsSet.add("notRemovedItems");
		this._notRemovedItems = value;
	}
	
	public void setTotalDeleteItemCount(final Integer value)
	{
		this.modifiedPropsSet.add("totalDeleteItemCount");
		this._totalDeleteItemCount = value;
	}
	
}
