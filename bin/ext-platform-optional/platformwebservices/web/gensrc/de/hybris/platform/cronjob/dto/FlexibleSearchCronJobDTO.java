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
package de.hybris.platform.cronjob.dto;

import de.hybris.platform.cronjob.dto.MediaProcessCronJobDTO;
import de.hybris.platform.cronjob.model.FlexibleSearchCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type FlexibleSearchCronJob first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = FlexibleSearchCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "flexiblesearchcronjob")
public class FlexibleSearchCronJobDTO extends MediaProcessCronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>FlexibleSearchCronJob.searchResult</code> attribute defined at extension <code> */
	private java.util.Collection<java.lang.String> _searchResult;
	/** <i>Generated variable</i> - Variable of <code>FlexibleSearchCronJob.failOnUnknown</code> attribute defined at extension <code> */
	private java.lang.Boolean _failOnUnknown;
	/** <i>Generated variable</i> - Variable of <code>FlexibleSearchCronJob.count</code> attribute defined at extension <code> */
	private java.lang.Integer _count;
	/** <i>Generated variable</i> - Variable of <code>FlexibleSearchCronJob.dontNeedTotal</code> attribute defined at extension <code> */
	private java.lang.Boolean _dontNeedTotal;
	/** <i>Generated variable</i> - Variable of <code>FlexibleSearchCronJob.query</code> attribute defined at extension <code> */
	private java.lang.String _query;
	/** <i>Generated variable</i> - Variable of <code>FlexibleSearchCronJob.rangeStart</code> attribute defined at extension <code> */
	private java.lang.Integer _rangeStart;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FlexibleSearchCronJobDTO()
	{
		super();
	}
	
	
	public Integer getCount()
	{
		return this._count;
	}
	
	public Boolean getDontNeedTotal()
	{
		return this._dontNeedTotal;
	}
	
	public Boolean getFailOnUnknown()
	{
		return this._failOnUnknown;
	}
	
	public String getQuery()
	{
		return this._query;
	}
	
	public Integer getRangeStart()
	{
		return this._rangeStart;
	}
	
	@XmlElementWrapper(name = "searchResult")
	@XmlElement(name = "value")
	public Collection<String> getSearchResult()
	{
		return this._searchResult;
	}
	
	public void setCount(final Integer value)
	{
		this.modifiedPropsSet.add("count");
		this._count = value;
	}
	
	public void setDontNeedTotal(final Boolean value)
	{
		this.modifiedPropsSet.add("dontNeedTotal");
		this._dontNeedTotal = value;
	}
	
	public void setFailOnUnknown(final Boolean value)
	{
		this.modifiedPropsSet.add("failOnUnknown");
		this._failOnUnknown = value;
	}
	
	public void setQuery(final String value)
	{
		this.modifiedPropsSet.add("query");
		this._query = value;
	}
	
	public void setRangeStart(final Integer value)
	{
		this.modifiedPropsSet.add("rangeStart");
		this._rangeStart = value;
	}
	
	public void setSearchResult(final Collection<String> value)
	{
		this.modifiedPropsSet.add("searchResult");
		this._searchResult = value;
	}
	
}
