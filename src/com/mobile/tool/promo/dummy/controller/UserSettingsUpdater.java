package com.mobile.tool.promo.dummy.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.labs.repackaged.com.google.common.io.CharStreams;

public class UserSettingsUpdater extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 972108903076334610L;
	private static int counter = 0;
	private final Logger log = Logger.getLogger(UserSettingsUpdater.class.getName());
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		counter++;
		log.warning(CharStreams.toString(req.getReader()));
		if (counter % 3 == 0) {
			resp.getWriter().write(
					"{" + "\"status\": \"Failed\","
							+ "\"message\": \" \""
							+ "}");

		} else {
			resp.getWriter().write(
					"{" + "\"status\": \"SUCCESS\","
							+ "\"message\": \" User settings are changed successfully \""
							+ "}");
		}
	}
}
