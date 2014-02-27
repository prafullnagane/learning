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
package de.hybris.platform.cms2.dto.contents;

import de.hybris.platform.cms2.dto.contents.ContentCatalogDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ContentCatalog first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "contentcatalogs")
public class ContentCatalogsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ContentCatalogDTO*/
	private List<ContentCatalogDTO>  contentcatalogsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentCatalogsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentCatalogsDTO(final List<ContentCatalogDTO> contentcatalogsList)
	{
		super();
		this.contentcatalogsList=contentcatalogsList;
	}
	
	
	/**
	 * @return the contentcatalogs
	 */
	@XmlElement(name = "contentcatalog")
	public List<ContentCatalogDTO> getContentCatalogs()
	{
		return	contentcatalogsList;
	}
	
	/**
	 * @param contentcatalogsList 
	 *  the contentcatalogsList to set   
	 */
	public void setContentCatalogs(final List<ContentCatalogDTO> contentcatalogsList)
	{
		this.contentcatalogsList=contentcatalogsList;
	}
	
}
