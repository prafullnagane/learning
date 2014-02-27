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
package de.hybris.platform.catalog.dto.classification;

import de.hybris.platform.catalog.dto.classification.ClassificationAttributeUnitDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ClassificationAttributeUnit first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "classificationattributeunits")
public class ClassificationAttributeUnitsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ClassificationAttributeUnitDTO*/
	private List<ClassificationAttributeUnitDTO>  classificationattributeunitsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationAttributeUnitsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationAttributeUnitsDTO(final List<ClassificationAttributeUnitDTO> classificationattributeunitsList)
	{
		super();
		this.classificationattributeunitsList=classificationattributeunitsList;
	}
	
	
	/**
	 * @return the classificationattributeunits
	 */
	@XmlElement(name = "classificationattributeunit")
	public List<ClassificationAttributeUnitDTO> getClassificationAttributeUnits()
	{
		return	classificationattributeunitsList;
	}
	
	/**
	 * @param classificationattributeunitsList 
	 *  the classificationattributeunitsList to set   
	 */
	public void setClassificationAttributeUnits(final List<ClassificationAttributeUnitDTO> classificationattributeunitsList)
	{
		this.classificationattributeunitsList=classificationattributeunitsList;
	}
	
}
