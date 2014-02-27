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

import de.hybris.platform.btg.dto.BTGUserMemberOfGroupsOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGUserMemberOfGroupsOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgusermemberofgroupsoperands")
public class BTGUserMemberOfGroupsOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGUserMemberOfGroupsOperandDTO*/
	private List<BTGUserMemberOfGroupsOperandDTO>  btgusermemberofgroupsoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGUserMemberOfGroupsOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGUserMemberOfGroupsOperandsDTO(final List<BTGUserMemberOfGroupsOperandDTO> btgusermemberofgroupsoperandsList)
	{
		super();
		this.btgusermemberofgroupsoperandsList=btgusermemberofgroupsoperandsList;
	}
	
	
	/**
	 * @return the btgusermemberofgroupsoperands
	 */
	@XmlElement(name = "btgusermemberofgroupsoperand")
	public List<BTGUserMemberOfGroupsOperandDTO> getBTGUserMemberOfGroupsOperands()
	{
		return	btgusermemberofgroupsoperandsList;
	}
	
	/**
	 * @param btgusermemberofgroupsoperandsList 
	 *  the btgusermemberofgroupsoperandsList to set   
	 */
	public void setBTGUserMemberOfGroupsOperands(final List<BTGUserMemberOfGroupsOperandDTO> btgusermemberofgroupsoperandsList)
	{
		this.btgusermemberofgroupsoperandsList=btgusermemberofgroupsoperandsList;
	}
	
}
