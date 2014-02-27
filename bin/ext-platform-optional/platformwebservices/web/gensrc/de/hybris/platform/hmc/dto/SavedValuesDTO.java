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
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.hmc.dto.SavedValueEntryDTO;
import de.hybris.platform.hmc.model.SavedValuesModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Date;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SavedValues first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = SavedValuesModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "savedvalues")
public class SavedValuesDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SavedValues.savedValuesEntries</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.hmc.dto.SavedValueEntryDTO> _savedValuesEntries;
	/** <i>Generated variable</i> - Variable of <code>SavedValues.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	/** <i>Generated variable</i> - Variable of <code>SavedValues.modifiedItemType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _modifiedItemType;
	/** <i>Generated variable</i> - Variable of <code>SavedValues.changedAttributes</code> attribute defined at extension <code> */
	private java.lang.String _changedAttributes;
	/** <i>Generated variable</i> - Variable of <code>SavedValues.modificationType</code> attribute defined at extension <code> */
	private java.lang.String _modificationType;
	/** <i>Generated variable</i> - Variable of <code>SavedValues.numberOfChangedAttributes</code> attribute defined at extension <code> */
	private java.lang.Integer _numberOfChangedAttributes;
	/** <i>Generated variable</i> - Variable of <code>SavedValues.modifiedItem</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _modifiedItem;
	/** <i>Generated variable</i> - Variable of <code>SavedValues.modifiedItemDisplayString</code> attribute defined at extension <code> */
	private java.lang.String _modifiedItemDisplayString;
	/** <i>Generated variable</i> - Variable of <code>SavedValues.timestamp</code> attribute defined at extension <code> */
	private java.util.Date _timestamp;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SavedValuesDTO()
	{
		super();
	}
	
	
	public String getChangedAttributes()
	{
		return this._changedAttributes;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getModificationType()
	{
		return this._modificationType;
	}
	
	public ItemDTO getModifiedItem()
	{
		return this._modifiedItem;
	}
	
	public String getModifiedItemDisplayString()
	{
		return this._modifiedItemDisplayString;
	}
	
	public ComposedTypeDTO getModifiedItemType()
	{
		return this._modifiedItemType;
	}
	
	public Integer getNumberOfChangedAttributes()
	{
		return this._numberOfChangedAttributes;
	}
	
	@XmlElementWrapper(name = "savedValuesEntries")
	@XmlElement(name = "savedValueEntry")
	public Set<SavedValueEntryDTO> getSavedValuesEntries()
	{
		return this._savedValuesEntries;
	}
	
	public Date getTimestamp()
	{
		return this._timestamp;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	public void setChangedAttributes(final String value)
	{
		this.modifiedPropsSet.add("changedAttributes");
		this._changedAttributes = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setModificationType(final String value)
	{
		this.modifiedPropsSet.add("modificationType");
		this._modificationType = value;
	}
	
	public void setModifiedItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("modifiedItem");
		this._modifiedItem = value;
	}
	
	public void setModifiedItemDisplayString(final String value)
	{
		this.modifiedPropsSet.add("modifiedItemDisplayString");
		this._modifiedItemDisplayString = value;
	}
	
	public void setModifiedItemType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("modifiedItemType");
		this._modifiedItemType = value;
	}
	
	public void setNumberOfChangedAttributes(final Integer value)
	{
		this.modifiedPropsSet.add("numberOfChangedAttributes");
		this._numberOfChangedAttributes = value;
	}
	
	public void setSavedValuesEntries(final Set<SavedValueEntryDTO> value)
	{
		this.modifiedPropsSet.add("savedValuesEntries");
		this._savedValuesEntries = value;
	}
	
	public void setTimestamp(final Date value)
	{
		this.modifiedPropsSet.add("timestamp");
		this._timestamp = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
}
