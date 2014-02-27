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
package de.hybris.platform.europe1.model;

import de.hybris.platform.core.HybrisEnumValue;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.util.StandardDateRange;
import java.util.Date;

/**
 * Generated model class for type PDTRow first defined at extension europe1.
 */
@SuppressWarnings("all")
public class PDTRowModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PDTRow";
	
	/** <i>Generated constant</i> - Attribute key of <code>PDTRow.dateRange</code> attribute defined at extension <code>europe1</code>. */
	public static final String DATERANGE = "dateRange";
	
	/** <i>Generated constant</i> - Attribute key of <code>PDTRow.endTime</code> attribute defined at extension <code>europe1</code>. */
	public static final String ENDTIME = "endTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>PDTRow.pg</code> attribute defined at extension <code>europe1</code>. */
	public static final String PG = "pg";
	
	/** <i>Generated constant</i> - Attribute key of <code>PDTRow.startTime</code> attribute defined at extension <code>europe1</code>. */
	public static final String STARTTIME = "startTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>PDTRow.user</code> attribute defined at extension <code>europe1</code>. */
	public static final String USER = "user";
	
	/** <i>Generated constant</i> - Attribute key of <code>PDTRow.ug</code> attribute defined at extension <code>europe1</code>. */
	public static final String UG = "ug";
	
	/** <i>Generated constant</i> - Attribute key of <code>PDTRow.product</code> attribute defined at extension <code>europe1</code>. */
	public static final String PRODUCT = "product";
	
	
	/** <i>Generated variable</i> - Variable of <code>PDTRow.dateRange</code> attribute defined at extension <code>europe1</code>. */
	private StandardDateRange _dateRange;
	
	/** <i>Generated variable</i> - Variable of <code>PDTRow.endTime</code> attribute defined at extension <code>europe1</code>. */
	private Date _endTime;
	
	/** <i>Generated variable</i> - Variable of <code>PDTRow.pg</code> attribute defined at extension <code>europe1</code>. */
	private HybrisEnumValue _pg;
	
	/** <i>Generated variable</i> - Variable of <code>PDTRow.startTime</code> attribute defined at extension <code>europe1</code>. */
	private Date _startTime;
	
	/** <i>Generated variable</i> - Variable of <code>PDTRow.user</code> attribute defined at extension <code>europe1</code>. */
	private UserModel _user;
	
	/** <i>Generated variable</i> - Variable of <code>PDTRow.ug</code> attribute defined at extension <code>europe1</code>. */
	private HybrisEnumValue _ug;
	
	/** <i>Generated variable</i> - Variable of <code>PDTRow.product</code> attribute defined at extension <code>europe1</code>. */
	private ProductModel _product;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PDTRowModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PDTRowModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _pg initial attribute declared by type <code>PDTRow</code> at extension <code>europe1</code>
	 * @param _product initial attribute declared by type <code>PDTRow</code> at extension <code>europe1</code>
	 */
	@Deprecated
	public PDTRowModel(final ItemModel _owner, final HybrisEnumValue _pg, final ProductModel _product)
	{
		super();
		setOwner(_owner);
		setPg(_pg);
		setProduct(_product);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PDTRow.dateRange</code> attribute defined at extension <code>europe1</code>. 
	 * @return the dateRange
	 */
	public StandardDateRange getDateRange()
	{
		return _dateRange = getPersistenceContext().getValue(DATERANGE, _dateRange);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PDTRow.endTime</code> attribute defined at extension <code>europe1</code>. 
	 * @return the endTime
	 */
	public Date getEndTime()
	{
		return _endTime = getPersistenceContext().getValue(ENDTIME, _endTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PDTRow.pg</code> attribute defined at extension <code>europe1</code>. 
	 * @return the pg
	 */
	public HybrisEnumValue getPg()
	{
		return _pg = getPersistenceContext().getValue(PG, _pg);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PDTRow.product</code> attribute defined at extension <code>europe1</code>. 
	 * @return the product
	 */
	public ProductModel getProduct()
	{
		return _product = getPersistenceContext().getValue(PRODUCT, _product);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PDTRow.startTime</code> attribute defined at extension <code>europe1</code>. 
	 * @return the startTime
	 */
	public Date getStartTime()
	{
		return _startTime = getPersistenceContext().getValue(STARTTIME, _startTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PDTRow.ug</code> attribute defined at extension <code>europe1</code>. 
	 * @return the ug
	 */
	public HybrisEnumValue getUg()
	{
		return _ug = getPersistenceContext().getValue(UG, _ug);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PDTRow.user</code> attribute defined at extension <code>europe1</code>. 
	 * @return the user
	 */
	public UserModel getUser()
	{
		return _user = getPersistenceContext().getValue(USER, _user);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PDTRow.dateRange</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the dateRange
	 */
	public void setDateRange(final StandardDateRange value)
	{
		_dateRange = getPersistenceContext().setValue(DATERANGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PDTRow.endTime</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the endTime
	 */
	public void setEndTime(final Date value)
	{
		_endTime = getPersistenceContext().setValue(ENDTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>PDTRow.pg</code> attribute defined at extension <code>europe1</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the pg
	 */
	public void setPg(final HybrisEnumValue value)
	{
		_pg = getPersistenceContext().setValue(PG, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>PDTRow.product</code> attribute defined at extension <code>europe1</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the product
	 */
	public void setProduct(final ProductModel value)
	{
		_product = getPersistenceContext().setValue(PRODUCT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PDTRow.startTime</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the startTime
	 */
	public void setStartTime(final Date value)
	{
		_startTime = getPersistenceContext().setValue(STARTTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PDTRow.ug</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the ug
	 */
	public void setUg(final HybrisEnumValue value)
	{
		_ug = getPersistenceContext().setValue(UG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PDTRow.user</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the user
	 */
	public void setUser(final UserModel value)
	{
		_user = getPersistenceContext().setValue(USER, value);
	}
	
}
