package com.mobile.tool.promo.dummy.controller;

import java.io.IOException;

import javax.servlet.http.*;

import com.mobile.tool.promo.dummy.utils.URLUtils;

@SuppressWarnings("serial")
public class SubCategoryLoadData extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("application/json");
		String subCategory = URLUtils.readURLParameter(req,
				"/plugin/subcategory/");

		if (subCategory.equalsIgnoreCase("G")) {
			resp.getWriter().println(
					"{" + "\"serviceTypeCode\": \"G\","
							+ "\"subCategoryModels\": [" + "{"
							+ "\"subCategoryId\": 4,"
							+ "\"serviceTypeCode\": \"G\","
							+ " \"name\": \"Rice\"," + "\"code\": \"GR\""
							+ "}," + "{" + "\"subCategoryId\": 5,"
							+ " \"serviceTypeCode\": \"G\","
							+ "\"name\": \"Wheat\"," + "\"code\": \"GW\""
							+ "}," + "{" + "\"subCategoryId\": 6,"
							+ "\"serviceTypeCode\": \"G\","
							+ "\"name\": \"Other\"," + "\"code\": \"GO\""
							+ " }" + "]" + "}");

		} else {
			resp.getWriter().println(
					"{" + "\"serviceTypeCode\": \"A\","
							+ "\"subCategoryModels\": [" + "{"
							+ "\"subCategoryId\": 4,"
							+ "\"serviceTypeCode\": \"A\","
							+ " \"name\": \"Tee\"," + "\"code\": \"AR\""
							+ "}," + "{" + "\"subCategoryId\": 5,"
							+ " \"serviceTypeCode\": \"A\","
							+ "\"name\": \"Jeans\"," + "\"code\": \"AW\""
							+ "}," + "{" + "\"subCategoryId\": 6,"
							+ "\"serviceTypeCode\": \"A\","
							+ "\"name\": \"Other\"," + "\"code\": \"AO\""
							+ " }" + "]" + "}");

		}
	}
}
