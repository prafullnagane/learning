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
package de.hybris.platform.ticket.dto;

import de.hybris.platform.core.dto.user.EmployeeDTO;
import de.hybris.platform.core.dto.user.UserGroupDTO;
import de.hybris.platform.store.BaseStoreDTO;
import de.hybris.platform.ticket.model.CsAgentGroupModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CsAgentGroup first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@GraphNode(target = CsAgentGroupModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "csagentgroup")
public class CsAgentGroupDTO extends UserGroupDTO
{
	/** <i>Generated variable</i> - Variable of <code>CsAgentGroup.defaultAssignee</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.EmployeeDTO _defaultAssignee;
	/** <i>Generated variable</i> - Variable of <code>CsAgentGroup.ticketstores</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.store.BaseStoreDTO> _ticketstores;
	/** <i>Generated variable</i> - Variable of <code>CsAgentGroup.emailDistributionList</code> attribute defined at extension <code> */
	private java.lang.String _emailDistributionList;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsAgentGroupDTO()
	{
		super();
	}
	
	
	public EmployeeDTO getDefaultAssignee()
	{
		return this._defaultAssignee;
	}
	
	public String getEmailDistributionList()
	{
		return this._emailDistributionList;
	}
	
	@XmlElementWrapper(name = "ticketstores")
	@XmlElement(name = "baseStore")
	public List<BaseStoreDTO> getTicketstores()
	{
		return this._ticketstores;
	}
	
	public void setDefaultAssignee(final EmployeeDTO value)
	{
		this.modifiedPropsSet.add("defaultAssignee");
		this._defaultAssignee = value;
	}
	
	public void setEmailDistributionList(final String value)
	{
		this.modifiedPropsSet.add("emailDistributionList");
		this._emailDistributionList = value;
	}
	
	public void setTicketstores(final List<BaseStoreDTO> value)
	{
		this.modifiedPropsSet.add("ticketstores");
		this._ticketstores = value;
	}
	
}
