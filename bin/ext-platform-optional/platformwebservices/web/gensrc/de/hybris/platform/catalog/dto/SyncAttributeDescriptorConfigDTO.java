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
package de.hybris.platform.catalog.dto;

import de.hybris.platform.catalog.dto.SyncItemJobDTO;
import de.hybris.platform.catalog.model.SyncAttributeDescriptorConfigModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.AttributeDescriptorDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SyncAttributeDescriptorConfig first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = SyncAttributeDescriptorConfigModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "syncattributedescriptorconfig")
public class SyncAttributeDescriptorConfigDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SyncAttributeDescriptorConfig.syncJob</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.SyncItemJobDTO _syncJob;
	/** <i>Generated variable</i> - Variable of <code>SyncAttributeDescriptorConfig.includedInSync</code> attribute defined at extension <code> */
	private java.lang.Boolean _includedInSync;
	/** <i>Generated variable</i> - Variable of <code>SyncAttributeDescriptorConfig.translateValue</code> attribute defined at extension <code> */
	private java.lang.Boolean _translateValue;
	/** <i>Generated variable</i> - Variable of <code>SyncAttributeDescriptorConfig.untranslatable</code> attribute defined at extension <code> */
	private java.lang.Boolean _untranslatable;
	/** <i>Generated variable</i> - Variable of <code>SyncAttributeDescriptorConfig.copyByValue</code> attribute defined at extension <code> */
	private java.lang.Boolean _copyByValue;
	/** <i>Generated variable</i> - Variable of <code>SyncAttributeDescriptorConfig.presetValue</code> attribute defined at extension <code> */
	private java.lang.Object _presetValue;
	/** <i>Generated variable</i> - Variable of <code>SyncAttributeDescriptorConfig.attributeDescriptor</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.AttributeDescriptorDTO _attributeDescriptor;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SyncAttributeDescriptorConfigDTO()
	{
		super();
	}
	
	
	public AttributeDescriptorDTO getAttributeDescriptor()
	{
		return this._attributeDescriptor;
	}
	
	public Boolean getCopyByValue()
	{
		return this._copyByValue;
	}
	
	public Boolean getIncludedInSync()
	{
		return this._includedInSync;
	}
	
	public Object getPresetValue()
	{
		return this._presetValue;
	}
	
	public SyncItemJobDTO getSyncJob()
	{
		return this._syncJob;
	}
	
	public Boolean getTranslateValue()
	{
		return this._translateValue;
	}
	
	public Boolean getUntranslatable()
	{
		return this._untranslatable;
	}
	
	public void setAttributeDescriptor(final AttributeDescriptorDTO value)
	{
		this.modifiedPropsSet.add("attributeDescriptor");
		this._attributeDescriptor = value;
	}
	
	public void setCopyByValue(final Boolean value)
	{
		this.modifiedPropsSet.add("copyByValue");
		this._copyByValue = value;
	}
	
	public void setIncludedInSync(final Boolean value)
	{
		this.modifiedPropsSet.add("includedInSync");
		this._includedInSync = value;
	}
	
	public void setPresetValue(final Object value)
	{
		this.modifiedPropsSet.add("presetValue");
		this._presetValue = value;
	}
	
	public void setSyncJob(final SyncItemJobDTO value)
	{
		this.modifiedPropsSet.add("syncJob");
		this._syncJob = value;
	}
	
	public void setTranslateValue(final Boolean value)
	{
		this.modifiedPropsSet.add("translateValue");
		this._translateValue = value;
	}
	
	public void setUntranslatable(final Boolean value)
	{
		this.modifiedPropsSet.add("untranslatable");
		this._untranslatable = value;
	}
	
}
