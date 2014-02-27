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
package de.hybris.platform.servicelayer.media.impl;

import static de.hybris.platform.testframework.assertions.InputStreamAssert.assertThat;
import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.media.DerivedMediaModel;
import de.hybris.platform.core.model.media.MediaContainerModel;
import de.hybris.platform.core.model.media.MediaFormatModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.exceptions.ModelSavingException;
import de.hybris.platform.testframework.TestUtils;

import java.io.InputStream;

import javax.annotation.Nullable;
import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;


@IntegrationTest
public class DefaultMediaServiceIntegrationTest extends AbstractMediaFormatIntegrationTest
{
	@Resource
	private DefaultMediaService mediaService;
	private MediaModel media;
	@Mock
	private InputStream inputStream;

	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
		given(Integer.valueOf(inputStream.read(any(byte[].class)))).willReturn(Integer.valueOf(1), Integer.valueOf(0),
				Integer.valueOf(-1));

		media = modelService.create(MediaModel.class);
		media.setCode("foo");
		media.setCatalogVersion(catalogVersion);
		modelService.save(media);

		mediaService.setStreamForMedia(media, inputStream, "fooBar.jpg", "image/jpeg");
	}

	@Override
	MediaModel getMediaByFormat(final MediaModel last, final MediaFormatModel mediaFormatModel)
	{
		return this.mediaService.getMediaByFormat(last, mediaFormatModel);
	}

	@Override
	MediaModel getMediaByFormat(final MediaContainerModel container, final MediaFormatModel mediaFormatModel)
	{
		return this.mediaService.getMediaByFormat(container, mediaFormatModel);
	}

	@Test
	public void shouldAddMediaVersionToExistingMedia()
	{
		// given
		final String versionId = "thumbnail";

		// when
		mediaService.addVersionStreamForMedia(media, versionId, inputStream);

		// then
		assertThat(media.getDerivedMedias()).hasSize(1);
	}

	@Test
	public void shouldPreventAddingMediaVersionWithNotUniqueVersionId()
	{
		// given
		TestUtils.disableFileAnalyzer("Log ERROR in this case is OK");
		final String versionId = "thumbnail";

		try
		{
			// when
			mediaService.addVersionStreamForMedia(media, versionId, inputStream);
			mediaService.addVersionStreamForMedia(media, versionId, inputStream);
			fail("Should throw ModelSavingException");
		}
		catch (final ModelSavingException e)
		{
			// then OK
		}
		TestUtils.enableFileAnalyzer();
	}

	@Test
	public void shouldReturnDataStreamForExistingMediaVersion()
	{
		// given
		final String versionId = "thumbnail";
		mediaService.addVersionStreamForMedia(media, versionId, inputStream);

		// when
		final InputStream stream = mediaService.getStreamForMediaVersion(media, versionId);

		// then
		assertThat(stream).hasSameDataAs(inputStream);
	}


	@Test
	public void shouldReturnUrlForExistingMediaVersion()
	{
		// given
		final String versionId = "thumbnail";
		mediaService.addVersionStreamForMedia(media, versionId, inputStream);

		// when
		final String url = mediaService.getUrlForMediaVersion(media, versionId);

		// then
		assertThat(url).isNotNull().startsWith("/medias?context");
	}

	@Test
	public void shouldRemoveVersionFromExistingMedia()
	{
		// given
		mediaService.addVersionStreamForMedia(media, "thumbnail", inputStream);
		mediaService.addVersionStreamForMedia(media, "picture", inputStream);
		mediaService.addVersionStreamForMedia(media, "frontend", inputStream);
		assertThat(media.getDerivedMedias()).hasSize(3);

		// when
		mediaService.removeVersionForMedia(media, "picture");

		// then
		assertThat(Iterables.transform(media.getDerivedMedias(), new Function<DerivedMediaModel, String>()
		{

			@Override
			public String apply(@Nullable final DerivedMediaModel input)
			{
				return input.getVersion();
			}
		})).containsOnly("thumbnail", "frontend");
	}

}
