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
package de.hybris.platform.core.dto.test;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.model.test.TestItemModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type TestItem first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = TestItemModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "testitem")
public class TestItemDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveChar</code> attribute defined at extension <code> */
	private java.lang.Character _primitiveChar;
	/** <i>Generated variable</i> - Variable of <code>TestItem.a</code> attribute defined at extension <code> */
	private java.lang.String _a;
	/** <i>Generated variable</i> - Variable of <code>TestItem.byte</code> attribute defined at extension <code> */
	private java.lang.Byte _byte;
	/** <i>Generated variable</i> - Variable of <code>TestItem.integer</code> attribute defined at extension <code> */
	private java.lang.Integer _integer;
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveDouble</code> attribute defined at extension <code> */
	private java.lang.Double _primitiveDouble;
	/** <i>Generated variable</i> - Variable of <code>TestItem.double</code> attribute defined at extension <code> */
	private java.lang.Double _double;
	/** <i>Generated variable</i> - Variable of <code>TestItem.string</code> attribute defined at extension <code> */
	private java.lang.String _string;
	/** <i>Generated variable</i> - Variable of <code>TestItem.testDumpProperty</code> attribute defined at extension <code> */
	private java.lang.String _testDumpProperty;
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveShort</code> attribute defined at extension <code> */
	private java.lang.Short _primitiveShort;
	/** <i>Generated variable</i> - Variable of <code>TestItem.b</code> attribute defined at extension <code> */
	private java.lang.String _b;
	/** <i>Generated variable</i> - Variable of <code>TestItem.longString</code> attribute defined at extension <code> */
	private java.lang.String _longString;
	/** <i>Generated variable</i> - Variable of <code>TestItem.long</code> attribute defined at extension <code> */
	private java.lang.Long _long;
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveBoolean</code> attribute defined at extension <code> */
	private java.lang.Boolean _primitiveBoolean;
	/** <i>Generated variable</i> - Variable of <code>TestItem.date</code> attribute defined at extension <code> */
	private java.util.Date _date;
	/** <i>Generated variable</i> - Variable of <code>TestItem.float</code> attribute defined at extension <code> */
	private java.lang.Float _float;
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveByte</code> attribute defined at extension <code> */
	private java.lang.Byte _primitiveByte;
	/** <i>Generated variable</i> - Variable of <code>TestItem.serializable</code> attribute defined at extension <code> */
	private java.lang.Object _serializable;
	/** <i>Generated variable</i> - Variable of <code>TestItem.boolean</code> attribute defined at extension <code> */
	private java.lang.Boolean _boolean;
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveFloat</code> attribute defined at extension <code> */
	private java.lang.Float _primitiveFloat;
	/** <i>Generated variable</i> - Variable of <code>TestItem.character</code> attribute defined at extension <code> */
	private java.lang.Character _character;
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveLong</code> attribute defined at extension <code> */
	private java.lang.Long _primitiveLong;
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveInteger</code> attribute defined at extension <code> */
	private java.lang.Integer _primitiveInteger;
	/** <i>Generated variable</i> - Variable of <code>TestItem.testProperty0</code> attribute defined at extension <code> */
	private java.lang.String _testProperty0;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TestItemDTO()
	{
		super();
	}
	
	
	public String getA()
	{
		return this._a;
	}
	
	public String getB()
	{
		return this._b;
	}
	
	public Boolean getBoolean()
	{
		return this._boolean;
	}
	
	public Byte getByte()
	{
		return this._byte;
	}
	
	public Character getCharacter()
	{
		return this._character;
	}
	
	public Date getDate()
	{
		return this._date;
	}
	
	public Double getDouble()
	{
		return this._double;
	}
	
	public Float getFloat()
	{
		return this._float;
	}
	
	public Integer getInteger()
	{
		return this._integer;
	}
	
	public Long getLong()
	{
		return this._long;
	}
	
	public String getLongString()
	{
		return this._longString;
	}
	
	public Boolean getPrimitiveBoolean()
	{
		return this._primitiveBoolean;
	}
	
	public Byte getPrimitiveByte()
	{
		return this._primitiveByte;
	}
	
	public Character getPrimitiveChar()
	{
		return this._primitiveChar;
	}
	
	public Double getPrimitiveDouble()
	{
		return this._primitiveDouble;
	}
	
	public Float getPrimitiveFloat()
	{
		return this._primitiveFloat;
	}
	
	public Integer getPrimitiveInteger()
	{
		return this._primitiveInteger;
	}
	
	public Long getPrimitiveLong()
	{
		return this._primitiveLong;
	}
	
	public Short getPrimitiveShort()
	{
		return this._primitiveShort;
	}
	
	public Object getSerializable()
	{
		return this._serializable;
	}
	
	public String getString()
	{
		return this._string;
	}
	
	public String getTestDumpProperty()
	{
		return this._testDumpProperty;
	}
	
	public String getTestProperty0()
	{
		return this._testProperty0;
	}
	
	public void setA(final String value)
	{
		this.modifiedPropsSet.add("a");
		this._a = value;
	}
	
	public void setB(final String value)
	{
		this.modifiedPropsSet.add("b");
		this._b = value;
	}
	
	public void setBoolean(final Boolean value)
	{
		this.modifiedPropsSet.add("boolean");
		this._boolean = value;
	}
	
	public void setByte(final Byte value)
	{
		this.modifiedPropsSet.add("byte");
		this._byte = value;
	}
	
	public void setCharacter(final Character value)
	{
		this.modifiedPropsSet.add("character");
		this._character = value;
	}
	
	public void setDate(final Date value)
	{
		this.modifiedPropsSet.add("date");
		this._date = value;
	}
	
	public void setDouble(final Double value)
	{
		this.modifiedPropsSet.add("double");
		this._double = value;
	}
	
	public void setFloat(final Float value)
	{
		this.modifiedPropsSet.add("float");
		this._float = value;
	}
	
	public void setInteger(final Integer value)
	{
		this.modifiedPropsSet.add("integer");
		this._integer = value;
	}
	
	public void setLong(final Long value)
	{
		this.modifiedPropsSet.add("long");
		this._long = value;
	}
	
	public void setLongString(final String value)
	{
		this.modifiedPropsSet.add("longString");
		this._longString = value;
	}
	
	public void setPrimitiveBoolean(final Boolean value)
	{
		this.modifiedPropsSet.add("primitiveBoolean");
		this._primitiveBoolean = value;
	}
	
	public void setPrimitiveByte(final Byte value)
	{
		this.modifiedPropsSet.add("primitiveByte");
		this._primitiveByte = value;
	}
	
	public void setPrimitiveChar(final Character value)
	{
		this.modifiedPropsSet.add("primitiveChar");
		this._primitiveChar = value;
	}
	
	public void setPrimitiveDouble(final Double value)
	{
		this.modifiedPropsSet.add("primitiveDouble");
		this._primitiveDouble = value;
	}
	
	public void setPrimitiveFloat(final Float value)
	{
		this.modifiedPropsSet.add("primitiveFloat");
		this._primitiveFloat = value;
	}
	
	public void setPrimitiveInteger(final Integer value)
	{
		this.modifiedPropsSet.add("primitiveInteger");
		this._primitiveInteger = value;
	}
	
	public void setPrimitiveLong(final Long value)
	{
		this.modifiedPropsSet.add("primitiveLong");
		this._primitiveLong = value;
	}
	
	public void setPrimitiveShort(final Short value)
	{
		this.modifiedPropsSet.add("primitiveShort");
		this._primitiveShort = value;
	}
	
	public void setSerializable(final Object value)
	{
		this.modifiedPropsSet.add("serializable");
		this._serializable = value;
	}
	
	public void setString(final String value)
	{
		this.modifiedPropsSet.add("string");
		this._string = value;
	}
	
	public void setTestDumpProperty(final String value)
	{
		this.modifiedPropsSet.add("testDumpProperty");
		this._testDumpProperty = value;
	}
	
	public void setTestProperty0(final String value)
	{
		this.modifiedPropsSet.add("testProperty0");
		this._testProperty0 = value;
	}
	
}
