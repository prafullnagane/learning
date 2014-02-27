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
package de.hybris.platform.core.dto.link;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.core.model.link.LinkModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Link first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = LinkModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "link")
public class LinkDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Link.sequenceNumber</code> attribute defined at extension <code> */
	private java.lang.Integer _sequenceNumber;
	/** <i>Generated variable</i> - Variable of <code>Link.source</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _source;
	/** <i>Generated variable</i> - Variable of <code>Link.qualifier</code> attribute defined at extension <code> */
	private java.lang.String _qualifier;
	/** <i>Generated variable</i> - Variable of <code>Link.language</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.LanguageDTO _language;
	/** <i>Generated variable</i> - Variable of <code>Link.target</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _target;
	/** <i>Generated variable</i> - Variable of <code>Link.reverseSequenceNumber</code> attribute defined at extension <code> */
	private java.lang.Integer _reverseSequenceNumber;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LinkDTO()
	{
		super();
	}
	
	
	public LanguageDTO getLanguage()
	{
		return this._language;
	}
	
	public String getQualifier()
	{
		return this._qualifier;
	}
	
	public Integer getReverseSequenceNumber()
	{
		return this._reverseSequenceNumber;
	}
	
	public Integer getSequenceNumber()
	{
		return this._sequenceNumber;
	}
	
	public ItemDTO getSource()
	{
		return this._source;
	}
	
	public ItemDTO getTarget()
	{
		return this._target;
	}
	
	public void setLanguage(final LanguageDTO value)
	{
		this.modifiedPropsSet.add("language");
		this._language = value;
	}
	
	public void setQualifier(final String value)
	{
		this.modifiedPropsSet.add("qualifier");
		this._qualifier = value;
	}
	
	public void setReverseSequenceNumber(final Integer value)
	{
		this.modifiedPropsSet.add("reverseSequenceNumber");
		this._reverseSequenceNumber = value;
	}
	
	public void setSequenceNumber(final Integer value)
	{
		this.modifiedPropsSet.add("sequenceNumber");
		this._sequenceNumber = value;
	}
	
	public void setSource(final ItemDTO value)
	{
		this.modifiedPropsSet.add("source");
		this._source = value;
	}
	
	public void setTarget(final ItemDTO value)
	{
		this.modifiedPropsSet.add("target");
		this._target = value;
	}
	
}
