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
package de.hybris.platform.mcc.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.mcc.model.AbstractLinkEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractLinkEntry first defined at extension mcc
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractLinkEntryModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "abstractlinkentry")
public class AbstractLinkEntryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractLinkEntry.readPrincipals</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.security.PrincipalDTO> _readPrincipals;
	/** <i>Generated variable</i> - Variable of <code>AbstractLinkEntry.area</code> attribute defined at extension <code> */
	private java.lang.String _area;
	/** <i>Generated variable</i> - Variable of <code>AbstractLinkEntry.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>AbstractLinkEntry.sortorder</code> attribute defined at extension <code> */
	private java.lang.Integer _sortorder;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractLinkEntryDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getArea()
	{
		return this._area;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "readPrincipals")
	@XmlElement(name = "principal")
	public List<PrincipalDTO> getReadPrincipals()
	{
		return this._readPrincipals;
	}
	
	public Integer getSortorder()
	{
		return this._sortorder;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setArea(final String value)
	{
		this.modifiedPropsSet.add("area");
		this._area = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setReadPrincipals(final List<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("readPrincipals");
		this._readPrincipals = value;
	}
	
	public void setSortorder(final Integer value)
	{
		this.modifiedPropsSet.add("sortorder");
		this._sortorder = value;
	}
	
}
