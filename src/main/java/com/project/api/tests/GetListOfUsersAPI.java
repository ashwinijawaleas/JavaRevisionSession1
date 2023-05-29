package com.project.api.tests;

import java.io.IOException;
import java.util.HashMap;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetListOfUsersAPI extends BaseAPI {
	public String Url;
	public String endPoint;
	HashMap<String , String> Details;

	@BeforeTest
	public void beforeTest() throws Exception {
		Url = getUrl();
		endPoint = "null";
		Details = new HashMap<String, String>();
	}

	@Test
	public void getUserListAPI() throws Exception {
		HashMap<String, String> response = getUsersList(Url, Details, endPoint);
		System.out.println(response);

	}
	@Test
	public void getSingleUserAPI() throws Exception {
		HashMap<String, String> response = getSingleUsers(Url, Details, endPoint);
		System.out.println(response);
	}

//	@Test
	public void getA(String url) throws IOException, ParseException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url + "/api/users?page=2");
		// Hit the GET call
		CloseableHttpResponse closableHttpResponse = httpClient.execute(httpGet);
		int statusCode = closableHttpResponse.getCode();
		String Response = EntityUtils.toString(closableHttpResponse.getEntity(),"UTF-8");
		JSONObject responseJson = new JSONObject(Response);
		System.out.println("Response From API :- " + responseJson);		
	} 
}
