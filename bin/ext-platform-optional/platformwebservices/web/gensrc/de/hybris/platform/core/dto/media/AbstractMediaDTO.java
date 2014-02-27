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
package de.hybris.platform.core.dto.media;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.model.media.AbstractMediaModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractMedia first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractMediaModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "abstractmedia")
public class AbstractMediaDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractMedia.size</code> attribute defined at extension <code> */
	private java.lang.Long _size;
	/** <i>Generated variable</i> - Variable of <code>AbstractMedia.locationHash</code> attribute defined at extension <code> */
	private java.lang.String _locationHash;
	/** <i>Generated variable</i> - Variable of <code>AbstractMedia.dataPK</code> attribute defined at extension <code> */
	private java.lang.Long _dataPK;
	/** <i>Generated variable</i> - Variable of <code>AbstractMedia.realFileName</code> attribute defined at extension <code> */
	private java.lang.String _realFileName;
	/** <i>Generated variable</i> - Variable of <code>AbstractMedia.location</code> attribute defined at extension <code> */
	private java.lang.String _location;
	/** <i>Generated variable</i> - Variable of <code>AbstractMedia.mime</code> attribute defined at extension <code> */
	private java.lang.String _mime;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractMediaDTO()
	{
		super();
	}
	
	
	public Long getDataPK()
	{
		return this._dataPK;
	}
	
	public String getLocation()
	{
		return this._location;
	}
	
	public String getLocationHash()
	{
		return this._locationHash;
	}
	
	public String getMime()
	{
		return this._mime;
	}
	
	public String getRealFileName()
	{
		return this._realFileName;
	}
	
	public Long getSize()
	{
		return this._size;
	}
	
	public void setDataPK(final Long value)
	{
		this.modifiedPropsSet.add("dataPK");
		this._dataPK = value;
	}
	
	public void setLocation(final String value)
	{
		this.modifiedPropsSet.add("location");
		this._location = value;
	}
	
	public void setLocationHash(final String value)
	{
		this.modifiedPropsSet.add("locationHash");
		this._locationHash = value;
	}
	
	public void setMime(final String value)
	{
		this.modifiedPropsSet.add("mime");
		this._mime = value;
	}
	
	public void setRealFileName(final String value)
	{
		this.modifiedPropsSet.add("realFileName");
		this._realFileName = value;
	}
	
	public void setSize(final Long value)
	{
		this.modifiedPropsSet.add("size");
		this._size = value;
	}
	
}
