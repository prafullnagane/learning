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
package de.hybris.platform.validation.dto.constraints.jsr303;

import de.hybris.platform.validation.dto.constraints.AttributeConstraintDTO;
import de.hybris.platform.validation.model.constraints.jsr303.FutureConstraintModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type FutureConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@GraphNode(target = FutureConstraintModel.class, factory = GenericNodeFactory.class, uidProperties="id")
@XmlRootElement(name = "futureconstraint")
public class FutureConstraintDTO extends AttributeConstraintDTO
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FutureConstraintDTO()
	{
		super();
	}
	
	
}
