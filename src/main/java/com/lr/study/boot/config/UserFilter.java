package com.lr.study.boot.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("userFilter")
public class UserFilter implements Filter{
	private static Logger logger = LoggerFactory.getLogger(UserFilter.class);
	public void destroy() {
		// TODO Auto-generated method stub
		logger.info("userFilter destroy ...");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		logger.info("before userFilter ...");
		chain.doFilter(request,response);
		logger.info("after userFilter ...");
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		logger.info("userFilter init ...");
	}
	
}
