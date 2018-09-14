package org.rubiconred.pagerdutyservice;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PagerDutyServiceResponse {
	private Service[] services;
    public PagerDutyServiceResponse() {
    	
    }
	public Service[] getServices() {
		return services;
	}

	public void setServices(Service[] services) {
		this.services = services;
	}
	

}
