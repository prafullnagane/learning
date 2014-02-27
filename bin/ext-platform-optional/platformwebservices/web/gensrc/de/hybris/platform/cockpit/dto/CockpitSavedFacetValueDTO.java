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
import de.hybris.platform.cockpit.model.CockpitSavedFacetValueModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CockpitSavedFacetValue first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = CockpitSavedFacetValueModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "cockpitsavedfacetvalue")
public class CockpitSavedFacetValueDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedFacetValue.valueQualifier</code> attribute defined at extension <code> */
	private java.lang.String _valueQualifier;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedFacetValue.facetQualifier</code> attribute defined at extension <code> */
	private java.lang.String _facetQualifier;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedFacetValue.cockpitSavedQuery</code> attribute defined at extension <code> */
	private de.hybris.platform.cockpit.dto.CockpitSavedQueryDTO _cockpitSavedQuery;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitSavedFacetValueDTO()
	{
		super();
	}
	
	
	public CockpitSavedQueryDTO getCockpitSavedQuery()
	{
		return this._cockpitSavedQuery;
	}
	
	public String getFacetQualifier()
	{
		return this._facetQualifier;
	}
	
	public String getValueQualifier()
	{
		return this._valueQualifier;
	}
	
	public void setCockpitSavedQuery(final CockpitSavedQueryDTO value)
	{
		this.modifiedPropsSet.add("cockpitSavedQuery");
		this._cockpitSavedQuery = value;
	}
	
	public void setFacetQualifier(final String value)
	{
		this.modifiedPropsSet.add("facetQualifier");
		this._facetQualifier = value;
	}
	
	public void setValueQualifier(final String value)
	{
		this.modifiedPropsSet.add("valueQualifier");
		this._valueQualifier = value;
	}
	
}
