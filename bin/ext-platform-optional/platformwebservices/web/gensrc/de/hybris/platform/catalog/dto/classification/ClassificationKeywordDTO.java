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
package de.hybris.platform.catalog.dto.classification;

import de.hybris.platform.catalog.dto.KeywordDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationSystemVersionDTO;
import de.hybris.platform.catalog.model.classification.ClassificationKeywordModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ClassificationKeyword first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = ClassificationKeywordModel.class, factory = GenericNodeFactory.class, uidProperties="keyword")
@XmlRootElement(name = "classificationkeyword")
public class ClassificationKeywordDTO extends KeywordDTO
{
	/** <i>Generated variable</i> - Variable of <code>ClassificationKeyword.externalID</code> attribute defined at extension <code> */
	private java.lang.String _externalID;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationKeywordDTO()
	{
		super();
	}
	
	
	@Override
	public ClassificationSystemVersionDTO getCatalogVersion()
	{
		return (de.hybris.platform.catalog.dto.classification.ClassificationSystemVersionDTO) super.getCatalogVersion();
	}
	
	public String getExternalID()
	{
		return this._externalID;
	}
	
	public void setExternalID(final String value)
	{
		this.modifiedPropsSet.add("externalID");
		this._externalID = value;
	}
	
}
