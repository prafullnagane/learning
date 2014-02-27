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
package de.hybris.platform.catalog.dto;

import de.hybris.platform.catalog.dto.AgreementDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Agreement first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "agreements")
public class AgreementsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AgreementDTO*/
	private List<AgreementDTO>  agreementsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AgreementsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AgreementsDTO(final List<AgreementDTO> agreementsList)
	{
		super();
		this.agreementsList=agreementsList;
	}
	
	
	/**
	 * @return the agreements
	 */
	@XmlElement(name = "agreement")
	public List<AgreementDTO> getAgreements()
	{
		return	agreementsList;
	}
	
	/**
	 * @param agreementsList 
	 *  the agreementsList to set   
	 */
	public void setAgreements(final List<AgreementDTO> agreementsList)
	{
		this.agreementsList=agreementsList;
	}
	
}
