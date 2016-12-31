package com.bakerbeach.market.newsletter.api.service;

import com.bakerbeach.market.newsletter.api.model.NewsletterSubscription;

public interface NewsletterSubscriptionService {

	void subscribe(String prefix, String firstName, String lastName, String email, String newsletterCode, String status)
			throws NewsletterServiceException;

	NewsletterSubscription getSubscription(String email) throws NewsletterServiceException;

}
