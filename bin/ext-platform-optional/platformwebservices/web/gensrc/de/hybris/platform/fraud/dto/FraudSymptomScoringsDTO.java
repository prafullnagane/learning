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

import de.hybris.platform.fraud.dto.FraudSymptomScoringDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type FraudSymptomScoring first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "fraudsymptomscorings")
public class FraudSymptomScoringsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>FraudSymptomScoringDTO*/
	private List<FraudSymptomScoringDTO>  fraudsymptomscoringsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FraudSymptomScoringsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FraudSymptomScoringsDTO(final List<FraudSymptomScoringDTO> fraudsymptomscoringsList)
	{
		super();
		this.fraudsymptomscoringsList=fraudsymptomscoringsList;
	}
	
	
	/**
	 * @return the fraudsymptomscorings
	 */
	@XmlElement(name = "fraudsymptomscoring")
	public List<FraudSymptomScoringDTO> getFraudSymptomScorings()
	{
		return	fraudsymptomscoringsList;
	}
	
	/**
	 * @param fraudsymptomscoringsList 
	 *  the fraudsymptomscoringsList to set   
	 */
	public void setFraudSymptomScorings(final List<FraudSymptomScoringDTO> fraudsymptomscoringsList)
	{
		this.fraudsymptomscoringsList=fraudsymptomscoringsList;
	}
	
}
