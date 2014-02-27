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

import de.hybris.platform.btg.dto.BTGConditionDTO;
import de.hybris.platform.btg.dto.BTGItemDTO;
import de.hybris.platform.btg.dto.BTGRuleResultDTO;
import de.hybris.platform.btg.dto.BTGSegmentDTO;
import de.hybris.platform.btg.model.BTGRuleModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGRule first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGRuleModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "btgrule")
public class BTGRuleDTO extends BTGItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGRule.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>BTGRule.ruleType</code> attribute defined at extension <code> */
	private java.lang.String _ruleType;
	/** <i>Generated variable</i> - Variable of <code>BTGRule.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>BTGRule.conditions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.btg.dto.BTGConditionDTO> _conditions;
	/** <i>Generated variable</i> - Variable of <code>BTGRule.results</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.btg.dto.BTGRuleResultDTO> _results;
	/** <i>Generated variable</i> - Variable of <code>BTGRule.segment</code> attribute defined at extension <code> */
	private de.hybris.platform.btg.dto.BTGSegmentDTO _segment;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGRuleDTO()
	{
		super();
	}
	
	
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "conditions")
	@XmlElement(name = "bTGCondition")
	public Collection<BTGConditionDTO> getConditions()
	{
		return this._conditions;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	@XmlElementWrapper(name = "results")
	@XmlElement(name = "bTGRuleResult")
	public Collection<BTGRuleResultDTO> getResults()
	{
		return this._results;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getRuleType()
	{
		return this._ruleType;
	}
	
	public BTGSegmentDTO getSegment()
	{
		return this._segment;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setConditions(final Collection<BTGConditionDTO> value)
	{
		this.modifiedPropsSet.add("conditions");
		this._conditions = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setResults(final Collection<BTGRuleResultDTO> value)
	{
		this.modifiedPropsSet.add("results");
		this._results = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setRuleType(final String value)
	{
		this.modifiedPropsSet.add("ruleType");
		this._ruleType = value;
	}
	
	public void setSegment(final BTGSegmentDTO value)
	{
		this.modifiedPropsSet.add("segment");
		this._segment = value;
	}
	
}
