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
package de.hybris.platform.solrfacetsearch.dto.redirect;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.solrfacetsearch.model.redirect.SolrAbstractKeywordRedirectModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrAbstractKeywordRedirect first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrAbstractKeywordRedirectModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "solrabstractkeywordredirect")
public class SolrAbstractKeywordRedirectDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrAbstractKeywordRedirect.hmcLabel</code> attribute defined at extension <code> */
	private java.lang.String _hmcLabel;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrAbstractKeywordRedirectDTO()
	{
		super();
	}
	
	
	public String getHmcLabel()
	{
		return this._hmcLabel;
	}
	
	public void setHmcLabel(final String value)
	{
		this.modifiedPropsSet.add("hmcLabel");
		this._hmcLabel = value;
	}
	
}
