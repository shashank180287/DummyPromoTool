package com.mobile.tool.promo.dummy.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.labs.repackaged.com.google.common.io.CharStreams;

public class RequestSubmitResponse extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2803624829206210511L;
	private static int counter = 0;
	private final Logger log = Logger.getLogger(RequestSubmitResponse.class.getName());
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		counter++;
		log.warning(CharStreams.toString(req.getReader()));
		if (counter % 3 == 0) {
			resp.getWriter().write(
					"{" + "\"status\": \"FALSE\","
							+ "\"message\": \"Request Limit Reached\""
							+ "}");

		} else {
			resp.getWriter().write(
					"{" + "\"status\": \"TRUE\","
							+ "\"message\": \" Request Posted Successfully \""
							+ "}");
		}

	}
}
