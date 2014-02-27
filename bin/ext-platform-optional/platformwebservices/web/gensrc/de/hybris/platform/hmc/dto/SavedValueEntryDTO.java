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
package de.hybris.platform.hmc.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.AttributeDescriptorDTO;
import de.hybris.platform.hmc.dto.SavedValuesDTO;
import de.hybris.platform.hmc.model.SavedValueEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SavedValueEntry first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = SavedValueEntryModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "savedvalueentry")
public class SavedValueEntryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SavedValueEntry.modifiedAttribute</code> attribute defined at extension <code> */
	private java.lang.String _modifiedAttribute;
	/** <i>Generated variable</i> - Variable of <code>SavedValueEntry.newValue</code> attribute defined at extension <code> */
	private java.lang.Object _newValue;
	/** <i>Generated variable</i> - Variable of <code>SavedValueEntry.oldValue</code> attribute defined at extension <code> */
	private java.lang.Object _oldValue;
	/** <i>Generated variable</i> - Variable of <code>SavedValueEntry.parent</code> attribute defined at extension <code> */
	private de.hybris.platform.hmc.dto.SavedValuesDTO _parent;
	/** <i>Generated variable</i> - Variable of <code>SavedValueEntry.OldValueAttributeDescriptor</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.AttributeDescriptorDTO _OldValueAttributeDescriptor;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SavedValueEntryDTO()
	{
		super();
	}
	
	
	public String getModifiedAttribute()
	{
		return this._modifiedAttribute;
	}
	
	public Object getNewValue()
	{
		return this._newValue;
	}
	
	public Object getOldValue()
	{
		return this._oldValue;
	}
	
	public AttributeDescriptorDTO getOldValueAttributeDescriptor()
	{
		return this._OldValueAttributeDescriptor;
	}
	
	public SavedValuesDTO getParent()
	{
		return this._parent;
	}
	
	public void setModifiedAttribute(final String value)
	{
		this.modifiedPropsSet.add("modifiedAttribute");
		this._modifiedAttribute = value;
	}
	
	public void setNewValue(final Object value)
	{
		this.modifiedPropsSet.add("newValue");
		this._newValue = value;
	}
	
	public void setOldValue(final Object value)
	{
		this.modifiedPropsSet.add("oldValue");
		this._oldValue = value;
	}
	
	public void setOldValueAttributeDescriptor(final AttributeDescriptorDTO value)
	{
		this.modifiedPropsSet.add("OldValueAttributeDescriptor");
		this._OldValueAttributeDescriptor = value;
	}
	
	public void setParent(final SavedValuesDTO value)
	{
		this.modifiedPropsSet.add("parent");
		this._parent = value;
	}
	
}
