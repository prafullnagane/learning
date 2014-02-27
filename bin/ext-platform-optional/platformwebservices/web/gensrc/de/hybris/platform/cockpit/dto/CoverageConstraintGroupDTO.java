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
package de.hybris.platform.cockpit.dto;

import de.hybris.platform.cockpit.model.CoverageConstraintGroupModel;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.validation.dto.constraints.ConstraintGroupDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CoverageConstraintGroup first defined at extension validation
 */
@SuppressWarnings("all")
@GraphNode(target = CoverageConstraintGroupModel.class, factory = GenericNodeFactory.class, uidProperties="interfaceName")
@XmlRootElement(name = "coverageconstraintgroup")
public class CoverageConstraintGroupDTO extends ConstraintGroupDTO
{
	/** <i>Generated variable</i> - Variable of <code>CoverageConstraintGroup.coverageDomainID</code> attribute defined at extension <code> */
	private java.lang.String _coverageDomainID;
	/** <i>Generated variable</i> - Variable of <code>CoverageConstraintGroup.dedicatedTypes</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.core.dto.type.ComposedTypeDTO> _dedicatedTypes;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CoverageConstraintGroupDTO()
	{
		super();
	}
	
	
	public String getCoverageDomainID()
	{
		return this._coverageDomainID;
	}
	
	@XmlElementWrapper(name = "dedicatedTypes")
	@XmlElement(name = "composedType")
	public Set<ComposedTypeDTO> getDedicatedTypes()
	{
		return this._dedicatedTypes;
	}
	
	public void setCoverageDomainID(final String value)
	{
		this.modifiedPropsSet.add("coverageDomainID");
		this._coverageDomainID = value;
	}
	
	public void setDedicatedTypes(final Set<ComposedTypeDTO> value)
	{
		this.modifiedPropsSet.add("dedicatedTypes");
		this._dedicatedTypes = value;
	}
	
}
