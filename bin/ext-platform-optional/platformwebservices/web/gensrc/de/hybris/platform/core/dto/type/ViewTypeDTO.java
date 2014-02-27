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

import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.core.dto.type.ViewAttributeDescriptorDTO;
import de.hybris.platform.core.model.type.ViewTypeModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ViewType first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = ViewTypeModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "viewtype")
public class ViewTypeDTO extends ComposedTypeDTO
{
	/** <i>Generated variable</i> - Variable of <code>ViewType.query</code> attribute defined at extension <code> */
	private java.lang.String _query;
	/** <i>Generated variable</i> - Variable of <code>ViewType.params</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.core.dto.type.ViewAttributeDescriptorDTO> _params;
	/** <i>Generated variable</i> - Variable of <code>ViewType.columns</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.type.ViewAttributeDescriptorDTO> _columns;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ViewTypeDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "columns")
	@XmlElement(name = "viewAttributeDescriptor")
	public List<ViewAttributeDescriptorDTO> getColumns()
	{
		return this._columns;
	}
	
	@XmlElementWrapper(name = "params")
	@XmlElement(name = "viewAttributeDescriptor")
	public Set<ViewAttributeDescriptorDTO> getParams()
	{
		return this._params;
	}
	
	public String getQuery()
	{
		return this._query;
	}
	
	public void setColumns(final List<ViewAttributeDescriptorDTO> value)
	{
		this.modifiedPropsSet.add("columns");
		this._columns = value;
	}
	
	public void setParams(final Set<ViewAttributeDescriptorDTO> value)
	{
		this.modifiedPropsSet.add("params");
		this._params = value;
	}
	
	public void setQuery(final String value)
	{
		this.modifiedPropsSet.add("query");
		this._query = value;
	}
	
}
