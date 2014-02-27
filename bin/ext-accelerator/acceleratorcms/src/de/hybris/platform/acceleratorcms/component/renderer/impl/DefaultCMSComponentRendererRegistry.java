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
package de.hybris.platform.acceleratorcms.component.renderer.impl;

import de.hybris.platform.acceleratorcms.component.renderer.CMSComponentRenderer;
import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import de.hybris.platform.servicelayer.type.TypeService;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.jsp.PageContext;

import org.springframework.beans.factory.annotation.Required;

/**
 */
public class DefaultCMSComponentRendererRegistry implements CMSComponentRenderer<AbstractCMSComponentModel>
{
	protected TypeService typeService;
	protected CMSComponentRenderer<AbstractCMSComponentModel> defaultCmsComponentRenderer;
	protected Map<String, CMSComponentRenderer> renderers;

	protected TypeService getTypeService()
	{
		return typeService;
	}

	@Required
	public void setTypeService(final TypeService typeService)
	{
		this.typeService = typeService;
	}

	protected CMSComponentRenderer<AbstractCMSComponentModel> getDefaultCmsComponentRenderer()
	{
		return defaultCmsComponentRenderer;
	}

	@Required
	public void setDefaultCmsComponentRenderer(final CMSComponentRenderer<AbstractCMSComponentModel> defaultCmsComponentRenderer)
	{
		this.defaultCmsComponentRenderer = defaultCmsComponentRenderer;
	}

	protected Map<String, CMSComponentRenderer> getRenderers()
	{
		return renderers;
	}

	public void setRenderers(final Map<String, CMSComponentRenderer> renderers)
	{
		this.renderers = renderers;
	}

	@Override
	public void renderComponent(final PageContext pageContext, final AbstractCMSComponentModel component) throws ServletException, IOException
	{
		final String typeCode = getTypeService().getComposedTypeForClass(component.getClass()).getCode();
		final Map<String, CMSComponentRenderer> renderersMap = getRenderers();
		if (renderersMap != null && renderersMap.containsKey(typeCode))
		{
			renderersMap.get(typeCode).renderComponent(pageContext, component);
		}
		else
		{
			getDefaultCmsComponentRenderer().renderComponent(pageContext, component);
		}
	}
}
