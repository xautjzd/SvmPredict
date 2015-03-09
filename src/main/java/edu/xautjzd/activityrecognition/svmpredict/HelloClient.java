package edu.xautjzd.activityrecognition.svmpredict;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;


public class HelloClient {

	public static void main(String[] args) {
		User u = new User("xautjzd", "Î÷°²ÊÐ");
		
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
		WebResource webResource = client
				.resource("http://localhost:8080/svmpredict/hello");

		ClientResponse response = webResource.accept("text/plain")
				.type("application/json").post(ClientResponse.class, u);
		
		String output = response.getEntity(String.class);
		System.out.println("Server response .... \n");
		System.out.println(output);
		
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}
		
	}

}
