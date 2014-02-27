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
import de.hybris.platform.cockpit.model.CockpitSavedSortCriterionModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CockpitSavedSortCriterion first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = CockpitSavedSortCriterionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "cockpitsavedsortcriterion")
public class CockpitSavedSortCriterionDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedSortCriterion.cockpitSavedQuery</code> attribute defined at extension <code> */
	private de.hybris.platform.cockpit.dto.CockpitSavedQueryDTO _cockpitSavedQuery;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedSortCriterion.criterionQualifier</code> attribute defined at extension <code> */
	private java.lang.String _criterionQualifier;
	/** <i>Generated variable</i> - Variable of <code>CockpitSavedSortCriterion.asc</code> attribute defined at extension <code> */
	private java.lang.Boolean _asc;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitSavedSortCriterionDTO()
	{
		super();
	}
	
	
	public Boolean getAsc()
	{
		return this._asc;
	}
	
	public CockpitSavedQueryDTO getCockpitSavedQuery()
	{
		return this._cockpitSavedQuery;
	}
	
	public String getCriterionQualifier()
	{
		return this._criterionQualifier;
	}
	
	public void setAsc(final Boolean value)
	{
		this.modifiedPropsSet.add("asc");
		this._asc = value;
	}
	
	public void setCockpitSavedQuery(final CockpitSavedQueryDTO value)
	{
		this.modifiedPropsSet.add("cockpitSavedQuery");
		this._cockpitSavedQuery = value;
	}
	
	public void setCriterionQualifier(final String value)
	{
		this.modifiedPropsSet.add("criterionQualifier");
		this._criterionQualifier = value;
	}
	
}
