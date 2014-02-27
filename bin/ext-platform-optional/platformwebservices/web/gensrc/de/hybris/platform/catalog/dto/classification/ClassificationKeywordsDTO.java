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

import de.hybris.platform.catalog.dto.classification.ClassificationKeywordDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ClassificationKeyword first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "classificationkeywords")
public class ClassificationKeywordsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ClassificationKeywordDTO*/
	private List<ClassificationKeywordDTO>  classificationkeywordsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationKeywordsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationKeywordsDTO(final List<ClassificationKeywordDTO> classificationkeywordsList)
	{
		super();
		this.classificationkeywordsList=classificationkeywordsList;
	}
	
	
	/**
	 * @return the classificationkeywords
	 */
	@XmlElement(name = "classificationkeyword")
	public List<ClassificationKeywordDTO> getClassificationKeywords()
	{
		return	classificationkeywordsList;
	}
	
	/**
	 * @param classificationkeywordsList 
	 *  the classificationkeywordsList to set   
	 */
	public void setClassificationKeywords(final List<ClassificationKeywordDTO> classificationkeywordsList)
	{
		this.classificationkeywordsList=classificationkeywordsList;
	}
	
}
