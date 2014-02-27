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
package de.hybris.platform.deeplink.dto.media;

import de.hybris.platform.deeplink.dto.media.BarcodeMediaDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BarcodeMedia first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "barcodemedias")
public class BarcodeMediasDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BarcodeMediaDTO*/
	private List<BarcodeMediaDTO>  barcodemediasList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BarcodeMediasDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BarcodeMediasDTO(final List<BarcodeMediaDTO> barcodemediasList)
	{
		super();
		this.barcodemediasList=barcodemediasList;
	}
	
	
	/**
	 * @return the barcodemedias
	 */
	@XmlElement(name = "barcodemedia")
	public List<BarcodeMediaDTO> getBarcodeMedias()
	{
		return	barcodemediasList;
	}
	
	/**
	 * @param barcodemediasList 
	 *  the barcodemediasList to set   
	 */
	public void setBarcodeMedias(final List<BarcodeMediaDTO> barcodemediasList)
	{
		this.barcodemediasList=barcodemediasList;
	}
	
}
