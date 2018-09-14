package org.rubiconred.pagerdutyservice;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Service {
	private String id;
	private String self;
	private String html_url;
	private String type;
	private String name;
	private String description;
    private String status;
   	private escalation_policy escalation_policy;
    	
    	@XmlRootElement
    	public static class escalation_policy {
    		public String getId() {
    			return id;
    		}
    		public void setId(String id) {
    			this.id = id;
    		}
    		public String getType() {
    			return type;
    		}
    		public void setType(String type) {
    			this.type = type;
    		}
    		String id;
    		String type;
    		
    	}
  
	public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getSelf() {
			return self;
		}

		public void setSelf(String self) {
			this.self = self;
		}

		public String getHtml_url() {
			return html_url;
		}

		public void setHtml_url(String html_url) {
			this.html_url = html_url;
		}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public escalation_policy getEscalation_policy() {
		return escalation_policy;
	}

	public void setEscalation_policy(escalation_policy escalation_policy) {
		this.escalation_policy = escalation_policy;
	}

	


}
