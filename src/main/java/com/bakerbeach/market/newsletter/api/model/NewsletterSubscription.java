package com.bakerbeach.market.newsletter.api.model;

import java.util.Date;

public class NewsletterSubscription {
	public static final String STATUS_REQUESTED = "requested";
	public static final String STATUS_ACTIVE = "active";
	public static final String STATUS_INACTIVE = "inactive";

	private String prefix;
	private String firstName;
	private String lastName;
	private String email;
	private String newsletterCode;
	private Date lastUpdate;
	private String status;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNewsletterCode() {
		return newsletterCode;
	}
	
	public void setNewsletterCode(String newsletterCode) {
		this.newsletterCode = newsletterCode;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
