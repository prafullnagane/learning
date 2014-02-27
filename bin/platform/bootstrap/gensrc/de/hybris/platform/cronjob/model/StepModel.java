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
package de.hybris.platform.cronjob.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.enums.ErrorMode;
import de.hybris.platform.cronjob.model.BatchJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type Step first defined at extension processing.
 */
@SuppressWarnings("all")
public class StepModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "Step";
	
	/** <i>Generated constant</i> - Attribute key of <code>Step.code</code> attribute defined at extension <code>processing</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>Step.batchJob</code> attribute defined at extension <code>processing</code>. */
	public static final String BATCHJOB = "batchJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>Step.synchronous</code> attribute defined at extension <code>processing</code>. */
	public static final String SYNCHRONOUS = "synchronous";
	
	/** <i>Generated constant</i> - Attribute key of <code>Step.errorMode</code> attribute defined at extension <code>processing</code>. */
	public static final String ERRORMODE = "errorMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>Step.sequenceNumber</code> attribute defined at extension <code>processing</code>. */
	public static final String SEQUENCENUMBER = "sequenceNumber";
	
	
	/** <i>Generated variable</i> - Variable of <code>Step.code</code> attribute defined at extension <code>processing</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>Step.batchJob</code> attribute defined at extension <code>processing</code>. */
	private BatchJobModel _batchJob;
	
	/** <i>Generated variable</i> - Variable of <code>Step.synchronous</code> attribute defined at extension <code>processing</code>. */
	private Boolean _synchronous;
	
	/** <i>Generated variable</i> - Variable of <code>Step.errorMode</code> attribute defined at extension <code>processing</code>. */
	private ErrorMode _errorMode;
	
	/** <i>Generated variable</i> - Variable of <code>Step.sequenceNumber</code> attribute defined at extension <code>processing</code>. */
	private Integer _sequenceNumber;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public StepModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public StepModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _batchJob initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 * @param _code initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 * @param _sequenceNumber initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 */
	@Deprecated
	public StepModel(final BatchJobModel _batchJob, final String _code, final Integer _sequenceNumber)
	{
		super();
		setBatchJob(_batchJob);
		setCode(_code);
		setSequenceNumber(_sequenceNumber);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _batchJob initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 * @param _code initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _sequenceNumber initial attribute declared by type <code>Step</code> at extension <code>processing</code>
	 */
	@Deprecated
	public StepModel(final BatchJobModel _batchJob, final String _code, final ItemModel _owner, final Integer _sequenceNumber)
	{
		super();
		setBatchJob(_batchJob);
		setCode(_code);
		setOwner(_owner);
		setSequenceNumber(_sequenceNumber);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Step.batchJob</code> attribute defined at extension <code>processing</code>. 
	 * @return the batchJob
	 */
	public BatchJobModel getBatchJob()
	{
		return _batchJob = getPersistenceContext().getValue(BATCHJOB, _batchJob);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Step.code</code> attribute defined at extension <code>processing</code>. 
	 * @return the code
	 */
	public String getCode()
	{
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Step.errorMode</code> attribute defined at extension <code>processing</code>. 
	 * @return the errorMode
	 */
	public ErrorMode getErrorMode()
	{
		return _errorMode = getPersistenceContext().getValue(ERRORMODE, _errorMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Step.sequenceNumber</code> attribute defined at extension <code>processing</code>. 
	 * @return the sequenceNumber
	 */
	public Integer getSequenceNumber()
	{
		return _sequenceNumber = getPersistenceContext().getValue(SEQUENCENUMBER, _sequenceNumber);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Step.synchronous</code> attribute defined at extension <code>processing</code>. 
	 * @return the synchronous
	 */
	public Boolean getSynchronous()
	{
		return _synchronous = getPersistenceContext().getValue(SYNCHRONOUS, _synchronous);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Step.batchJob</code> attribute defined at extension <code>processing</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the batchJob
	 */
	public void setBatchJob(final BatchJobModel value)
	{
		_batchJob = getPersistenceContext().setValue(BATCHJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Step.code</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Step.errorMode</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the errorMode
	 */
	public void setErrorMode(final ErrorMode value)
	{
		_errorMode = getPersistenceContext().setValue(ERRORMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Step.sequenceNumber</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the sequenceNumber
	 */
	public void setSequenceNumber(final Integer value)
	{
		_sequenceNumber = getPersistenceContext().setValue(SEQUENCENUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Step.synchronous</code> attribute defined at extension <code>processing</code>. 
	 *  
	 * @param value the synchronous
	 */
	public void setSynchronous(final Boolean value)
	{
		_synchronous = getPersistenceContext().setValue(SYNCHRONOUS, value);
	}
	
}
