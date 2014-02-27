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

import de.hybris.platform.catalog.dto.CatalogDTO;
import de.hybris.platform.cms2.dto.site.CMSSiteDTO;
import de.hybris.platform.cms2.model.contents.ContentCatalogModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ContentCatalog first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = ContentCatalogModel.class, factory = GenericNodeFactory.class, uidProperties="id")
@XmlRootElement(name = "contentcatalog")
public class ContentCatalogDTO extends CatalogDTO
{
	/** <i>Generated variable</i> - Variable of <code>ContentCatalog.cmsSites</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.site.CMSSiteDTO> _cmsSites;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentCatalogDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "cmsSites")
	@XmlElement(name = "cMSSite")
	public Collection<CMSSiteDTO> getCmsSites()
	{
		return this._cmsSites;
	}
	
	public void setCmsSites(final Collection<CMSSiteDTO> value)
	{
		this.modifiedPropsSet.add("cmsSites");
		this._cmsSites = value;
	}
	
}
