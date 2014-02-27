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
package de.hybris.platform.webservices;

import static org.junit.Assert.assertEquals;

import de.hybris.platform.core.dto.order.payment.InvoicePaymentInfoDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.core.model.order.payment.InvoicePaymentInfoModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.jalo.JaloBusinessException;

import java.io.IOException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.Before;
import org.junit.Test;

import com.sun.jersey.api.client.ClientResponse;


/**
 * 
 */
public class InvoicePaymentInfoResourceTest extends AbstractWebServicesTest
{
	private static final String URI = "/invoicepaymentinfos";
	private InvoicePaymentInfoModel invoiceModel = null;

	/**
	 * @throws Exception
	 */
	public InvoicePaymentInfoResourceTest() throws Exception //NOPMD
	{
		super();
	}

	@Before
	public void setUpPaymentInfos() throws JaloBusinessException
	{
		createTestCustomers();
		createTestPaymentInfos();
		final CustomerModel customerModel = (CustomerModel) userService.getUserForUID("testCustomer1");
		for (final PaymentInfoModel paymentInfo : customerModel.getPaymentInfos())
		{
			if (paymentInfo instanceof InvoicePaymentInfoModel)
			{
				invoiceModel = (InvoicePaymentInfoModel) paymentInfo;
			}
		}
	}

	@Test
	public void testGetInvoicePaymentInfo()
	{
		final ClientResponse result = webResource.path(URI + "/" + invoiceModel.getPk().toString()).cookie(tenantCookie).header(
				HEADER_AUTH_KEY, HEADER_AUTH_VALUE_BASIC_ADMIN).accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
		result.bufferEntity();
		assertOk(result, false);
		assertEqual(invoiceModel, result, InvoicePaymentInfoDTO.class, "code", "duplicate");
	}

	@Test
	public void testPostInvoicePaymentInfoNew()
	{
		final UserDTO userDto = new UserDTO();
		userDto.setUid("testCustomer1");

		final InvoicePaymentInfoDTO invoicePaymentInfoDTO = new InvoicePaymentInfoDTO();
		invoicePaymentInfoDTO.setCode("newInvoice");
		invoicePaymentInfoDTO.setDuplicate(Boolean.FALSE);
		invoicePaymentInfoDTO.setUser(userDto);

		ClientResponse result = webResource.path(URI).cookie(tenantCookie).header(HEADER_AUTH_KEY, HEADER_AUTH_VALUE_BASIC_ADMIN)
				.accept(MediaType.APPLICATION_XML).entity(invoicePaymentInfoDTO).post(ClientResponse.class);
		result.bufferEntity();
		assertCreated(result, false);
		final InvoicePaymentInfoDTO invoicePaymentInfoPostResultDTO = result.getEntity(InvoicePaymentInfoDTO.class);

		result = webResource.path(URI + "/" + invoicePaymentInfoPostResultDTO.getPk().toString()).cookie(tenantCookie).header(
				HEADER_AUTH_KEY, HEADER_AUTH_VALUE_BASIC_ADMIN).accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
		result.bufferEntity();
		assertOk(result, false);
		assertEqual(invoicePaymentInfoDTO, result, "code", "duplicate");
	}

	//Commented because the payment mode is always created, not updated
	@Test
	public void testPutInvoicePaymentInfoUpdate()
	{
		final InvoicePaymentInfoDTO invoicePaymentInfoDTO = new InvoicePaymentInfoDTO();
		invoicePaymentInfoDTO.setCode("invoice1");
		invoicePaymentInfoDTO.setDuplicate(Boolean.FALSE);

		ClientResponse result = webResource.path(URI + "/" + invoiceModel.getPk().toString()).cookie(tenantCookie).header(
				HEADER_AUTH_KEY, HEADER_AUTH_VALUE_BASIC_ADMIN).accept(MediaType.APPLICATION_XML).entity(invoicePaymentInfoDTO).put(
				ClientResponse.class);
		result.bufferEntity();
		assertOk(result, true);

		result = webResource.path(URI + "/" + invoiceModel.getPk().toString()).cookie(tenantCookie).header(HEADER_AUTH_KEY,
				HEADER_AUTH_VALUE_BASIC_ADMIN).accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
		result.bufferEntity();
		assertOk(result, false);
		assertEqual(invoicePaymentInfoDTO, result, "code", "duplicate");
	}

	@Test
	public void testDeleteInvoicePaymentInfo()
	{
		ClientResponse result = webResource.path(URI + "/" + invoiceModel.getPk().toString()).cookie(tenantCookie).header(
				HEADER_AUTH_KEY, HEADER_AUTH_VALUE_BASIC_ADMIN).accept(MediaType.APPLICATION_XML).delete(ClientResponse.class);
		result.bufferEntity();
		assertOk(result, true);

		result = webResource.path(URI + "/" + invoiceModel.getPk().toString()).cookie(tenantCookie).header(HEADER_AUTH_KEY,
				HEADER_AUTH_VALUE_BASIC_ADMIN).accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
		result.bufferEntity();
		assertEquals("Wrong HTTP status at response: " + result, Response.Status.NOT_FOUND, result.getResponseStatus());
	}

	@Test
	public void testMethodNotAllowed() throws IOException
	{
		assertMethodNotAllowed(URI + "/" + invoiceModel.getPk().toString(), POST);
	}

}
