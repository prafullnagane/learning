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

import de.hybris.platform.core.dto.test.TestItemType3DTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type TestItemType3 first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "testitemtype3s")
public class TestItemType3sDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>TestItemType3DTO*/
	private List<TestItemType3DTO>  testitemtype3sList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TestItemType3sDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TestItemType3sDTO(final List<TestItemType3DTO> testitemtype3sList)
	{
		super();
		this.testitemtype3sList=testitemtype3sList;
	}
	
	
	/**
	 * @return the testitemtype3s
	 */
	@XmlElement(name = "testitemtype3")
	public List<TestItemType3DTO> getTestItemType3s()
	{
		return	testitemtype3sList;
	}
	
	/**
	 * @param testitemtype3sList 
	 *  the testitemtype3sList to set   
	 */
	public void setTestItemType3s(final List<TestItemType3DTO> testitemtype3sList)
	{
		this.testitemtype3sList=testitemtype3sList;
	}
	
}
