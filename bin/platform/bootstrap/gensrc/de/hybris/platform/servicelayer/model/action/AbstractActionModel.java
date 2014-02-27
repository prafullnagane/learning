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
package de.hybris.platform.servicelayer.model.action;

import de.hybris.platform.btg.model.BTGSegmentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.enums.ActionType;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type AbstractAction first defined at extension processing.
 */
@SuppressWarnings("all")
public class AbstractActionModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractAction";
	
	/**<i>Generated relation code constant for relation <code>BTGSegmentToAbstractActionsRelation</code> defining source attribute <code>segment</code> in extension <code>btg</code>.</i>*/
	public final static String _BTGSEGMENTTOABSTRACTACTIONSRELATION = "BTGSegmentToAbstractActionsRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractAction.target</code> attribute defined at extension <code>processing</code>. */
	public static final String TARGET = "target";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractAction.code</code> attribute defined at extension <code>processing</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractAction.segment</code> attribute defined at extension <code>btg</code>. */
	public static final String SEGMENT = "segment";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractAction.type</code> attribute defined at extension <code>processing</code>. */
	public static final String TYPE = "type";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractAction.target</code> attribute defined at extension <code>processing</code>. */
	private String _target;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractAction.code</code> attribute defined at extension <code>processing</code>. */
	private String _code;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractAction.segment</code> attribute defined at extension <code>btg</code>. */
	private BTGSegmentModel _segment;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractAction.type</code> attribute defined at extension <code>processing</code>. */
	private ActionType _type;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractActionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractActionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 * @param _target initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 * @param _type initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 */
	@Deprecated
	public AbstractActionModel(final String _code, final String _target, final ActionType _type)
	{
		super();
		setCode(_code);
		setTarget(_target);
		setType(_type);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _target initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 * @param _type initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 */
	@Deprecated
	public AbstractActionModel(final String _code, final ItemModel _owner, final String _target, final ActionType _type)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setTarget(_target);
		setType(_type);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAction.code</code> attribute defined at extension <code>processing</code>. 
	 * @return the code
	 */
	public String getCode()
	{
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAction.segment</code> attribute defined at extension <code>btg</code>. 
	 * @return the segment
	 */
	public BTGSegmentModel getSegment()
	{
		return _segment = getPersistenceContext().getValue(SEGMENT, _segment);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAction.target</code> attribute defined at extension <code>processing</code>. 
	 * @return the target
	 */
	public String getTarget()
	{
		return _target = getPersistenceContext().getValue(TARGET, _target);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAction.type</code> attribute defined at extension <code>processing</code>. 
	 * @return the type
	 */
	public ActionType getType()
	{
		return _type = getPersistenceContext().getValue(TYPE, _type);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AbstractAction.code</code> attribute defined at extension <code>processing</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractAction.segment</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the segment
	 */
	public void setSegment(final BTGSegmentModel value)
	{
		_segment = getPersistenceContext().setValue(SEGMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AbstractAction.target</code> attribute defined at extension <code>processing</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the target
	 */
	public void setTarget(final String value)
	{
		_target = getPersistenceContext().setValue(TARGET, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AbstractAction.type</code> attribute defined at extension <code>processing</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the type
	 */
	public void setType(final ActionType value)
	{
		_type = getPersistenceContext().setValue(TYPE, value);
	}
	
}
