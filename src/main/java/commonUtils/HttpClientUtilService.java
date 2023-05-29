package commonUtils;

import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.client5.http.io.HttpClientConnectionManager;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory;
import org.apache.hc.core5.ssl.SSLContexts;

public class HttpClientUtilService {
	
	HttpClientConnectionManager httpClientConnectionManager;
	public void init() {
		httpClientConnectionManager = new PoolingHttpClientConnectionManager();
	}
	
	public CloseableHttpClient getCloseableHttpClient() {
		javax.net.ssl.SSLContext sslcontext = SSLContexts.createSystemDefault();
		HttpClientBuilder builder = HttpClientBuilder.create();
//		SSLConnectionSocketFactory sslConnectionFactory = new SSLConnectionSocketFactory(sslcontext);
		builder.setConnectionManager(httpClientConnectionManager);
		
		return builder.build();
		
	}
}
