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
package de.hybris.platform.core.model.test;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type TestItem first defined at extension core.
 */
@SuppressWarnings("all")
public class TestItemModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "TestItem";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.primitiveChar</code> attribute defined at extension <code>core</code>. */
	public static final String PRIMITIVECHAR = "primitiveChar";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.a</code> attribute defined at extension <code>core</code>. */
	public static final String A = "a";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.byte</code> attribute defined at extension <code>core</code>. */
	public static final String BYTE = "byte";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.integer</code> attribute defined at extension <code>core</code>. */
	public static final String INTEGER = "integer";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.primitiveDouble</code> attribute defined at extension <code>core</code>. */
	public static final String PRIMITIVEDOUBLE = "primitiveDouble";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.double</code> attribute defined at extension <code>core</code>. */
	public static final String DOUBLE = "double";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.string</code> attribute defined at extension <code>core</code>. */
	public static final String STRING = "string";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.testDumpProperty</code> attribute defined at extension <code>core</code>. */
	public static final String TESTDUMPPROPERTY = "testDumpProperty";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.primitiveShort</code> attribute defined at extension <code>core</code>. */
	public static final String PRIMITIVESHORT = "primitiveShort";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.b</code> attribute defined at extension <code>core</code>. */
	public static final String B = "b";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.longString</code> attribute defined at extension <code>core</code>. */
	public static final String LONGSTRING = "longString";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.long</code> attribute defined at extension <code>core</code>. */
	public static final String LONG = "long";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.float</code> attribute defined at extension <code>core</code>. */
	public static final String FLOAT = "float";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.date</code> attribute defined at extension <code>core</code>. */
	public static final String DATE = "date";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.primitiveBoolean</code> attribute defined at extension <code>core</code>. */
	public static final String PRIMITIVEBOOLEAN = "primitiveBoolean";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.primitiveFloat</code> attribute defined at extension <code>core</code>. */
	public static final String PRIMITIVEFLOAT = "primitiveFloat";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.boolean</code> attribute defined at extension <code>core</code>. */
	public static final String BOOLEAN = "boolean";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.serializable</code> attribute defined at extension <code>core</code>. */
	public static final String SERIALIZABLE = "serializable";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.primitiveByte</code> attribute defined at extension <code>core</code>. */
	public static final String PRIMITIVEBYTE = "primitiveByte";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.character</code> attribute defined at extension <code>core</code>. */
	public static final String CHARACTER = "character";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.primitiveLong</code> attribute defined at extension <code>core</code>. */
	public static final String PRIMITIVELONG = "primitiveLong";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.primitiveInteger</code> attribute defined at extension <code>core</code>. */
	public static final String PRIMITIVEINTEGER = "primitiveInteger";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestItem.testProperty0</code> attribute defined at extension <code>core</code>. */
	public static final String TESTPROPERTY0 = "testProperty0";
	
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveChar</code> attribute defined at extension <code>core</code>. */
	private Character _primitiveChar;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.a</code> attribute defined at extension <code>core</code>. */
	private String _a;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.byte</code> attribute defined at extension <code>core</code>. */
	private Byte _byte;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.integer</code> attribute defined at extension <code>core</code>. */
	private Integer _integer;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveDouble</code> attribute defined at extension <code>core</code>. */
	private Double _primitiveDouble;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.double</code> attribute defined at extension <code>core</code>. */
	private Double _double;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.string</code> attribute defined at extension <code>core</code>. */
	private String _string;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.testDumpProperty</code> attribute defined at extension <code>core</code>. */
	private String _testDumpProperty;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveShort</code> attribute defined at extension <code>core</code>. */
	private Short _primitiveShort;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.b</code> attribute defined at extension <code>core</code>. */
	private String _b;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.longString</code> attribute defined at extension <code>core</code>. */
	private String _longString;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.long</code> attribute defined at extension <code>core</code>. */
	private Long _long;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.float</code> attribute defined at extension <code>core</code>. */
	private Float _float;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.date</code> attribute defined at extension <code>core</code>. */
	private Date _date;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveBoolean</code> attribute defined at extension <code>core</code>. */
	private Boolean _primitiveBoolean;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveFloat</code> attribute defined at extension <code>core</code>. */
	private Float _primitiveFloat;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.boolean</code> attribute defined at extension <code>core</code>. */
	private Boolean _boolean;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.serializable</code> attribute defined at extension <code>core</code>. */
	private Object _serializable;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveByte</code> attribute defined at extension <code>core</code>. */
	private Byte _primitiveByte;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.character</code> attribute defined at extension <code>core</code>. */
	private Character _character;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveLong</code> attribute defined at extension <code>core</code>. */
	private Long _primitiveLong;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.primitiveInteger</code> attribute defined at extension <code>core</code>. */
	private Integer _primitiveInteger;
	
	/** <i>Generated variable</i> - Variable of <code>TestItem.testProperty0</code> attribute defined at extension <code>core</code>. */
	private String _testProperty0;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public TestItemModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public TestItemModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public TestItemModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.a</code> attribute defined at extension <code>core</code>. 
	 * @return the a
	 */
	public String getA()
	{
		return _a = getPersistenceContext().getValue(A, _a);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.b</code> attribute defined at extension <code>core</code>. 
	 * @return the b
	 */
	public String getB()
	{
		return _b = getPersistenceContext().getValue(B, _b);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.boolean</code> attribute defined at extension <code>core</code>. 
	 * @return the boolean
	 */
	public Boolean getBoolean()
	{
		return _boolean = getPersistenceContext().getValue(BOOLEAN, _boolean);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.byte</code> attribute defined at extension <code>core</code>. 
	 * @return the byte
	 */
	public Byte getByte()
	{
		return _byte = getPersistenceContext().getValue(BYTE, _byte);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.character</code> attribute defined at extension <code>core</code>. 
	 * @return the character
	 */
	public Character getCharacter()
	{
		return _character = getPersistenceContext().getValue(CHARACTER, _character);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.date</code> attribute defined at extension <code>core</code>. 
	 * @return the date
	 */
	public Date getDate()
	{
		return _date = getPersistenceContext().getValue(DATE, _date);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.double</code> attribute defined at extension <code>core</code>. 
	 * @return the double
	 */
	public Double getDouble()
	{
		return _double = getPersistenceContext().getValue(DOUBLE, _double);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.float</code> attribute defined at extension <code>core</code>. 
	 * @return the float
	 */
	public Float getFloat()
	{
		return _float = getPersistenceContext().getValue(FLOAT, _float);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.integer</code> attribute defined at extension <code>core</code>. 
	 * @return the integer
	 */
	public Integer getInteger()
	{
		return _integer = getPersistenceContext().getValue(INTEGER, _integer);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.long</code> attribute defined at extension <code>core</code>. 
	 * @return the long
	 */
	public Long getLong()
	{
		return _long = getPersistenceContext().getValue(LONG, _long);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.longString</code> attribute defined at extension <code>core</code>. 
	 * @return the longString
	 */
	public String getLongString()
	{
		return _longString = getPersistenceContext().getValue(LONGSTRING, _longString);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.primitiveBoolean</code> attribute defined at extension <code>core</code>. 
	 * @return the primitiveBoolean
	 */
	public Boolean getPrimitiveBoolean()
	{
		return _primitiveBoolean = getPersistenceContext().getValue(PRIMITIVEBOOLEAN, _primitiveBoolean);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.primitiveByte</code> attribute defined at extension <code>core</code>. 
	 * @return the primitiveByte
	 */
	public Byte getPrimitiveByte()
	{
		return _primitiveByte = getPersistenceContext().getValue(PRIMITIVEBYTE, _primitiveByte);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.primitiveChar</code> attribute defined at extension <code>core</code>. 
	 * @return the primitiveChar
	 */
	public Character getPrimitiveChar()
	{
		return _primitiveChar = getPersistenceContext().getValue(PRIMITIVECHAR, _primitiveChar);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.primitiveDouble</code> attribute defined at extension <code>core</code>. 
	 * @return the primitiveDouble
	 */
	public Double getPrimitiveDouble()
	{
		return _primitiveDouble = getPersistenceContext().getValue(PRIMITIVEDOUBLE, _primitiveDouble);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.primitiveFloat</code> attribute defined at extension <code>core</code>. 
	 * @return the primitiveFloat
	 */
	public Float getPrimitiveFloat()
	{
		return _primitiveFloat = getPersistenceContext().getValue(PRIMITIVEFLOAT, _primitiveFloat);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.primitiveInteger</code> attribute defined at extension <code>core</code>. 
	 * @return the primitiveInteger
	 */
	public Integer getPrimitiveInteger()
	{
		return _primitiveInteger = getPersistenceContext().getValue(PRIMITIVEINTEGER, _primitiveInteger);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.primitiveLong</code> attribute defined at extension <code>core</code>. 
	 * @return the primitiveLong
	 */
	public Long getPrimitiveLong()
	{
		return _primitiveLong = getPersistenceContext().getValue(PRIMITIVELONG, _primitiveLong);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.primitiveShort</code> attribute defined at extension <code>core</code>. 
	 * @return the primitiveShort
	 */
	public Short getPrimitiveShort()
	{
		return _primitiveShort = getPersistenceContext().getValue(PRIMITIVESHORT, _primitiveShort);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.serializable</code> attribute defined at extension <code>core</code>. 
	 * @return the serializable
	 */
	public Object getSerializable()
	{
		return _serializable = getPersistenceContext().getValue(SERIALIZABLE, _serializable);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.string</code> attribute defined at extension <code>core</code>. 
	 * @return the string
	 */
	public String getString()
	{
		return _string = getPersistenceContext().getValue(STRING, _string);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.testDumpProperty</code> attribute defined at extension <code>core</code>. 
	 * @return the testDumpProperty
	 */
	public String getTestDumpProperty()
	{
		return _testDumpProperty = getPersistenceContext().getValue(TESTDUMPPROPERTY, _testDumpProperty);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestItem.testProperty0</code> attribute defined at extension <code>core</code>. 
	 * @return the testProperty0
	 */
	public String getTestProperty0()
	{
		return _testProperty0 = getPersistenceContext().getValue(TESTPROPERTY0, _testProperty0);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.a</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the a
	 */
	public void setA(final String value)
	{
		_a = getPersistenceContext().setValue(A, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.b</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the b
	 */
	public void setB(final String value)
	{
		_b = getPersistenceContext().setValue(B, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.boolean</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the boolean
	 */
	public void setBoolean(final Boolean value)
	{
		_boolean = getPersistenceContext().setValue(BOOLEAN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.byte</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the byte
	 */
	public void setByte(final Byte value)
	{
		_byte = getPersistenceContext().setValue(BYTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.character</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the character
	 */
	public void setCharacter(final Character value)
	{
		_character = getPersistenceContext().setValue(CHARACTER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.date</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		_date = getPersistenceContext().setValue(DATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.double</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the double
	 */
	public void setDouble(final Double value)
	{
		_double = getPersistenceContext().setValue(DOUBLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.float</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the float
	 */
	public void setFloat(final Float value)
	{
		_float = getPersistenceContext().setValue(FLOAT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.integer</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the integer
	 */
	public void setInteger(final Integer value)
	{
		_integer = getPersistenceContext().setValue(INTEGER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.long</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the long
	 */
	public void setLong(final Long value)
	{
		_long = getPersistenceContext().setValue(LONG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.longString</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the longString
	 */
	public void setLongString(final String value)
	{
		_longString = getPersistenceContext().setValue(LONGSTRING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.primitiveBoolean</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the primitiveBoolean
	 */
	public void setPrimitiveBoolean(final Boolean value)
	{
		_primitiveBoolean = getPersistenceContext().setValue(PRIMITIVEBOOLEAN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.primitiveByte</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the primitiveByte
	 */
	public void setPrimitiveByte(final Byte value)
	{
		_primitiveByte = getPersistenceContext().setValue(PRIMITIVEBYTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.primitiveChar</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the primitiveChar
	 */
	public void setPrimitiveChar(final Character value)
	{
		_primitiveChar = getPersistenceContext().setValue(PRIMITIVECHAR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.primitiveDouble</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the primitiveDouble
	 */
	public void setPrimitiveDouble(final Double value)
	{
		_primitiveDouble = getPersistenceContext().setValue(PRIMITIVEDOUBLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.primitiveFloat</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the primitiveFloat
	 */
	public void setPrimitiveFloat(final Float value)
	{
		_primitiveFloat = getPersistenceContext().setValue(PRIMITIVEFLOAT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.primitiveInteger</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the primitiveInteger
	 */
	public void setPrimitiveInteger(final Integer value)
	{
		_primitiveInteger = getPersistenceContext().setValue(PRIMITIVEINTEGER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.primitiveLong</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the primitiveLong
	 */
	public void setPrimitiveLong(final Long value)
	{
		_primitiveLong = getPersistenceContext().setValue(PRIMITIVELONG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.primitiveShort</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the primitiveShort
	 */
	public void setPrimitiveShort(final Short value)
	{
		_primitiveShort = getPersistenceContext().setValue(PRIMITIVESHORT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.serializable</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the serializable
	 */
	public void setSerializable(final Object value)
	{
		_serializable = getPersistenceContext().setValue(SERIALIZABLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.string</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the string
	 */
	public void setString(final String value)
	{
		_string = getPersistenceContext().setValue(STRING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.testDumpProperty</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the testDumpProperty
	 */
	public void setTestDumpProperty(final String value)
	{
		_testDumpProperty = getPersistenceContext().setValue(TESTDUMPPROPERTY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestItem.testProperty0</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the testProperty0
	 */
	public void setTestProperty0(final String value)
	{
		_testProperty0 = getPersistenceContext().setValue(TESTPROPERTY0, value);
	}
	
}
