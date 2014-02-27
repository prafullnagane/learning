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
package de.hybris.platform.cms2.dto.restrictions;

import de.hybris.platform.cms2.dto.restrictions.CMSCatalogRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSCatalogRestriction first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmscatalogrestrictions")
public class CMSCatalogRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSCatalogRestrictionDTO*/
	private List<CMSCatalogRestrictionDTO>  cmscatalogrestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSCatalogRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSCatalogRestrictionsDTO(final List<CMSCatalogRestrictionDTO> cmscatalogrestrictionsList)
	{
		super();
		this.cmscatalogrestrictionsList=cmscatalogrestrictionsList;
	}
	
	
	/**
	 * @return the cmscatalogrestrictions
	 */
	@XmlElement(name = "cmscatalogrestriction")
	public List<CMSCatalogRestrictionDTO> getCMSCatalogRestrictions()
	{
		return	cmscatalogrestrictionsList;
	}
	
	/**
	 * @param cmscatalogrestrictionsList 
	 *  the cmscatalogrestrictionsList to set   
	 */
	public void setCMSCatalogRestrictions(final List<CMSCatalogRestrictionDTO> cmscatalogrestrictionsList)
	{
		this.cmscatalogrestrictionsList=cmscatalogrestrictionsList;
	}
	
}
