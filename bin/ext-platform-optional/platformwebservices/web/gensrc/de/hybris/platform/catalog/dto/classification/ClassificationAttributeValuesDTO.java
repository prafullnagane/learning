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

import de.hybris.platform.catalog.dto.classification.ClassificationAttributeValueDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ClassificationAttributeValue first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "classificationattributevalues")
public class ClassificationAttributeValuesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ClassificationAttributeValueDTO*/
	private List<ClassificationAttributeValueDTO>  classificationattributevaluesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationAttributeValuesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationAttributeValuesDTO(final List<ClassificationAttributeValueDTO> classificationattributevaluesList)
	{
		super();
		this.classificationattributevaluesList=classificationattributevaluesList;
	}
	
	
	/**
	 * @return the classificationattributevalues
	 */
	@XmlElement(name = "classificationattributevalue")
	public List<ClassificationAttributeValueDTO> getClassificationAttributeValues()
	{
		return	classificationattributevaluesList;
	}
	
	/**
	 * @param classificationattributevaluesList 
	 *  the classificationattributevaluesList to set   
	 */
	public void setClassificationAttributeValues(final List<ClassificationAttributeValueDTO> classificationattributevaluesList)
	{
		this.classificationattributevaluesList=classificationattributevaluesList;
	}
	
}
