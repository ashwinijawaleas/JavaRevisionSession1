package api.automation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.json.JSONObject;

import com.google.gson.JsonObject;

public class RestClient {
	// GET Call
	public static CloseableHttpResponse get(String url) throws IOException, ParseException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		// Hit the GET call
		CloseableHttpResponse closableHttpResponse = httpClient.execute(httpGet);
		int statusCode = closableHttpResponse.getCode();
        System.out.println("StatusCode : " + statusCode);

		String Response = EntityUtils.toString(closableHttpResponse.getEntity(),"UTF-8");
		JSONObject responseJson = new JSONObject(Response);
		System.out.println("Response From API :- " + responseJson);	
		
		return closableHttpResponse;
		
	}
	
	// POST Call
	public static CloseableHttpResponse post(String url, String entityString, HashMap<String, String> HeadersMap ) throws IOException, ParseException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httppost = new HttpPost(url);
		// For Payload
		httppost.setEntity(new StringEntity(entityString));
		
		// Headers
		for (Entry<String, String> entry : HeadersMap.entrySet()) {
		httppost.addHeader(entry.getKey(), entry.getValue());	
		}
		// Hit the Post call
		CloseableHttpResponse closableHttpResponse = httpClient.execute(httppost);
		int statusCode = closableHttpResponse.getCode();
        System.out.println("StatusCode : " + statusCode);

		String Response = EntityUtils.toString(closableHttpResponse.getEntity(),"UTF-8");
		JSONObject responseJson = new JSONObject(Response);
		System.out.println("Response From API :- " + responseJson);		
		
		return closableHttpResponse;
		
	}
	
	public static void main(String[] args) throws ParseException, IOException {
		get("https://reqres.in/api/users?page=2");
	}
	

}
