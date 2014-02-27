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
import de.hybris.platform.validation.dto.constraints.AbstractConstraintDTO;
import de.hybris.platform.validation.model.constraints.ConstraintGroupModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Set;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ConstraintGroup first defined at extension validation
 */
@SuppressWarnings("all")
@GraphNode(target = ConstraintGroupModel.class, factory = GenericNodeFactory.class, uidProperties="interfaceName")
@XmlRootElement(name = "constraintgroup")
public class ConstraintGroupDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ConstraintGroup.constraints</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.validation.dto.constraints.AbstractConstraintDTO> _constraints;
	/** <i>Generated variable</i> - Variable of <code>ConstraintGroup.id</code> attribute defined at extension <code> */
	private java.lang.String _id;
	/** <i>Generated variable</i> - Variable of <code>ConstraintGroup.interfaceName</code> attribute defined at extension <code> */
	private java.lang.String _interfaceName;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConstraintGroupDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "constraints")
	@XmlElement(name = "abstractConstraint")
	public Set<AbstractConstraintDTO> getConstraints()
	{
		return this._constraints;
	}
	
	public String getId()
	{
		return this._id;
	}
	
	@XmlAttribute
	public String getInterfaceName()
	{
		return this._interfaceName;
	}
	
	public void setConstraints(final Set<AbstractConstraintDTO> value)
	{
		this.modifiedPropsSet.add("constraints");
		this._constraints = value;
	}
	
	public void setId(final String value)
	{
		this.modifiedPropsSet.add("id");
		this._id = value;
	}
	
	public void setInterfaceName(final String value)
	{
		this.modifiedPropsSet.add("interfaceName");
		this._interfaceName = value;
	}
	
}
