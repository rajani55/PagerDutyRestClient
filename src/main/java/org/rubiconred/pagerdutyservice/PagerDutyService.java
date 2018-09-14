package org.rubiconred.pagerdutyservice;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class PagerDutyService {

	String serviceCreationEndpoint = "https://api.pagerduty.com/services/%s";
	String servicesEndpoint = "https://api.pagerduty.com/services?time_zone=UTC&sort_by=name"; 
	String apiToken = "Token token=%s" ;

	public PagerDutyService(String token) {
		this.apiToken = String.format(apiToken, token);
	}

	public void getServices() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(servicesEndpoint);
		Response response = target.request().accept(MediaType.APPLICATION_JSON_TYPE).header(HttpHeaders.AUTHORIZATION, apiToken).get();
		if(response.getStatus()!=200) {
			System.out.println(response.readEntity(String.class));
		}else {
			PagerDutyServiceResponse res = response.readEntity(PagerDutyServiceResponse.class);
		}
	}
}
