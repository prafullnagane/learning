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
package de.hybris.platform.core.model.test;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.test.TestItemType2Model;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type TestItemType3 first defined at extension core.
 */
@SuppressWarnings("all")
public class TestItemType3Model extends TestItemType2Model
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "TestItemType3";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItemType3.xxx</code> attribute defined at extension <code>core</code>. */
	public static final String XXX = "xxx";
	
	
	/** <i>Generated variable</i> - Variable of <code>TestItemType3.xxx</code> attribute defined at extension <code>core</code>. */
	private String _xxx;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public TestItemType3Model()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public TestItemType3Model(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public TestItemType3Model(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItemType3.xxx</code> attribute defined at extension <code>core</code>. 
	 * @return the xxx
	 */
	public String getXxx()
	{
		return _xxx = getPersistenceContext().getValue(XXX, _xxx);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItemType3.xxx</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the xxx
	 */
	public void setXxx(final String value)
	{
		_xxx = getPersistenceContext().setValue(XXX, value);
	}
	
}
