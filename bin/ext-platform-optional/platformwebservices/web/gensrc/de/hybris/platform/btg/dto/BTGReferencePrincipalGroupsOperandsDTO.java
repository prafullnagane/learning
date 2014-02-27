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
package de.hybris.platform.btg.dto;

import de.hybris.platform.btg.dto.BTGReferencePrincipalGroupsOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGReferencePrincipalGroupsOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgreferenceprincipalgroupsoperands")
public class BTGReferencePrincipalGroupsOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGReferencePrincipalGroupsOperandDTO*/
	private List<BTGReferencePrincipalGroupsOperandDTO>  btgreferenceprincipalgroupsoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferencePrincipalGroupsOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferencePrincipalGroupsOperandsDTO(final List<BTGReferencePrincipalGroupsOperandDTO> btgreferenceprincipalgroupsoperandsList)
	{
		super();
		this.btgreferenceprincipalgroupsoperandsList=btgreferenceprincipalgroupsoperandsList;
	}
	
	
	/**
	 * @return the btgreferenceprincipalgroupsoperands
	 */
	@XmlElement(name = "btgreferenceprincipalgroupsoperand")
	public List<BTGReferencePrincipalGroupsOperandDTO> getBTGReferencePrincipalGroupsOperands()
	{
		return	btgreferenceprincipalgroupsoperandsList;
	}
	
	/**
	 * @param btgreferenceprincipalgroupsoperandsList 
	 *  the btgreferenceprincipalgroupsoperandsList to set   
	 */
	public void setBTGReferencePrincipalGroupsOperands(final List<BTGReferencePrincipalGroupsOperandDTO> btgreferenceprincipalgroupsoperandsList)
	{
		this.btgreferenceprincipalgroupsoperandsList=btgreferenceprincipalgroupsoperandsList;
	}
	
}
