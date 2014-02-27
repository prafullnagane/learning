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

import de.hybris.platform.catalog.dto.classification.ClassificationAttributeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ClassificationAttribute first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "classificationattributes")
public class ClassificationAttributesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ClassificationAttributeDTO*/
	private List<ClassificationAttributeDTO>  classificationattributesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationAttributesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationAttributesDTO(final List<ClassificationAttributeDTO> classificationattributesList)
	{
		super();
		this.classificationattributesList=classificationattributesList;
	}
	
	
	/**
	 * @return the classificationattributes
	 */
	@XmlElement(name = "classificationattribute")
	public List<ClassificationAttributeDTO> getClassificationAttributes()
	{
		return	classificationattributesList;
	}
	
	/**
	 * @param classificationattributesList 
	 *  the classificationattributesList to set   
	 */
	public void setClassificationAttributes(final List<ClassificationAttributeDTO> classificationattributesList)
	{
		this.classificationattributesList=classificationattributesList;
	}
	
}
