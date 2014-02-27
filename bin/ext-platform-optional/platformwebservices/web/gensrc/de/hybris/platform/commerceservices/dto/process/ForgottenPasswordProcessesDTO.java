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
package de.hybris.platform.commerceservices.dto.process;

import de.hybris.platform.commerceservices.dto.process.ForgottenPasswordProcessDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ForgottenPasswordProcess first defined at extension commerceservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "forgottenpasswordprocesses")
public class ForgottenPasswordProcessesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ForgottenPasswordProcessDTO*/
	private List<ForgottenPasswordProcessDTO>  forgottenpasswordprocessesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ForgottenPasswordProcessesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ForgottenPasswordProcessesDTO(final List<ForgottenPasswordProcessDTO> forgottenpasswordprocessesList)
	{
		super();
		this.forgottenpasswordprocessesList=forgottenpasswordprocessesList;
	}
	
	
	/**
	 * @return the forgottenpasswordprocesses
	 */
	@XmlElement(name = "forgottenpasswordprocess")
	public List<ForgottenPasswordProcessDTO> getForgottenPasswordProcesses()
	{
		return	forgottenpasswordprocessesList;
	}
	
	/**
	 * @param forgottenpasswordprocessesList 
	 *  the forgottenpasswordprocessesList to set   
	 */
	public void setForgottenPasswordProcesses(final List<ForgottenPasswordProcessDTO> forgottenpasswordprocessesList)
	{
		this.forgottenpasswordprocessesList=forgottenpasswordprocessesList;
	}
	
}
