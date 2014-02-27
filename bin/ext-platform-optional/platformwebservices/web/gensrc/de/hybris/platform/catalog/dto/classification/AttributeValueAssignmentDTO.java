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

import de.hybris.platform.catalog.dto.classification.ClassAttributeAssignmentDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationAttributeDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationAttributeValueDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationSystemVersionDTO;
import de.hybris.platform.catalog.model.classification.AttributeValueAssignmentModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AttributeValueAssignment first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = AttributeValueAssignmentModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "attributevalueassignment")
public class AttributeValueAssignmentDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AttributeValueAssignment.attribute</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.classification.ClassificationAttributeDTO _attribute;
	/** <i>Generated variable</i> - Variable of <code>AttributeValueAssignment.externalID</code> attribute defined at extension <code> */
	private java.lang.String _externalID;
	/** <i>Generated variable</i> - Variable of <code>AttributeValueAssignment.attributeAssignment</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.classification.ClassAttributeAssignmentDTO _attributeAssignment;
	/** <i>Generated variable</i> - Variable of <code>AttributeValueAssignment.position</code> attribute defined at extension <code> */
	private java.lang.Integer _position;
	/** <i>Generated variable</i> - Variable of <code>AttributeValueAssignment.systemVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.classification.ClassificationSystemVersionDTO _systemVersion;
	/** <i>Generated variable</i> - Variable of <code>AttributeValueAssignment.value</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.classification.ClassificationAttributeValueDTO _value;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AttributeValueAssignmentDTO()
	{
		super();
	}
	
	
	public ClassificationAttributeDTO getAttribute()
	{
		return this._attribute;
	}
	
	public ClassAttributeAssignmentDTO getAttributeAssignment()
	{
		return this._attributeAssignment;
	}
	
	public String getExternalID()
	{
		return this._externalID;
	}
	
	public Integer getPosition()
	{
		return this._position;
	}
	
	public ClassificationSystemVersionDTO getSystemVersion()
	{
		return this._systemVersion;
	}
	
	public ClassificationAttributeValueDTO getValue()
	{
		return this._value;
	}
	
	public void setAttribute(final ClassificationAttributeDTO value)
	{
		this.modifiedPropsSet.add("attribute");
		this._attribute = value;
	}
	
	public void setAttributeAssignment(final ClassAttributeAssignmentDTO value)
	{
		this.modifiedPropsSet.add("attributeAssignment");
		this._attributeAssignment = value;
	}
	
	public void setExternalID(final String value)
	{
		this.modifiedPropsSet.add("externalID");
		this._externalID = value;
	}
	
	public void setPosition(final Integer value)
	{
		this.modifiedPropsSet.add("position");
		this._position = value;
	}
	
	public void setSystemVersion(final ClassificationSystemVersionDTO value)
	{
		this.modifiedPropsSet.add("systemVersion");
		this._systemVersion = value;
	}
	
	public void setValue(final ClassificationAttributeValueDTO value)
	{
		this.modifiedPropsSet.add("value");
		this._value = value;
	}
	
}
