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
package de.hybris.platform.advancedsavedquery.dto;

import de.hybris.platform.advancedsavedquery.dto.WherePartDTO;
import de.hybris.platform.advancedsavedquery.model.AdvancedSavedQueryModel;
import de.hybris.platform.core.dto.flexiblesearch.SavedQueryDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AdvancedSavedQuery first defined at extension advancedsavedquery
 */
@SuppressWarnings("all")
@GraphNode(target = AdvancedSavedQueryModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "advancedsavedquery")
public class AdvancedSavedQueryDTO extends SavedQueryDTO
{
	/** <i>Generated variable</i> - Variable of <code>AdvancedSavedQuery.whereparts</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.advancedsavedquery.dto.WherePartDTO> _whereparts;
	/** <i>Generated variable</i> - Variable of <code>AdvancedSavedQuery.generatedFlexibleSearch</code> attribute defined at extension <code> */
	private java.lang.String _generatedFlexibleSearch;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AdvancedSavedQueryDTO()
	{
		super();
	}
	
	
	public String getGeneratedFlexibleSearch()
	{
		return this._generatedFlexibleSearch;
	}
	
	@XmlElementWrapper(name = "whereparts")
	@XmlElement(name = "wherePart")
	public Collection<WherePartDTO> getWhereparts()
	{
		return this._whereparts;
	}
	
	public void setGeneratedFlexibleSearch(final String value)
	{
		this.modifiedPropsSet.add("generatedFlexibleSearch");
		this._generatedFlexibleSearch = value;
	}
	
	public void setWhereparts(final Collection<WherePartDTO> value)
	{
		this.modifiedPropsSet.add("whereparts");
		this._whereparts = value;
	}
	
}
