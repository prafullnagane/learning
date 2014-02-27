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
import de.hybris.platform.cockpit.model.CockpitObjectSpecialCollectionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CockpitObjectSpecialCollection first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = CockpitObjectSpecialCollectionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "cockpitobjectspecialcollection")
public class CockpitObjectSpecialCollectionDTO extends CockpitObjectAbstractCollectionDTO
{
	/** <i>Generated variable</i> - Variable of <code>CockpitObjectSpecialCollection.collectionType</code> attribute defined at extension <code> */
	private java.lang.String _collectionType;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitObjectSpecialCollectionDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getCollectionType()
	{
		return this._collectionType;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setCollectionType(final String value)
	{
		this.modifiedPropsSet.add("collectionType");
		this._collectionType = value;
	}
	
}
