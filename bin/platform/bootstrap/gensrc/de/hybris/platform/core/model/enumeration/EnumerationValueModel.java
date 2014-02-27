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
package de.hybris.platform.core.model.enumeration;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Locale;

/**
 * Generated model class for type EnumerationValue first defined at extension core.
 */
@SuppressWarnings("all")
public class EnumerationValueModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "EnumerationValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>EnumerationValue.sequenceNumber</code> attribute defined at extension <code>core</code>. */
	public static final String SEQUENCENUMBER = "sequenceNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>EnumerationValue.icon</code> attribute defined at extension <code>core</code>. */
	public static final String ICON = "icon";
	
	/** <i>Generated constant</i> - Attribute key of <code>EnumerationValue.deprecated</code> attribute defined at extension <code>core</code>. */
	public static final String DEPRECATED = "deprecated";
	
	/** <i>Generated constant</i> - Attribute key of <code>EnumerationValue.name</code> attribute defined at extension <code>core</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>EnumerationValue.extensionName</code> attribute defined at extension <code>core</code>. */
	public static final String EXTENSIONNAME = "extensionName";
	
	/** <i>Generated constant</i> - Attribute key of <code>EnumerationValue.code</code> attribute defined at extension <code>core</code>. */
	public static final String CODE = "code";
	
	
	/** <i>Generated variable</i> - Variable of <code>EnumerationValue.sequenceNumber</code> attribute defined at extension <code>core</code>. */
	private Integer _sequenceNumber;
	
	/** <i>Generated variable</i> - Variable of <code>EnumerationValue.icon</code> attribute defined at extension <code>core</code>. */
	private MediaModel _icon;
	
	/** <i>Generated variable</i> - Variable of <code>EnumerationValue.deprecated</code> attribute defined at extension <code>core</code>. */
	private Boolean _deprecated;
	
	/** <i>Generated variable</i> - Variable of <code>EnumerationValue.extensionName</code> attribute defined at extension <code>core</code>. */
	private String _extensionName;
	
	/** <i>Generated variable</i> - Variable of <code>EnumerationValue.code</code> attribute defined at extension <code>core</code>. */
	private String _code;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public EnumerationValueModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public EnumerationValueModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>EnumerationValue</code> at extension <code>core</code>
	 */
	@Deprecated
	public EnumerationValueModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>EnumerationValue</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public EnumerationValueModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnumerationValue.code</code> attribute defined at extension <code>core</code>. 
	 * @return the code
	 */
	public String getCode()
	{
		return _code = getPersistenceContext().getValue(CODE, _code);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnumerationValue.deprecated</code> attribute defined at extension <code>core</code>. 
	 * @return the deprecated
	 */
	public Boolean getDeprecated()
	{
		return _deprecated = getPersistenceContext().getValue(DEPRECATED, _deprecated);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnumerationValue.extensionName</code> attribute defined at extension <code>core</code>. 
	 * @return the extensionName
	 */
	public String getExtensionName()
	{
		return _extensionName = getPersistenceContext().getValue(EXTENSIONNAME, _extensionName);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnumerationValue.icon</code> attribute defined at extension <code>core</code>. 
	 * @return the icon
	 */
	public MediaModel getIcon()
	{
		return _icon = getPersistenceContext().getValue(ICON, _icon);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnumerationValue.name</code> attribute defined at extension <code>core</code>. 
	 * @return the name
	 */
	public String getName()
	{
		return getName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>EnumerationValue.name</code> attribute defined at extension <code>core</code>. 
	 * @param loc the value localization key 
	 * @return the name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnumerationValue.sequenceNumber</code> attribute defined at extension <code>core</code>. 
	 * @return the sequenceNumber
	 */
	public Integer getSequenceNumber()
	{
		return _sequenceNumber = getPersistenceContext().getValue(SEQUENCENUMBER, _sequenceNumber);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EnumerationValue.code</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		_code = getPersistenceContext().setValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EnumerationValue.extensionName</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the extensionName
	 */
	public void setExtensionName(final String value)
	{
		_extensionName = getPersistenceContext().setValue(EXTENSIONNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EnumerationValue.icon</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the icon
	 */
	public void setIcon(final MediaModel value)
	{
		_icon = getPersistenceContext().setValue(ICON, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EnumerationValue.name</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>EnumerationValue.name</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the name
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	public void setName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(NAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EnumerationValue.sequenceNumber</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the sequenceNumber
	 */
	public void setSequenceNumber(final Integer value)
	{
		_sequenceNumber = getPersistenceContext().setValue(SEQUENCENUMBER, value);
	}
	
}
