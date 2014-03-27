package com.mobile.tool.promo.dummy.controller;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ToolStatusTrackerData extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("application/json");
		String userId = req.getParameter("id");
		String latitude = req.getParameter("latitude");
		String longitude = req.getParameter("longitude");
		resp.getWriter().println(
				"{" + " \"isServiceAvailable\": \"Y\","
						+ " \"serviceTypesResponse\": {"
						+ " \"serviceTypes\": [" + "{" + " \"code\": \"G\","
						+ "\"name\": \"grocery\"" + "}," + "{"
						+ "\"code\": \"A\"," + "\"name\": \"apparel\"" + "},"
						+ "{" + "\"code\": \"O\"," + "\"name\": \"other\""
						+ "}" + "]" + "}," + "\"inventorySearchResponse\": {"
						+ "\"categoryName\": \"G\","
						+ "\"subCategoryName\": \"Rice\","
						+ "\"inventorySearchItems\": [" + "{"
						+ " \"itemCode\": \"C0001GH\","
						+ "\"itemName\": \"Best Rice\"," + "\"price\": 210,"
						+ "\"message\": \"Rice for biryani\","
						+ "\"effectivePrice\": 150," + "\"brand\": \"best\""
						+ "}" + "]" + "}" + "}");
	}
}
