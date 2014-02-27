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
package de.hybris.platform.cockpit.reports.dto;

import de.hybris.platform.cockpit.reports.dto.CompiledJasperMediaDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CompiledJasperMedia first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "compiledjaspermedias")
public class CompiledJasperMediasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CompiledJasperMediaDTO*/
	private List<CompiledJasperMediaDTO>  compiledjaspermediasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompiledJasperMediasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompiledJasperMediasDTO(final List<CompiledJasperMediaDTO> compiledjaspermediasList)
	{
		super();
		this.compiledjaspermediasList=compiledjaspermediasList;
	}
	
	
	/**
	 * @return the compiledjaspermedias
	 */
	@XmlElement(name = "compiledjaspermedia")
	public List<CompiledJasperMediaDTO> getCompiledJasperMedias()
	{
		return	compiledjaspermediasList;
	}
	
	/**
	 * @param compiledjaspermediasList 
	 *  the compiledjaspermediasList to set   
	 */
	public void setCompiledJasperMedias(final List<CompiledJasperMediaDTO> compiledjaspermediasList)
	{
		this.compiledjaspermediasList=compiledjaspermediasList;
	}
	
}
