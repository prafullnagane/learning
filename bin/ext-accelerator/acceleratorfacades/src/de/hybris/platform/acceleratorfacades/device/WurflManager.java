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
package de.hybris.platform.acceleratorfacades.device;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

import net.sourceforge.wurfl.spring.SpringWurflManager;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.Validate;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;


/**
 * WurflManager that can handle urls like "jar:file:path_to_jar!file_inside_jar".
 */
public class WurflManager extends SpringWurflManager
{
	@Override
	public void setWurfl(final Resource wurfl)
	{
		Validate.notNull(wurfl);
		InputStream inputsteam = null;
		try
		{
			if (wurfl instanceof ClassPathResource)
			{
				final ClassPathResource wurflClassPAthResource = (ClassPathResource) wurfl;

				if (wurflClassPAthResource.getPath().toLowerCase().endsWith(".zip"))
				{
					inputsteam = fromZipFile(wurflClassPAthResource.getInputStream());
				}
				else
				{
					inputsteam = wurflClassPAthResource.getInputStream();
				}

				super.setWurfl(new InputStreamResource(inputsteam));
			}
			else
			{
				super.setWurfl(wurfl);
			}
		}
		catch (final IOException e)
		{
			IOUtils.closeQuietly(inputsteam);
		}
	}

	protected InputStream fromZipFile(final InputStream inputStream) throws IOException
	{
		final ZipInputStream zipInputStream = new ZipInputStream(inputStream);
		zipInputStream.getNextEntry();
		return zipInputStream;
	}
}
