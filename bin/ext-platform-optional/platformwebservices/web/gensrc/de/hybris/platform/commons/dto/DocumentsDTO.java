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
package de.hybris.platform.commons.dto;

import de.hybris.platform.commons.dto.DocumentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Document first defined at extension commons
 */
@SuppressWarnings("all")
@XmlRootElement(name = "documents")
public class DocumentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DocumentDTO*/
	private List<DocumentDTO>  documentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DocumentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DocumentsDTO(final List<DocumentDTO> documentsList)
	{
		super();
		this.documentsList=documentsList;
	}
	
	
	/**
	 * @return the documents
	 */
	@XmlElement(name = "document")
	public List<DocumentDTO> getDocuments()
	{
		return	documentsList;
	}
	
	/**
	 * @param documentsList 
	 *  the documentsList to set   
	 */
	public void setDocuments(final List<DocumentDTO> documentsList)
	{
		this.documentsList=documentsList;
	}
	
}
