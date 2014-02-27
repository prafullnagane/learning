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
package de.hybris.platform.acceleratorcms.jalo.components;

import de.hybris.platform.acceleratorcms.constants.AcceleratorCmsConstants;
import de.hybris.platform.acceleratorcms.jalo.components.ProductReferencesComponent;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.PurchasedProductReferencesComponent PurchasedProductReferencesComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPurchasedProductReferencesComponent extends ProductReferencesComponent
{
	/** Qualifier of the <code>PurchasedProductReferencesComponent.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>PurchasedProductReferencesComponent.filterPurchased</code> attribute **/
	public static final String FILTERPURCHASED = "filterPurchased";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ProductReferencesComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(FILTERPURCHASED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PurchasedProductReferencesComponent.category</code> attribute.
	 * @return the category - Category to filter displayed references with.
	 */
	public Category getCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PurchasedProductReferencesComponent.category</code> attribute.
	 * @return the category - Category to filter displayed references with.
	 */
	public Category getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PurchasedProductReferencesComponent.category</code> attribute. 
	 * @param value the category - Category to filter displayed references with.
	 */
	public void setCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PurchasedProductReferencesComponent.category</code> attribute. 
	 * @param value the category - Category to filter displayed references with.
	 */
	public void setCategory(final Category value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PurchasedProductReferencesComponent.filterPurchased</code> attribute.
	 * @return the filterPurchased - Determines if only purchased products are displayed in the component.
	 */
	public Boolean isFilterPurchased(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FILTERPURCHASED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PurchasedProductReferencesComponent.filterPurchased</code> attribute.
	 * @return the filterPurchased - Determines if only purchased products are displayed in the component.
	 */
	public Boolean isFilterPurchased()
	{
		return isFilterPurchased( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PurchasedProductReferencesComponent.filterPurchased</code> attribute. 
	 * @return the filterPurchased - Determines if only purchased products are displayed in the component.
	 */
	public boolean isFilterPurchasedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFilterPurchased( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PurchasedProductReferencesComponent.filterPurchased</code> attribute. 
	 * @return the filterPurchased - Determines if only purchased products are displayed in the component.
	 */
	public boolean isFilterPurchasedAsPrimitive()
	{
		return isFilterPurchasedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PurchasedProductReferencesComponent.filterPurchased</code> attribute. 
	 * @param value the filterPurchased - Determines if only purchased products are displayed in the component.
	 */
	public void setFilterPurchased(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FILTERPURCHASED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PurchasedProductReferencesComponent.filterPurchased</code> attribute. 
	 * @param value the filterPurchased - Determines if only purchased products are displayed in the component.
	 */
	public void setFilterPurchased(final Boolean value)
	{
		setFilterPurchased( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PurchasedProductReferencesComponent.filterPurchased</code> attribute. 
	 * @param value the filterPurchased - Determines if only purchased products are displayed in the component.
	 */
	public void setFilterPurchased(final SessionContext ctx, final boolean value)
	{
		setFilterPurchased( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PurchasedProductReferencesComponent.filterPurchased</code> attribute. 
	 * @param value the filterPurchased - Determines if only purchased products are displayed in the component.
	 */
	public void setFilterPurchased(final boolean value)
	{
		setFilterPurchased( getSession().getSessionContext(), value );
	}
	
}
