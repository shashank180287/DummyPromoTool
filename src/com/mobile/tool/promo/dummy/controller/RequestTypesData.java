package com.mobile.tool.promo.dummy.controller;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RequestTypesData extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("application/json");
		resp.getWriter().println("[PricePro, BrandPro]");
	}
}
