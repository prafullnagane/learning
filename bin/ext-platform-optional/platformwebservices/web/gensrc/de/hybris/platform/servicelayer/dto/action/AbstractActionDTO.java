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
package de.hybris.platform.servicelayer.dto.action;

import de.hybris.platform.btg.dto.BTGSegmentDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.servicelayer.model.action.AbstractActionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractAction first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractActionModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "abstractaction")
public class AbstractActionDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractAction.target</code> attribute defined at extension <code> */
	private java.lang.String _target;
	/** <i>Generated variable</i> - Variable of <code>AbstractAction.type</code> attribute defined at extension <code> */
	private java.lang.String _type;
	/** <i>Generated variable</i> - Variable of <code>AbstractAction.segment</code> attribute defined at extension <code> */
	private de.hybris.platform.btg.dto.BTGSegmentDTO _segment;
	/** <i>Generated variable</i> - Variable of <code>AbstractAction.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractActionDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public BTGSegmentDTO getSegment()
	{
		return this._segment;
	}
	
	public String getTarget()
	{
		return this._target;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getType()
	{
		return this._type;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setSegment(final BTGSegmentDTO value)
	{
		this.modifiedPropsSet.add("segment");
		this._segment = value;
	}
	
	public void setTarget(final String value)
	{
		this.modifiedPropsSet.add("target");
		this._target = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setType(final String value)
	{
		this.modifiedPropsSet.add("type");
		this._type = value;
	}
	
}
