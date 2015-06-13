package com.xjd.ct.web.cmpnt;

import com.xjd.ct.web.util.SessionContextUtil;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String path = uri.substring(uri.indexOf(ctx) + ctx.length());

		if (path.startsWith("/admin/login") || path.startsWith("/10") || Pattern.matches("^((/css)|(/fonts)|(/js)|(/img)|(/other)).*", path)) {
			chain.doFilter(request, response);
		} else {
			if (httpRequest.getSession().getAttribute(SessionContextUtil.USER_KEY) == null) {
				HttpServletResponse httpResponse = (HttpServletResponse) response;
				httpResponse.sendRedirect(ctx + "/admin/login/input");
			} else {
				chain.doFilter(request, response);
			}
		}
	}

	@Override
	public void destroy() {

	}
}
