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
package de.hybris.platform.catalog.dto.classification;

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationSystemDTO;
import de.hybris.platform.catalog.model.classification.ClassificationSystemVersionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ClassificationSystemVersion first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = ClassificationSystemVersionModel.class, factory = GenericNodeFactory.class, uidProperties="version")
@XmlRootElement(name = "classificationsystemversion")
public class ClassificationSystemVersionDTO extends CatalogVersionDTO
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationSystemVersionDTO()
	{
		super();
	}
	
	
	@Override
	public ClassificationSystemDTO getCatalog()
	{
		return (de.hybris.platform.catalog.dto.classification.ClassificationSystemDTO) super.getCatalog();
	}
	
}
