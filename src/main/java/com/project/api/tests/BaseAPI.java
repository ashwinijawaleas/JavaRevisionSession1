package com.project.api.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.module.Configuration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.logging.Log;
import commonUtils.APIConstants;
import commonUtils.Constants;
import commonUtils.HttpClientUtilService;
import commonUtils.RestHttpClientUtils;

public class BaseAPI {
	public static String getUrl() throws Exception {
	Properties p = new Properties();
	FileInputStream file = new FileInputStream("D:\\Ys Akshay\\Java Programs\\Zerodha\\src\\main\\resources\\config.properties");
	p.load(file);
	String url = p.getProperty("Url");
	System.out.println(url);
	return url;
	
}
	public static String getEndpoint(String endpointName) throws Exception {
		Properties p = new Properties();
		FileInputStream file = new FileInputStream("D:\\Ys Akshay\\Java Programs\\Zerodha\\src\\main\\resources\\config.properties");
		p.load(file);
		String endpoint = p.getProperty(endpointName);
		System.out.println(endpoint);
		return endpoint;
		
	}
	
	public HashMap<String , String > getUsersList(String Url, HashMap<String,String> details, String endpoint) throws Exception{
		Map<String,String> headers = new HashMap<String , String>();
//		headers.put(Constants.AUTHORIZATION, "Bearer " + "abcd");
//		headers.put(Constants.CONTENT_TYPE, Constants.JSON_CONTENT_TYPE);
		
		// Parameters
		HashMap<String, String> params = new HashMap<>();
		
		// Request Body
//		AtomicReference<String> requestBody = new AtomicReference<>();
		
		// Log Request Body
//		System.out.println("Request Body : " + requestBody.get());
		
		if ( endpoint.equalsIgnoreCase(Constants.NULL))
		{
			endpoint = APIConstants.GETLISTOFUSERS;
		}
		return RestHttpClientUtils.GET(Url, endpoint, headers, params);
	}
	
	public HashMap<String , String > getSingleUsers(String Url, HashMap<String,String> details, String endpoint) throws Exception{
		Map<String,String> headers = new HashMap<String , String>();
//		headers.put(Constants.AUTHORIZATION, "Bearer " + "abcd");
//		headers.put(Constants.CONTENT_TYPE, Constants.JSON_CONTENT_TYPE);
		
		// Parameters
		HashMap<String, String> params = new HashMap<>();
		
		// Request Body
//		AtomicReference<String> requestBody = new AtomicReference<>();
		
		// Log Request Body
//		System.out.println("Request Body : " + requestBody.get());
		
		if ( endpoint.equalsIgnoreCase(Constants.NULL))
		{
			endpoint = APIConstants.GETSINGLEUSERS;
		}
		return RestHttpClientUtils.GET(Url, endpoint, headers, params);
	}
}

