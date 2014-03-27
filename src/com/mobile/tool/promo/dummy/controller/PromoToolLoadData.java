package com.mobile.tool.promo.dummy.controller;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class PromoToolLoadData extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("application/json");
		resp.getWriter()
				.println(
						"{"
								+ "\"dod\":\"http://1-dot-promotooldummy.appspot.com/dod_2802.jpg\","
								+ "\"serviceTypes\":[" + "{"
								+ "\"code\": \"G\"," + "\"name\": \"grocery\""
								+ "}," + "{" + "\"code\": \"A\","
								+ "\"name\": \"apparel\"" + "}," + "{"
								+ "\"code\": \"O\"," + "\"name\": \"other\""
								+ "}" + "]" + "}");
	}
}
