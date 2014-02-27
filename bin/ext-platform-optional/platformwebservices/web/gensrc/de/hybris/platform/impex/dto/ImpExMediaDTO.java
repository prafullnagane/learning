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
package de.hybris.platform.impex.dto;

import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.impex.model.ImpExMediaModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ImpExMedia first defined at extension impex
 */
@SuppressWarnings("all")
@GraphNode(target = ImpExMediaModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "impexmedia")
public class ImpExMediaDTO extends MediaDTO
{
	/** <i>Generated variable</i> - Variable of <code>ImpExMedia.commentCharacter</code> attribute defined at extension <code> */
	private java.lang.Character _commentCharacter;
	/** <i>Generated variable</i> - Variable of <code>ImpExMedia.zipentry</code> attribute defined at extension <code> */
	private java.lang.String _zipentry;
	/** <i>Generated variable</i> - Variable of <code>ImpExMedia.fieldSeparator</code> attribute defined at extension <code> */
	private java.lang.Character _fieldSeparator;
	/** <i>Generated variable</i> - Variable of <code>ImpExMedia.preview</code> attribute defined at extension <code> */
	private java.lang.String _preview;
	/** <i>Generated variable</i> - Variable of <code>ImpExMedia.linesToSkip</code> attribute defined at extension <code> */
	private int _linesToSkip;
	/** <i>Generated variable</i> - Variable of <code>ImpExMedia.encoding</code> attribute defined at extension <code> */
	private java.lang.String _encoding;
	/** <i>Generated variable</i> - Variable of <code>ImpExMedia.quoteCharacter</code> attribute defined at extension <code> */
	private java.lang.Character _quoteCharacter;
	/** <i>Generated variable</i> - Variable of <code>ImpExMedia.removeOnSuccess</code> attribute defined at extension <code> */
	private boolean _removeOnSuccess;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExMediaDTO()
	{
		super();
	}
	
	
	public Character getCommentCharacter()
	{
		return this._commentCharacter;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getEncoding()
	{
		return this._encoding;
	}
	
	public Character getFieldSeparator()
	{
		return this._fieldSeparator;
	}
	
	public int getLinesToSkip()
	{
		return this._linesToSkip;
	}
	
	public String getPreview()
	{
		return this._preview;
	}
	
	public Character getQuoteCharacter()
	{
		return this._quoteCharacter;
	}
	
	public String getZipentry()
	{
		return this._zipentry;
	}
	
	public boolean isRemoveOnSuccess()
	{
		return this._removeOnSuccess;
	}
	
	public void setCommentCharacter(final Character value)
	{
		this.modifiedPropsSet.add("commentCharacter");
		this._commentCharacter = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setEncoding(final String value)
	{
		this.modifiedPropsSet.add("encoding");
		this._encoding = value;
	}
	
	public void setFieldSeparator(final Character value)
	{
		this.modifiedPropsSet.add("fieldSeparator");
		this._fieldSeparator = value;
	}
	
	public void setLinesToSkip(final int value)
	{
		this.modifiedPropsSet.add("linesToSkip");
		this._linesToSkip = value;
	}
	
	public void setPreview(final String value)
	{
		this.modifiedPropsSet.add("preview");
		this._preview = value;
	}
	
	public void setQuoteCharacter(final Character value)
	{
		this.modifiedPropsSet.add("quoteCharacter");
		this._quoteCharacter = value;
	}
	
	public void setRemoveOnSuccess(final boolean value)
	{
		this.modifiedPropsSet.add("removeOnSuccess");
		this._removeOnSuccess = value;
	}
	
	public void setZipentry(final String value)
	{
		this.modifiedPropsSet.add("zipentry");
		this._zipentry = value;
	}
	
}
