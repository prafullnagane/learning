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

import de.hybris.platform.btg.dto.BTGSegmentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGSegment first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgsegments")
public class BTGSegmentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGSegmentDTO*/
	private List<BTGSegmentDTO>  btgsegmentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGSegmentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGSegmentsDTO(final List<BTGSegmentDTO> btgsegmentsList)
	{
		super();
		this.btgsegmentsList=btgsegmentsList;
	}
	
	
	/**
	 * @return the btgsegments
	 */
	@XmlElement(name = "btgsegment")
	public List<BTGSegmentDTO> getBTGSegments()
	{
		return	btgsegmentsList;
	}
	
	/**
	 * @param btgsegmentsList 
	 *  the btgsegmentsList to set   
	 */
	public void setBTGSegments(final List<BTGSegmentDTO> btgsegmentsList)
	{
		this.btgsegmentsList=btgsegmentsList;
	}
	
}
