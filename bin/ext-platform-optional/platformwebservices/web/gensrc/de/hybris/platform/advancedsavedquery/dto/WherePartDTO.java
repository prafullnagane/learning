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

import de.hybris.platform.advancedsavedquery.dto.AbstractAdvancedSavedQuerySearchParameterDTO;
import de.hybris.platform.advancedsavedquery.dto.AdvancedSavedQueryDTO;
import de.hybris.platform.advancedsavedquery.model.WherePartModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type WherePart first defined at extension advancedsavedquery
 */
@SuppressWarnings("all")
@GraphNode(target = WherePartModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "wherepart")
public class WherePartDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>WherePart.savedQuery</code> attribute defined at extension <code> */
	private de.hybris.platform.advancedsavedquery.dto.AdvancedSavedQueryDTO _savedQuery;
	/** <i>Generated variable</i> - Variable of <code>WherePart.and</code> attribute defined at extension <code> */
	private java.lang.Boolean _and;
	/** <i>Generated variable</i> - Variable of <code>WherePart.dynamicParams</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.advancedsavedquery.dto.AbstractAdvancedSavedQuerySearchParameterDTO> _dynamicParams;
	/** <i>Generated variable</i> - Variable of <code>WherePart.replacePattern</code> attribute defined at extension <code> */
	private java.lang.String _replacePattern;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WherePartDTO()
	{
		super();
	}
	
	
	public Boolean getAnd()
	{
		return this._and;
	}
	
	@XmlElementWrapper(name = "dynamicParams")
	@XmlElement(name = "abstractAdvancedSavedQuerySearchParameter")
	public Collection<AbstractAdvancedSavedQuerySearchParameterDTO> getDynamicParams()
	{
		return this._dynamicParams;
	}
	
	public String getReplacePattern()
	{
		return this._replacePattern;
	}
	
	public AdvancedSavedQueryDTO getSavedQuery()
	{
		return this._savedQuery;
	}
	
	public void setAnd(final Boolean value)
	{
		this.modifiedPropsSet.add("and");
		this._and = value;
	}
	
	public void setDynamicParams(final Collection<AbstractAdvancedSavedQuerySearchParameterDTO> value)
	{
		this.modifiedPropsSet.add("dynamicParams");
		this._dynamicParams = value;
	}
	
	public void setReplacePattern(final String value)
	{
		this.modifiedPropsSet.add("replacePattern");
		this._replacePattern = value;
	}
	
	public void setSavedQuery(final AdvancedSavedQueryDTO value)
	{
		this.modifiedPropsSet.add("savedQuery");
		this._savedQuery = value;
	}
	
}
