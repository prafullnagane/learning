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
import de.hybris.platform.catalog.dto.SyncItemCronJobDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.model.util.ExecutedPublicationsViewModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ExecutedPublicationsView first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = ExecutedPublicationsViewModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "executedpublicationsview")
public class ExecutedPublicationsViewDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ExecutedPublicationsView.sicjpk</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.SyncItemCronJobDTO _sicjpk;
	/** <i>Generated variable</i> - Variable of <code>ExecutedPublicationsView.targetVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _targetVersion;
	/** <i>Generated variable</i> - Variable of <code>ExecutedPublicationsView.startTime</code> attribute defined at extension <code> */
	private java.util.Date _startTime;
	/** <i>Generated variable</i> - Variable of <code>ExecutedPublicationsView.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>ExecutedPublicationsView.sourceVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _sourceVersion;
	/** <i>Generated variable</i> - Variable of <code>ExecutedPublicationsView.result</code> attribute defined at extension <code> */
	private java.lang.String _result;
	/** <i>Generated variable</i> - Variable of <code>ExecutedPublicationsView.endTime</code> attribute defined at extension <code> */
	private java.util.Date _endTime;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExecutedPublicationsViewDTO()
	{
		super();
	}
	
	
	public String getCode()
	{
		return this._code;
	}
	
	public Date getEndTime()
	{
		return this._endTime;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getResult()
	{
		return this._result;
	}
	
	public SyncItemCronJobDTO getSicjpk()
	{
		return this._sicjpk;
	}
	
	public CatalogVersionDTO getSourceVersion()
	{
		return this._sourceVersion;
	}
	
	public Date getStartTime()
	{
		return this._startTime;
	}
	
	public CatalogVersionDTO getTargetVersion()
	{
		return this._targetVersion;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setEndTime(final Date value)
	{
		this.modifiedPropsSet.add("endTime");
		this._endTime = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setResult(final String value)
	{
		this.modifiedPropsSet.add("result");
		this._result = value;
	}
	
	public void setSicjpk(final SyncItemCronJobDTO value)
	{
		this.modifiedPropsSet.add("sicjpk");
		this._sicjpk = value;
	}
	
	public void setSourceVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("sourceVersion");
		this._sourceVersion = value;
	}
	
	public void setStartTime(final Date value)
	{
		this.modifiedPropsSet.add("startTime");
		this._startTime = value;
	}
	
	public void setTargetVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("targetVersion");
		this._targetVersion = value;
	}
	
}
