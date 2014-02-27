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

import de.hybris.platform.catalog.dto.classification.ClassificationClassDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ClassificationClass first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "classificationclasses")
public class ClassificationClassesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ClassificationClassDTO*/
	private List<ClassificationClassDTO>  classificationclassesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationClassesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationClassesDTO(final List<ClassificationClassDTO> classificationclassesList)
	{
		super();
		this.classificationclassesList=classificationclassesList;
	}
	
	
	/**
	 * @return the classificationclasses
	 */
	@XmlElement(name = "classificationclass")
	public List<ClassificationClassDTO> getClassificationClasses()
	{
		return	classificationclassesList;
	}
	
	/**
	 * @param classificationclassesList 
	 *  the classificationclassesList to set   
	 */
	public void setClassificationClasses(final List<ClassificationClassDTO> classificationclassesList)
	{
		this.classificationclassesList=classificationclassesList;
	}
	
}
