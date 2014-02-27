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
package de.hybris.platform.validation.dto.constraints;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.validation.dto.constraints.ConstraintGroupDTO;
import de.hybris.platform.validation.model.constraints.AbstractConstraintModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Set;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractConstraintModel.class, factory = GenericNodeFactory.class, uidProperties="id")
@XmlRootElement(name = "abstractconstraint")
public class AbstractConstraintDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractConstraint.type</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _type;
	/** <i>Generated variable</i> - Variable of <code>AbstractConstraint.constraintGroups</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.validation.dto.constraints.ConstraintGroupDTO> _constraintGroups;
	/** <i>Generated variable</i> - Variable of <code>AbstractConstraint.needReload</code> attribute defined at extension <code> */
	private boolean _needReload;
	/** <i>Generated variable</i> - Variable of <code>AbstractConstraint.severity</code> attribute defined at extension <code> */
	private java.lang.String _severity;
	/** <i>Generated variable</i> - Variable of <code>AbstractConstraint.target</code> attribute defined at extension <code> */
	private java.lang.Class _target;
	/** <i>Generated variable</i> - Variable of <code>AbstractConstraint.annotation</code> attribute defined at extension <code> */
	private java.lang.Class _annotation;
	/** <i>Generated variable</i> - Variable of <code>AbstractConstraint.defaultMessage</code> attribute defined at extension <code> */
	private java.lang.String _defaultMessage;
	/** <i>Generated variable</i> - Variable of <code>AbstractConstraint.id</code> attribute defined at extension <code> */
	private java.lang.String _id;
	/** <i>Generated variable</i> - Variable of <code>AbstractConstraint.active</code> attribute defined at extension <code> */
	private boolean _active;
	/** <i>Generated variable</i> - Variable of <code>AbstractConstraint.message</code> attribute defined at extension <code> */
	private java.lang.String _message;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractConstraintDTO()
	{
		super();
	}
	
	
	public Class getAnnotation()
	{
		return this._annotation;
	}
	
	@XmlElementWrapper(name = "constraintGroups")
	@XmlElement(name = "constraintGroup")
	public Set<ConstraintGroupDTO> getConstraintGroups()
	{
		return this._constraintGroups;
	}
	
	public String getDefaultMessage()
	{
		return this._defaultMessage;
	}
	
	@XmlAttribute
	public String getId()
	{
		return this._id;
	}
	
	public String getMessage()
	{
		return this._message;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getSeverity()
	{
		return this._severity;
	}
	
	public Class getTarget()
	{
		return this._target;
	}
	
	public ComposedTypeDTO getType()
	{
		return this._type;
	}
	
	public boolean isActive()
	{
		return this._active;
	}
	
	public boolean isNeedReload()
	{
		return this._needReload;
	}
	
	public void setActive(final boolean value)
	{
		this.modifiedPropsSet.add("active");
		this._active = value;
	}
	
	public void setAnnotation(final Class value)
	{
		this.modifiedPropsSet.add("annotation");
		this._annotation = value;
	}
	
	public void setConstraintGroups(final Set<ConstraintGroupDTO> value)
	{
		this.modifiedPropsSet.add("constraintGroups");
		this._constraintGroups = value;
	}
	
	public void setDefaultMessage(final String value)
	{
		this.modifiedPropsSet.add("defaultMessage");
		this._defaultMessage = value;
	}
	
	public void setId(final String value)
	{
		this.modifiedPropsSet.add("id");
		this._id = value;
	}
	
	public void setMessage(final String value)
	{
		this.modifiedPropsSet.add("message");
		this._message = value;
	}
	
	public void setNeedReload(final boolean value)
	{
		this.modifiedPropsSet.add("needReload");
		this._needReload = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setSeverity(final String value)
	{
		this.modifiedPropsSet.add("severity");
		this._severity = value;
	}
	
	public void setTarget(final Class value)
	{
		this.modifiedPropsSet.add("target");
		this._target = value;
	}
	
	public void setType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("type");
		this._type = value;
	}
	
}
