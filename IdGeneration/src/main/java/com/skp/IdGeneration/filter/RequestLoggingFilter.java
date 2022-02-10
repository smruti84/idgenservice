/*
 * package com.skp.IdGeneration.filter;
 * 
 * import java.io.IOException;
 * 
 * import javax.servlet.FilterChain; import javax.servlet.ServletException;
 * import javax.servlet.ServletRequest; import javax.servlet.ServletResponse;
 * import javax.servlet.http.HttpServletRequest;
 * 
 * import org.springframework.web.filter.GenericFilterBean;
 * 
 * import com.skp.IdGeneration.model.MyHTTPServletRequestWrapper;
 * 
 * public class RequestLoggingFilter extends GenericFilterBean{
 * 
 * @Override public void doFilter(ServletRequest request, ServletResponse
 * response, FilterChain chain) throws IOException, ServletException {
 * HttpServletRequest requestToCache = new
 * MyHTTPServletRequestWrapper((HttpServletRequest) request);
 * System.out.println(((WGHTTPServletRequestWrapper)requestToCache).getUUID());
 * chain.doFilter(requestToCache, response);
 * 
 * }
 * 
 * }
 */