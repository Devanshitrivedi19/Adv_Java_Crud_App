package com.royal.filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyFilter implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException 
	{
		
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out=response.getWriter();
		out.println("Filter is invoked before<br>");
		chain.doFilter(request, response);
		out.println("Filter is invoked after<br>");
		
	}
	@Override
	public void destroy() {
		
	}
	
}
