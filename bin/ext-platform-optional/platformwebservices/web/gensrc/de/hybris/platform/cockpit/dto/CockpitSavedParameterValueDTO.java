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
package de.hybris.platform.cockpit.dto;

import de.hybris.platform.cockpit.dto.CockpitSavedQueryDTO;
import de.hybris.platform.cockpit.model.CockpitSavedParameterValueModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CockpitSavedParameterValue first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = CockpitSavedParameterValueModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "cockpitsavedparametervalue")
public class CockpitSavedParameterValueDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedParameterValue.parameterQualifier</code> attribute defined at extension <code> */
	private java.lang.String _parameterQualifier;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedParameterValue.reference</code> attribute defined at extension <code> */
	private java.lang.Boolean _reference;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedParameterValue.operatorQualifier</code> attribute defined at extension <code> */
	private java.lang.String _operatorQualifier;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedParameterValue.rawValue</code> attribute defined at extension <code> */
	private java.lang.String _rawValue;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedParameterValue.languageIso</code> attribute defined at extension <code> */
	private java.lang.String _languageIso;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedParameterValue.cockpitSavedQuery</code> attribute defined at extension <code> */
	private de.hybris.platform.cockpit.dto.CockpitSavedQueryDTO _cockpitSavedQuery;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedParameterValue.caseSensitive</code> attribute defined at extension <code> */
	private java.lang.Boolean _caseSensitive;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitSavedParameterValueDTO()
	{
		super();
	}
	
	
	public Boolean getCaseSensitive()
	{
		return this._caseSensitive;
	}
	
	public CockpitSavedQueryDTO getCockpitSavedQuery()
	{
		return this._cockpitSavedQuery;
	}
	
	public String getLanguageIso()
	{
		return this._languageIso;
	}
	
	public String getOperatorQualifier()
	{
		return this._operatorQualifier;
	}
	
	public String getParameterQualifier()
	{
		return this._parameterQualifier;
	}
	
	public String getRawValue()
	{
		return this._rawValue;
	}
	
	public Boolean getReference()
	{
		return this._reference;
	}
	
	public void setCaseSensitive(final Boolean value)
	{
		this.modifiedPropsSet.add("caseSensitive");
		this._caseSensitive = value;
	}
	
	public void setCockpitSavedQuery(final CockpitSavedQueryDTO value)
	{
		this.modifiedPropsSet.add("cockpitSavedQuery");
		this._cockpitSavedQuery = value;
	}
	
	public void setLanguageIso(final String value)
	{
		this.modifiedPropsSet.add("languageIso");
		this._languageIso = value;
	}
	
	public void setOperatorQualifier(final String value)
	{
		this.modifiedPropsSet.add("operatorQualifier");
		this._operatorQualifier = value;
	}
	
	public void setParameterQualifier(final String value)
	{
		this.modifiedPropsSet.add("parameterQualifier");
		this._parameterQualifier = value;
	}
	
	public void setRawValue(final String value)
	{
		this.modifiedPropsSet.add("rawValue");
		this._rawValue = value;
	}
	
	public void setReference(final Boolean value)
	{
		this.modifiedPropsSet.add("reference");
		this._reference = value;
	}
	
}
