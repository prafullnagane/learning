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

import de.hybris.platform.cockpit.dto.CockpitSavedFacetValueDTO;
import de.hybris.platform.cockpit.dto.CockpitSavedParameterValueDTO;
import de.hybris.platform.cockpit.dto.CockpitSavedSortCriterionDTO;
import de.hybris.platform.cockpit.model.CockpitSavedQueryModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CockpitSavedQuery first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = CockpitSavedQueryModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "cockpitsavedquery")
public class CockpitSavedQueryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedQuery.cockpitSavedSortCriteria</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cockpit.dto.CockpitSavedSortCriterionDTO> _cockpitSavedSortCriteria;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedQuery.selectedTemplateCode</code> attribute defined at extension <code> */
	private java.lang.String _selectedTemplateCode;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedQuery.cockpitSavedParameterValues</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cockpit.dto.CockpitSavedParameterValueDTO> _cockpitSavedParameterValues;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedQuery.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedQuery.readSavedQueryPrincipals</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.security.PrincipalDTO> _readSavedQueryPrincipals;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedQuery.selectedTypeCode</code> attribute defined at extension <code> */
	private java.lang.String _selectedTypeCode;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedQuery.cockpitSavedFacetValues</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cockpit.dto.CockpitSavedFacetValueDTO> _cockpitSavedFacetValues;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedQuery.simpleText</code> attribute defined at extension <code> */
	private java.lang.String _simpleText;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedQuery.label</code> attribute defined at extension <code> */
	private java.lang.String _label;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedQuery.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedQuery.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedQuery.defaultViewMode</code> attribute defined at extension <code> */
	private java.lang.String _defaultViewMode;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitSavedQueryDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "cockpitSavedFacetValues")
	@XmlElement(name = "cockpitSavedFacetValue")
	public Collection<CockpitSavedFacetValueDTO> getCockpitSavedFacetValues()
	{
		return this._cockpitSavedFacetValues;
	}
	
	@XmlElementWrapper(name = "cockpitSavedParameterValues")
	@XmlElement(name = "cockpitSavedParameterValue")
	public Collection<CockpitSavedParameterValueDTO> getCockpitSavedParameterValues()
	{
		return this._cockpitSavedParameterValues;
	}
	
	@XmlElementWrapper(name = "cockpitSavedSortCriteria")
	@XmlElement(name = "cockpitSavedSortCriterion")
	public Collection<CockpitSavedSortCriterionDTO> getCockpitSavedSortCriteria()
	{
		return this._cockpitSavedSortCriteria;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public String getDefaultViewMode()
	{
		return this._defaultViewMode;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public String getLabel()
	{
		return this._label;
	}
	
	@XmlElementWrapper(name = "readSavedQueryPrincipals")
	@XmlElement(name = "principal")
	public Collection<PrincipalDTO> getReadSavedQueryPrincipals()
	{
		return this._readSavedQueryPrincipals;
	}
	
	public String getSelectedTemplateCode()
	{
		return this._selectedTemplateCode;
	}
	
	public String getSelectedTypeCode()
	{
		return this._selectedTypeCode;
	}
	
	public String getSimpleText()
	{
		return this._simpleText;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	public void setCockpitSavedFacetValues(final Collection<CockpitSavedFacetValueDTO> value)
	{
		this.modifiedPropsSet.add("cockpitSavedFacetValues");
		this._cockpitSavedFacetValues = value;
	}
	
	public void setCockpitSavedParameterValues(final Collection<CockpitSavedParameterValueDTO> value)
	{
		this.modifiedPropsSet.add("cockpitSavedParameterValues");
		this._cockpitSavedParameterValues = value;
	}
	
	public void setCockpitSavedSortCriteria(final Collection<CockpitSavedSortCriterionDTO> value)
	{
		this.modifiedPropsSet.add("cockpitSavedSortCriteria");
		this._cockpitSavedSortCriteria = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setDefaultViewMode(final String value)
	{
		this.modifiedPropsSet.add("defaultViewMode");
		this._defaultViewMode = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setLabel(final String value)
	{
		this.modifiedPropsSet.add("label");
		this._label = value;
	}
	
	public void setReadSavedQueryPrincipals(final Collection<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("readSavedQueryPrincipals");
		this._readSavedQueryPrincipals = value;
	}
	
	public void setSelectedTemplateCode(final String value)
	{
		this.modifiedPropsSet.add("selectedTemplateCode");
		this._selectedTemplateCode = value;
	}
	
	public void setSelectedTypeCode(final String value)
	{
		this.modifiedPropsSet.add("selectedTypeCode");
		this._selectedTypeCode = value;
	}
	
	public void setSimpleText(final String value)
	{
		this.modifiedPropsSet.add("simpleText");
		this._simpleText = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
}
