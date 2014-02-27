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
package de.hybris.platform.cms2.dto.relations;

import de.hybris.platform.cms2.dto.relations.CMSRelationDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSRelation first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmsrelations")
public class CMSRelationsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSRelationDTO*/
	private List<CMSRelationDTO>  cmsrelationsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSRelationsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSRelationsDTO(final List<CMSRelationDTO> cmsrelationsList)
	{
		super();
		this.cmsrelationsList=cmsrelationsList;
	}
	
	
	/**
	 * @return the cmsrelations
	 */
	@XmlElement(name = "cmsrelation")
	public List<CMSRelationDTO> getCMSRelations()
	{
		return	cmsrelationsList;
	}
	
	/**
	 * @param cmsrelationsList 
	 *  the cmsrelationsList to set   
	 */
	public void setCMSRelations(final List<CMSRelationDTO> cmsrelationsList)
	{
		this.cmsrelationsList=cmsrelationsList;
	}
	
}
