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
package de.hybris.platform.acceleratorservices.dto.cms2.pages;

import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.cms2.dto.pages.AbstractPageDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type EmailPage first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@GraphNode(target = EmailPageModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "emailpage")
public class EmailPageDTO extends AbstractPageDTO
{
	/** <i>Generated variable</i> - Variable of <code>EmailPage.fromEmail</code> attribute defined at extension <code> */
	private java.lang.String _fromEmail;
	/** <i>Generated variable</i> - Variable of <code>EmailPage.fromName</code> attribute defined at extension <code> */
	private java.lang.String _fromName;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EmailPageDTO()
	{
		super();
	}
	
	
	public String getFromEmail()
	{
		return this._fromEmail;
	}
	
	public String getFromName()
	{
		return this._fromName;
	}
	
	public void setFromEmail(final String value)
	{
		this.modifiedPropsSet.add("fromEmail");
		this._fromEmail = value;
	}
	
	public void setFromName(final String value)
	{
		this.modifiedPropsSet.add("fromName");
		this._fromName = value;
	}
	
}
