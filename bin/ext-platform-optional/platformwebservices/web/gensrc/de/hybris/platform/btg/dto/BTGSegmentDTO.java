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

import de.hybris.platform.btg.dto.BTGItemDTO;
import de.hybris.platform.btg.dto.BTGRuleDTO;
import de.hybris.platform.btg.dto.BTGSegmentResultDTO;
import de.hybris.platform.btg.model.BTGSegmentModel;
import de.hybris.platform.cms2.dto.site.CMSSiteDTO;
import de.hybris.platform.servicelayer.dto.action.AbstractActionDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGSegment first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGSegmentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "btgsegment")
public class BTGSegmentDTO extends BTGItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.results</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.btg.dto.BTGSegmentResultDTO> _results;
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.activeFrom</code> attribute defined at extension <code> */
	private java.util.Date _activeFrom;
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.outputActions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.servicelayer.dto.action.AbstractActionDTO> _outputActions;
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.activeTo</code> attribute defined at extension <code> */
	private java.util.Date _activeTo;
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.scope</code> attribute defined at extension <code> */
	private java.lang.String _scope;
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.defaultResultScope</code> attribute defined at extension <code> */
	private java.lang.String _defaultResultScope;
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.defaultEvaluationMethod</code> attribute defined at extension <code> */
	private java.lang.String _defaultEvaluationMethod;
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.rules</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.btg.dto.BTGRuleDTO> _rules;
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.active</code> attribute defined at extension <code> */
	private java.lang.Boolean _active;
	/** <i>Generated variable</i> - Variable of <code>BTGSegment.sites</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.site.CMSSiteDTO> _sites;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGSegmentDTO()
	{
		super();
	}
	
	
	public Boolean getActive()
	{
		return this._active;
	}
	
	public Date getActiveFrom()
	{
		return this._activeFrom;
	}
	
	public Date getActiveTo()
	{
		return this._activeTo;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getDefaultEvaluationMethod()
	{
		return this._defaultEvaluationMethod;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getDefaultResultScope()
	{
		return this._defaultResultScope;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	@XmlElementWrapper(name = "outputActions")
	@XmlElement(name = "abstractAction")
	public Collection<AbstractActionDTO> getOutputActions()
	{
		return this._outputActions;
	}
	
	@XmlElementWrapper(name = "results")
	@XmlElement(name = "bTGSegmentResult")
	public Collection<BTGSegmentResultDTO> getResults()
	{
		return this._results;
	}
	
	@XmlElementWrapper(name = "rules")
	@XmlElement(name = "bTGRule")
	public Collection<BTGRuleDTO> getRules()
	{
		return this._rules;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getScope()
	{
		return this._scope;
	}
	
	@XmlElementWrapper(name = "sites")
	@XmlElement(name = "cMSSite")
	public Collection<CMSSiteDTO> getSites()
	{
		return this._sites;
	}
	
	public void setActive(final Boolean value)
	{
		this.modifiedPropsSet.add("active");
		this._active = value;
	}
	
	public void setActiveFrom(final Date value)
	{
		this.modifiedPropsSet.add("activeFrom");
		this._activeFrom = value;
	}
	
	public void setActiveTo(final Date value)
	{
		this.modifiedPropsSet.add("activeTo");
		this._activeTo = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setDefaultEvaluationMethod(final String value)
	{
		this.modifiedPropsSet.add("defaultEvaluationMethod");
		this._defaultEvaluationMethod = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setDefaultResultScope(final String value)
	{
		this.modifiedPropsSet.add("defaultResultScope");
		this._defaultResultScope = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setOutputActions(final Collection<AbstractActionDTO> value)
	{
		this.modifiedPropsSet.add("outputActions");
		this._outputActions = value;
	}
	
	public void setResults(final Collection<BTGSegmentResultDTO> value)
	{
		this.modifiedPropsSet.add("results");
		this._results = value;
	}
	
	public void setRules(final Collection<BTGRuleDTO> value)
	{
		this.modifiedPropsSet.add("rules");
		this._rules = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setScope(final String value)
	{
		this.modifiedPropsSet.add("scope");
		this._scope = value;
	}
	
	public void setSites(final Collection<CMSSiteDTO> value)
	{
		this.modifiedPropsSet.add("sites");
		this._sites = value;
	}
	
}
