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

import de.hybris.platform.core.dto.test.TestItemDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type TestItem first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "testitems")
public class TestItemsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>TestItemDTO*/
	private List<TestItemDTO>  testitemsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TestItemsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TestItemsDTO(final List<TestItemDTO> testitemsList)
	{
		super();
		this.testitemsList=testitemsList;
	}
	
	
	/**
	 * @return the testitems
	 */
	@XmlElement(name = "testitem")
	public List<TestItemDTO> getTestItems()
	{
		return	testitemsList;
	}
	
	/**
	 * @param testitemsList 
	 *  the testitemsList to set   
	 */
	public void setTestItems(final List<TestItemDTO> testitemsList)
	{
		this.testitemsList=testitemsList;
	}
	
}
