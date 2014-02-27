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
package de.hybris.platform.core.dto.test;

import de.hybris.platform.core.dto.test.TestItemType2DTO;
import de.hybris.platform.core.model.test.TestItemType3Model;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type TestItemType3 first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = TestItemType3Model.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "testitemtype3")
public class TestItemType3DTO extends TestItemType2DTO
{
	/** <i>Generated variable</i> - Variable of <code>TestItemType3.xxx</code> attribute defined at extension <code> */
	private java.lang.String _xxx;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TestItemType3DTO()
	{
		super();
	}
	
	
	public String getXxx()
	{
		return this._xxx;
	}
	
	public void setXxx(final String value)
	{
		this.modifiedPropsSet.add("xxx");
		this._xxx = value;
	}
	
}