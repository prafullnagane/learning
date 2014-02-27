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
package de.hybris.platform.btg.dto;

import de.hybris.platform.btg.dto.ScriptMediaDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ScriptMedia first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "scriptmedias")
public class ScriptMediasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ScriptMediaDTO*/
	private List<ScriptMediaDTO>  scriptmediasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ScriptMediasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ScriptMediasDTO(final List<ScriptMediaDTO> scriptmediasList)
	{
		super();
		this.scriptmediasList=scriptmediasList;
	}
	
	
	/**
	 * @return the scriptmedias
	 */
	@XmlElement(name = "scriptmedia")
	public List<ScriptMediaDTO> getScriptMedias()
	{
		return	scriptmediasList;
	}
	
	/**
	 * @param scriptmediasList 
	 *  the scriptmediasList to set   
	 */
	public void setScriptMedias(final List<ScriptMediaDTO> scriptmediasList)
	{
		this.scriptmediasList=scriptmediasList;
	}
	
}
