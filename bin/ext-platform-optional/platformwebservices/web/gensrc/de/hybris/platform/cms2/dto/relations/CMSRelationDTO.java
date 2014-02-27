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
package de.hybris.platform.cms2.dto.relations;

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.cms2.model.relations.CMSRelationModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CMSRelation first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = CMSRelationModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "cmsrelation")
public class CMSRelationDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSRelation.catalogVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _catalogVersion;
	/** <i>Generated variable</i> - Variable of <code>CMSRelation.uid</code> attribute defined at extension <code> */
	private java.lang.String _uid;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSRelationDTO()
	{
		super();
	}
	
	
	public CatalogVersionDTO getCatalogVersion()
	{
		return this._catalogVersion;
	}
	
	@XmlAttribute
	public String getUid()
	{
		return this._uid;
	}
	
	public void setCatalogVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("catalogVersion");
		this._catalogVersion = value;
	}
	
	public void setUid(final String value)
	{
		this.modifiedPropsSet.add("uid");
		this._uid = value;
	}
	
}
