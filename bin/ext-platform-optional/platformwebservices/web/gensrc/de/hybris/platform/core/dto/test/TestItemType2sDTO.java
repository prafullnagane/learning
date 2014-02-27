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
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type TestItemType2 first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "testitemtype2s")
public class TestItemType2sDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>TestItemType2DTO*/
	private List<TestItemType2DTO>  testitemtype2sList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TestItemType2sDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TestItemType2sDTO(final List<TestItemType2DTO> testitemtype2sList)
	{
		super();
		this.testitemtype2sList=testitemtype2sList;
	}
	
	
	/**
	 * @return the testitemtype2s
	 */
	@XmlElement(name = "testitemtype2")
	public List<TestItemType2DTO> getTestItemType2s()
	{
		return	testitemtype2sList;
	}
	
	/**
	 * @param testitemtype2sList 
	 *  the testitemtype2sList to set   
	 */
	public void setTestItemType2s(final List<TestItemType2DTO> testitemtype2sList)
	{
		this.testitemtype2sList=testitemtype2sList;
	}
	
}
