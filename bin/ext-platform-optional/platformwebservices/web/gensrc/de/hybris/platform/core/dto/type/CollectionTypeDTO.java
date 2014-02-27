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

import de.hybris.platform.core.dto.type.TypeDTO;
import de.hybris.platform.core.model.type.CollectionTypeModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CollectionType first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = CollectionTypeModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "collectiontype")
public class CollectionTypeDTO extends TypeDTO
{
	/** <i>Generated variable</i> - Variable of <code>CollectionType.typeOfCollection</code> attribute defined at extension <code> */
	private java.lang.String _typeOfCollection;
	/** <i>Generated variable</i> - Variable of <code>CollectionType.elementType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.TypeDTO _elementType;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CollectionTypeDTO()
	{
		super();
	}
	
	
	public TypeDTO getElementType()
	{
		return this._elementType;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getTypeOfCollection()
	{
		return this._typeOfCollection;
	}
	
	public void setElementType(final TypeDTO value)
	{
		this.modifiedPropsSet.add("elementType");
		this._elementType = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setTypeOfCollection(final String value)
	{
		this.modifiedPropsSet.add("typeOfCollection");
		this._typeOfCollection = value;
	}
	
}
