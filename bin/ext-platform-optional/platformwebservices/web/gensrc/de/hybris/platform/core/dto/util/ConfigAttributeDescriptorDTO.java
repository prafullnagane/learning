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
package de.hybris.platform.core.dto.util;

import de.hybris.platform.core.dto.type.AttributeDescriptorDTO;
import de.hybris.platform.core.model.util.ConfigAttributeDescriptorModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ConfigAttributeDescriptor first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = ConfigAttributeDescriptorModel.class, factory = GenericNodeFactory.class, uidProperties="qualifier")
@XmlRootElement(name = "configattributedescriptor")
public class ConfigAttributeDescriptorDTO extends AttributeDescriptorDTO
{
	/** <i>Generated variable</i> - Variable of <code>ConfigAttributeDescriptor.externalQualifier</code> attribute defined at extension <code> */
	private java.lang.String _externalQualifier;
	/** <i>Generated variable</i> - Variable of <code>ConfigAttributeDescriptor.needRestart</code> attribute defined at extension <code> */
	private java.lang.Boolean _needRestart;
	/** <i>Generated variable</i> - Variable of <code>ConfigAttributeDescriptor.storeInDatabase</code> attribute defined at extension <code> */
	private java.lang.Boolean _storeInDatabase;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConfigAttributeDescriptorDTO()
	{
		super();
	}
	
	
	public String getExternalQualifier()
	{
		return this._externalQualifier;
	}
	
	public Boolean getNeedRestart()
	{
		return this._needRestart;
	}
	
	public Boolean getStoreInDatabase()
	{
		return this._storeInDatabase;
	}
	
	public void setExternalQualifier(final String value)
	{
		this.modifiedPropsSet.add("externalQualifier");
		this._externalQualifier = value;
	}
	
	public void setNeedRestart(final Boolean value)
	{
		this.modifiedPropsSet.add("needRestart");
		this._needRestart = value;
	}
	
	public void setStoreInDatabase(final Boolean value)
	{
		this.modifiedPropsSet.add("storeInDatabase");
		this._storeInDatabase = value;
	}
	
}
