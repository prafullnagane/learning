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
package de.hybris.platform.core.dto.util;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.core.dto.type.RelationMetaTypeDTO;
import de.hybris.platform.core.model.util.RelationTypeUsageViewModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type RelationTypeUsageView first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = RelationTypeUsageViewModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "relationtypeusageview")
public class RelationTypeUsageViewDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>RelationTypeUsageView.composedType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _composedType;
	/** <i>Generated variable</i> - Variable of <code>RelationTypeUsageView.relationType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.RelationMetaTypeDTO _relationType;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RelationTypeUsageViewDTO()
	{
		super();
	}
	
	
	public ComposedTypeDTO getComposedType()
	{
		return this._composedType;
	}
	
	public RelationMetaTypeDTO getRelationType()
	{
		return this._relationType;
	}
	
	public void setComposedType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("composedType");
		this._composedType = value;
	}
	
	public void setRelationType(final RelationMetaTypeDTO value)
	{
		this.modifiedPropsSet.add("relationType");
		this._relationType = value;
	}
	
}
