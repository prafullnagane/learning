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

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.catalog.dto.CompareCatalogVersionsCronJobDTO;
import de.hybris.platform.catalog.model.CatalogVersionDifferenceModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CatalogVersionDifference first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = CatalogVersionDifferenceModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "catalogversiondifference")
public class CatalogVersionDifferenceDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CatalogVersionDifference.sourceVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _sourceVersion;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersionDifference.targetVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _targetVersion;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersionDifference.cronJob</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CompareCatalogVersionsCronJobDTO _cronJob;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersionDifference.differenceValue</code> attribute defined at extension <code> */
	private java.lang.Double _differenceValue;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersionDifference.differenceText</code> attribute defined at extension <code> */
	private java.lang.String _differenceText;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionDifferenceDTO()
	{
		super();
	}
	
	
	public CompareCatalogVersionsCronJobDTO getCronJob()
	{
		return this._cronJob;
	}
	
	public String getDifferenceText()
	{
		return this._differenceText;
	}
	
	public Double getDifferenceValue()
	{
		return this._differenceValue;
	}
	
	public CatalogVersionDTO getSourceVersion()
	{
		return this._sourceVersion;
	}
	
	public CatalogVersionDTO getTargetVersion()
	{
		return this._targetVersion;
	}
	
	public void setCronJob(final CompareCatalogVersionsCronJobDTO value)
	{
		this.modifiedPropsSet.add("cronJob");
		this._cronJob = value;
	}
	
	public void setDifferenceText(final String value)
	{
		this.modifiedPropsSet.add("differenceText");
		this._differenceText = value;
	}
	
	public void setDifferenceValue(final Double value)
	{
		this.modifiedPropsSet.add("differenceValue");
		this._differenceValue = value;
	}
	
	public void setSourceVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("sourceVersion");
		this._sourceVersion = value;
	}
	
	public void setTargetVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("targetVersion");
		this._targetVersion = value;
	}
	
}
