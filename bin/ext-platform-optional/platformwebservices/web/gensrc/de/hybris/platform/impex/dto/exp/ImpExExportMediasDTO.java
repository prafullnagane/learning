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
package de.hybris.platform.impex.dto.exp;

import de.hybris.platform.impex.dto.exp.ImpExExportMediaDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ImpExExportMedia first defined at extension impex
 */
@SuppressWarnings("all")
@XmlRootElement(name = "impexexportmedias")
public class ImpExExportMediasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ImpExExportMediaDTO*/
	private List<ImpExExportMediaDTO>  impexexportmediasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExExportMediasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExExportMediasDTO(final List<ImpExExportMediaDTO> impexexportmediasList)
	{
		super();
		this.impexexportmediasList=impexexportmediasList;
	}
	
	
	/**
	 * @return the impexexportmedias
	 */
	@XmlElement(name = "impexexportmedia")
	public List<ImpExExportMediaDTO> getImpExExportMedias()
	{
		return	impexexportmediasList;
	}
	
	/**
	 * @param impexexportmediasList 
	 *  the impexexportmediasList to set   
	 */
	public void setImpExExportMedias(final List<ImpExExportMediaDTO> impexexportmediasList)
	{
		this.impexexportmediasList=impexexportmediasList;
	}
	
}
