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
package de.hybris.platform.cms2.dto.preview;

import de.hybris.platform.cms2.dto.preview.PreviewDataDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PreviewData first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "previewdatas")
public class PreviewDatasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PreviewDataDTO*/
	private List<PreviewDataDTO>  previewdatasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PreviewDatasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PreviewDatasDTO(final List<PreviewDataDTO> previewdatasList)
	{
		super();
		this.previewdatasList=previewdatasList;
	}
	
	
	/**
	 * @return the previewdatas
	 */
	@XmlElement(name = "previewdata")
	public List<PreviewDataDTO> getPreviewDatas()
	{
		return	previewdatasList;
	}
	
	/**
	 * @param previewdatasList 
	 *  the previewdatasList to set   
	 */
	public void setPreviewDatas(final List<PreviewDataDTO> previewdatasList)
	{
		this.previewdatasList=previewdatasList;
	}
	
}
