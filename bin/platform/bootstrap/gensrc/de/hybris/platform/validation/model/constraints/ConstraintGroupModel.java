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
package de.hybris.platform.validation.model.constraints;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.validation.model.constraints.AbstractConstraintModel;
import java.util.Set;

/**
 * Generated model class for type ConstraintGroup first defined at extension validation.
 * <p>
 * Constraint group definition.
 */
@SuppressWarnings("all")
public class ConstraintGroupModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ConstraintGroup";
	
	/**<i>Generated relation code constant for relation <code>ConstraintGroup2AbstractConstraintRelation</code> defining source attribute <code>constraints</code> in extension <code>validation</code>.</i>*/
	public final static String _CONSTRAINTGROUP2ABSTRACTCONSTRAINTRELATION = "ConstraintGroup2AbstractConstraintRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>ConstraintGroup.id</code> attribute defined at extension <code>validation</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>ConstraintGroup.constraints</code> attribute defined at extension <code>validation</code>. */
	public static final String CONSTRAINTS = "constraints";
	
	/** <i>Generated constant</i> - Attribute key of <code>ConstraintGroup.interfaceName</code> attribute defined at extension <code>validation</code>. */
	public static final String INTERFACENAME = "interfaceName";
	
	
	/** <i>Generated variable</i> - Variable of <code>ConstraintGroup.id</code> attribute defined at extension <code>validation</code>. */
	private String _id;
	
	/** <i>Generated variable</i> - Variable of <code>ConstraintGroup.constraints</code> attribute defined at extension <code>validation</code>. */
	private Set<AbstractConstraintModel> _constraints;
	
	/** <i>Generated variable</i> - Variable of <code>ConstraintGroup.interfaceName</code> attribute defined at extension <code>validation</code>. */
	private String _interfaceName;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ConstraintGroupModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ConstraintGroupModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _id initial attribute declared by type <code>ConstraintGroup</code> at extension <code>validation</code>
	 */
	@Deprecated
	public ConstraintGroupModel(final String _id)
	{
		super();
		setId(_id);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _id initial attribute declared by type <code>ConstraintGroup</code> at extension <code>validation</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ConstraintGroupModel(final String _id, final ItemModel _owner)
	{
		super();
		setId(_id);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConstraintGroup.constraints</code> attribute defined at extension <code>validation</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the constraints
	 */
	public Set<AbstractConstraintModel> getConstraints()
	{
		return _constraints = getPersistenceContext().getValue(CONSTRAINTS, _constraints);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConstraintGroup.id</code> attribute defined at extension <code>validation</code>. 
	 * @return the id - Constraint group identifier
	 */
	public String getId()
	{
		return _id = getPersistenceContext().getValue(ID, _id);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConstraintGroup.interfaceName</code> attribute defined at extension <code>validation</code>. 
	 * @return the interfaceName
	 */
	public String getInterfaceName()
	{
		return _interfaceName = getPersistenceContext().getValue(INTERFACENAME, _interfaceName);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ConstraintGroup.constraints</code> attribute defined at extension <code>validation</code>. 
	 *  
	 * @param value the constraints
	 */
	public void setConstraints(final Set<AbstractConstraintModel> value)
	{
		_constraints = getPersistenceContext().setValue(CONSTRAINTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ConstraintGroup.id</code> attribute defined at extension <code>validation</code>. 
	 *  
	 * @param value the id - Constraint group identifier
	 */
	public void setId(final String value)
	{
		_id = getPersistenceContext().setValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ConstraintGroup.interfaceName</code> attribute defined at extension <code>validation</code>. 
	 *  
	 * @param value the interfaceName
	 */
	public void setInterfaceName(final String value)
	{
		_interfaceName = getPersistenceContext().setValue(INTERFACENAME, value);
	}
	
}