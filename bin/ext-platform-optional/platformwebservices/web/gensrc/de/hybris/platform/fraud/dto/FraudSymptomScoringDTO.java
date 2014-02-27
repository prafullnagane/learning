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
import de.hybris.platform.fraud.dto.FraudReportDTO;
import de.hybris.platform.fraud.model.FraudSymptomScoringModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type FraudSymptomScoring first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = FraudSymptomScoringModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "fraudsymptomscoring")
public class FraudSymptomScoringDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>FraudSymptomScoring.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>FraudSymptomScoring.fraudReport</code> attribute defined at extension <code> */
	private de.hybris.platform.fraud.dto.FraudReportDTO _fraudReport;
	/** <i>Generated variable</i> - Variable of <code>FraudSymptomScoring.explanation</code> attribute defined at extension <code> */
	private java.lang.String _explanation;
	/** <i>Generated variable</i> - Variable of <code>FraudSymptomScoring.score</code> attribute defined at extension <code> */
	private double _score;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FraudSymptomScoringDTO()
	{
		super();
	}
	
	
	public String getExplanation()
	{
		return this._explanation;
	}
	
	public FraudReportDTO getFraudReport()
	{
		return this._fraudReport;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public double getScore()
	{
		return this._score;
	}
	
	public void setExplanation(final String value)
	{
		this.modifiedPropsSet.add("explanation");
		this._explanation = value;
	}
	
	public void setFraudReport(final FraudReportDTO value)
	{
		this.modifiedPropsSet.add("fraudReport");
		this._fraudReport = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setScore(final double value)
	{
		this.modifiedPropsSet.add("score");
		this._score = value;
	}
	
}
