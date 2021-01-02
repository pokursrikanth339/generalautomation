package apiautomation.apiautomation;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;

import client.RestClient;

public class GetApi extends BaseClass {
	String serviceurl;
	RestClient restclient;
	String appurl;
	String url;

	@BeforeMethod
	public void setup() throws ClientProtocolException, IOException {
		restclient = new RestClient();
		serviceurl = prop.getProperty("url");
		appurl = prop.getProperty("serviceurl");
		url = serviceurl + appurl;
		RestClient restclient = new RestClient();
		restclient.get(url);
	}

	public void getapi() throws ClientProtocolException, IOException {
		restclient = new RestClient();
		restclient.get(url);
	}

}
