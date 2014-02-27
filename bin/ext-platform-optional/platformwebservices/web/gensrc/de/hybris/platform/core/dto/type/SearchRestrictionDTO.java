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
package de.hybris.platform.core.dto.type;

import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.core.dto.type.TypeManagerManagedDTO;
import de.hybris.platform.core.model.type.SearchRestrictionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SearchRestriction first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = SearchRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "searchrestriction")
public class SearchRestrictionDTO extends TypeManagerManagedDTO
{
	/** <i>Generated variable</i> - Variable of <code>SearchRestriction.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>SearchRestriction.active</code> attribute defined at extension <code> */
	private java.lang.Boolean _active;
	/** <i>Generated variable</i> - Variable of <code>SearchRestriction.principal</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.security.PrincipalDTO _principal;
	/** <i>Generated variable</i> - Variable of <code>SearchRestriction.query</code> attribute defined at extension <code> */
	private java.lang.String _query;
	/** <i>Generated variable</i> - Variable of <code>SearchRestriction.restrictedType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _restrictedType;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SearchRestrictionDTO()
	{
		super();
	}
	
	
	public Boolean getActive()
	{
		return this._active;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public PrincipalDTO getPrincipal()
	{
		return this._principal;
	}
	
	public String getQuery()
	{
		return this._query;
	}
	
	public ComposedTypeDTO getRestrictedType()
	{
		return this._restrictedType;
	}
	
	public void setActive(final Boolean value)
	{
		this.modifiedPropsSet.add("active");
		this._active = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setPrincipal(final PrincipalDTO value)
	{
		this.modifiedPropsSet.add("principal");
		this._principal = value;
	}
	
	public void setQuery(final String value)
	{
		this.modifiedPropsSet.add("query");
		this._query = value;
	}
	
	public void setRestrictedType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("restrictedType");
		this._restrictedType = value;
	}
	
}
