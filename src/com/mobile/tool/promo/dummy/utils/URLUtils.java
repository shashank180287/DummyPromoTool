package com.mobile.tool.promo.dummy.utils;

import javax.servlet.http.HttpServletRequest;

public class URLUtils {

	public static String readURLParameter(HttpServletRequest request, String identifier) {
		String requestURL = request.getRequestURL().toString();
		if(requestURL.contains(identifier)){
			String tmp = requestURL.substring(requestURL.indexOf(identifier)+identifier.length());
			return tmp.contains("/")?tmp.substring(0, tmp.indexOf("/")):tmp;
		}
		return null;
	}
}
