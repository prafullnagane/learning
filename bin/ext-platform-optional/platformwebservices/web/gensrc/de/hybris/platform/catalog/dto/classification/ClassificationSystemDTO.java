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

import de.hybris.platform.catalog.dto.CatalogDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationSystemVersionDTO;
import de.hybris.platform.catalog.model.classification.ClassificationSystemModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ClassificationSystem first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = ClassificationSystemModel.class, factory = GenericNodeFactory.class, uidProperties="id")
@XmlRootElement(name = "classificationsystem")
public class ClassificationSystemDTO extends CatalogDTO
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationSystemDTO()
	{
		super();
	}
	
	
}
