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
package de.hybris.platform.core.dto.enumeration;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.model.enumeration.EnumerationValueModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type EnumerationValue first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = EnumerationValueModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "enumerationvalue")
public class EnumerationValueDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>EnumerationValue.sequenceNumber</code> attribute defined at extension <code> */
	private java.lang.Integer _sequenceNumber;
	/** <i>Generated variable</i> - Variable of <code>EnumerationValue.icon</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _icon;
	/** <i>Generated variable</i> - Variable of <code>EnumerationValue.deprecated</code> attribute defined at extension <code> */
	private java.lang.Boolean _deprecated;
	/** <i>Generated variable</i> - Variable of <code>EnumerationValue.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>EnumerationValue.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>EnumerationValue.extensionName</code> attribute defined at extension <code> */
	private java.lang.String _extensionName;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EnumerationValueDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public Boolean getDeprecated()
	{
		return this._deprecated;
	}
	
	public String getExtensionName()
	{
		return this._extensionName;
	}
	
	public MediaDTO getIcon()
	{
		return this._icon;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public Integer getSequenceNumber()
	{
		return this._sequenceNumber;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
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
	
	public void setIcon(final MediaDTO value)
	{
		this.modifiedPropsSet.add("icon");
		this._icon = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setSequenceNumber(final Integer value)
	{
		this.modifiedPropsSet.add("sequenceNumber");
		this._sequenceNumber = value;
	}
	
}
