package com.xjd.ct.web.cmpnt;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

/**
 * @author elvis.xu
 * @since 2015-06-13 00:05
 */
public class AuthFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String uri = httpRequest.getRequestURI();
		String ctx = httpRequest.getContextPath();
		System.out.println(ctx);
		System.out.println(uri);
	}

	@Override
	public void destroy() {

	}
}
