package commonUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpHeaders;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.message.BasicHeader;
import org.apache.hc.core5.net.URIBuilder;

import com.github.dockerjava.transport.DockerHttpClient.Response;

public class RestHttpClientUtils {

	
	public static URI getUrl(String url, String resourse, Map<String, String> inputParameters	) {
		StringBuilder requestUrl = new StringBuilder(url).append(resourse);
		System.out.println(requestUrl);
		URIBuilder uriBuilder = new URIBuilder();
		try {
			uriBuilder.setPath(requestUrl.toString());
			if(!inputParameters.isEmpty()) {
				for ( Entry<String, String> params : inputParameters.entrySet()) {
					uriBuilder.addParameter(params.getKey(), params.getValue());
				}
			}
			return uriBuilder.build();
		} catch(URISyntaxException e) {
			System.out.println(e);			
		}
		return null;
		
	}
	
	public static HashMap<String, String> getResponseMap(CloseableHttpResponse httpResponse) throws Exception{
		HttpEntity entity = httpResponse.getEntity();
		String inputLine;
		StringBuffer responseBody = new StringBuffer();
		if(entity != null) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()));
			while ((inputLine = reader.readLine()) != null) {
				responseBody.append(inputLine);
			}
			reader.close();
		}
		HashMap<String, String> responseMap = new HashMap<String, String>();
		responseMap.put("StatusCode", Integer.toString(httpResponse.getCode()));
		responseMap.put("ResponseBody", httpResponse.getEntity().toString());
		return responseMap;
		
	}
/*	
	public static HashMap<String, String> GET(String URL, String resourse, Map<String,String> headers , Map<String,String> inputParameters) throws Exception{
		HttpClientUtilService service = new HttpClientUtilService();
		CloseableHttpClient httpClient = service.getCloseableHttpClient();
		HttpGet httpGet = new HttpGet(getUrl(URL, resourse, inputParameters));
		
		for (Entry<String, String> header : headers.entrySet()) {
			Header head = new BasicHeader(header.getKey(), header.getValue());
			httpGet.addHeader(head);
		}
		CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
		HashMap<String, String> responseMap = getResponseMap(httpResponse);
		
		return responseMap;
	}
	*/
	
	public static HashMap<String, String> GET(String URL, String resourse, Map<String,String> header , Map<String,String> inputParameters) throws Exception{
		HttpGet request=null;
        HttpClient client = HttpClientBuilder.create().build();         

        try {
            request = new HttpGet(URL.concat(resourse));
            System.out.println(request);
            HttpResponse httpResponse=client.execute(request);      
            System.out.println(httpResponse);
            

//            Header[] headers = httpResponse.getHeaders(HttpHeaders.LOCATION);
           // Preconditions.checkState(headers.length == 1);
//            String newUrl = headers[0].getValue();          
//            System.out.println("new url" + newUrl);   
            
            HashMap<String, String> responseMap = new HashMap<>();
            responseMap.put("StatusCode", Integer.toString(httpResponse.getCode()));
    		responseMap.put("ResponseBody", httpResponse.toString());
//    		responseMap.put("Body",httpResponse.)
    		
    		return responseMap;
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
        }
		return null;           
        }
}
