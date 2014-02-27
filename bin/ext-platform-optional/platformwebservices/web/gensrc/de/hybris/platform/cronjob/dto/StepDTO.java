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
import de.hybris.platform.cronjob.dto.BatchJobDTO;
import de.hybris.platform.cronjob.model.StepModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Step first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = StepModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "step")
public class StepDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Step.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>Step.synchronous</code> attribute defined at extension <code> */
	private java.lang.Boolean _synchronous;
	/** <i>Generated variable</i> - Variable of <code>Step.errorMode</code> attribute defined at extension <code> */
	private java.lang.String _errorMode;
	/** <i>Generated variable</i> - Variable of <code>Step.batchJob</code> attribute defined at extension <code> */
	private de.hybris.platform.cronjob.dto.BatchJobDTO _batchJob;
	/** <i>Generated variable</i> - Variable of <code>Step.sequenceNumber</code> attribute defined at extension <code> */
	private java.lang.Integer _sequenceNumber;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StepDTO()
	{
		super();
	}
	
	
	public BatchJobDTO getBatchJob()
	{
		return this._batchJob;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getErrorMode()
	{
		return this._errorMode;
	}
	
	@XmlAttribute
	public Integer getSequenceNumber()
	{
		return this._sequenceNumber;
	}
	
	public Boolean getSynchronous()
	{
		return this._synchronous;
	}
	
	public void setBatchJob(final BatchJobDTO value)
	{
		this.modifiedPropsSet.add("batchJob");
		this._batchJob = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setErrorMode(final String value)
	{
		this.modifiedPropsSet.add("errorMode");
		this._errorMode = value;
	}
	
	public void setSequenceNumber(final Integer value)
	{
		this.modifiedPropsSet.add("sequenceNumber");
		this._sequenceNumber = value;
	}
	
	public void setSynchronous(final Boolean value)
	{
		this.modifiedPropsSet.add("synchronous");
		this._synchronous = value;
	}
	
}
