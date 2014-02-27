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
package de.hybris.platform.core.dto.flexiblesearch;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.core.model.flexiblesearch.SavedQueryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SavedQuery first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = SavedQueryModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "savedquery")
public class SavedQueryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SavedQuery.query</code> attribute defined at extension <code> */
	private java.lang.String _query;
	/** <i>Generated variable</i> - Variable of <code>SavedQuery.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>SavedQuery.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>SavedQuery.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>SavedQuery.resultType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _resultType;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SavedQueryDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public String getQuery()
	{
		return this._query;
	}
	
	public ComposedTypeDTO getResultType()
	{
		return this._resultType;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setQuery(final String value)
	{
		this.modifiedPropsSet.add("query");
		this._query = value;
	}
	
	public void setResultType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("resultType");
		this._resultType = value;
	}
	
}
