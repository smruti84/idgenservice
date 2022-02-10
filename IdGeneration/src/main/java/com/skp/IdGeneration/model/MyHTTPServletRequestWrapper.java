package com.skp.IdGeneration.model;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.util.ContentCachingRequestWrapper;

public class MyHTTPServletRequestWrapper extends ContentCachingRequestWrapper {

	private UUID uuid;

	public MyHTTPServletRequestWrapper(HttpServletRequest request) {
		super(request);
		uuid = UUID.randomUUID();
	}

	public UUID getUUID() {
		return uuid;
	}
}
