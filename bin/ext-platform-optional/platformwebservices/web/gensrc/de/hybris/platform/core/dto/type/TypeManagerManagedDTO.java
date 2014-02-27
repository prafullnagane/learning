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
package de.hybris.platform.core.dto.type;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.model.type.TypeManagerManagedModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type TypeManagerManaged first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = TypeManagerManagedModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "typemanagermanaged")
public class TypeManagerManagedDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>TypeManagerManaged.autocreate</code> attribute defined at extension <code> */
	private java.lang.Boolean _autocreate;
	/** <i>Generated variable</i> - Variable of <code>TypeManagerManaged.deprecated</code> attribute defined at extension <code> */
	private java.lang.Boolean _deprecated;
	/** <i>Generated variable</i> - Variable of <code>TypeManagerManaged.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>TypeManagerManaged.extensionName</code> attribute defined at extension <code> */
	private java.lang.String _extensionName;
	/** <i>Generated variable</i> - Variable of <code>TypeManagerManaged.generate</code> attribute defined at extension <code> */
	private java.lang.Boolean _generate;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypeManagerManagedDTO()
	{
		super();
	}
	
	
	public Boolean getAutocreate()
	{
		return this._autocreate;
	}
	
	public Boolean getDeprecated()
	{
		return this._deprecated;
	}
	
	public String getExtensionName()
	{
		return this._extensionName;
	}
	
	public Boolean getGenerate()
	{
		return this._generate;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public void setAutocreate(final Boolean value)
	{
		this.modifiedPropsSet.add("autocreate");
		this._autocreate = value;
	}
	
	public void setDeprecated(final Boolean value)
	{
		this.modifiedPropsSet.add("deprecated");
		this._deprecated = value;
	}
	
	public void setExtensionName(final String value)
	{
		this.modifiedPropsSet.add("extensionName");
		this._extensionName = value;
	}
	
	public void setGenerate(final Boolean value)
	{
		this.modifiedPropsSet.add("generate");
		this._generate = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
}
