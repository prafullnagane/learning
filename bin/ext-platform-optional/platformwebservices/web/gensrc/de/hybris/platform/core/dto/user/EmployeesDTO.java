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

import de.hybris.platform.core.dto.user.EmployeeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Employee first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "employees")
public class EmployeesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>EmployeeDTO*/
	private List<EmployeeDTO>  employeesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmployeesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmployeesDTO(final List<EmployeeDTO> employeesList)
	{
		super();
		this.employeesList=employeesList;
	}
	
	
	/**
	 * @return the employees
	 */
	@XmlElement(name = "employee")
	public List<EmployeeDTO> getEmployees()
	{
		return	employeesList;
	}
	
	/**
	 * @param employeesList 
	 *  the employeesList to set   
	 */
	public void setEmployees(final List<EmployeeDTO> employeesList)
	{
		this.employeesList=employeesList;
	}
	
}
