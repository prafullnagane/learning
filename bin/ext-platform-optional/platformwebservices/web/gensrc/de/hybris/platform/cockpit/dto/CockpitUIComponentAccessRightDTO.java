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

import de.hybris.platform.cockpit.model.CockpitUIComponentAccessRightModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CockpitUIComponentAccessRight first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = CockpitUIComponentAccessRightModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "cockpituicomponentaccessright")
public class CockpitUIComponentAccessRightDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CockpitUIComponentAccessRight.readPrincipals</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.security.PrincipalDTO> _readPrincipals;
	/** <i>Generated variable</i> - Variable of <code>CockpitUIComponentAccessRight.writePrincipals</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.security.PrincipalDTO> _writePrincipals;
	/** <i>Generated variable</i> - Variable of <code>CockpitUIComponentAccessRight.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitUIComponentAccessRightDTO()
	{
		super();
	}
	
	
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "readPrincipals")
	@XmlElement(name = "principal")
	public Collection<PrincipalDTO> getReadPrincipals()
	{
		return this._readPrincipals;
	}
	
	@XmlElementWrapper(name = "writePrincipals")
	@XmlElement(name = "principal")
	public Collection<PrincipalDTO> getWritePrincipals()
	{
		return this._writePrincipals;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setReadPrincipals(final Collection<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("readPrincipals");
		this._readPrincipals = value;
	}
	
	public void setWritePrincipals(final Collection<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("writePrincipals");
		this._writePrincipals = value;
	}
	
}
