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
package de.hybris.platform.core.dto.user;

import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.store.BaseStoreDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Employee first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = EmployeeModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "employee")
public class EmployeeDTO extends UserDTO
{
	/** <i>Generated variable</i> - Variable of <code>Employee.ticketstores</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.store.BaseStoreDTO> _ticketstores;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmployeeDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "ticketstores")
	@XmlElement(name = "baseStore")
	public List<BaseStoreDTO> getTicketstores()
	{
		return this._ticketstores;
	}
	
	public void setTicketstores(final List<BaseStoreDTO> value)
	{
		this.modifiedPropsSet.add("ticketstores");
		this._ticketstores = value;
	}
	
}
