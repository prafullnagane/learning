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
package de.hybris.platform.core.dto.media;

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.model.media.MediaContainerModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type MediaContainer first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = MediaContainerModel.class, factory = GenericNodeFactory.class, uidProperties="qualifier")
@XmlRootElement(name = "mediacontainer")
public class MediaContainerDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>MediaContainer.medias</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.media.MediaDTO> _medias;
	/** <i>Generated variable</i> - Variable of <code>MediaContainer.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>MediaContainer.catalogVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _catalogVersion;
	/** <i>Generated variable</i> - Variable of <code>MediaContainer.qualifier</code> attribute defined at extension <code> */
	private java.lang.String _qualifier;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaContainerDTO()
	{
		super();
	}
	
	
	public CatalogVersionDTO getCatalogVersion()
	{
		return this._catalogVersion;
	}
	
	@XmlElementWrapper(name = "medias")
	@XmlElement(name = "media")
	public Collection<MediaDTO> getMedias()
	{
		return this._medias;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	@XmlAttribute
	public String getQualifier()
	{
		return this._qualifier;
	}
	
	public void setCatalogVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("catalogVersion");
		this._catalogVersion = value;
	}
	
	public void setMedias(final Collection<MediaDTO> value)
	{
		this.modifiedPropsSet.add("medias");
		this._medias = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setQualifier(final String value)
	{
		this.modifiedPropsSet.add("qualifier");
		this._qualifier = value;
	}
	
}
