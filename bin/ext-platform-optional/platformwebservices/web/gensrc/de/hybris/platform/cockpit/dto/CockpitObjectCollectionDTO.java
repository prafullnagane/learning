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
import de.hybris.platform.cockpit.model.CockpitObjectCollectionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CockpitObjectCollection first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = CockpitObjectCollectionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "cockpitobjectcollection")
public class CockpitObjectCollectionDTO extends CockpitObjectAbstractCollectionDTO
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitObjectCollectionDTO()
	{
		super();
	}
	
	
}
