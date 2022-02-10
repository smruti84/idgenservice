package com.skp.IdGeneration.model;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AppMvcInterceptor

		implements HandlerInterceptor {

	private String TRACE_HEADER = "X-Trace-Id";

	public AppMvcInterceptor() {
		MDC.put("transactionId", UUID.randomUUID().toString());
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String traceID = UUID.randomUUID().toString();
		if (request.getHeader(TRACE_HEADER) != null || !request.getHeader(TRACE_HEADER).isEmpty()) {
			traceID = request.getHeader(TRACE_HEADER);
		}
		System.out.println(traceID);
		MDC.put("transactionId", traceID);
		return true;
	}
}
