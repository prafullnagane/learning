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
package de.hybris.platform.cockpit.model;

import de.hybris.platform.cockpit.model.CockpitSavedQueryModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type CockpitSavedParameterValue first defined at extension cockpit.
 */
@SuppressWarnings("all")
public class CockpitSavedParameterValueModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CockpitSavedParameterValue";
	
	/**<i>Generated relation code constant for relation <code>CockpitSavedQuery2CockpitSavedParameterValueRelation</code> defining source attribute <code>cockpitSavedQuery</code> in extension <code>cockpit</code>.</i>*/
	public final static String _COCKPITSAVEDQUERY2COCKPITSAVEDPARAMETERVALUERELATION = "CockpitSavedQuery2CockpitSavedParameterValueRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>CockpitSavedParameterValue.parameterQualifier</code> attribute defined at extension <code>cockpit</code>. */
	public static final String PARAMETERQUALIFIER = "parameterQualifier";
	
	/** <i>Generated constant</i> - Attribute key of <code>CockpitSavedParameterValue.operatorQualifier</code> attribute defined at extension <code>cockpit</code>. */
	public static final String OPERATORQUALIFIER = "operatorQualifier";
	
	/** <i>Generated constant</i> - Attribute key of <code>CockpitSavedParameterValue.reference</code> attribute defined at extension <code>cockpit</code>. */
	public static final String REFERENCE = "reference";
	
	/** <i>Generated constant</i> - Attribute key of <code>CockpitSavedParameterValue.rawValue</code> attribute defined at extension <code>cockpit</code>. */
	public static final String RAWVALUE = "rawValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>CockpitSavedParameterValue.caseSensitive</code> attribute defined at extension <code>cockpit</code>. */
	public static final String CASESENSITIVE = "caseSensitive";
	
	/** <i>Generated constant</i> - Attribute key of <code>CockpitSavedParameterValue.cockpitSavedQuery</code> attribute defined at extension <code>cockpit</code>. */
	public static final String COCKPITSAVEDQUERY = "cockpitSavedQuery";
	
	/** <i>Generated constant</i> - Attribute key of <code>CockpitSavedParameterValue.languageIso</code> attribute defined at extension <code>cockpit</code>. */
	public static final String LANGUAGEISO = "languageIso";
	
	
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedParameterValue.parameterQualifier</code> attribute defined at extension <code>cockpit</code>. */
	private String _parameterQualifier;
	
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedParameterValue.operatorQualifier</code> attribute defined at extension <code>cockpit</code>. */
	private String _operatorQualifier;
	
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedParameterValue.reference</code> attribute defined at extension <code>cockpit</code>. */
	private Boolean _reference;
	
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedParameterValue.rawValue</code> attribute defined at extension <code>cockpit</code>. */
	private String _rawValue;
	
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedParameterValue.caseSensitive</code> attribute defined at extension <code>cockpit</code>. */
	private Boolean _caseSensitive;
	
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedParameterValue.cockpitSavedQuery</code> attribute defined at extension <code>cockpit</code>. */
	private CockpitSavedQueryModel _cockpitSavedQuery;
	
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedParameterValue.languageIso</code> attribute defined at extension <code>cockpit</code>. */
	private String _languageIso;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CockpitSavedParameterValueModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CockpitSavedParameterValueModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _operatorQualifier initial attribute declared by type <code>CockpitSavedParameterValue</code> at extension <code>cockpit</code>
	 * @param _parameterQualifier initial attribute declared by type <code>CockpitSavedParameterValue</code> at extension <code>cockpit</code>
	 */
	@Deprecated
	public CockpitSavedParameterValueModel(final String _operatorQualifier, final String _parameterQualifier)
	{
		super();
		setOperatorQualifier(_operatorQualifier);
		setParameterQualifier(_parameterQualifier);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _operatorQualifier initial attribute declared by type <code>CockpitSavedParameterValue</code> at extension <code>cockpit</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _parameterQualifier initial attribute declared by type <code>CockpitSavedParameterValue</code> at extension <code>cockpit</code>
	 */
	@Deprecated
	public CockpitSavedParameterValueModel(final String _operatorQualifier, final ItemModel _owner, final String _parameterQualifier)
	{
		super();
		setOperatorQualifier(_operatorQualifier);
		setOwner(_owner);
		setParameterQualifier(_parameterQualifier);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CockpitSavedParameterValue.caseSensitive</code> attribute defined at extension <code>cockpit</code>. 
	 * @return the caseSensitive
	 */
	public Boolean getCaseSensitive()
	{
		return _caseSensitive = getPersistenceContext().getValue(CASESENSITIVE, _caseSensitive);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CockpitSavedParameterValue.cockpitSavedQuery</code> attribute defined at extension <code>cockpit</code>. 
	 * @return the cockpitSavedQuery
	 */
	public CockpitSavedQueryModel getCockpitSavedQuery()
	{
		return _cockpitSavedQuery = getPersistenceContext().getValue(COCKPITSAVEDQUERY, _cockpitSavedQuery);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CockpitSavedParameterValue.languageIso</code> attribute defined at extension <code>cockpit</code>. 
	 * @return the languageIso
	 */
	public String getLanguageIso()
	{
		return _languageIso = getPersistenceContext().getValue(LANGUAGEISO, _languageIso);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CockpitSavedParameterValue.operatorQualifier</code> attribute defined at extension <code>cockpit</code>. 
	 * @return the operatorQualifier
	 */
	public String getOperatorQualifier()
	{
		return _operatorQualifier = getPersistenceContext().getValue(OPERATORQUALIFIER, _operatorQualifier);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CockpitSavedParameterValue.parameterQualifier</code> attribute defined at extension <code>cockpit</code>. 
	 * @return the parameterQualifier
	 */
	public String getParameterQualifier()
	{
		return _parameterQualifier = getPersistenceContext().getValue(PARAMETERQUALIFIER, _parameterQualifier);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CockpitSavedParameterValue.rawValue</code> attribute defined at extension <code>cockpit</code>. 
	 * @return the rawValue
	 */
	public String getRawValue()
	{
		return _rawValue = getPersistenceContext().getValue(RAWVALUE, _rawValue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CockpitSavedParameterValue.reference</code> attribute defined at extension <code>cockpit</code>. 
	 * @return the reference
	 */
	public Boolean getReference()
	{
		return _reference = getPersistenceContext().getValue(REFERENCE, _reference);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CockpitSavedParameterValue.caseSensitive</code> attribute defined at extension <code>cockpit</code>. 
	 *  
	 * @param value the caseSensitive
	 */
	public void setCaseSensitive(final Boolean value)
	{
		_caseSensitive = getPersistenceContext().setValue(CASESENSITIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CockpitSavedParameterValue.cockpitSavedQuery</code> attribute defined at extension <code>cockpit</code>. 
	 *  
	 * @param value the cockpitSavedQuery
	 */
	public void setCockpitSavedQuery(final CockpitSavedQueryModel value)
	{
		_cockpitSavedQuery = getPersistenceContext().setValue(COCKPITSAVEDQUERY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CockpitSavedParameterValue.languageIso</code> attribute defined at extension <code>cockpit</code>. 
	 *  
	 * @param value the languageIso
	 */
	public void setLanguageIso(final String value)
	{
		_languageIso = getPersistenceContext().setValue(LANGUAGEISO, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CockpitSavedParameterValue.operatorQualifier</code> attribute defined at extension <code>cockpit</code>. 
	 *  
	 * @param value the operatorQualifier
	 */
	public void setOperatorQualifier(final String value)
	{
		_operatorQualifier = getPersistenceContext().setValue(OPERATORQUALIFIER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CockpitSavedParameterValue.parameterQualifier</code> attribute defined at extension <code>cockpit</code>. 
	 *  
	 * @param value the parameterQualifier
	 */
	public void setParameterQualifier(final String value)
	{
		_parameterQualifier = getPersistenceContext().setValue(PARAMETERQUALIFIER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CockpitSavedParameterValue.rawValue</code> attribute defined at extension <code>cockpit</code>. 
	 *  
	 * @param value the rawValue
	 */
	public void setRawValue(final String value)
	{
		_rawValue = getPersistenceContext().setValue(RAWVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CockpitSavedParameterValue.reference</code> attribute defined at extension <code>cockpit</code>. 
	 *  
	 * @param value the reference
	 */
	public void setReference(final Boolean value)
	{
		_reference = getPersistenceContext().setValue(REFERENCE, value);
	}
	
}