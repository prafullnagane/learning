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
package de.hybris.platform.catalog.model;

import de.hybris.platform.catalog.model.SyncItemJobModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SyncAttributeDescriptorConfig first defined at extension catalog.
 */
@SuppressWarnings("all")
public class SyncAttributeDescriptorConfigModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SyncAttributeDescriptorConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SyncAttributeDescriptorConfig.syncJob</code> attribute defined at extension <code>catalog</code>. */
	public static final String SYNCJOB = "syncJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>SyncAttributeDescriptorConfig.includedInSync</code> attribute defined at extension <code>catalog</code>. */
	public static final String INCLUDEDINSYNC = "includedInSync";
	
	/** <i>Generated constant</i> - Attribute key of <code>SyncAttributeDescriptorConfig.translateValue</code> attribute defined at extension <code>catalog</code>. */
	public static final String TRANSLATEVALUE = "translateValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>SyncAttributeDescriptorConfig.copyByValue</code> attribute defined at extension <code>catalog</code>. */
	public static final String COPYBYVALUE = "copyByValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>SyncAttributeDescriptorConfig.untranslatable</code> attribute defined at extension <code>catalog</code>. */
	public static final String UNTRANSLATABLE = "untranslatable";
	
	/** <i>Generated constant</i> - Attribute key of <code>SyncAttributeDescriptorConfig.presetValue</code> attribute defined at extension <code>catalog</code>. */
	public static final String PRESETVALUE = "presetValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>SyncAttributeDescriptorConfig.attributeDescriptor</code> attribute defined at extension <code>catalog</code>. */
	public static final String ATTRIBUTEDESCRIPTOR = "attributeDescriptor";
	
	
	/** <i>Generated variable</i> - Variable of <code>SyncAttributeDescriptorConfig.syncJob</code> attribute defined at extension <code>catalog</code>. */
	private SyncItemJobModel _syncJob;
	
	/** <i>Generated variable</i> - Variable of <code>SyncAttributeDescriptorConfig.includedInSync</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _includedInSync;
	
	/** <i>Generated variable</i> - Variable of <code>SyncAttributeDescriptorConfig.translateValue</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _translateValue;
	
	/** <i>Generated variable</i> - Variable of <code>SyncAttributeDescriptorConfig.copyByValue</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _copyByValue;
	
	/** <i>Generated variable</i> - Variable of <code>SyncAttributeDescriptorConfig.untranslatable</code> attribute defined at extension <code>catalog</code>. */
	private Boolean _untranslatable;
	
	/** <i>Generated variable</i> - Variable of <code>SyncAttributeDescriptorConfig.presetValue</code> attribute defined at extension <code>catalog</code>. */
	private Object _presetValue;
	
	/** <i>Generated variable</i> - Variable of <code>SyncAttributeDescriptorConfig.attributeDescriptor</code> attribute defined at extension <code>catalog</code>. */
	private AttributeDescriptorModel _attributeDescriptor;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SyncAttributeDescriptorConfigModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SyncAttributeDescriptorConfigModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _attributeDescriptor initial attribute declared by type <code>SyncAttributeDescriptorConfig</code> at extension <code>catalog</code>
	 * @param _copyByValue initial attribute declared by type <code>SyncAttributeDescriptorConfig</code> at extension <code>catalog</code>
	 * @param _syncJob initial attribute declared by type <code>SyncAttributeDescriptorConfig</code> at extension <code>catalog</code>
	 */
	@Deprecated
	public SyncAttributeDescriptorConfigModel(final AttributeDescriptorModel _attributeDescriptor, final Boolean _copyByValue, final SyncItemJobModel _syncJob)
	{
		super();
		setAttributeDescriptor(_attributeDescriptor);
		setCopyByValue(_copyByValue);
		setSyncJob(_syncJob);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _attributeDescriptor initial attribute declared by type <code>SyncAttributeDescriptorConfig</code> at extension <code>catalog</code>
	 * @param _copyByValue initial attribute declared by type <code>SyncAttributeDescriptorConfig</code> at extension <code>catalog</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _syncJob initial attribute declared by type <code>SyncAttributeDescriptorConfig</code> at extension <code>catalog</code>
	 */
	@Deprecated
	public SyncAttributeDescriptorConfigModel(final AttributeDescriptorModel _attributeDescriptor, final Boolean _copyByValue, final ItemModel _owner, final SyncItemJobModel _syncJob)
	{
		super();
		setAttributeDescriptor(_attributeDescriptor);
		setCopyByValue(_copyByValue);
		setOwner(_owner);
		setSyncJob(_syncJob);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SyncAttributeDescriptorConfig.attributeDescriptor</code> attribute defined at extension <code>catalog</code>. 
	 * @return the attributeDescriptor
	 */
	public AttributeDescriptorModel getAttributeDescriptor()
	{
		return _attributeDescriptor = getPersistenceContext().getValue(ATTRIBUTEDESCRIPTOR, _attributeDescriptor);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SyncAttributeDescriptorConfig.copyByValue</code> attribute defined at extension <code>catalog</code>. 
	 * @return the copyByValue
	 */
	public Boolean getCopyByValue()
	{
		return _copyByValue = getPersistenceContext().getValue(COPYBYVALUE, _copyByValue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SyncAttributeDescriptorConfig.includedInSync</code> attribute defined at extension <code>catalog</code>. 
	 * @return the includedInSync
	 */
	public Boolean getIncludedInSync()
	{
		return _includedInSync = getPersistenceContext().getValue(INCLUDEDINSYNC, _includedInSync);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SyncAttributeDescriptorConfig.presetValue</code> attribute defined at extension <code>catalog</code>. 
	 * @return the presetValue
	 */
	public Object getPresetValue()
	{
		return _presetValue = getPersistenceContext().getValue(PRESETVALUE, _presetValue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SyncAttributeDescriptorConfig.syncJob</code> attribute defined at extension <code>catalog</code>. 
	 * @return the syncJob
	 */
	public SyncItemJobModel getSyncJob()
	{
		return _syncJob = getPersistenceContext().getValue(SYNCJOB, _syncJob);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SyncAttributeDescriptorConfig.translateValue</code> attribute defined at extension <code>catalog</code>. 
	 * @return the translateValue - deprecated: please use attribute untranslatable
	 */
	public Boolean getTranslateValue()
	{
		return _translateValue = getPersistenceContext().getValue(TRANSLATEVALUE, _translateValue);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SyncAttributeDescriptorConfig.untranslatable</code> attribute defined at extension <code>catalog</code>. 
	 * @return the untranslatable
	 */
	public Boolean getUntranslatable()
	{
		return _untranslatable = getPersistenceContext().getValue(UNTRANSLATABLE, _untranslatable);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SyncAttributeDescriptorConfig.attributeDescriptor</code> attribute defined at extension <code>catalog</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the attributeDescriptor
	 */
	public void setAttributeDescriptor(final AttributeDescriptorModel value)
	{
		_attributeDescriptor = getPersistenceContext().setValue(ATTRIBUTEDESCRIPTOR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SyncAttributeDescriptorConfig.copyByValue</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the copyByValue
	 */
	public void setCopyByValue(final Boolean value)
	{
		_copyByValue = getPersistenceContext().setValue(COPYBYVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SyncAttributeDescriptorConfig.includedInSync</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the includedInSync
	 */
	public void setIncludedInSync(final Boolean value)
	{
		_includedInSync = getPersistenceContext().setValue(INCLUDEDINSYNC, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SyncAttributeDescriptorConfig.presetValue</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the presetValue
	 */
	public void setPresetValue(final Object value)
	{
		_presetValue = getPersistenceContext().setValue(PRESETVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SyncAttributeDescriptorConfig.syncJob</code> attribute defined at extension <code>catalog</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the syncJob
	 */
	public void setSyncJob(final SyncItemJobModel value)
	{
		_syncJob = getPersistenceContext().setValue(SYNCJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SyncAttributeDescriptorConfig.translateValue</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the translateValue - deprecated: please use attribute untranslatable
	 */
	public void setTranslateValue(final Boolean value)
	{
		_translateValue = getPersistenceContext().setValue(TRANSLATEVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SyncAttributeDescriptorConfig.untranslatable</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the untranslatable
	 */
	public void setUntranslatable(final Boolean value)
	{
		_untranslatable = getPersistenceContext().setValue(UNTRANSLATABLE, value);
	}
	
}
