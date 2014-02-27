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

import de.hybris.platform.core.dto.type.AttributeDescriptorDTO;
import de.hybris.platform.core.dto.type.RelationMetaTypeDTO;
import de.hybris.platform.core.model.type.RelationDescriptorModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type RelationDescriptor first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = RelationDescriptorModel.class, factory = GenericNodeFactory.class, uidProperties="qualifier")
@XmlRootElement(name = "relationdescriptor")
public class RelationDescriptorDTO extends AttributeDescriptorDTO
{
	/** <i>Generated variable</i> - Variable of <code>RelationDescriptor.isSource</code> attribute defined at extension <code> */
	private java.lang.Boolean _isSource;
	/** <i>Generated variable</i> - Variable of <code>RelationDescriptor.relationType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.RelationMetaTypeDTO _relationType;
	/** <i>Generated variable</i> - Variable of <code>RelationDescriptor.ordered</code> attribute defined at extension <code> */
	private java.lang.Boolean _ordered;
	/** <i>Generated variable</i> - Variable of <code>RelationDescriptor.relationName</code> attribute defined at extension <code> */
	private java.lang.String _relationName;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RelationDescriptorDTO()
	{
		super();
	}
	
	
	public Boolean getIsSource()
	{
		return this._isSource;
	}
	
	public Boolean getOrdered()
	{
		return this._ordered;
	}
	
	public String getRelationName()
	{
		return this._relationName;
	}
	
	public RelationMetaTypeDTO getRelationType()
	{
		return this._relationType;
	}
	
	public void setIsSource(final Boolean value)
	{
		this.modifiedPropsSet.add("isSource");
		this._isSource = value;
	}
	
	public void setOrdered(final Boolean value)
	{
		this.modifiedPropsSet.add("ordered");
		this._ordered = value;
	}
	
	public void setRelationName(final String value)
	{
		this.modifiedPropsSet.add("relationName");
		this._relationName = value;
	}
	
	public void setRelationType(final RelationMetaTypeDTO value)
	{
		this.modifiedPropsSet.add("relationType");
		this._relationType = value;
	}
	
}
