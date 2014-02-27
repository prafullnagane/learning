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
package de.hybris.platform.servicelayer.internal.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.servicelayer.internal.model.IndexTestItemModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type IndexTestItem first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = IndexTestItemModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "indextestitem")
public class IndexTestItemDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>IndexTestItem.column4</code> attribute defined at extension <code> */
	private java.lang.Short _column4;
	/** <i>Generated variable</i> - Variable of <code>IndexTestItem.column3</code> attribute defined at extension <code> */
	private java.lang.Short _column3;
	/** <i>Generated variable</i> - Variable of <code>IndexTestItem.column2</code> attribute defined at extension <code> */
	private java.lang.Short _column2;
	/** <i>Generated variable</i> - Variable of <code>IndexTestItem.column5</code> attribute defined at extension <code> */
	private java.lang.Short _column5;
	/** <i>Generated variable</i> - Variable of <code>IndexTestItem.column1</code> attribute defined at extension <code> */
	private java.lang.Short _column1;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public IndexTestItemDTO()
	{
		super();
	}
	
	
	public Short getColumn1()
	{
		return this._column1;
	}
	
	public Short getColumn2()
	{
		return this._column2;
	}
	
	public Short getColumn3()
	{
		return this._column3;
	}
	
	public Short getColumn4()
	{
		return this._column4;
	}
	
	public Short getColumn5()
	{
		return this._column5;
	}
	
	public void setColumn1(final Short value)
	{
		this.modifiedPropsSet.add("column1");
		this._column1 = value;
	}
	
	public void setColumn2(final Short value)
	{
		this.modifiedPropsSet.add("column2");
		this._column2 = value;
	}
	
	public void setColumn3(final Short value)
	{
		this.modifiedPropsSet.add("column3");
		this._column3 = value;
	}
	
	public void setColumn4(final Short value)
	{
		this.modifiedPropsSet.add("column4");
		this._column4 = value;
	}
	
	public void setColumn5(final Short value)
	{
		this.modifiedPropsSet.add("column5");
		this._column5 = value;
	}
	
}
