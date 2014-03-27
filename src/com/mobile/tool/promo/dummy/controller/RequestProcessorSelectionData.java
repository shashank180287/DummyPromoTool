package com.mobile.tool.promo.dummy.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mobile.tool.promo.dummy.utils.URLUtils;

public class RequestProcessorSelectionData extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("application/json");

		String requestProcessor = URLUtils.readURLParameter(req,
				"/plugin/requestintr/processordetails/");
		if (requestProcessor.equalsIgnoreCase("PricePro")) {
			resp.getWriter()
					.println(
							"{\"name\": \"PricePro\","
									+ "\"selection\" : '{"
									+ "\"selection1\":{"
									+ "\"type\":\"list\","
									+ "\"values\": '[\"Less Than\", \"More Than\", \"Equal To\"]'"
									+ "}," + "\"selection2\":{"
									+ "\"type\": \"input\"" + "}" + "}'" + "}");
		} else {
			resp.getWriter()
			.println(
					"{\"name\": \"BrandPro\","
							+ "\"selection\" : '{"
							+ "\"selection1\":{"
							+ "\"type\": \"input\"" + "}" + "}'" + "}");
		}
	}
}
