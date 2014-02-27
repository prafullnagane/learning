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
import de.hybris.platform.core.model.test.TestItemType2Model;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type TestItemType2 first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = TestItemType2Model.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "testitemtype2")
public class TestItemType2DTO extends TestItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>TestItemType2.testProperty2</code> attribute defined at extension <code> */
	private java.lang.String _testProperty2;
	/** <i>Generated variable</i> - Variable of <code>TestItemType2.foo</code> attribute defined at extension <code> */
	private java.lang.String _foo;
	/** <i>Generated variable</i> - Variable of <code>TestItemType2.intBar</code> attribute defined at extension <code> */
	private int _intBar;
	/** <i>Generated variable</i> - Variable of <code>TestItemType2.testProperty1</code> attribute defined at extension <code> */
	private java.lang.Integer _testProperty1;
	/** <i>Generated variable</i> - Variable of <code>TestItemType2.bar</code> attribute defined at extension <code> */
	private java.lang.String _bar;
	/** <i>Generated variable</i> - Variable of <code>TestItemType2.gender</code> attribute defined at extension <code> */
	private java.lang.String _gender;
	/** <i>Generated variable</i> - Variable of <code>TestItemType2.fooBar</code> attribute defined at extension <code> */
	private java.lang.String _fooBar;
	/** <i>Generated variable</i> - Variable of <code>TestItemType2.localizedFooBar</code> attribute defined at extension <code> */
	private java.lang.String _localizedFooBar;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TestItemType2DTO()
	{
		super();
	}
	
	
	public String getBar()
	{
		return this._bar;
	}
	
	public String getFoo()
	{
		return this._foo;
	}
	
	public String getFooBar()
	{
		return this._fooBar;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getGender()
	{
		return this._gender;
	}
	
	public int getIntBar()
	{
		return this._intBar;
	}
	
	public String getLocalizedFooBar()
	{
		return this._localizedFooBar;
	}
	
	public Integer getTestProperty1()
	{
		return this._testProperty1;
	}
	
	public String getTestProperty2()
	{
		return this._testProperty2;
	}
	
	public void setBar(final String value)
	{
		this.modifiedPropsSet.add("bar");
		this._bar = value;
	}
	
	public void setFoo(final String value)
	{
		this.modifiedPropsSet.add("foo");
		this._foo = value;
	}
	
	public void setFooBar(final String value)
	{
		this.modifiedPropsSet.add("fooBar");
		this._fooBar = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setGender(final String value)
	{
		this.modifiedPropsSet.add("gender");
		this._gender = value;
	}
	
	public void setIntBar(final int value)
	{
		this.modifiedPropsSet.add("intBar");
		this._intBar = value;
	}
	
	public void setLocalizedFooBar(final String value)
	{
		this.modifiedPropsSet.add("localizedFooBar");
		this._localizedFooBar = value;
	}
	
	public void setTestProperty1(final Integer value)
	{
		this.modifiedPropsSet.add("testProperty1");
		this._testProperty1 = value;
	}
	
	public void setTestProperty2(final String value)
	{
		this.modifiedPropsSet.add("testProperty2");
		this._testProperty2 = value;
	}
	
}
