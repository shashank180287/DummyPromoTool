package com.mobile.tool.promo.dummy.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PluginStatusTracker extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1587839716432374905L;
	private int counter=1;
	private final Logger log = Logger.getLogger(PluginStatusTracker.class.getName());
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");
		String userId = req.getParameter("id");
		String latitude = req.getParameter("latitude");
		String longitude = req.getParameter("longitude");
		log.info("Request received for user "+userId+" for location ["+latitude+","+longitude+"]");
		
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		if(counter%3==0){
			sb.append("\"isServiceAvailable\": \"Y\",");
		}else{
			sb.append("\"isServiceAvailable\": \"N\",");
		}
		sb.append("\"serviceTypesResponse\": {"+
		        "\"serviceTypes\": ["+
		        "{"+
		            "\"code\": \"G\","+
		            "\"name\": \"grocery\""+
		        "},"+
		        "{"+
		            "\"code\": \"A\","+
		            "\"name\": \"apparel\""+
		        "},"+
		        "{"+
		           " \"code\": \"O\","+
		            "\"name\": \"other\""+
		        "}"+
		    "]"+
		    "}");
		if(counter%6==0){
		sb.append(","+
		    "\"inventorySearchResponse\": {"+
		        "\"categoryName\": \"G\","+
		        "\"subCategoryName\": \"Rice\","+
		        "\"inventorySearchItems\": ["+
		            "{"+
		                "\"itemCode\": \"C0001GH\","+
		                "\"itemName\": \"Best Rice\","+
		                "\"price\": 210,"+
		                "\"message\": \"Rice for biryani\","+
		                "\"effectivePrice\": 150,"+
		                "\"brand\": \"best\""+
		            "}"+
		        "]"+
		    "}");
		}
		sb.append("}");
		counter++;
		resp.getWriter().write(sb.toString());
	}
}
