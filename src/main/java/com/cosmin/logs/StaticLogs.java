package com.cosmin.logs;

public class StaticLogs {
	public static void staticLogs(org.slf4j.Logger log, String message) {
		log.info("<info>The application 07-netflix-zuul - {}.", message);
		log.error("<error>The application 07-netflix-zuul - {}.", message);
		log.debug("<debug>The application 07-netflix-zuul - {}.", message);
	}
}
