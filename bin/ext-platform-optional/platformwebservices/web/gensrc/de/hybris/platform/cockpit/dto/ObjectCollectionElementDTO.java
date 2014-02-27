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

import de.hybris.platform.cockpit.dto.CockpitObjectAbstractCollectionDTO;
import de.hybris.platform.cockpit.model.ObjectCollectionElementModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ObjectCollectionElement first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = ObjectCollectionElementModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "objectcollectionelement")
public class ObjectCollectionElementDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ObjectCollectionElement.objectTypeCode</code> attribute defined at extension <code> */
	private java.lang.String _objectTypeCode;
	/** <i>Generated variable</i> - Variable of <code>ObjectCollectionElement.position</code> attribute defined at extension <code> */
	private java.lang.Integer _position;
	/** <i>Generated variable</i> - Variable of <code>ObjectCollectionElement.collection</code> attribute defined at extension <code> */
	private de.hybris.platform.cockpit.dto.CockpitObjectAbstractCollectionDTO _collection;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ObjectCollectionElementDTO()
	{
		super();
	}
	
	
	public CockpitObjectAbstractCollectionDTO getCollection()
	{
		return this._collection;
	}
	
	public String getObjectTypeCode()
	{
		return this._objectTypeCode;
	}
	
	public Integer getPosition()
	{
		return this._position;
	}
	
	public void setCollection(final CockpitObjectAbstractCollectionDTO value)
	{
		this.modifiedPropsSet.add("collection");
		this._collection = value;
	}
	
	public void setObjectTypeCode(final String value)
	{
		this.modifiedPropsSet.add("objectTypeCode");
		this._objectTypeCode = value;
	}
	
	public void setPosition(final Integer value)
	{
		this.modifiedPropsSet.add("position");
		this._position = value;
	}
	
}
