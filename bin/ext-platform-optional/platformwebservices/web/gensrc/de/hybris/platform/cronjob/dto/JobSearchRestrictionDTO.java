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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.cronjob.dto.JobDTO;
import de.hybris.platform.cronjob.model.JobSearchRestrictionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type JobSearchRestriction first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = JobSearchRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "jobsearchrestriction")
public class JobSearchRestrictionDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>JobSearchRestriction.type</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _type;
	/** <i>Generated variable</i> - Variable of <code>JobSearchRestriction.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>JobSearchRestriction.query</code> attribute defined at extension <code> */
	private java.lang.String _query;
	/** <i>Generated variable</i> - Variable of <code>JobSearchRestriction.job</code> attribute defined at extension <code> */
	private de.hybris.platform.cronjob.dto.JobDTO _job;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JobSearchRestrictionDTO()
	{
		super();
	}
	
	
	public String getCode()
	{
		return this._code;
	}
	
	public JobDTO getJob()
	{
		return this._job;
	}
	
	public String getQuery()
	{
		return this._query;
	}
	
	public ComposedTypeDTO getType()
	{
		return this._type;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setJob(final JobDTO value)
	{
		this.modifiedPropsSet.add("job");
		this._job = value;
	}
	
	public void setQuery(final String value)
	{
		this.modifiedPropsSet.add("query");
		this._query = value;
	}
	
	public void setType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("type");
		this._type = value;
	}
	
}
