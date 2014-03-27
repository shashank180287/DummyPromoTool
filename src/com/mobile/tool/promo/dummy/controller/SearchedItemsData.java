package com.mobile.tool.promo.dummy.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SearchedItemsData extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("application/json");
		String category = req.getParameter("service-type");
		String subCategory = req.getParameter("sub-category");
		
		if (subCategory.equalsIgnoreCase("Rice")) {
			resp.getWriter().println(
					"{" + "\"categoryName\": \""+category+"\","
							+	"\"subCategoryName\": \"Rice\","
							+ "\"inventorySearchItems\": [" + "{"
								+ "\"itemCode\": \"C0001GH\","
								+ "\"itemName\": \"Best Rice\","
								+ "\"price\": 210,"
								+ "\"message\": \"Rice for biryani\","
								+ "\"effectivePrice\": 150,"
								+ "\"brand\": \"best\""
							+ "}," + "{" 
								+ "\"itemCode\": \"C0002GH\","
								+ "\"itemName\": \"Basmati Rice\","
								+ "\"price\": 300,"
								+ "\"message\": \"Rice matlab Basmati Rice\","
								+ "\"effectivePrice\": 250,"
								+ "\"brand\": \"himgiri\""
							+ " }" + "]" + "}");
		} else {
			resp.getWriter().println(
					"{" + "\"categoryName\": \""+category+"\","
							+	"\"subCategoryName\": \"Jeans\","
							+ "\"inventorySearchItems\": [" + "{"
								+ "\"itemCode\": \"J0001GH\","
								+ "\"itemName\": \"Levis Jean\","
								+ "\"price\": 1210,"
								+ "\"message\": \"8 Bottles 1 Jeans \","
								+ "\"effectivePrice\": 750,"
								+ "\"brand\": \"Levis\""
							+ "}," + "{" 
								+ "\"itemCode\": \"J0002GH\","
								+ "\"itemName\": \"Pepe Jeans\","
								+ "\"price\": 2100,"
								+ "\"message\": \"Jeams\","
								+ "\"effectivePrice\": 2050,"
								+ "\"brand\": \"Pepe\""
							+ " }" + "]" + "}");

		}
	}
}
