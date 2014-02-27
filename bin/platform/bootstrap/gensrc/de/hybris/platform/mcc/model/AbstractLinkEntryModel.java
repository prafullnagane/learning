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
package de.hybris.platform.mcc.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.security.PrincipalModel;
import de.hybris.platform.mcc.enums.CockpitLinkArea;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;

/**
 * Generated model class for type AbstractLinkEntry first defined at extension mcc.
 */
@SuppressWarnings("all")
public class AbstractLinkEntryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractLinkEntry";
	
	/**<i>Generated relation code constant for relation <code>Principal2ReadableAbstractLinkEntryRelation</code> defining source attribute <code>readPrincipals</code> in extension <code>mcc</code>.</i>*/
	public final static String _PRINCIPAL2READABLEABSTRACTLINKENTRYRELATION = "Principal2ReadableAbstractLinkEntryRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractLinkEntry.sortorder</code> attribute defined at extension <code>mcc</code>. */
	public static final String SORTORDER = "sortorder";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractLinkEntry.area</code> attribute defined at extension <code>mcc</code>. */
	public static final String AREA = "area";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractLinkEntry.readPrincipals</code> attribute defined at extension <code>mcc</code>. */
	public static final String READPRINCIPALS = "readPrincipals";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractLinkEntry.code</code> attribute defined at extension <code>mcc</code>. */
	public static final String CODE = "code";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractLinkEntry.sortorder</code> attribute defined at extension <code>mcc</code>. */
	private Integer _sortorder;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractLinkEntry.area</code> attribute defined at extension <code>mcc</code>. */
	private CockpitLinkArea _area;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractLinkEntry.readPrincipals</code> attribute defined at extension <code>mcc</code>. */
	private List<PrincipalModel> _readPrincipals;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractLinkEntry.code</code> attribute defined at extension <code>mcc</code>. */
	private String _code;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractLinkEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractLinkEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _area initial attribute declared by type <code>AbstractLinkEntry</code> at extension <code>mcc</code>
	 * @param _code initial attribute declared by type <code>AbstractLinkEntry</code> at extension <code>mcc</code>
	 */
	@Deprecated
	public AbstractLinkEntryModel(final CockpitLinkArea _area, final String _code)
	{
		super();
		setArea(_area);
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _area initial attribute declared by type <code>AbstractLinkEntry</code> at extension <code>mcc</code>
	 * @param _code initial attribute declared by type <code>AbstractLinkEntry</code> at extension <code>mcc</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public AbstractLinkEntryModel(final CockpitLinkArea _area, final String _code, final ItemModel _owner)
	{
		super();
		setArea(_area);
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractLinkEntry.area</code> attribute defined at extension <code>mcc</code>. 
	 * @return the area
	 */
	public CockpitLinkArea getArea()
	{
		return _area = getPersistenceContext().getValue(AREA, _area);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractLinkEntry.code</code> attribute defined at extension <code>mcc</code>. 
	 * @return the code
	 */
	public String getCode()
	{
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractLinkEntry.readPrincipals</code> attribute defined at extension <code>mcc</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the readPrincipals
	 */
	public List<PrincipalModel> getReadPrincipals()
	{
		return _readPrincipals = getPersistenceContext().getValue(READPRINCIPALS, _readPrincipals);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractLinkEntry.sortorder</code> attribute defined at extension <code>mcc</code>. 
	 * @return the sortorder
	 */
	public Integer getSortorder()
	{
		return _sortorder = getPersistenceContext().getValue(SORTORDER, _sortorder);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractLinkEntry.area</code> attribute defined at extension <code>mcc</code>. 
	 *  
	 * @param value the area
	 */
	public void setArea(final CockpitLinkArea value)
	{
		_area = getPersistenceContext().setValue(AREA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractLinkEntry.code</code> attribute defined at extension <code>mcc</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractLinkEntry.readPrincipals</code> attribute defined at extension <code>mcc</code>. 
	 *  
	 * @param value the readPrincipals
	 */
	public void setReadPrincipals(final List<PrincipalModel> value)
	{
		_readPrincipals = getPersistenceContext().setValue(READPRINCIPALS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractLinkEntry.sortorder</code> attribute defined at extension <code>mcc</code>. 
	 *  
	 * @param value the sortorder
	 */
	public void setSortorder(final Integer value)
	{
		_sortorder = getPersistenceContext().setValue(SORTORDER, value);
	}
	
}