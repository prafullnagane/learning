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
package de.hybris.platform.catalog.dto.classification;

import de.hybris.platform.catalog.dto.classification.ClassificationAttributeValueDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationClassDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationSystemVersionDTO;
import de.hybris.platform.catalog.model.classification.ClassificationAttributeModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ClassificationAttribute first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = ClassificationAttributeModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "classificationattribute")
public class ClassificationAttributeDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ClassificationAttribute.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>ClassificationAttribute.systemVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.classification.ClassificationSystemVersionDTO _systemVersion;
	/** <i>Generated variable</i> - Variable of <code>ClassificationAttribute.externalID</code> attribute defined at extension <code> */
	private java.lang.String _externalID;
	/** <i>Generated variable</i> - Variable of <code>ClassificationAttribute.classes</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.classification.ClassificationClassDTO> _classes;
	/** <i>Generated variable</i> - Variable of <code>ClassificationAttribute.defaultAttributeValues</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.classification.ClassificationAttributeValueDTO> _defaultAttributeValues;
	/** <i>Generated variable</i> - Variable of <code>ClassificationAttribute.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationAttributeDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "classes")
	@XmlElement(name = "classificationClass")
	public List<ClassificationClassDTO> getClasses()
	{
		return this._classes;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "defaultAttributeValues")
	@XmlElement(name = "classificationAttributeValue")
	public List<ClassificationAttributeValueDTO> getDefaultAttributeValues()
	{
		return this._defaultAttributeValues;
	}
	
	public String getExternalID()
	{
		return this._externalID;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public ClassificationSystemVersionDTO getSystemVersion()
	{
		return this._systemVersion;
	}
	
	public void setClasses(final List<ClassificationClassDTO> value)
	{
		this.modifiedPropsSet.add("classes");
		this._classes = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setDefaultAttributeValues(final List<ClassificationAttributeValueDTO> value)
	{
		this.modifiedPropsSet.add("defaultAttributeValues");
		this._defaultAttributeValues = value;
	}
	
	public void setExternalID(final String value)
	{
		this.modifiedPropsSet.add("externalID");
		this._externalID = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setSystemVersion(final ClassificationSystemVersionDTO value)
	{
		this.modifiedPropsSet.add("systemVersion");
		this._systemVersion = value;
	}
	
}
