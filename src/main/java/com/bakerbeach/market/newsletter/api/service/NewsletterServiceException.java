package com.bakerbeach.market.newsletter.api.service;

public class NewsletterServiceException extends Exception {
	private static final long serialVersionUID = 1L;

	public static class AlreadySubscribedException extends NewsletterServiceException {		
		private static final long serialVersionUID = 1L;
	}

}
