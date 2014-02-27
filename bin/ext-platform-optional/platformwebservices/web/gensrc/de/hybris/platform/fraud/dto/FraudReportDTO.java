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
package de.hybris.platform.fraud.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.order.OrderDTO;
import de.hybris.platform.fraud.dto.FraudSymptomScoringDTO;
import de.hybris.platform.fraud.model.FraudReportModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type FraudReport first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = FraudReportModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "fraudreport")
public class FraudReportDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>FraudReport.order</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.OrderDTO _order;
	/** <i>Generated variable</i> - Variable of <code>FraudReport.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>FraudReport.status</code> attribute defined at extension <code> */
	private java.lang.String _status;
	/** <i>Generated variable</i> - Variable of <code>FraudReport.timestamp</code> attribute defined at extension <code> */
	private java.util.Date _timestamp;
	/** <i>Generated variable</i> - Variable of <code>FraudReport.explanation</code> attribute defined at extension <code> */
	private java.lang.String _explanation;
	/** <i>Generated variable</i> - Variable of <code>FraudReport.fraudSymptomScorings</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.fraud.dto.FraudSymptomScoringDTO> _fraudSymptomScorings;
	/** <i>Generated variable</i> - Variable of <code>FraudReport.provider</code> attribute defined at extension <code> */
	private java.lang.String _provider;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FraudReportDTO()
	{
		super();
	}
	
	
	public String getCode()
	{
		return this._code;
	}
	
	public String getExplanation()
	{
		return this._explanation;
	}
	
	@XmlElementWrapper(name = "fraudSymptomScorings")
	@XmlElement(name = "fraudSymptomScoring")
	public List<FraudSymptomScoringDTO> getFraudSymptomScorings()
	{
		return this._fraudSymptomScorings;
	}
	
	public OrderDTO getOrder()
	{
		return this._order;
	}
	
	public String getProvider()
	{
		return this._provider;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getStatus()
	{
		return this._status;
	}
	
	public Date getTimestamp()
	{
		return this._timestamp;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setExplanation(final String value)
	{
		this.modifiedPropsSet.add("explanation");
		this._explanation = value;
	}
	
	public void setFraudSymptomScorings(final List<FraudSymptomScoringDTO> value)
	{
		this.modifiedPropsSet.add("fraudSymptomScorings");
		this._fraudSymptomScorings = value;
	}
	
	public void setOrder(final OrderDTO value)
	{
		this.modifiedPropsSet.add("order");
		this._order = value;
	}
	
	public void setProvider(final String value)
	{
		this.modifiedPropsSet.add("provider");
		this._provider = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setStatus(final String value)
	{
		this.modifiedPropsSet.add("status");
		this._status = value;
	}
	
	public void setTimestamp(final Date value)
	{
		this.modifiedPropsSet.add("timestamp");
		this._timestamp = value;
	}
	
}
