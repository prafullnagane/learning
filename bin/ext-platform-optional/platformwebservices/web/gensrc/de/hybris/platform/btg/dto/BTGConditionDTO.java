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

import de.hybris.platform.btg.dto.BTGConditionResultDTO;
import de.hybris.platform.btg.dto.BTGItemDTO;
import de.hybris.platform.btg.dto.BTGRuleDTO;
import de.hybris.platform.btg.model.BTGConditionModel;
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
 * Generated dto class for type BTGCondition first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGConditionModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "btgcondition")
public class BTGConditionDTO extends BTGItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGCondition.results</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.btg.dto.BTGConditionResultDTO> _results;
	/** <i>Generated variable</i> - Variable of <code>BTGCondition.evaluationScope</code> attribute defined at extension <code> */
	private java.lang.String _evaluationScope;
	/** <i>Generated variable</i> - Variable of <code>BTGCondition.rule</code> attribute defined at extension <code> */
	private de.hybris.platform.btg.dto.BTGRuleDTO _rule;
	/** <i>Generated variable</i> - Variable of <code>BTGCondition.beanId</code> attribute defined at extension <code> */
	private java.lang.String _beanId;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGConditionDTO()
	{
		super();
	}
	
	
	public String getBeanId()
	{
		return this._beanId;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getEvaluationScope()
	{
		return this._evaluationScope;
	}
	
	@XmlElementWrapper(name = "results")
	@XmlElement(name = "bTGConditionResult")
	public Collection<BTGConditionResultDTO> getResults()
	{
		return this._results;
	}
	
	public BTGRuleDTO getRule()
	{
		return this._rule;
	}
	
	public void setBeanId(final String value)
	{
		this.modifiedPropsSet.add("beanId");
		this._beanId = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setEvaluationScope(final String value)
	{
		this.modifiedPropsSet.add("evaluationScope");
		this._evaluationScope = value;
	}
	
	public void setResults(final Collection<BTGConditionResultDTO> value)
	{
		this.modifiedPropsSet.add("results");
		this._results = value;
	}
	
	public void setRule(final BTGRuleDTO value)
	{
		this.modifiedPropsSet.add("rule");
		this._rule = value;
	}
	
}
