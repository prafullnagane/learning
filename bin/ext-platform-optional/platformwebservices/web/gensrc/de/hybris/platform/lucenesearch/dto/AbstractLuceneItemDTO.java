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
package de.hybris.platform.lucenesearch.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.lucenesearch.model.AbstractLuceneItemModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractLuceneItem first defined at extension lucenesearch
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractLuceneItemModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "abstractluceneitem")
public class AbstractLuceneItemDTO extends ItemDTO
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractLuceneItemDTO()
	{
		super();
	}
	
	
}
