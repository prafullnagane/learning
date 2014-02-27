/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package de.hybris.platform.ycommercewebservices.conv;

import de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;


/**
 * Converter for facet search page data.
 */
public class ProductSearchPageDataConverter extends AbstractRedirectableConverter
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.commercewebservices.conv.RedirectableConverter#getConvertedClass()
	 */
	@Override
	public Class getConvertedClass()
	{
		return ProductSearchPageData.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#marshal(java.lang.Object,
	 * com.thoughtworks.xstream.io.HierarchicalStreamWriter, com.thoughtworks.xstream.converters.MarshallingContext)
	 */
	@Override
	public void marshal(final Object source, final HierarchicalStreamWriter writer, final MarshallingContext context)
	{
		final ProductSearchPageData result = (ProductSearchPageData) source;

		context.convertAnother(result.getBreadcrumbs());
		context.convertAnother(result.getCurrentQuery());
		context.convertAnother(result.getFacets());
		context.convertAnother(result.getPagination());
		context.convertAnother(result.getResults());
		context.convertAnother(result.getSorts());
		context.convertAnother(result.getSpellingSuggestion());
		context.convertAnother(result.getKeywordRedirectUrl());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.thoughtworks.xstream.converters.Converter#unmarshal(com.thoughtworks.xstream.io.HierarchicalStreamReader,
	 * com.thoughtworks.xstream.converters.UnmarshallingContext)
	 */
	@Override
	public Object unmarshal(final HierarchicalStreamReader reader, final UnmarshallingContext context)
	{
		return getTargetConverter().unmarshal(reader, context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.thoughtworks.xstream.converters.ConverterMatcher#canConvert(java.lang.Class)
	 */
	@Override
	public boolean canConvert(final Class type)
	{
		return type == ProductSearchPageData.class;
	}

}
